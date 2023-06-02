import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recycleviev.DataItem
import com.example.recycleviev.HorizontalListAdapter
import com.example.recycleviev.PhotoItem
import com.example.recycleviev.PhotoPagerAdapter
import com.example.recycleviev.R

class HomeFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = view.findViewById(R.id.viewPager)
        val photoAdapter = PhotoPagerAdapter(getPhotoList().take(6))
        viewPager.adapter = photoAdapter

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = HorizontalListAdapter(getDataList().take(8))
    }

    private fun getDataList(): List<DataItem> {
        val dataList = mutableListOf<DataItem>()
        dataList.add(DataItem(R.drawable.image1, "One Peace"))
        dataList.add(DataItem(R.drawable.image2, "Raftalia"))
        dataList.add(DataItem(R.drawable.image3, "Gambol"))
        dataList.add(DataItem(R.drawable.image4, "One Punch Man"))
        dataList.add(DataItem(R.drawable.image5, "Funny Boy"))
        dataList.add(DataItem(R.drawable.image6, "Psycho"))
        dataList.add(DataItem(R.drawable.image7, "Tanjiro"))
        dataList.add(DataItem(R.drawable.image8, "Gomer"))

        return dataList
    }

    private fun getPhotoList(): List<PhotoItem> {
        val photoList = mutableListOf<PhotoItem>()
        photoList.add(PhotoItem(R.drawable.gambol1))
        photoList.add(PhotoItem(R.drawable.gamboll2))
        photoList.add(PhotoItem(R.drawable.gamboll3))
        photoList.add(PhotoItem(R.drawable.gamboll4))
        photoList.add(PhotoItem(R.drawable.gamboll5))
        photoList.add(PhotoItem(R.drawable.gamboll6))

        return photoList
    }
}
