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

public class TreeBuilderState_isWhitespace_1984562203146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186094;
     Object term1333879;

    public TreeBuilderState_isWhitespace_1984562203146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1333887 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1333886 = ((Class) term1333887).getDeclaredField((String) "Character");
        ((Field) term1333886).setAccessible(true);
        Object enum297 = ((Field) term1333886).get((Object) null);
        term1186094 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1186094, term1186094.getClass(), "type", enum297);
        setField(term1186094, term1186094.getClass(), "data", "\t\n\n\t\n \n\n  \n\n\n\n  \t\n\n \t\n\n\n\n  \n \n\t\t\n\n\t\n\n\n\n\n\n\t \n\n\n\n\n\n\n\n\t\t\n\n\n\t\n\n\t \n\t\n\n\t\t   \n\n\n\t\n\t\n\n\n\t\n\n\n\t\t\n  \n\n\n\n\t\n\n\n\t\n\n\n\t\n\n\n\n\t\n\n\n\n\n\n\n\n\n\t\t\n\n\n\t\t\n \n\n\t\t \n\n \n\n\t\n\n\t\n\n\t\t\n\n\n\t\n\n\t\n    \n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\n\t\t\n\n\n\n\n \t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n \n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\t\n\n\t\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n                                              ");
        Class<? extends Object> term1335057 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1335056 = ((Class) term1335057).getDeclaredField((String) "Character");
        ((Field) term1335056).setAccessible(true);
        Object enum298 = ((Field) term1335056).get((Object) null);
        term1333879 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1333879, term1333879.getClass(), "data", "\t\n\n\t\n \n\n  \n\n\n\n  \t\n\n \t\n\n\n\n  \n \n\t\t\n\n\t\n\n\n\n\n\n\t \n\n\n\n\n\n\n\n\t\t\n\n\n\t\n\n\t \n\t\n\n\t\t   \n\n\n\t\n\t\n\n\n\t\n\n\n\t\t\n  \n\n\n\n\t\n\n\n\t\n\n\n\t\n\n\n\n\t\n\n\n\n\n\n\n\n\n\t\t\n\n\n\t\t\n \n\n\t\t \n\n \n\n\t\n\n\t\n\n\t\t\n\n\n\t\n\n\t\n    \n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\n\t\t\n\n\n\n\n \t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n \n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\t\n\n\t\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n                                              ");
        setField(term1333879, term1333879.getClass(), "type", enum298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1186094;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1186094, term1333879));
        assertTrue(recursiveEquals(retValue, true));
    }

};


