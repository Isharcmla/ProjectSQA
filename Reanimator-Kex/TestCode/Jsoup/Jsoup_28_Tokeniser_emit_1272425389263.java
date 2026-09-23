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

public class Tokeniser_emit_1272425389263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255355;
     Object term255489;
     Object term255845;
     Object term255850;

    public Tokeniser_emit_1272425389263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255355 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term255421 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setBooleanField(term255355, term255355.getClass(), "isEmitPending", false);
        setField(term255355, term255355.getClass(), "emitPending", term255421);
        setField(term255355, term255355.getClass(), "lastStartTag", null);
        Class<? extends Object> term255855 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term255854 = ((Class) term255855).getDeclaredField((String) "StartTag");
        ((Field) term255854).setAccessible(true);
        Object enum399 = ((Field) term255854).get((Object) null);
        term255489 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term255489, term255489.getClass(), "type", enum399);
        setBooleanField(term255489, term255489.getClass(), "selfClosing", true);
        Class<? extends Object> term256046 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term256045 = ((Class) term256046).getDeclaredField((String) "StartTag");
        ((Field) term256045).setAccessible(true);
        Object enum400 = ((Field) term256045).get((Object) null);
        term255845 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term255846 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term255845, term255845.getClass(), "reader", null);
        setField(term255845, term255845.getClass(), "errors", null);
        setField(term255845, term255845.getClass(), "state", null);
        setField(term255846, term255846.getClass(), "tagName", null);
        setField(term255846, term255846.getClass(), "pendingAttributeName", null);
        setField(term255846, term255846.getClass(), "pendingAttributeValue", null);
        setBooleanField(term255846, term255846.getClass(), "selfClosing", true);
        setField(term255846, term255846.getClass(), "attributes", null);
        setField(term255846, term255846.getClass(), "type", enum400);
        setField(term255845, term255845.getClass(), "emitPending", term255846);
        setBooleanField(term255845, term255845.getClass(), "isEmitPending", true);
        setField(term255845, term255845.getClass(), "charBuffer", null);
        setField(term255845, term255845.getClass(), "dataBuffer", null);
        setField(term255845, term255845.getClass(), "tagPending", null);
        setField(term255845, term255845.getClass(), "doctypePending", null);
        setField(term255845, term255845.getClass(), "commentPending", null);
        setField(term255845, term255845.getClass(), "lastStartTag", term255846);
        setBooleanField(term255845, term255845.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term256237 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term256236 = ((Class) term256237).getDeclaredField((String) "StartTag");
        ((Field) term256236).setAccessible(true);
        Object enum401 = ((Field) term256236).get((Object) null);
        term255850 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term255850, term255850.getClass(), "tagName", null);
        setField(term255850, term255850.getClass(), "pendingAttributeName", null);
        setField(term255850, term255850.getClass(), "pendingAttributeValue", null);
        setBooleanField(term255850, term255850.getClass(), "selfClosing", true);
        setField(term255850, term255850.getClass(), "attributes", null);
        setField(term255850, term255850.getClass(), "type", enum401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term255489;
        callMethod(klass, "emit", argTypes, term255355, args);
        assertTrue(recursiveEquals(term255355, term255845));
        assertTrue(recursiveEquals(term255489, term255850));
    }

};


