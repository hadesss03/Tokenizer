# Tokenizer
CLI tool that tokenizes C-like code into KEYWORDS (int,if,while), OPERATORS (+,-,*,/), and IDENTIFIERs. Enter code, see formatted token table. Menu-driven with loop. Basic lexer for compiler education.

🎯 Overview
Educational compiler that teaches lexical analysis, parsing, AST construction, and interpretation. Write, analyze, and run simplified C/C++ code while seeing each compiler phase.

✨ Features
Lexical Analysis - Tokenizes keywords, operators, numbers, strings
Recursive Descent Parsing - Proper operator precedence
AST Construction - Polymorphic node hierarchy
Interpretation - Executes with variable scope
I/O Support - cout<<, printf, cin>>
Control Flow - if-else, while loops
GUI Interface - See tokens + output simultaneously

🚀 Quick Start
Java Version (Recommended)
bash# Compile all classes
javac *.java

# Run
java MiniCompilerGUI
Supported Code Examples
cppint main() {
    int x = 5;
    int y = 10;
    cout << "Sum: " << x + y << endl;
}

📊 Workflow
textCode Input → Lexer (Tokens) → Parser (AST) → Interpreter (Execution)
           ↓
       GUI shows tokens + output
🛠 Supported Syntax
FeatureExamplesVariablesint x = 5;Arithmetic+ - * /Conditionsif (x > 0)Loopswhile (i < 10)Outputcout << "Hi"; printf("Hi %d", x);Inputcin >> x;

🎮 Sample Usage

Enter code in left panel
Click "Compile and Run"
View tokens in middle panel
See output in bottom panel

📁 Project Structure
text├── MiniCompilerGUI.java     # Main GUI

    ├── Lexer.java              # Tokenization
    
    ├── Parser.java             # Syntax analysis
    
    ├── AST Nodes               # Expression/Statement classes
    
    ├── InterpreterVisitor.java # Code execution
    
    └── TokenType.java          # Token enum

🎓 Learning Value
Visualize compiler phases
Experiment with syntax
Extend lexer/parser easily
Debug with token output

🏆 Credits
Author: Josh J. Pantalunan (BSCS 2B)
Purpose: Compiler design education
