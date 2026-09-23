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

public class Tokeniser_emit_1272425389179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158393;
     Object term158531;
     Object term158887;
     Object term158892;

    public Tokeniser_emit_1272425389179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158393 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term158463 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setBooleanField(term158393, term158393.getClass(), "isEmitPending", false);
        setField(term158393, term158393.getClass(), "emitPending", term158463);
        Class<? extends Object> term158897 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term158896 = ((Class) term158897).getDeclaredField((String) "StartTag");
        ((Field) term158896).setAccessible(true);
        Object enum334 = ((Field) term158896).get((Object) null);
        term158531 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term158531, term158531.getClass(), "type", enum334);
        Class<? extends Object> term159088 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term159087 = ((Class) term159088).getDeclaredField((String) "StartTag");
        ((Field) term159087).setAccessible(true);
        Object enum335 = ((Field) term159087).get((Object) null);
        term158887 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term158888 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term158887, term158887.getClass(), "reader", null);
        setField(term158887, term158887.getClass(), "errors", null);
        setField(term158887, term158887.getClass(), "state", null);
        setField(term158888, term158888.getClass(), "tagName", null);
        setField(term158888, term158888.getClass(), "pendingAttributeName", null);
        setField(term158888, term158888.getClass(), "pendingAttributeValue", null);
        setBooleanField(term158888, term158888.getClass(), "selfClosing", false);
        setField(term158888, term158888.getClass(), "attributes", null);
        setField(term158888, term158888.getClass(), "type", enum335);
        setField(term158887, term158887.getClass(), "emitPending", term158888);
        setBooleanField(term158887, term158887.getClass(), "isEmitPending", true);
        setField(term158887, term158887.getClass(), "charBuffer", null);
        setField(term158887, term158887.getClass(), "dataBuffer", null);
        setField(term158887, term158887.getClass(), "tagPending", null);
        setField(term158887, term158887.getClass(), "doctypePending", null);
        setField(term158887, term158887.getClass(), "commentPending", null);
        setField(term158887, term158887.getClass(), "lastStartTag", term158888);
        setBooleanField(term158887, term158887.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term159279 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term159278 = ((Class) term159279).getDeclaredField((String) "StartTag");
        ((Field) term159278).setAccessible(true);
        Object enum336 = ((Field) term159278).get((Object) null);
        term158892 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term158892, term158892.getClass(), "tagName", null);
        setField(term158892, term158892.getClass(), "pendingAttributeName", null);
        setField(term158892, term158892.getClass(), "pendingAttributeValue", null);
        setBooleanField(term158892, term158892.getClass(), "selfClosing", false);
        setField(term158892, term158892.getClass(), "attributes", null);
        setField(term158892, term158892.getClass(), "type", enum336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term158531;
        callMethod(klass, "emit", argTypes, term158393, args);
        assertTrue(recursiveEquals(term158393, term158887));
        assertTrue(recursiveEquals(term158531, term158892));
    }

};


