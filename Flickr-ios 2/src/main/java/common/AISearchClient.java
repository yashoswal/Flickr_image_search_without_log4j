package common;



import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.Flickr;

import com.flickr4java.flickr.photos.SearchParameters;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;
import com.flickr4java.flickr.photos.PhotosInterface;

import ios.photos.PHAdjustmentData;

public class AISearchClient {

    public static final String apiKey = "66d1a1e779288446512ef2ce49006d9c";
    String server = "api.flickr.com";
    REST rest;
    int totalPages;
    int totalResults;
    PhotoList photoList;


    public void fetchImages(String searchText,int numPerPage,int pageNum) {
        try {
            rest = new REST();
            rest.setHost(server);

            Flickr flickr = new Flickr(apiKey, "1", rest);
            Flickr.debugStream = false;

            SearchParameters searchParams = new SearchParameters();
            searchParams.setSort(SearchParameters.INTERESTINGNESS_DESC);


            searchParams.setText(searchText);

            PhotosInterface photosInterface = flickr.getPhotosInterface();


            // this is just to find out the total results and pages
            photoList = photosInterface.search(searchParams, numPerPage, pageNum);
            totalPages = photoList.getPages();
            totalResults = photoList.getTotal();


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Done");

    }

    public int getTotalPages(){
        return totalPages;
    }

    public int getTotalResults(){
        return totalResults;
    }

    public String getImageUrl(){
        Photo photo = (Photo)photoList.get(0);
        return photo.getUrl();

    }
}