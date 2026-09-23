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

public class TreeBuilderState_isWhitespace_198456220359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96378;
     Object term111609;

    public TreeBuilderState_isWhitespace_198456220359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111617 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111616 = ((Class) term111617).getDeclaredField((String) "Character");
        ((Field) term111616).setAccessible(true);
        Object enum207 = ((Field) term111616).get((Object) null);
        term96378 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term96378, term96378.getClass(), "type", enum207);
        setField(term96378, term96378.getClass(), "data", "\n\n\n\t \t\n\t\n\n \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        Class<? extends Object> term112318 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term112317 = ((Class) term112318).getDeclaredField((String) "Character");
        ((Field) term112317).setAccessible(true);
        Object enum208 = ((Field) term112317).get((Object) null);
        term111609 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term111609, term111609.getClass(), "data", "\n\n\n\t \t\n\t\n\n \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        setField(term111609, term111609.getClass(), "type", enum208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term96378;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term96378, term111609));
        assertTrue(recursiveEquals(retValue, true));
    }

};


