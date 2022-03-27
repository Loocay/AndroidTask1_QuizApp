package com.quizapp

object Constants{

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "What does a compiler do?",
            "Translates computer code from machine level to byte code.",
            "Translates computer code from higher-level programming language to machine code.",
            "Translates computer code from lower-level programming language to higher-level programming language.",
            "Translates computer code from machine level to byte code.",
            2
        )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "Which of the following is not a programming language?",
            "TypeScript",
            "Python",
            "Anaconda",
            "Java",
            3
        )
        questionsList.add(q2)

        val q3 = Question(
            3,
            "Which of the following is an apt description for an algorithm?",
            "A process or set of rules to be followed in calculations or other problem-solving operations, especially by a computer.",
            "Program statements that run to execute a task.",
            "A set of instructions written in a programming language to perform a task.",
            "Set of instructions decoded from a high-level programming code to perform the task.",
            1
        )
        questionsList.add(q3)

        val q4 = Question(
            4,
            "Which of the following is not a type of computer code related to Program Execution?",
            "Source code",
            "Bytecode",
            "Machine Code",
            "Hex Code",
            4
        )
        questionsList.add(q4)

        val q5 = Question(
            5,
            "WhatsApp concurrent model is implemented using _____ programming language.",
            "Java",
            "Node.js",
            "Erlang",
            "C",
            3
        )
        questionsList.add(q5)

        val q6 = Question(
            6,
            "Python is _____ programming language.",
            "High-level",
            "Mid-level",
            "Low-level",
            "No, python is a snake",
            2
        )
        questionsList.add(q6)

        val q7 = Question(
            7,
            "Which of the following includes Chrome's V8 JavaScript Engine?",
            "jQuery",
            "Java",
            "npm",
            "Node.js",
            4
        )
        questionsList.add(q7)

        val q8 = Question(
            8,
            "A short sections of code written to complete a task.",
            "Array",
            "Loop",
            "Function",
            "Buffer",
            3
        )
        questionsList.add(q8)

        val q9 = Question(
            9,
            "What dose this equation mean ? a != t",
            "A is assigned t",
            "A is not equal to t",
            "T is add to a",
            "A and t are equal",
            2
        )
        questionsList.add(q9)

        val q10 = Question(
            10,
            "A memory location that holds a single letter or number is called _________.  ",
            "Char",
            "Int",
            "Word",
            "String",
            1
        )
        questionsList.add(q10)



        return questionsList
    }
}