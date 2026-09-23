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

public class TreeBuilderState_isWhitespace_198456220388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114392;
     Object term118813;

    public TreeBuilderState_isWhitespace_198456220388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118821 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term118820 = ((Class) term118821).getDeclaredField((String) "Character");
        ((Field) term118820).setAccessible(true);
        Object enum216 = ((Field) term118820).get((Object) null);
        term114392 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term114392, term114392.getClass(), "type", enum216);
        setField(term114392, term114392.getClass(), "data", "\t\t\t");
        Class<? extends Object> term119021 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term119020 = ((Class) term119021).getDeclaredField((String) "Character");
        ((Field) term119020).setAccessible(true);
        Object enum217 = ((Field) term119020).get((Object) null);
        term118813 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term118813, term118813.getClass(), "data", "\t\t\t");
        setField(term118813, term118813.getClass(), "type", enum217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term114392;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term114392, term118813));
        assertTrue(recursiveEquals(retValue, true));
    }

};


