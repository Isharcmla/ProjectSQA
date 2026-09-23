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

public class TreeBuilderState_isWhitespace_1984562203120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212338;
     Object term227795;

    public TreeBuilderState_isWhitespace_1984562203120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227803 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term227802 = ((Class) term227803).getDeclaredField((String) "Character");
        ((Field) term227802).setAccessible(true);
        Object enum260 = ((Field) term227802).get((Object) null);
        term212338 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term212338, term212338.getClass(), "type", enum260);
        setField(term212338, term212338.getClass(), "data", "\n \n\t\n \n\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        Class<? extends Object> term228501 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term228500 = ((Class) term228501).getDeclaredField((String) "Character");
        ((Field) term228500).setAccessible(true);
        Object enum261 = ((Field) term228500).get((Object) null);
        term227795 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term227795, term227795.getClass(), "data", "\n \n\t\n \n\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setField(term227795, term227795.getClass(), "type", enum261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term212338;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term212338, term227795));
        assertTrue(recursiveEquals(retValue, true));
    }

};


