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

public class Tokeniser_emit_1272425389193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155744;
     Object term155870;
     Object term156226;
     Object term156231;

    public Tokeniser_emit_1272425389193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155744 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term155802 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setBooleanField(term155744, term155744.getClass(), "isEmitPending", false);
        setField(term155744, term155744.getClass(), "emitPending", term155802);
        setField(term155744, term155744.getClass(), "lastStartTag", null);
        Class<? extends Object> term156236 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term156235 = ((Class) term156236).getDeclaredField((String) "StartTag");
        ((Field) term156235).setAccessible(true);
        Object enum341 = ((Field) term156235).get((Object) null);
        term155870 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term155870, term155870.getClass(), "type", enum341);
        setBooleanField(term155870, term155870.getClass(), "selfClosing", true);
        Class<? extends Object> term156427 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term156426 = ((Class) term156427).getDeclaredField((String) "StartTag");
        ((Field) term156426).setAccessible(true);
        Object enum342 = ((Field) term156426).get((Object) null);
        term156226 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term156227 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term156226, term156226.getClass(), "reader", null);
        setField(term156226, term156226.getClass(), "errors", null);
        setField(term156226, term156226.getClass(), "state", null);
        setField(term156227, term156227.getClass(), "tagName", null);
        setField(term156227, term156227.getClass(), "pendingAttributeName", null);
        setField(term156227, term156227.getClass(), "pendingAttributeValue", null);
        setBooleanField(term156227, term156227.getClass(), "selfClosing", true);
        setField(term156227, term156227.getClass(), "attributes", null);
        setField(term156227, term156227.getClass(), "type", enum342);
        setField(term156226, term156226.getClass(), "emitPending", term156227);
        setBooleanField(term156226, term156226.getClass(), "isEmitPending", true);
        setField(term156226, term156226.getClass(), "charBuffer", null);
        setField(term156226, term156226.getClass(), "dataBuffer", null);
        setField(term156226, term156226.getClass(), "tagPending", null);
        setField(term156226, term156226.getClass(), "doctypePending", null);
        setField(term156226, term156226.getClass(), "commentPending", null);
        setField(term156226, term156226.getClass(), "lastStartTag", term156227);
        setBooleanField(term156226, term156226.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term156618 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term156617 = ((Class) term156618).getDeclaredField((String) "StartTag");
        ((Field) term156617).setAccessible(true);
        Object enum343 = ((Field) term156617).get((Object) null);
        term156231 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term156231, term156231.getClass(), "tagName", null);
        setField(term156231, term156231.getClass(), "pendingAttributeName", null);
        setField(term156231, term156231.getClass(), "pendingAttributeValue", null);
        setBooleanField(term156231, term156231.getClass(), "selfClosing", true);
        setField(term156231, term156231.getClass(), "attributes", null);
        setField(term156231, term156231.getClass(), "type", enum343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term155870;
        callMethod(klass, "emit", argTypes, term155744, args);
        assertTrue(recursiveEquals(term155744, term156226));
        assertTrue(recursiveEquals(term155870, term156231));
    }

};


