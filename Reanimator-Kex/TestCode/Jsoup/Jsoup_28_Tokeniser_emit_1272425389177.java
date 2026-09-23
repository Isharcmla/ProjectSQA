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

public class Tokeniser_emit_1272425389177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156680;
     Object term156744;
     Object term157516;
     Object term157521;

    public Tokeniser_emit_1272425389177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156680 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term156680, term156680.getClass(), "isEmitPending", false);
        setField(term156680, term156680.getClass(), "emitPending", null);
        Class<? extends Object> term157526 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157525 = ((Class) term157526).getDeclaredField((String) "EndTag");
        ((Field) term157525).setAccessible(true);
        Object enum330 = ((Field) term157525).get((Object) null);
        term156744 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term156744, term156744.getClass(), "type", enum330);
        Class<? extends Object> term157711 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157710 = ((Class) term157711).getDeclaredField((String) "EndTag");
        ((Field) term157710).setAccessible(true);
        Object enum331 = ((Field) term157710).get((Object) null);
        term157516 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term157517 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term157516, term157516.getClass(), "reader", null);
        setField(term157516, term157516.getClass(), "errors", null);
        setField(term157516, term157516.getClass(), "state", null);
        setField(term157517, term157517.getClass(), "tagName", null);
        setField(term157517, term157517.getClass(), "pendingAttributeName", null);
        setField(term157517, term157517.getClass(), "pendingAttributeValue", null);
        setBooleanField(term157517, term157517.getClass(), "selfClosing", false);
        setField(term157517, term157517.getClass(), "attributes", null);
        setField(term157517, term157517.getClass(), "type", enum331);
        setField(term157516, term157516.getClass(), "emitPending", term157517);
        setBooleanField(term157516, term157516.getClass(), "isEmitPending", true);
        setField(term157516, term157516.getClass(), "charBuffer", null);
        setField(term157516, term157516.getClass(), "dataBuffer", null);
        setField(term157516, term157516.getClass(), "tagPending", null);
        setField(term157516, term157516.getClass(), "doctypePending", null);
        setField(term157516, term157516.getClass(), "commentPending", null);
        setField(term157516, term157516.getClass(), "lastStartTag", null);
        setBooleanField(term157516, term157516.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term157896 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157895 = ((Class) term157896).getDeclaredField((String) "EndTag");
        ((Field) term157895).setAccessible(true);
        Object enum332 = ((Field) term157895).get((Object) null);
        term157521 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term157521, term157521.getClass(), "tagName", null);
        setField(term157521, term157521.getClass(), "pendingAttributeName", null);
        setField(term157521, term157521.getClass(), "pendingAttributeValue", null);
        setBooleanField(term157521, term157521.getClass(), "selfClosing", false);
        setField(term157521, term157521.getClass(), "attributes", null);
        setField(term157521, term157521.getClass(), "type", enum332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term156744;
        callMethod(klass, "emit", argTypes, term156680, args);
        assertTrue(recursiveEquals(term156680, term157516));
        assertTrue(recursiveEquals(term156744, term157521));
    }

};


