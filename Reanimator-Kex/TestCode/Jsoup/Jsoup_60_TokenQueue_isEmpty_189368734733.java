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

public class TokenQueue_isEmpty_189368734733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term1235;

    public TokenQueue_isEmpty_189368734733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term23, term23.getClass(), "queue", "sjlJAEtRrb");
        setIntField(term23, term23.getClass(), "pos", 568599855);
        term1235 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1235, term1235.getClass(), "queue", "sjlJAEtRrb");
        setIntField(term1235, term1235.getClass(), "pos", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term1235));
        assertTrue(recursiveEquals(retValue, false));
    }

};


