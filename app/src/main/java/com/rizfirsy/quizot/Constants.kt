package com.rizfirsy.quizot

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question(
                1,
                "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )

        val question2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia", "Austria",
            2
        )

        val question3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Brazil", "Zimbabwe", "South Africa",
            1
        )

        val question4 = Question(
            14,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Australia", "Kuwait", "Palestine",
            3
        )

        val question5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Finland", "Australia", "New Zealand", "United States",
            3
        )

        val question6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Indonesia", "Nepal", "Bangladesh", "India",
            4
        )

        val question7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "India", "Belgium", "Germany", "Malaysia",
            3
        )

        val question8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Nepal", "Cyprus", "Israel",
            1
        )

        val question9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway", "Australia", "Armenia", "Denmark",
            4
        )

        val question10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Belgium", "Morocco", "Canada",
            1
        )

        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)
        questionsList.add(question6)
        questionsList.add(question7)
        questionsList.add(question8)
        questionsList.add(question9)
        questionsList.add(question10)

        return questionsList
    }
}