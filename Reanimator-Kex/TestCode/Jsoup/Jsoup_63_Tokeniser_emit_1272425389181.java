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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177265;
     Object term177329;
     Object term177680;
     Object term177685;

    public Tokeniser_emit_1272425389181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177265 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term177265, term177265.getClass(), "isEmitPending", false);
        setField(term177265, term177265.getClass(), "emitPending", null);
        Class<? extends Object> term177690 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term177689 = ((Class) term177690).getDeclaredField((String) "EndTag");
        ((Field) term177689).setAccessible(true);
        Object enum454 = ((Field) term177689).get((Object) null);
        term177329 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term177329, term177329.getClass(), "type", enum454);
        Class<? extends Object> term177875 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term177874 = ((Class) term177875).getDeclaredField((String) "EndTag");
        ((Field) term177874).setAccessible(true);
        Object enum455 = ((Field) term177874).get((Object) null);
        term177680 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term177681 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term177680, term177680.getClass(), "reader", null);
        setField(term177680, term177680.getClass(), "errors", null);
        setField(term177680, term177680.getClass(), "state", null);
        setField(term177681, term177681.getClass(), "tagName", null);
        setField(term177681, term177681.getClass(), "normalName", null);
        setField(term177681, term177681.getClass(), "pendingAttributeName", null);
        setField(term177681, term177681.getClass(), "pendingAttributeValue", null);
        setField(term177681, term177681.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term177681, term177681.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term177681, term177681.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term177681, term177681.getClass(), "selfClosing", false);
        setField(term177681, term177681.getClass(), "attributes", null);
        setField(term177681, term177681.getClass(), "type", enum455);
        setField(term177680, term177680.getClass(), "emitPending", term177681);
        setBooleanField(term177680, term177680.getClass(), "isEmitPending", true);
        setField(term177680, term177680.getClass(), "charsString", null);
        setField(term177680, term177680.getClass(), "charsBuilder", null);
        setField(term177680, term177680.getClass(), "dataBuffer", null);
        setField(term177680, term177680.getClass(), "tagPending", null);
        setField(term177680, term177680.getClass(), "startPending", null);
        setField(term177680, term177680.getClass(), "endPending", null);
        setField(term177680, term177680.getClass(), "charPending", null);
        setField(term177680, term177680.getClass(), "doctypePending", null);
        setField(term177680, term177680.getClass(), "commentPending", null);
        setField(term177680, term177680.getClass(), "lastStartTag", null);
        setBooleanField(term177680, term177680.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term177680, term177680.getClass(), "codepointHolder", null);
        setField(term177680, term177680.getClass(), "multipointHolder", null);
        Class<? extends Object> term178060 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term178059 = ((Class) term178060).getDeclaredField((String) "EndTag");
        ((Field) term178059).setAccessible(true);
        Object enum456 = ((Field) term178059).get((Object) null);
        term177685 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term177685, term177685.getClass(), "tagName", null);
        setField(term177685, term177685.getClass(), "normalName", null);
        setField(term177685, term177685.getClass(), "pendingAttributeName", null);
        setField(term177685, term177685.getClass(), "pendingAttributeValue", null);
        setField(term177685, term177685.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term177685, term177685.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term177685, term177685.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term177685, term177685.getClass(), "selfClosing", false);
        setField(term177685, term177685.getClass(), "attributes", null);
        setField(term177685, term177685.getClass(), "type", enum456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term177329;
        callMethod(klass, "emit", argTypes, term177265, args);
        assertTrue(recursiveEquals(term177265, term177680));
        assertTrue(recursiveEquals(term177329, term177685));
    }

};


