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

public class TreeBuilderState_isWhitespace_1984562203116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201789;
     Object term213798;

    public TreeBuilderState_isWhitespace_1984562203116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213806 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213805 = ((Class) term213806).getDeclaredField((String) "Character");
        ((Field) term213805).setAccessible(true);
        Object enum255 = ((Field) term213805).get((Object) null);
        term201789 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term201789, term201789.getClass(), "type", enum255);
        setField(term201789, term201789.getClass(), "data", "\t\n");
        Class<? extends Object> term214004 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term214003 = ((Class) term214004).getDeclaredField((String) "Character");
        ((Field) term214003).setAccessible(true);
        Object enum256 = ((Field) term214003).get((Object) null);
        term213798 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term213798, term213798.getClass(), "data", "\t\n");
        setField(term213798, term213798.getClass(), "type", enum256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term201789;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term201789, term213798));
        assertTrue(recursiveEquals(retValue, true));
    }

};


