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

public class Tokeniser_emit_1272425389197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197163;
     Object term197231;
     Object term198145;
     Object term198154;

    public Tokeniser_emit_1272425389197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197163 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term197163, term197163.getClass(), "isEmitPending", false);
        setField(term197163, term197163.getClass(), "emitPending", null);
        setField(term197163, term197163.getClass(), "lastStartTag", null);
        Class<? extends Object> term198161 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198160 = ((Class) term198161).getDeclaredField((String) "StartTag");
        ((Field) term198160).setAccessible(true);
        Object enum464 = ((Field) term198160).get((Object) null);
        term197231 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term197231, term197231.getClass(), "type", enum464);
        setField(term197231, term197231.getClass(), "tagName", "");
        setBooleanField(term197231, term197231.getClass(), "selfClosing", true);
        Class<? extends Object> term198352 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198351 = ((Class) term198352).getDeclaredField((String) "StartTag");
        ((Field) term198351).setAccessible(true);
        Object enum465 = ((Field) term198351).get((Object) null);
        term198145 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term198146 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term198145, term198145.getClass(), "reader", null);
        setField(term198145, term198145.getClass(), "errors", null);
        setField(term198145, term198145.getClass(), "state", null);
        setField(term198146, term198146.getClass(), "tagName", "");
        setField(term198146, term198146.getClass(), "normalName", null);
        setField(term198146, term198146.getClass(), "pendingAttributeName", null);
        setField(term198146, term198146.getClass(), "pendingAttributeValue", null);
        setField(term198146, term198146.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term198146, term198146.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term198146, term198146.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term198146, term198146.getClass(), "selfClosing", true);
        setField(term198146, term198146.getClass(), "attributes", null);
        setField(term198146, term198146.getClass(), "type", enum465);
        setField(term198145, term198145.getClass(), "emitPending", term198146);
        setBooleanField(term198145, term198145.getClass(), "isEmitPending", true);
        setField(term198145, term198145.getClass(), "charsString", null);
        setField(term198145, term198145.getClass(), "charsBuilder", null);
        setField(term198145, term198145.getClass(), "dataBuffer", null);
        setField(term198145, term198145.getClass(), "tagPending", null);
        setField(term198145, term198145.getClass(), "startPending", null);
        setField(term198145, term198145.getClass(), "endPending", null);
        setField(term198145, term198145.getClass(), "charPending", null);
        setField(term198145, term198145.getClass(), "doctypePending", null);
        setField(term198145, term198145.getClass(), "commentPending", null);
        setField(term198145, term198145.getClass(), "lastStartTag", "");
        setBooleanField(term198145, term198145.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term198145, term198145.getClass(), "codepointHolder", null);
        setField(term198145, term198145.getClass(), "multipointHolder", null);
        Class<? extends Object> term198543 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198542 = ((Class) term198543).getDeclaredField((String) "StartTag");
        ((Field) term198542).setAccessible(true);
        Object enum466 = ((Field) term198542).get((Object) null);
        term198154 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term198154, term198154.getClass(), "tagName", "");
        setField(term198154, term198154.getClass(), "normalName", null);
        setField(term198154, term198154.getClass(), "pendingAttributeName", null);
        setField(term198154, term198154.getClass(), "pendingAttributeValue", null);
        setField(term198154, term198154.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term198154, term198154.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term198154, term198154.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term198154, term198154.getClass(), "selfClosing", true);
        setField(term198154, term198154.getClass(), "attributes", null);
        setField(term198154, term198154.getClass(), "type", enum466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term197231;
        callMethod(klass, "emit", argTypes, term197163, args);
        assertTrue(recursiveEquals(term197163, term198145));
        assertTrue(recursiveEquals(term197231, term198154));
    }

};


