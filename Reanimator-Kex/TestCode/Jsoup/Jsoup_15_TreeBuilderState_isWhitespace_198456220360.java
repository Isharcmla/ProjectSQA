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

public class TreeBuilderState_isWhitespace_198456220360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105485;
     Object term115545;

    public TreeBuilderState_isWhitespace_198456220360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115553 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term115552 = ((Class) term115553).getDeclaredField((String) "Character");
        ((Field) term115552).setAccessible(true);
        Object enum209 = ((Field) term115552).get((Object) null);
        term105485 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term105485, term105485.getClass(), "type", enum209);
        setField(term105485, term105485.getClass(), "data", "\n\t\t  \t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Class<? extends Object> term116249 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term116248 = ((Class) term116249).getDeclaredField((String) "Character");
        ((Field) term116248).setAccessible(true);
        Object enum210 = ((Field) term116248).get((Object) null);
        term115545 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term115545, term115545.getClass(), "data", "\n\t\t  \t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term115545, term115545.getClass(), "type", enum210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term105485;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term105485, term115545));
        assertTrue(recursiveEquals(retValue, true));
    }

};


