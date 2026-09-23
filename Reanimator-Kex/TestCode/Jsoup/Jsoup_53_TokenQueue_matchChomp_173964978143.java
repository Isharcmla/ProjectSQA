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

public class TokenQueue_matchChomp_173964978143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451;
     Object term3369;

    public TokenQueue_matchChomp_173964978143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term451, term451.getClass(), "queue", "pCTimMblYc");
        setIntField(term451, term451.getClass(), "pos", 1725571209);
        term3369 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term3369, term3369.getClass(), "queue", "pCTimMblYc");
        setIntField(term3369, term3369.getClass(), "pos", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        Object retValue = callMethod(klass, "matchChomp", argTypes, term451, args);
        assertTrue(recursiveEquals(term451, term3369));
        assertTrue(recursiveEquals(retValue, false));
    }

};


