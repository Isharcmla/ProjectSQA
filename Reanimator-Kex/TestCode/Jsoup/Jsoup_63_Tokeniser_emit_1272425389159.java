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

public class Tokeniser_emit_1272425389159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166244;
     Object term166378;
     Object term166736;
     Object term166741;

    public Tokeniser_emit_1272425389159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166244 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term166310 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setBooleanField(term166244, term166244.getClass(), "isEmitPending", false);
        setField(term166244, term166244.getClass(), "emitPending", term166310);
        Class<? extends Object> term166746 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term166745 = ((Class) term166746).getDeclaredField((String) "StartTag");
        ((Field) term166745).setAccessible(true);
        Object enum446 = ((Field) term166745).get((Object) null);
        term166378 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term166378, term166378.getClass(), "type", enum446);
        Class<? extends Object> term166937 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term166936 = ((Class) term166937).getDeclaredField((String) "StartTag");
        ((Field) term166936).setAccessible(true);
        Object enum447 = ((Field) term166936).get((Object) null);
        term166736 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term166737 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term166736, term166736.getClass(), "reader", null);
        setField(term166736, term166736.getClass(), "errors", null);
        setField(term166736, term166736.getClass(), "state", null);
        setField(term166737, term166737.getClass(), "tagName", null);
        setField(term166737, term166737.getClass(), "normalName", null);
        setField(term166737, term166737.getClass(), "pendingAttributeName", null);
        setField(term166737, term166737.getClass(), "pendingAttributeValue", null);
        setField(term166737, term166737.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term166737, term166737.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term166737, term166737.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term166737, term166737.getClass(), "selfClosing", false);
        setField(term166737, term166737.getClass(), "attributes", null);
        setField(term166737, term166737.getClass(), "type", enum447);
        setField(term166736, term166736.getClass(), "emitPending", term166737);
        setBooleanField(term166736, term166736.getClass(), "isEmitPending", true);
        setField(term166736, term166736.getClass(), "charsString", null);
        setField(term166736, term166736.getClass(), "charsBuilder", null);
        setField(term166736, term166736.getClass(), "dataBuffer", null);
        setField(term166736, term166736.getClass(), "tagPending", null);
        setField(term166736, term166736.getClass(), "startPending", null);
        setField(term166736, term166736.getClass(), "endPending", null);
        setField(term166736, term166736.getClass(), "charPending", null);
        setField(term166736, term166736.getClass(), "doctypePending", null);
        setField(term166736, term166736.getClass(), "commentPending", null);
        setField(term166736, term166736.getClass(), "lastStartTag", null);
        setBooleanField(term166736, term166736.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term166736, term166736.getClass(), "codepointHolder", null);
        setField(term166736, term166736.getClass(), "multipointHolder", null);
        Class<? extends Object> term167128 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term167127 = ((Class) term167128).getDeclaredField((String) "StartTag");
        ((Field) term167127).setAccessible(true);
        Object enum448 = ((Field) term167127).get((Object) null);
        term166741 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term166741, term166741.getClass(), "tagName", null);
        setField(term166741, term166741.getClass(), "normalName", null);
        setField(term166741, term166741.getClass(), "pendingAttributeName", null);
        setField(term166741, term166741.getClass(), "pendingAttributeValue", null);
        setField(term166741, term166741.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term166741, term166741.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term166741, term166741.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term166741, term166741.getClass(), "selfClosing", false);
        setField(term166741, term166741.getClass(), "attributes", null);
        setField(term166741, term166741.getClass(), "type", enum448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term166378;
        callMethod(klass, "emit", argTypes, term166244, args);
        assertTrue(recursiveEquals(term166244, term166736));
        assertTrue(recursiveEquals(term166378, term166741));
    }

};


