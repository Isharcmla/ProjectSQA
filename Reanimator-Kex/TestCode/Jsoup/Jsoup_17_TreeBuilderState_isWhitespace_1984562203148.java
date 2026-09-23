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

public class TreeBuilderState_isWhitespace_1984562203148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329906;
     Object term1386476;

    public TreeBuilderState_isWhitespace_1984562203148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1386484 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1386483 = ((Class) term1386484).getDeclaredField((String) "Character");
        ((Field) term1386483).setAccessible(true);
        Object enum300 = ((Field) term1386483).get((Object) null);
        term1329906 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1329906, term1329906.getClass(), "type", enum300);
        setField(term1329906, term1329906.getClass(), "data", "\n\n\n\n\n   \n\n\t\t\n\t\t\t\n\t\n\n\n\n\n\t\t  \t\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\t \n\n\n\n\n\n\t\n\t\n\n \t\n\n\t\t\n\n\t \t\t\t\n\t\n\n\n\n\t\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\u0001                                                                                                                                                                                                                                                                                                                                                                                          ");
        Class<? extends Object> term1387322 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1387321 = ((Class) term1387322).getDeclaredField((String) "Character");
        ((Field) term1387321).setAccessible(true);
        Object enum301 = ((Field) term1387321).get((Object) null);
        term1386476 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1386476, term1386476.getClass(), "data", "\n\n\n\n\n   \n\n\t\t\n\t\t\t\n\t\n\n\n\n\n\t\t  \t\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\t \n\n\n\n\n\n\t\n\t\n\n \t\n\n\t\t\n\n\t \t\t\t\n\t\n\n\n\n\t\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\u0001                                                                                                                                                                                                                                                                                                                                                                                          ");
        setField(term1386476, term1386476.getClass(), "type", enum301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1329906;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1329906, term1386476));
        assertTrue(recursiveEquals(retValue, false));
    }

};


