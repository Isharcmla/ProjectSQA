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
     Object term108461;
     Object term109423;

    public TreeBuilderState_isWhitespace_198456220377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109431 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109430 = ((Class) term109431).getDeclaredField((String) "Character");
        ((Field) term109430).setAccessible(true);
        Object enum209 = ((Field) term109430).get((Object) null);
        term108461 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term108461, term108461.getClass(), "type", enum209);
        setField(term108461, term108461.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term109744 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109743 = ((Class) term109744).getDeclaredField((String) "Character");
        ((Field) term109743).setAccessible(true);
        Object enum210 = ((Field) term109743).get((Object) null);
        term109423 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term109423, term109423.getClass(), "data", "EndTag                                                                                                           ");
        setField(term109423, term109423.getClass(), "type", enum210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term108461;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term108461, term109423));
        assertTrue(recursiveEquals(retValue, false));
    }

};


