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

public class TreeBuilderState_isWhitespace_198456220374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157634;
     Object term162164;

    public TreeBuilderState_isWhitespace_198456220374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162172 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term162171 = ((Class) term162172).getDeclaredField((String) "Character");
        ((Field) term162171).setAccessible(true);
        Object enum222 = ((Field) term162171).get((Object) null);
        term157634 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term157634, term157634.getClass(), "type", enum222);
        setField(term157634, term157634.getClass(), "data", "\n\t\n\t \n\n\n\t\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        Class<? extends Object> term162872 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term162871 = ((Class) term162872).getDeclaredField((String) "Character");
        ((Field) term162871).setAccessible(true);
        Object enum223 = ((Field) term162871).get((Object) null);
        term162164 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term162164, term162164.getClass(), "data", "\n\t\n\t \n\n\n\t\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        setField(term162164, term162164.getClass(), "type", enum223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term157634;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term157634, term162164));
        assertTrue(recursiveEquals(retValue, true));
    }

};


