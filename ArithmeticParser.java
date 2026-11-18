// Output created by jacc on Wed Nov 18 08:27:24 EST 2026


class ArithmeticParser implements ArithmeticTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 12:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 13:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 24;
                            continue;
                        case '+':
                            yyn = 6;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 14:
                    switch (yytok) {
                        case '(':
                        case NUMBER:
                        case error:
                            yyn = 27;
                            continue;
                    }
                    yyn = yyr4();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 15:
                    switch (yytok) {
                        case '*':
                            yyn = 7;
                            continue;
                        case '+':
                        case ENDINPUT:
                        case ')':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 16:
                    switch (yytok) {
                        case '(':
                        case NUMBER:
                        case error:
                            yyn = 27;
                            continue;
                    }
                    yyn = yyr5();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 17:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 18:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    switch (yytok) {
                        case NUMBER:
                            yyn = 4;
                            continue;
                        case '(':
                            yyn = 5;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 20:
                    switch (yytok) {
                        case '+':
                            yyn = 6;
                            continue;
                        case ')':
                            yyn = 11;
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 21:
                    switch (yytok) {
                        case '*':
                            yyn = 7;
                            continue;
                        case '+':
                        case ENDINPUT:
                        case ')':
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 27;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case '(':
                        case NUMBER:
                        case error:
                            yyn = 27;
                            continue;
                    }
                    yyn = yyr3();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    switch (yytok) {
                        case '(':
                        case NUMBER:
                        case error:
                            yyn = 27;
                            continue;
                    }
                    yyn = yyr6();
                    continue;

                case 24:
                    return true;
                case 25:
                    yyerror("stack overflow");
                case 26:
                    return false;
                case 27:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // Expr : Expr '+' Term
        yysp -= 3;
        return yypExpr();
    }

    private int yyr2() { // Expr : Term
        yysp -= 1;
        return yypExpr();
    }

    private int yypExpr() {
        switch (yyst[yysp-1]) {
            case 0: return 1;
            default: return 8;
        }
    }

    private int yyr5() { // Factor : NUMBER
        yysp -= 1;
        return yypFactor();
    }

    private int yyr6() { // Factor : '(' Expr ')'
        yysp -= 3;
        return yypFactor();
    }

    private int yypFactor() {
        switch (yyst[yysp-1]) {
            case 7: return 10;
            default: return 2;
        }
    }

    private int yyr3() { // Term : Term '*' Factor
        yysp -= 3;
        return yypTerm();
    }

    private int yyr4() { // Term : Factor
        yysp -= 1;
        return yypTerm();
    }

    private int yypTerm() {
        switch (yyst[yysp-1]) {
            case 6: return 9;
            default: return 3;
        }
    }

    protected String[] yyerrmsgs = {
    };

}
