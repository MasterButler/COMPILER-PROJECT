package packageA;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class JavaBaseErrorListener extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        
        SyntaxErrorCollector.getInstance().recordError(line, charPositionInLine, msg);
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }
    
     
}
