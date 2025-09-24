package fr.ensibs.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import 'package:flutter/material.dart';

void main() {
    runApp(const CalculatorApp());
}

class CalculatorApp extends StatelessWidget {
  const CalculatorApp({super.key});

    @override
    Widget build(BuildContext context) {
        return MaterialApp(
                title: 'Calculator',
                theme: ThemeData(
                primarySwatch: Colors.blueGrey,
                visualDensity: VisualDensity.adaptivePlatformDensity,
                scaffoldBackgroundColor: Colors.black, // Dark background like Apple
      ),
        home: const CalculatorScreen(),
    );
    }
}

class CalculatorScreen extends StatefulWidget {
  const CalculatorScreen({super.key});

    @override
    State<CalculatorScreen> createState() => _CalculatorScreenState();
}

class _CalculatorScreenState extends State<CalculatorScreen> {
    // This will hold our current display value
    String _output = "0";

    @override
    Widget build(BuildContext context) {
        return Scaffold(
                body: SafeArea(
                child: Column(
                children: <Widget>[
        // Display area
        Expanded(
                child: Container(
                alignment: Alignment.bottomRight,
                padding: const EdgeInsets.all(20.0),
                child: Text(
                _output,
                style: const TextStyle(
                color: Colors.white,
                fontSize: 80.0,
                fontWeight: FontWeight.w300,
                  ),
                ),
              ),
            ),
        // Buttons will go here
        Column(
                children: <Widget>[
        // Row 1 of buttons
        _buildButtonRow(['AC', '+/-', '%', '/']),
        // Row 2 of buttons
        _buildButtonRow(['7', '8', '9', 'x']),
        // Row 3 of buttons
        _buildButtonRow(['4', '5', '6', '-']),
        // Row 4 of buttons
        _buildButtonRow(['1', '2', '3', '+']),
        // Row 5 of buttons (0 and .)
        _buildButtonRow(['0', '.', '=']),
              ],
            ),
          ],
        ),
      ),
    );
    }

    Widget _buildButtonRow(List<String> buttons) {
        // This is a placeholder for now, we'll build real buttons soon.
        return Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: buttons.map((buttonText) {
        return Container(
                margin: const EdgeInsets.all(8.0),
                width: 75.0, // Example size
                height: 75.0, // Example size
                decoration: BoxDecoration(
                color: Colors.grey[850],
                borderRadius: BorderRadius.circular(50.0),
          ),
        child: Center(
                child: Text(
                buttonText,
                style: const TextStyle(
                color: Colors.white,
                fontSize: 30.0,
              ),
            ),
          ),
        );
      }).toList(),
    );
    }
}