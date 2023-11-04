    package com.example.androidhw2

    import android.content.Context
    import android.view.LayoutInflater
    import android.view.ViewGroup
    import androidx.recyclerview.widget.RecyclerView

    class MyAdapter(private val context: Context, private val foods: List<Characters>) : RecyclerView.Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.imageView.setImageResource(foods[position].image)
            holder.charName.text = foods[position].name
            holder.charDescription.text = foods[position].description
        }

        override fun getItemCount(): Int {
            return foods.size
        }


    }



