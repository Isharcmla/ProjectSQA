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

public class TreeBuilderState_isWhitespace_1984562203121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214406;
     Object term228755;

    public TreeBuilderState_isWhitespace_1984562203121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228763 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term228762 = ((Class) term228763).getDeclaredField((String) "Character");
        ((Field) term228762).setAccessible(true);
        Object enum262 = ((Field) term228762).get((Object) null);
        term214406 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term214406, term214406.getClass(), "type", enum262);
        setField(term214406, term214406.getClass(), "data", "\t");
        Class<? extends Object> term228959 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term228958 = ((Class) term228959).getDeclaredField((String) "Character");
        ((Field) term228958).setAccessible(true);
        Object enum263 = ((Field) term228958).get((Object) null);
        term228755 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term228755, term228755.getClass(), "data", "\t");
        setField(term228755, term228755.getClass(), "type", enum263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term214406;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term214406, term228755));
        assertTrue(recursiveEquals(retValue, true));
    }

};


