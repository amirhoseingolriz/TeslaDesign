package ir.golriz.amirhosein.tesladesign


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.golriz.amirhosein.tesladesign.data.Item
import ir.golriz.amirhosein.tesladesign.databinding.ItemRecyclerBinding


class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(private val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: Item) {

            binding.titleItem.text = item.title
            binding.subjectItem.text = item.subject
            if (item.isSelected) {
                binding.imgSelected.visibility = View.VISIBLE
            } else {
                binding.imgSelected.visibility = View.INVISIBLE
            }

            binding.cardItem.setOnClickListener {

                if (binding.imgSelected.visibility == View.VISIBLE) {
                    binding.imgSelected.visibility = View.INVISIBLE
                } else {
                    binding.imgSelected.visibility = View.VISIBLE
                }

            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}