package com.example.chatwithfirebase.data.model

 data class Chat(var senderId: String = "",
                 var receiverId: String = "",
                 var message: String = "",
                 var linkImage : String =""
 )