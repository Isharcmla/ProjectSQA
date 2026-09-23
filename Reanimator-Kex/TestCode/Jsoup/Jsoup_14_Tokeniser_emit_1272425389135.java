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

public class Tokeniser_emit_1272425389135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223091;
     Object term223229;
     Object term224065;
     Object term224070;

    public Tokeniser_emit_1272425389135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223091 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term223161 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setBooleanField(term223091, term223091.getClass(), "isEmitPending", false);
        setField(term223091, term223091.getClass(), "emitPending", term223161);
        setField(term223091, term223091.getClass(), "lastStartTag", null);
        Class<? extends Object> term224075 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224074 = ((Class) term224075).getDeclaredField((String) "StartTag");
        ((Field) term224074).setAccessible(true);
        Object enum792 = ((Field) term224074).get((Object) null);
        term223229 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term223229, term223229.getClass(), "type", enum792);
        setBooleanField(term223229, term223229.getClass(), "selfClosing", true);
        Class<? extends Object> term224266 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224265 = ((Class) term224266).getDeclaredField((String) "StartTag");
        ((Field) term224265).setAccessible(true);
        Object enum793 = ((Field) term224265).get((Object) null);
        term224065 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term224066 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term224065, term224065.getClass(), "reader", null);
        setBooleanField(term224065, term224065.getClass(), "trackErrors", false);
        setField(term224065, term224065.getClass(), "errors", null);
        setField(term224065, term224065.getClass(), "state", null);
        setField(term224066, term224066.getClass(), "tagName", null);
        setField(term224066, term224066.getClass(), "pendingAttributeName", null);
        setField(term224066, term224066.getClass(), "pendingAttributeValue", null);
        setBooleanField(term224066, term224066.getClass(), "selfClosing", true);
        setField(term224066, term224066.getClass(), "attributes", null);
        setField(term224066, term224066.getClass(), "type", enum793);
        setField(term224065, term224065.getClass(), "emitPending", term224066);
        setBooleanField(term224065, term224065.getClass(), "isEmitPending", true);
        setField(term224065, term224065.getClass(), "charBuffer", null);
        setField(term224065, term224065.getClass(), "dataBuffer", null);
        setField(term224065, term224065.getClass(), "tagPending", null);
        setField(term224065, term224065.getClass(), "doctypePending", null);
        setField(term224065, term224065.getClass(), "commentPending", null);
        setField(term224065, term224065.getClass(), "lastStartTag", term224066);
        setBooleanField(term224065, term224065.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term224457 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term224456 = ((Class) term224457).getDeclaredField((String) "StartTag");
        ((Field) term224456).setAccessible(true);
        Object enum794 = ((Field) term224456).get((Object) null);
        term224070 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term224070, term224070.getClass(), "tagName", null);
        setField(term224070, term224070.getClass(), "pendingAttributeName", null);
        setField(term224070, term224070.getClass(), "pendingAttributeValue", null);
        setBooleanField(term224070, term224070.getClass(), "selfClosing", true);
        setField(term224070, term224070.getClass(), "attributes", null);
        setField(term224070, term224070.getClass(), "type", enum794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term223229;
        callMethod(klass, "emit", argTypes, term223091, args);
        assertTrue(recursiveEquals(term223091, term224065));
        assertTrue(recursiveEquals(term223229, term224070));
    }

};


