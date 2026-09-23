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

public class TreeBuilderState_isWhitespace_1984562203109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177672;
     Object term195185;

    public TreeBuilderState_isWhitespace_1984562203109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195193 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term195192 = ((Class) term195193).getDeclaredField((String) "Character");
        ((Field) term195192).setAccessible(true);
        Object enum244 = ((Field) term195192).get((Object) null);
        term177672 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term177672, term177672.getClass(), "type", enum244);
        setField(term177672, term177672.getClass(), "data", "\n\n\n\n \n\n\n\t\n ");
        Class<? extends Object> term195409 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term195408 = ((Class) term195409).getDeclaredField((String) "Character");
        ((Field) term195408).setAccessible(true);
        Object enum245 = ((Field) term195408).get((Object) null);
        term195185 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term195185, term195185.getClass(), "data", "\n\n\n\n \n\n\n\t\n ");
        setField(term195185, term195185.getClass(), "type", enum245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term177672;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term177672, term195185));
        assertTrue(recursiveEquals(retValue, true));
    }

};


