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

public class TokenQueue_remainingLength_180436434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term1274;

    public TokenQueue_remainingLength_180436434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term47, term47.getClass(), "queue", "MuLcgQHgqz");
        setIntField(term47, term47.getClass(), "pos", 1162663216);
        term1274 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1274, term1274.getClass(), "queue", "MuLcgQHgqz");
        setIntField(term1274, term1274.getClass(), "pos", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "remainingLength", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term1274));
        assertTrue(recursiveEquals(retValue, -1162663206));
    }

};


