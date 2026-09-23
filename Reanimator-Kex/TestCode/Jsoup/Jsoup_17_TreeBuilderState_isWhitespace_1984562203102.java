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

public class TreeBuilderState_isWhitespace_1984562203102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161146;
     Object term168629;

    public TreeBuilderState_isWhitespace_1984562203102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term168637 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term168636 = ((Class) term168637).getDeclaredField((String) "Character");
        ((Field) term168636).setAccessible(true);
        Object enum234 = ((Field) term168636).get((Object) null);
        term161146 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term161146, term161146.getClass(), "type", enum234);
        setField(term161146, term161146.getClass(), "data", "\t\n \t \t\n");
        Class<? extends Object> term168845 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term168844 = ((Class) term168845).getDeclaredField((String) "Character");
        ((Field) term168844).setAccessible(true);
        Object enum235 = ((Field) term168844).get((Object) null);
        term168629 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term168629, term168629.getClass(), "data", "\t\n \t \t\n");
        setField(term168629, term168629.getClass(), "type", enum235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term161146;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term161146, term168629));
        assertTrue(recursiveEquals(retValue, true));
    }

};


