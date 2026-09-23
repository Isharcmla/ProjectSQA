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

public class TreeBuilderState_isWhitespace_1984562203139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274915;
     Object term276280;

    public TreeBuilderState_isWhitespace_1984562203139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276288 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term276287 = ((Class) term276288).getDeclaredField((String) "Character");
        ((Field) term276287).setAccessible(true);
        Object enum287 = ((Field) term276287).get((Object) null);
        term274915 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term274915, term274915.getClass(), "type", enum287);
        setField(term274915, term274915.getClass(), "data", "\t\t\t\n");
        Class<? extends Object> term276490 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term276489 = ((Class) term276490).getDeclaredField((String) "Character");
        ((Field) term276489).setAccessible(true);
        Object enum288 = ((Field) term276489).get((Object) null);
        term276280 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term276280, term276280.getClass(), "data", "\t\t\t\n");
        setField(term276280, term276280.getClass(), "type", enum288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term274915;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term274915, term276280));
        assertTrue(recursiveEquals(retValue, true));
    }

};


