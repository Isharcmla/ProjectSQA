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

public class TreeBuilderState_isWhitespace_1984562203113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237148;
     Object term237611;

    public TreeBuilderState_isWhitespace_1984562203113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term237619 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term237618 = ((Class) term237619).getDeclaredField((String) "Character");
        ((Field) term237618).setAccessible(true);
        Object enum263 = ((Field) term237618).get((Object) null);
        term237148 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term237148, term237148.getClass(), "type", enum263);
        setField(term237148, term237148.getClass(), "data", "\t\n \t \t\n");
        Class<? extends Object> term237827 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term237826 = ((Class) term237827).getDeclaredField((String) "Character");
        ((Field) term237826).setAccessible(true);
        Object enum264 = ((Field) term237826).get((Object) null);
        term237611 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term237611, term237611.getClass(), "data", "\t\n \t \t\n");
        setField(term237611, term237611.getClass(), "type", enum264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term237148;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term237148, term237611));
        assertTrue(recursiveEquals(retValue, true));
    }

};


