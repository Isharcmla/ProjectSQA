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

public class TreeBuilderState_isWhitespace_198456220343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72061;
     Object term73023;

    public TreeBuilderState_isWhitespace_198456220343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73031 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term73030 = ((Class) term73031).getDeclaredField((String) "Character");
        ((Field) term73030).setAccessible(true);
        Object enum177 = ((Field) term73030).get((Object) null);
        term72061 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term72061, term72061.getClass(), "type", enum177);
        setField(term72061, term72061.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term73344 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term73343 = ((Class) term73344).getDeclaredField((String) "Character");
        ((Field) term73343).setAccessible(true);
        Object enum178 = ((Field) term73343).get((Object) null);
        term73023 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term73023, term73023.getClass(), "data", "EndTag                                                                                                           ");
        setField(term73023, term73023.getClass(), "type", enum178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term72061;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term72061, term73023));
        assertTrue(recursiveEquals(retValue, false));
    }

};


