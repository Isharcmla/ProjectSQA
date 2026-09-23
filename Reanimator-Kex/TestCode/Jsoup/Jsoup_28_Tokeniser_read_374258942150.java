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

public class Tokeniser_read_374258942150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134661;
     Object term137018;
     Object term136978;

    public Tokeniser_read_374258942150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term134581 = (char[]) newCharArray(1);
        StringBuilder term134721 = new StringBuilder();
        ((StringBuilder) term134721).append(term134581);
        term134661 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term134661, term134661.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term134661, term134661.getClass(), "isEmitPending", true);
        setField(term134661, term134661.getClass(), "charBuffer", term134721);
        term137018 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term137019 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term137020 = (byte[]) newByteArray(16);
        setField(term137018, term137018.getClass(), "reader", null);
        setField(term137018, term137018.getClass(), "errors", null);
        setField(term137018, term137018.getClass(), "state", null);
        setField(term137018, term137018.getClass(), "emitPending", null);
        setBooleanField(term137018, term137018.getClass(), "isEmitPending", true);
        setField(term137019, term137019.getClass(), "value", term137020);
        setByteField(term137019, term137019.getClass(), "coder", (byte) 0);
        setIntField(term137019, term137019.getClass(), "count", 0);
        setField(term137018, term137018.getClass(), "charBuffer", term137019);
        setField(term137018, term137018.getClass(), "dataBuffer", null);
        setField(term137018, term137018.getClass(), "tagPending", null);
        setField(term137018, term137018.getClass(), "doctypePending", null);
        setField(term137018, term137018.getClass(), "commentPending", null);
        setField(term137018, term137018.getClass(), "lastStartTag", null);
        setBooleanField(term137018, term137018.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term137040 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term137039 = ((Class) term137040).getDeclaredField((String) "Character");
        ((Field) term137039).setAccessible(true);
        Object enum314 = ((Field) term137039).get((Object) null);
        term136978 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term136978, term136978.getClass(), "data", " ");
        setField(term136978, term136978.getClass(), "type", enum314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term134661, args);
        assertTrue(recursiveEquals(term134661, term137018));
        assertTrue(recursiveEquals(retValue, term136978));
    }

};


