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
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_read_374258942227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337176;
     Object term337339;
     Object term337322;

    public Tokeniser_read_374258942227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term337094 = (char[]) newCharArray(1);
        StringBuilder term337236 = new StringBuilder();
        ((StringBuilder) term337236).append(term337094);
        term337176 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term337176, term337176.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term337176, term337176.getClass(), "trackErrors", false);
        setBooleanField(term337176, term337176.getClass(), "isEmitPending", true);
        setField(term337176, term337176.getClass(), "charBuffer", term337236);
        term337339 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term337340 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term337341 = (byte[]) newByteArray(16);
        setField(term337339, term337339.getClass(), "reader", null);
        setBooleanField(term337339, term337339.getClass(), "trackErrors", false);
        setField(term337339, term337339.getClass(), "errors", null);
        setField(term337339, term337339.getClass(), "state", null);
        setField(term337339, term337339.getClass(), "emitPending", null);
        setBooleanField(term337339, term337339.getClass(), "isEmitPending", true);
        setField(term337340, term337340.getClass(), "value", term337341);
        setByteField(term337340, term337340.getClass(), "coder", (byte) 0);
        setIntField(term337340, term337340.getClass(), "count", 0);
        setField(term337339, term337339.getClass(), "charBuffer", term337340);
        setField(term337339, term337339.getClass(), "dataBuffer", null);
        setField(term337339, term337339.getClass(), "tagPending", null);
        setField(term337339, term337339.getClass(), "doctypePending", null);
        setField(term337339, term337339.getClass(), "commentPending", null);
        setField(term337339, term337339.getClass(), "lastStartTag", null);
        setBooleanField(term337339, term337339.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term337361 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term337360 = ((Class) term337361).getDeclaredField((String) "Character");
        ((Field) term337360).setAccessible(true);
        Object enum902 = ((Field) term337360).get((Object) null);
        term337322 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term337322, term337322.getClass(), "data", " ");
        setField(term337322, term337322.getClass(), "type", enum902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term337176, args);
        assertTrue(recursiveEquals(term337176, term337339));
        assertTrue(recursiveEquals(retValue, term337322));
    }

};


