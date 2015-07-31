package mono.com.tencent.tencentmap.mapsdk.map;


public class ItemizedOverlay_OnFocusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.ItemizedOverlay.OnFocusChangeListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onFocusChanged:(Lcom/tencent/tencentmap/mapsdk/map/ItemizedOverlay;Lcom/tencent/tencentmap/mapsdk/map/OverlayItem;)V:GetOnFocusChanged_Lcom_tencent_tencentmap_mapsdk_map_ItemizedOverlay_Lcom_tencent_tencentmap_mapsdk_map_OverlayItem_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.ItemizedOverlay/IOnFocusChangeListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.ItemizedOverlay/IOnFocusChangeListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", ItemizedOverlay_OnFocusChangeListenerImplementor.class, __md_methods);
	}


	public ItemizedOverlay_OnFocusChangeListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ItemizedOverlay_OnFocusChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.ItemizedOverlay/IOnFocusChangeListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFocusChanged (com.tencent.tencentmap.mapsdk.map.ItemizedOverlay p0, com.tencent.tencentmap.mapsdk.map.OverlayItem p1)
	{
		n_onFocusChanged (p0, p1);
	}

	private native void n_onFocusChanged (com.tencent.tencentmap.mapsdk.map.ItemizedOverlay p0, com.tencent.tencentmap.mapsdk.map.OverlayItem p1);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
