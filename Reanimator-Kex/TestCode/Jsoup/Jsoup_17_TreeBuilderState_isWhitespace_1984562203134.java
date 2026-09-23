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

public class TreeBuilderState_isWhitespace_1984562203134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258966;
     Object term269805;

    public TreeBuilderState_isWhitespace_1984562203134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term269813 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term269812 = ((Class) term269813).getDeclaredField((String) "Character");
        ((Field) term269812).setAccessible(true);
        Object enum279 = ((Field) term269812).get((Object) null);
        term258966 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term258966, term258966.getClass(), "type", enum279);
        setField(term258966, term258966.getClass(), "data", "\t\n\t\n\n\t");
        Class<? extends Object> term270019 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term270018 = ((Class) term270019).getDeclaredField((String) "Character");
        ((Field) term270018).setAccessible(true);
        Object enum280 = ((Field) term270018).get((Object) null);
        term269805 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term269805, term269805.getClass(), "data", "\t\n\t\n\n\t");
        setField(term269805, term269805.getClass(), "type", enum280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term258966;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term258966, term269805));
        assertTrue(recursiveEquals(retValue, true));
    }

};


