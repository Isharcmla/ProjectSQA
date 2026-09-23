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

public class TreeBuilderState_isWhitespace_198456220373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104988;
     Object term106318;

    public TreeBuilderState_isWhitespace_198456220373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106326 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term106325 = ((Class) term106326).getDeclaredField((String) "Character");
        ((Field) term106325).setAccessible(true);
        Object enum203 = ((Field) term106325).get((Object) null);
        term104988 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term104988, term104988.getClass(), "type", enum203);
        setField(term104988, term104988.getClass(), "data", "");
        Class<? extends Object> term106520 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term106519 = ((Class) term106520).getDeclaredField((String) "Character");
        ((Field) term106519).setAccessible(true);
        Object enum204 = ((Field) term106519).get((Object) null);
        term106318 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term106318, term106318.getClass(), "data", "");
        setField(term106318, term106318.getClass(), "type", enum204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term104988;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term104988, term106318));
        assertTrue(recursiveEquals(retValue, true));
    }

};


