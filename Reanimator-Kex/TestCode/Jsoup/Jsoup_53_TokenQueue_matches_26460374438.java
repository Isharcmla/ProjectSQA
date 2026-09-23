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

public class TokenQueue_matches_26460374438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;
     Object term2268;

    public TokenQueue_matches_26460374438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term167, term167.getClass(), "queue", "MjGYSRKTNF");
        setIntField(term167, term167.getClass(), "pos", -616727354);
        term2268 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2268, term2268.getClass(), "queue", "MjGYSRKTNF");
        setIntField(term2268, term2268.getClass(), "pos", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "matches", argTypes, term167, args);
        assertTrue(recursiveEquals(term167, term2268));
    }

};


