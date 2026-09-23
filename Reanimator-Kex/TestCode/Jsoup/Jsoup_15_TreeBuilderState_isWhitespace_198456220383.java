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

public class TreeBuilderState_isWhitespace_198456220383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189286;
     Object term190894;

    public TreeBuilderState_isWhitespace_198456220383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190902 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term190901 = ((Class) term190902).getDeclaredField((String) "Character");
        ((Field) term190901).setAccessible(true);
        Object enum233 = ((Field) term190901).get((Object) null);
        term189286 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term189286, term189286.getClass(), "type", enum233);
        setField(term189286, term189286.getClass(), "data", "\n\n\t\n   \t\u0001                                                                                                                                                                                                                                      ");
        Class<? extends Object> term191344 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term191343 = ((Class) term191344).getDeclaredField((String) "Character");
        ((Field) term191343).setAccessible(true);
        Object enum234 = ((Field) term191343).get((Object) null);
        term190894 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term190894, term190894.getClass(), "data", "\n\n\t\n   \t\u0001                                                                                                                                                                                                                                      ");
        setField(term190894, term190894.getClass(), "type", enum234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term189286;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term189286, term190894));
        assertTrue(recursiveEquals(retValue, false));
    }

};


