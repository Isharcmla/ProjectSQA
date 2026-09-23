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

public class TreeBuilderState_isWhitespace_198456220341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74946;
     Object term74952;

    public TreeBuilderState_isWhitespace_198456220341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74946 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        term74952 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term74952, term74952.getClass(), "data", null);
        setField(term74952, term74952.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term74946;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term74946, term74952));
        assertTrue(recursiveEquals(retValue, false));
    }

};


