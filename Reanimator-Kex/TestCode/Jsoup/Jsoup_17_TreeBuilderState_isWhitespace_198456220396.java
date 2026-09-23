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

public class TreeBuilderState_isWhitespace_198456220396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145154;
     Object term157122;

    public TreeBuilderState_isWhitespace_198456220396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157130 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157129 = ((Class) term157130).getDeclaredField((String) "Character");
        ((Field) term157129).setAccessible(true);
        Object enum228 = ((Field) term157129).get((Object) null);
        term145154 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term145154, term145154.getClass(), "type", enum228);
        setField(term145154, term145154.getClass(), "data", "\t \n\t   \t\n\n\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        Class<? extends Object> term157830 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term157829 = ((Class) term157830).getDeclaredField((String) "Character");
        ((Field) term157829).setAccessible(true);
        Object enum229 = ((Field) term157829).get((Object) null);
        term157122 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term157122, term157122.getClass(), "data", "\t \n\t   \t\n\n\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        setField(term157122, term157122.getClass(), "type", enum229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term145154;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term145154, term157122));
        assertTrue(recursiveEquals(retValue, false));
    }

};


