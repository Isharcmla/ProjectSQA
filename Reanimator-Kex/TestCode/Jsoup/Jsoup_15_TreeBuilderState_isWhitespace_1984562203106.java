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

public class TreeBuilderState_isWhitespace_1984562203106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218235;
     Object term222913;

    public TreeBuilderState_isWhitespace_1984562203106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222921 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term222920 = ((Class) term222921).getDeclaredField((String) "Character");
        ((Field) term222920).setAccessible(true);
        Object enum255 = ((Field) term222920).get((Object) null);
        term218235 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term218235, term218235.getClass(), "type", enum255);
        setField(term218235, term218235.getClass(), "data", "\n \n\t\n \n\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        Class<? extends Object> term223619 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term223618 = ((Class) term223619).getDeclaredField((String) "Character");
        ((Field) term223618).setAccessible(true);
        Object enum256 = ((Field) term223618).get((Object) null);
        term222913 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term222913, term222913.getClass(), "data", "\n \n\t\n \n\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setField(term222913, term222913.getClass(), "type", enum256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term218235;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term218235, term222913));
        assertTrue(recursiveEquals(retValue, true));
    }

};


