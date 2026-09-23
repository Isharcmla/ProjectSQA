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
     Object term247394;
     Object term255834;

    public TreeBuilderState_isWhitespace_1984562203120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term255842 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term255841 = ((Class) term255842).getDeclaredField((String) "Character");
        ((Field) term255841).setAccessible(true);
        Object enum270 = ((Field) term255841).get((Object) null);
        term247394 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term247394, term247394.getClass(), "type", enum270);
        setField(term247394, term247394.getClass(), "data", "\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Class<? extends Object> term256529 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term256528 = ((Class) term256529).getDeclaredField((String) "Character");
        ((Field) term256528).setAccessible(true);
        Object enum271 = ((Field) term256528).get((Object) null);
        term255834 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term255834, term255834.getClass(), "data", "\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setField(term255834, term255834.getClass(), "type", enum271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term247394;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term247394, term255834));
        assertTrue(recursiveEquals(retValue, true));
    }

};


