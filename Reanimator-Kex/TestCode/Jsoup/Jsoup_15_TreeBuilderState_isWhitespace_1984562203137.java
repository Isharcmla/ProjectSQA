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

public class TreeBuilderState_isWhitespace_1984562203137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395810;
     Object term1400349;

    public TreeBuilderState_isWhitespace_1984562203137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1400357 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1400356 = ((Class) term1400357).getDeclaredField((String) "Character");
        ((Field) term1400356).setAccessible(true);
        Object enum293 = ((Field) term1400356).get((Object) null);
        term1395810 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1395810, term1395810.getClass(), "type", enum293);
        setField(term1395810, term1395810.getClass(), "data", "\n\n\t\n \t \t \t\t\n\n\n\n\n\n\n\t\n\n\t\n\n\n\n  \n\n\t \n\n\n\n\t\t\t\t\n\n \n\n\n\t\n\n\n\n\t\t\n\n\n\n\n\n\n\n\n\t\n\n    \n\n\n\t\n \n\n\n\t\n\n\t \n\n\n\n\t\n\n\t\n\n\n\n\n\t\n\n\n\n\n\n \n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n");
        Class<? extends Object> term1400979 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1400978 = ((Class) term1400979).getDeclaredField((String) "Character");
        ((Field) term1400978).setAccessible(true);
        Object enum294 = ((Field) term1400978).get((Object) null);
        term1400349 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1400349, term1400349.getClass(), "data", "\n\n\t\n \t \t \t\t\n\n\n\n\n\n\n\t\n\n\t\n\n\n\n  \n\n\t \n\n\n\n\t\t\t\t\n\n \n\n\n\t\n\n\n\n\t\t\n\n\n\n\n\n\n\n\n\t\n\n    \n\n\n\t\n \n\n\n\t\n\n\t \n\n\n\n\t\n\n\t\n\n\n\n\n\t\n\n\n\n\n\n \n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n");
        setField(term1400349, term1400349.getClass(), "type", enum294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1395810;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1395810, term1400349));
        assertTrue(recursiveEquals(retValue, true));
    }

};


