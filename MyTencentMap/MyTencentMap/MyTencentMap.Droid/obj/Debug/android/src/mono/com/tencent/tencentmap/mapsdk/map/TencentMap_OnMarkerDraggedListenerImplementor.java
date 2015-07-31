package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMarkerDraggedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerDraggedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerDrag:(Lcom/tencent/mapsdk/raster/model/Marker;)V:GetOnMarkerDrag_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerDraggedListenerInvoker, TencentMapBinding\n" +
			"n_onMarkerDragEnd:(Lcom/tencent/mapsdk/raster/model/Marker;)V:GetOnMarkerDragEnd_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerDraggedListenerInvoker, TencentMapBinding\n" +
			"n_onMarkerDragStart:(Lcom/tencent/mapsdk/raster/model/Marker;)V:GetOnMarkerDragStart_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerDraggedListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerDraggedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMarkerDraggedListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMarkerDraggedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMarkerDraggedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerDraggedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMarkerDrag (com.tencent.mapsdk.raster.model.Marker p0)
	{
		n_onMarkerDrag (p0);
	}

	private native void n_onMarkerDrag (com.tencent.mapsdk.raster.model.Marker p0);


	public void onMarkerDragEnd (com.tencent.mapsdk.raster.model.Marker p0)
	{
		n_onMarkerDragEnd (p0);
	}

	private native void n_onMarkerDragEnd (com.tencent.mapsdk.raster.model.Marker p0);


	public void onMarkerDragStart (com.tencent.mapsdk.raster.model.Marker p0)
	{
		n_onMarkerDragStart (p0);
	}

	private native void n_onMarkerDragStart (com.tencent.mapsdk.raster.model.Marker p0);

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
