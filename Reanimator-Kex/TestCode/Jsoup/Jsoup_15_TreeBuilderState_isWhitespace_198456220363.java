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

public class TreeBuilderState_isWhitespace_198456220363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120467;
     Object term120933;

    public TreeBuilderState_isWhitespace_198456220363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120941 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term120940 = ((Class) term120941).getDeclaredField((String) "Character");
        ((Field) term120940).setAccessible(true);
        Object enum212 = ((Field) term120940).get((Object) null);
        term120467 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term120467, term120467.getClass(), "type", enum212);
        setField(term120467, term120467.getClass(), "data", "          ");
        Class<? extends Object> term121146 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term121145 = ((Class) term121146).getDeclaredField((String) "Character");
        ((Field) term121145).setAccessible(true);
        Object enum213 = ((Field) term121145).get((Object) null);
        term120933 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term120933, term120933.getClass(), "data", "          ");
        setField(term120933, term120933.getClass(), "type", enum213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term120467;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term120467, term120933));
        assertTrue(recursiveEquals(retValue, true));
    }

};


