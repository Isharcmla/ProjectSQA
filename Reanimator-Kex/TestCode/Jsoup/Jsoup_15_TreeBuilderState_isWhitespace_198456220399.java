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

public class TreeBuilderState_isWhitespace_198456220399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205723;
     Object term206140;

    public TreeBuilderState_isWhitespace_198456220399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206148 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term206147 = ((Class) term206148).getDeclaredField((String) "Character");
        ((Field) term206147).setAccessible(true);
        Object enum248 = ((Field) term206147).get((Object) null);
        term205723 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term205723, term205723.getClass(), "type", enum248);
        setField(term205723, term205723.getClass(), "data", "\t\t\t");
        Class<? extends Object> term206348 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term206347 = ((Class) term206348).getDeclaredField((String) "Character");
        ((Field) term206347).setAccessible(true);
        Object enum249 = ((Field) term206347).get((Object) null);
        term206140 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term206140, term206140.getClass(), "data", "\t\t\t");
        setField(term206140, term206140.getClass(), "type", enum249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term205723;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term205723, term206140));
        assertTrue(recursiveEquals(retValue, true));
    }

};


