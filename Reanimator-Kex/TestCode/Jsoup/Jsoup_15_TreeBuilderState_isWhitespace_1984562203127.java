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

public class TreeBuilderState_isWhitespace_1984562203127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267188;
     Object term267598;

    public TreeBuilderState_isWhitespace_1984562203127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267606 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term267605 = ((Class) term267606).getDeclaredField((String) "Character");
        ((Field) term267605).setAccessible(true);
        Object enum278 = ((Field) term267605).get((Object) null);
        term267188 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term267188, term267188.getClass(), "type", enum278);
        setField(term267188, term267188.getClass(), "data", "\t\n");
        Class<? extends Object> term267804 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term267803 = ((Class) term267804).getDeclaredField((String) "Character");
        ((Field) term267803).setAccessible(true);
        Object enum279 = ((Field) term267803).get((Object) null);
        term267598 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term267598, term267598.getClass(), "data", "\t\n");
        setField(term267598, term267598.getClass(), "type", enum279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term267188;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term267188, term267598));
        assertTrue(recursiveEquals(retValue, true));
    }

};


