package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnInfoWindowClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfoWindowClick:(Lcom/tencent/mapsdk/raster/model/Marker;)V:GetOnInfoWindowClick_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnInfoWindowClickListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnInfoWindowClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnInfoWindowClickListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnInfoWindowClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnInfoWindowClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnInfoWindowClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onInfoWindowClick (com.tencent.mapsdk.raster.model.Marker p0)
	{
		n_onInfoWindowClick (p0);
	}

	private native void n_onInfoWindowClick (com.tencent.mapsdk.raster.model.Marker p0);

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
