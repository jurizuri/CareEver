package com.example.careever

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View

class MV2Activity : AppCompatActivity() {

    lateinit var checkbutton: MV2Activity

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)

    }
}

//checkbutton을 클릭하면 색이 있는 checkbutton으로 바뀜, 테두리도 색이 바뀜
//아래 수락하기 버튼 생김
//popup도 연결 : intent로 연결??