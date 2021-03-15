package com.sample.fruitdesk

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.util.*

class RequestFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_request, null)
        val submtBtn = view.findViewById<Button>(R.id.btn_submit)

        submtBtn.setOnClickListener(this)








        return view
    }

    override fun onClick(v: View?) {

        if (v?.id == R.id.btn_submit) {

            // Help 버튼 클릭 : NewActivity 시작
            startSubmitActivity()
        }
    }

    private fun startSubmitActivity() {

        val intent = Intent(context, SubmitActivity::class.java)
        startActivity(intent)
    }

}
