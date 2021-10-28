//package com.example.ch11_3_gallery
//
//import android.content.Context
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.Gallery
//import android.widget.ImageView
//
//class MyGalleryAdapter(var context: Context ) : BaseAdapter() {
//    internal var posterID = arrayOf(
//        R.drawable.mov11, R.drawable.mov12, R.drawable.mov13, R.drawable.mov14,
//        R.drawable.mov15, R.drawable.mov16, R.drawable.mov17, R.drawable.mov18,
//        R.drawable.mov19, R.drawable.mov20
//    )
//
//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        var imageview = ImageView(context)
//        imageview.layoutParams = Gallery.LayoutParams(200, 300)
//        imageview.scaleType = ImageView.ScaleType.FIT_CENTER
//        imageview.setPadding(5, 5, 5, 5)
//        imageview.setImageResource(posterID[p0])
//
//        imageview.setOnTouchListener { v, event ->
//            var ivPoster = context1.findViewById<ImageView>(R.id.ivPoster)
//            ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
//            ivPoster.setImageResource(posterID[p0])
//            false
//        }
//
//        return imageview
//    }
//
//    override fun getItem(p0: Int): Any {
//        return 0
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return 0
//    }
//
//    override fun getCount(): Int {
//        return posterID.size
//    }
//}