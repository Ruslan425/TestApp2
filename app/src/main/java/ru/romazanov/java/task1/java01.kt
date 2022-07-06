package ru.romazanov.java.task1


/*
 val textView = findViewById<TextView>(R.id.textView)
        val numberText = findViewById<EditText>(R.id.editTextNumber3)
        val button2 = findViewById<Button>(R.id.button2)
        val number1 = findViewById<EditText>(R.id.editTextNumber)
        val number2 = findViewById<EditText>(R.id.editTextNumber2)
        val button3 = findViewById<Button>(R.id.button3)
        val button = findViewById<Button>(R.id.button)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val dateText = findViewById<TextView>(R.id.textView4)


        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        dateText.text = year.toString()

        val dpd = DatePickerDialog(this, { _, year, _, _ ->
            dateText.text = year.toString()
        }, year, month, day)


        button2.setOnClickListener {
            textView.text = Methods.one(number1.text.toString(), number2.text.toString()).toString()
        }

        button3.setOnClickListener {
            textView.text = Methods.two(numberText.text.toString())
        }

        button.setOnClickListener {
            textView.text = Methods.three(numberText.text.toString()).toString()
        }

        button4.setOnClickListener {
            textView.text = Methods.four(number1.text.toString(), number2.text.toString())
        }

        button5.setOnClickListener {
            textView.text = Methods.five(dateText.text.toString()).toString()
        }

        dateText.setOnClickListener {
            dpd.show()
        }
 */