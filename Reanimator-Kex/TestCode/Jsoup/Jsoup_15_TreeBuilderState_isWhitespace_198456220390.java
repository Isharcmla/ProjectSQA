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

public class TreeBuilderState_isWhitespace_198456220390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195215;
     Object term196555;

    public TreeBuilderState_isWhitespace_198456220390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196563 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term196562 = ((Class) term196563).getDeclaredField((String) "Character");
        ((Field) term196562).setAccessible(true);
        Object enum240 = ((Field) term196562).get((Object) null);
        term195215 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term195215, term195215.getClass(), "type", enum240);
        setField(term195215, term195215.getClass(), "data", "\n\n\n\n \n\n\n\t\n ");
        Class<? extends Object> term196779 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term196778 = ((Class) term196779).getDeclaredField((String) "Character");
        ((Field) term196778).setAccessible(true);
        Object enum241 = ((Field) term196778).get((Object) null);
        term196555 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term196555, term196555.getClass(), "data", "\n\n\n\n \n\n\n\t\n ");
        setField(term196555, term196555.getClass(), "type", enum241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term195215;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term195215, term196555));
        assertTrue(recursiveEquals(retValue, true));
    }

};


