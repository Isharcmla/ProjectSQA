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

public class TreeBuilderState_isWhitespace_198456220393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117908;
     Object term149761;

    public TreeBuilderState_isWhitespace_198456220393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149769 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term149768 = ((Class) term149769).getDeclaredField((String) "Character");
        ((Field) term149768).setAccessible(true);
        Object enum222 = ((Field) term149768).get((Object) null);
        term117908 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term117908, term117908.getClass(), "type", enum222);
        setField(term117908, term117908.getClass(), "data", "\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Class<? extends Object> term150456 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term150455 = ((Class) term150456).getDeclaredField((String) "Character");
        ((Field) term150455).setAccessible(true);
        Object enum223 = ((Field) term150455).get((Object) null);
        term149761 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term149761, term149761.getClass(), "data", "\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setField(term149761, term149761.getClass(), "type", enum223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term117908;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term117908, term149761));
        assertTrue(recursiveEquals(retValue, true));
    }

};


