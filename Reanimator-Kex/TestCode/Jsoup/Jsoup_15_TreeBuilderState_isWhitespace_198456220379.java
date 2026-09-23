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

public class TreeBuilderState_isWhitespace_198456220379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175861;
     Object term178754;

    public TreeBuilderState_isWhitespace_198456220379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178762 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term178761 = ((Class) term178762).getDeclaredField((String) "Character");
        ((Field) term178761).setAccessible(true);
        Object enum230 = ((Field) term178761).get((Object) null);
        term175861 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term175861, term175861.getClass(), "type", enum230);
        setField(term175861, term175861.getClass(), "data", "\t \n\t   \t\n\n\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        Class<? extends Object> term179462 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term179461 = ((Class) term179462).getDeclaredField((String) "Character");
        ((Field) term179461).setAccessible(true);
        Object enum231 = ((Field) term179461).get((Object) null);
        term178754 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term178754, term178754.getClass(), "data", "\t \n\t   \t\n\n\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        setField(term178754, term178754.getClass(), "type", enum231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term175861;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term175861, term178754));
        assertTrue(recursiveEquals(retValue, false));
    }

};


