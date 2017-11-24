package com.amin.al_khaida.m.tugas_marker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        GeoPoint startPointhome = new GeoPoint(-4.872555 , 103.501845);
        IMapController mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPointhome);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(startPointhome);
        startMarker.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.home));
        startMarker.setTitle("My Home");

        GeoPoint startPointubl = new GeoPoint(-5.379534, 105.251704);
        IMapController mapController1 = map.getController();
        mapController1.setZoom(15);
        mapController1.setCenter(startPointubl);

        Marker startMarker1 = new Marker(map);
        startMarker1.setPosition(startPointubl);
        startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker1);
        map.invalidate();
        startMarker1.setIcon(getResources().getDrawable(R.drawable.campus1));
        startMarker1.setTitle("Universitas Bandar Lampung");


        GeoPoint startPointubl2 = new GeoPoint(-5.375348,105.246246);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(startPointubl2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPointubl2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.campus));
        startMarker2.setTitle("Pascasarjana Universitas Bandar Lampung");


        GeoPoint startPointmuseum = new GeoPoint(-5.372223,105.240894);
        IMapController mapController3 = map.getController();
        mapController3.setCenter(startPointmuseum);

        Marker startMarker3 = new Marker(map);
        startMarker3.setPosition(startPointmuseum);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().getDrawable(R.drawable.museum));
        startMarker3.setTitle("Museum Lampung");


        GeoPoint startPointmbk = new GeoPoint(-5.381786,105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(startPointmbk);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPointmbk);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().getDrawable(R.drawable.shop));
        startMarker4.setTitle("Mall Boemi Kedaton");


    }
}
