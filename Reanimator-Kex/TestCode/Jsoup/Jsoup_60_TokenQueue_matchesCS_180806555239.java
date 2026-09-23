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

public class TokenQueue_matchesCS_180806555239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term2338;

    public TokenQueue_matchesCS_180806555239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term213, term213.getClass(), "queue", "RMFIsYGgne");
        setIntField(term213, term213.getClass(), "pos", -1955890973);
        term2338 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2338, term2338.getClass(), "queue", "RMFIsYGgne");
        setIntField(term2338, term2338.getClass(), "pos", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "matchesCS", argTypes, term213, args);
        assertTrue(recursiveEquals(term213, term2338));
    }

};


