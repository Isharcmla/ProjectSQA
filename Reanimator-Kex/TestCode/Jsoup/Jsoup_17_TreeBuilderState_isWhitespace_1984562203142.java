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

public class TreeBuilderState_isWhitespace_1984562203142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401567;
     Object term702512;

    public TreeBuilderState_isWhitespace_1984562203142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term702520 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term702519 = ((Class) term702520).getDeclaredField((String) "Character");
        ((Field) term702519).setAccessible(true);
        Object enum291 = ((Field) term702519).get((Object) null);
        term401567 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term401567, term401567.getClass(), "type", enum291);
        setField(term401567, term401567.getClass(), "data", " \n\n\t   \n\n\t\n\n\n\n\t\t\t\n\n\n\n\n\n\n\n  \t\n\n\n\n\n\n\t\t\n\t\n\n\n\n\t\t\n\n\n\n\t\n\n\t\n\n\n\n\n\n\n\t\n\n\n\n\t\t  \n\t\n\t\n\t\n\n\n\t\t\n \n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\t\n\n\n\t\t\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\t\n\n\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n  \n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n");
        Class<? extends Object> term703206 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term703205 = ((Class) term703206).getDeclaredField((String) "Character");
        ((Field) term703205).setAccessible(true);
        Object enum292 = ((Field) term703205).get((Object) null);
        term702512 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term702512, term702512.getClass(), "data", " \n\n\t   \n\n\t\n\n\n\n\t\t\t\n\n\n\n\n\n\n\n  \t\n\n\n\n\n\n\t\t\n\t\n\n\n\n\t\t\n\n\n\n\t\n\n\t\n\n\n\n\n\n\n\t\n\n\n\n\t\t  \n\t\n\t\n\t\n\n\n\t\t\n \n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\t\n\n\n\t\t\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\t\n\n\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n  \n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n");
        setField(term702512, term702512.getClass(), "type", enum292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term401567;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term401567, term702512));
        assertTrue(recursiveEquals(retValue, true));
    }

};


