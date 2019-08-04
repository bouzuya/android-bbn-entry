package net.bouzuya.bbn_entry

class Entry(
    val data: String,
    val date: String, // YYYY-MM-DD
    val minutes: Int,
    val html: String,
    val pubdate: String, // YYYY-MM-DDThh:mm:ss+09:00
    val tags: Array<String>,
    val title: String
)