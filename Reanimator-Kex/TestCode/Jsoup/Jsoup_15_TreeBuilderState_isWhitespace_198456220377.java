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

public class TreeBuilderState_isWhitespace_198456220377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163856;
     Object term164259;

    public TreeBuilderState_isWhitespace_198456220377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164267 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term164266 = ((Class) term164267).getDeclaredField((String) "Character");
        ((Field) term164266).setAccessible(true);
        Object enum227 = ((Field) term164266).get((Object) null);
        term163856 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term163856, term163856.getClass(), "type", enum227);
        setField(term163856, term163856.getClass(), "data", "\t");
        Class<? extends Object> term164463 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term164462 = ((Class) term164463).getDeclaredField((String) "Character");
        ((Field) term164462).setAccessible(true);
        Object enum228 = ((Field) term164462).get((Object) null);
        term164259 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term164259, term164259.getClass(), "data", "\t");
        setField(term164259, term164259.getClass(), "type", enum228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term163856;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term163856, term164259));
        assertTrue(recursiveEquals(retValue, true));
    }

};


