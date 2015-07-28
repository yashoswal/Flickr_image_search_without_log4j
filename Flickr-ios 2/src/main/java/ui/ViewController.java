package ui;


import com.migeran.natj.general.NatJ;
import com.migeran.natj.general.Pointer;
import com.migeran.natj.general.ann.Generated;
import com.migeran.natj.general.ann.Mapped;
import com.migeran.natj.general.ann.Owned;
import com.migeran.natj.general.ann.RegisterOnStartup;
import com.migeran.natj.general.ann.Runtime;
import com.migeran.natj.general.ptr.NIntPtr;
import com.migeran.natj.objc.ObjCRuntime;
import com.migeran.natj.objc.ann.ObjCClassName;
import com.migeran.natj.objc.ann.Selector;
import com.migeran.natj.objc.map.ObjCObjectMapper;

import common.AISearchClient;
import ios.foundation.NSBundle;
import ios.foundation.NSData;
import ios.foundation.NSSet;
import ios.foundation.NSURL;
import ios.foundation.struct.NSRange;
import ios.uikit.UIEvent;
import ios.uikit.UIImage;
import ios.uikit.UIImageView;
import ios.uikit.UILabel;
import ios.uikit.UISearchBar;
import ios.uikit.UITextField;
import ios.uikit.UIViewController;
import ios.uikit.protocol.UISearchBarDelegate;
import ios.uikit.protocol.UITextFieldDelegate;

import java.lang.String;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassName("ViewController")
@RegisterOnStartup
public class ViewController extends UIViewController implements UITextFieldDelegate {
	static {
		NatJ.register();
	}
	
	String searchText = "";
	int numPerPage = 50;
	int currentPage = 0;
	static AISearchClient searchClient = new AISearchClient();

	@Generated
	protected ViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native ViewController alloc();

	@Generated
	@Selector("count")
	public native NIntPtr count();

	@Generated
	@Selector("currentPage")
	public native UILabel currentPage();

	@Generated
	@Selector("init")
	public native ViewController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native ViewController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	@Generated
	@Selector("numPerPage")
	public native UITextField numPerPage();

	@Generated
	@Selector("searchString")
	public native String searchString();

	@Generated
	@Selector("searchText")
	public native UITextField searchText();

	@Generated
	@Selector("setCount:")
	public native void setCount(NIntPtr value);

	@Generated
	@Selector("setCurrentPage:")
	public native void setCurrentPage_unsafe(UILabel value);

	@Generated
	public void setCurrentPage(UILabel value) {
		com.migeran.natj.objc.ObjCObject __old = (com.migeran.natj.objc.ObjCObject) currentPage();
		if (value != null) {
			com.migeran.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setCurrentPage_unsafe(value);
		if (__old != null) {
			com.migeran.natj.objc.ObjCRuntime
					.unassociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setNumPerPage:")
	public native void setNumPerPage_unsafe(UITextField value);

	@Generated
	public void setNumPerPage(UITextField value) {
		com.migeran.natj.objc.ObjCObject __old = (com.migeran.natj.objc.ObjCObject) numPerPage();
		if (value != null) {
			com.migeran.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setNumPerPage_unsafe(value);
		if (__old != null) {
			com.migeran.natj.objc.ObjCRuntime
					.unassociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setSearchString:")
	public native void setSearchString(String value);

	@Generated
	@Selector("setSearchText:")
	public native void setSearchText_unsafe(UITextField value);

	@Generated
	public void setSearchText(UITextField value) {
		com.migeran.natj.objc.ObjCObject __old = (com.migeran.natj.objc.ObjCObject) searchText();
		if (value != null) {
			com.migeran.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setSearchText_unsafe(value);
		if (__old != null) {
			com.migeran.natj.objc.ObjCRuntime
					.unassociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setTotNumPages:")
	public native void setTotNumPages_unsafe(UILabel value);

	@Generated
	public void setTotNumPages(UILabel value) {
		com.migeran.natj.objc.ObjCObject __old = (com.migeran.natj.objc.ObjCObject) totNumPages();
		if (value != null) {
			com.migeran.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setTotNumPages_unsafe(value);
		if (__old != null) {
			com.migeran.natj.objc.ObjCRuntime
					.unassociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("totNumPages")
	public native UILabel totNumPages();
	
	@Selector("viewDidLoad")
	@Override
	public void viewDidLoad() {
	
		super.viewDidLoad();
		System.out.println("in view did load");
	
	
	}

	@Selector("touchesBegan:withEvent:")
	@Override
	public void touchesBeganWithEvent(NSSet nsSet, UIEvent uiEvent) {
		super.touchesBeganWithEvent(nsSet, uiEvent);
		this.view().endEditing(true);
	}

	@Selector("searchButton:")
	public void searchButton(@Mapped(ObjCObjectMapper.class) Object sender){
		System.out.println("Button called");
		this.view().endEditing(true);
		searchText = this.searchText().text();
		//numPerPage = Integer.parseInt(this.numPerPage().text());
		searchClient.fetchImages(searchText,numPerPage,0);
		//this.totNumPages().setText(String.valueOf(searchClient.getTotalPages()));
		//this.currentPage().setText(String.valueOf(currentPage));
		//System.out.println("Button called");*/
	}

	@Selector("getNextPage:")
	public void getNextPage(@Mapped(ObjCObjectMapper.class) Object sender){
		System.out.println("get next page called");
	}
	@Generated
	@Selector("imageView")
	public native UIImageView imageView();

	@Generated
	@Selector("setImageView:")
	public native void setImageView_unsafe(UIImageView value);

	@Generated
	public void setImageView(UIImageView value) {
		com.migeran.natj.objc.ObjCObject __old = (com.migeran.natj.objc.ObjCObject) imageView();
		if (value != null) {
			com.migeran.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setImageView_unsafe(value);
		if (__old != null) {
			com.migeran.natj.objc.ObjCRuntime
					.unassociateObjCObject(this, __old);
		}
	}



	@Override
	public boolean textFieldShouldChangeCharactersInRangeReplacementString(UITextField uiTextField, NSRange nsRange, String s) {
		return false;
	}

	@Override
	public void textFieldDidBeginEditing(UITextField uiTextField) {

	}

	@Override
	public void textFieldDidEndEditing(UITextField uiTextField) {

	}

	@Override
	public boolean textFieldShouldBeginEditing(UITextField uiTextField) {
		return false;
	}

	@Override
	public boolean textFieldShouldClear(UITextField uiTextField) {
		return false;
	}

	@Override
	public boolean textFieldShouldEndEditing(UITextField uiTextField) {
		return false;
	}

	@Override
	public boolean textFieldShouldReturn(UITextField uiTextField) {
		return false;
	}
}