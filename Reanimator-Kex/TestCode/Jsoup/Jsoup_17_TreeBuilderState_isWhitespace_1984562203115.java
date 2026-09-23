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

public class TreeBuilderState_isWhitespace_1984562203115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201211;
     Object term213289;

    public TreeBuilderState_isWhitespace_1984562203115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213297 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213296 = ((Class) term213297).getDeclaredField((String) "Character");
        ((Field) term213296).setAccessible(true);
        Object enum253 = ((Field) term213296).get((Object) null);
        term201211 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term201211, term201211.getClass(), "type", enum253);
        setField(term201211, term201211.getClass(), "data", "          ");
        Class<? extends Object> term213502 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213501 = ((Class) term213502).getDeclaredField((String) "Character");
        ((Field) term213501).setAccessible(true);
        Object enum254 = ((Field) term213501).get((Object) null);
        term213289 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term213289, term213289.getClass(), "data", "          ");
        setField(term213289, term213289.getClass(), "type", enum254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term201211;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term201211, term213289));
        assertTrue(recursiveEquals(retValue, true));
    }

};


