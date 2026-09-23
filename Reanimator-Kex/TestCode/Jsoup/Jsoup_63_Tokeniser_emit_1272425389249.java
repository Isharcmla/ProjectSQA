package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_1272425389249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223697;
     Object term223829;
     Object term224293;
     Object term224300;

    public Tokeniser_emit_1272425389249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223697 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term223765 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term223697, term223697.getClass(), "isEmitPending", false);
        setField(term223697, term223697.getClass(), "emitPending", null);
        setField(term223697, term223697.getClass(), "errors", term223765);
        Class<? extends Object> term224306 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224305 = ((Class) term224306).getDeclaredField((String) "EndTag");
        ((Field) term224305).setAccessible(true);
        Object enum487 = ((Field) term224305).get((Object) null);
        term223829 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term223995 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term223829, term223829.getClass(), "type", enum487);
        setField(term223829, term223829.getClass(), "attributes", term223995);
        Class<? extends Object> term224491 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224490 = ((Class) term224491).getDeclaredField((String) "EndTag");
        ((Field) term224490).setAccessible(true);
        Object enum488 = ((Field) term224490).get((Object) null);
        term224293 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term224294 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term224295 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term224296 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term224293, term224293.getClass(), "reader", null);
        setIntField(term224294, term224294.getClass(), "maxSize", 0);
        setField(term224294, term224294.getClass(), "elementData", null);
        setIntField(term224294, term224294.getClass(), "size", 0);
        setIntField(term224294, term224294.getClass(), "modCount", 0);
        setField(term224293, term224293.getClass(), "errors", term224294);
        setField(term224293, term224293.getClass(), "state", null);
        setField(term224295, term224295.getClass(), "tagName", null);
        setField(term224295, term224295.getClass(), "normalName", null);
        setField(term224295, term224295.getClass(), "pendingAttributeName", null);
        setField(term224295, term224295.getClass(), "pendingAttributeValue", null);
        setField(term224295, term224295.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term224295, term224295.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term224295, term224295.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term224295, term224295.getClass(), "selfClosing", false);
        setField(term224296, term224296.getClass(), "attributes", null);
        setField(term224295, term224295.getClass(), "attributes", term224296);
        setField(term224295, term224295.getClass(), "type", enum488);
        setField(term224293, term224293.getClass(), "emitPending", term224295);
        setBooleanField(term224293, term224293.getClass(), "isEmitPending", true);
        setField(term224293, term224293.getClass(), "charsString", null);
        setField(term224293, term224293.getClass(), "charsBuilder", null);
        setField(term224293, term224293.getClass(), "dataBuffer", null);
        setField(term224293, term224293.getClass(), "tagPending", null);
        setField(term224293, term224293.getClass(), "startPending", null);
        setField(term224293, term224293.getClass(), "endPending", null);
        setField(term224293, term224293.getClass(), "charPending", null);
        setField(term224293, term224293.getClass(), "doctypePending", null);
        setField(term224293, term224293.getClass(), "commentPending", null);
        setField(term224293, term224293.getClass(), "lastStartTag", null);
        setBooleanField(term224293, term224293.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term224293, term224293.getClass(), "codepointHolder", null);
        setField(term224293, term224293.getClass(), "multipointHolder", null);
        Class<? extends Object> term224676 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224675 = ((Class) term224676).getDeclaredField((String) "EndTag");
        ((Field) term224675).setAccessible(true);
        Object enum489 = ((Field) term224675).get((Object) null);
        term224300 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term224301 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term224300, term224300.getClass(), "tagName", null);
        setField(term224300, term224300.getClass(), "normalName", null);
        setField(term224300, term224300.getClass(), "pendingAttributeName", null);
        setField(term224300, term224300.getClass(), "pendingAttributeValue", null);
        setField(term224300, term224300.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term224300, term224300.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term224300, term224300.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term224300, term224300.getClass(), "selfClosing", false);
        setField(term224301, term224301.getClass(), "attributes", null);
        setField(term224300, term224300.getClass(), "attributes", term224301);
        setField(term224300, term224300.getClass(), "type", enum489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term223829;
        callMethod(klass, "emit", argTypes, term223697, args);
        assertTrue(recursiveEquals(term223697, term224293));
        assertTrue(recursiveEquals(term223829, term224300));
    }

};


