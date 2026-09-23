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

public class TreeBuilderState_isWhitespace_198456220391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196083;
     Object term197094;

    public TreeBuilderState_isWhitespace_198456220391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197102 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term197101 = ((Class) term197102).getDeclaredField((String) "Character");
        ((Field) term197101).setAccessible(true);
        Object enum242 = ((Field) term197101).get((Object) null);
        term196083 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term196083, term196083.getClass(), "type", enum242);
        setField(term196083, term196083.getClass(), "data", "\t\t\n\n \n\t\n\t\t");
        Class<? extends Object> term197316 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term197315 = ((Class) term197316).getDeclaredField((String) "Character");
        ((Field) term197315).setAccessible(true);
        Object enum243 = ((Field) term197315).get((Object) null);
        term197094 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term197094, term197094.getClass(), "data", "\t\t\n\n \n\t\n\t\t");
        setField(term197094, term197094.getClass(), "type", enum243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term196083;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term196083, term197094));
        assertTrue(recursiveEquals(retValue, true));
    }

};


