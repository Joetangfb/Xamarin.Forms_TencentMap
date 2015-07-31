package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMapLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLongClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapLongClick:(Lcom/tencent/mapsdk/raster/model/LatLng;)V:GetOnMapLongClick_Lcom_tencent_mapsdk_raster_model_LatLng_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLongClickListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLongClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMapLongClickListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMapLongClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMapLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapLongClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapLongClick (com.tencent.mapsdk.raster.model.LatLng p0)
	{
		n_onMapLongClick (p0);
	}

	private native void n_onMapLongClick (com.tencent.mapsdk.raster.model.LatLng p0);

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
