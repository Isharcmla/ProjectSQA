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

public class TreeBuilderState_isWhitespace_1984562203123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224417;
     Object term233276;

    public TreeBuilderState_isWhitespace_1984562203123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233284 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term233283 = ((Class) term233284).getDeclaredField((String) "Character");
        ((Field) term233283).setAccessible(true);
        Object enum266 = ((Field) term233283).get((Object) null);
        term224417 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term224417, term224417.getClass(), "type", enum266);
        setField(term224417, term224417.getClass(), "data", "\n\n\t\t \n\n\t \n\n\n");
        Class<? extends Object> term233502 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term233501 = ((Class) term233502).getDeclaredField((String) "Character");
        ((Field) term233501).setAccessible(true);
        Object enum267 = ((Field) term233501).get((Object) null);
        term233276 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term233276, term233276.getClass(), "data", "\n\n\t\t \n\n\t \n\n\n");
        setField(term233276, term233276.getClass(), "type", enum267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term224417;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term224417, term233276));
        assertTrue(recursiveEquals(retValue, true));
    }

};


