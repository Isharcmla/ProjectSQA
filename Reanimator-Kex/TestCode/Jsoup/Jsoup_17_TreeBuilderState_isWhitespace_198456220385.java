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

public class TreeBuilderState_isWhitespace_198456220385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112777;
     Object term113568;

    public TreeBuilderState_isWhitespace_198456220385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113576 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term113575 = ((Class) term113576).getDeclaredField((String) "Character");
        ((Field) term113575).setAccessible(true);
        Object enum212 = ((Field) term113575).get((Object) null);
        term112777 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term112777, term112777.getClass(), "type", enum212);
        setField(term112777, term112777.getClass(), "data", "\t            ");
        Class<? extends Object> term113784 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term113783 = ((Class) term113784).getDeclaredField((String) "Character");
        ((Field) term113783).setAccessible(true);
        Object enum213 = ((Field) term113783).get((Object) null);
        term113568 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term113568, term113568.getClass(), "data", "\t            ");
        setField(term113568, term113568.getClass(), "type", enum213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term112777;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term112777, term113568));
        assertTrue(recursiveEquals(retValue, true));
    }

};


