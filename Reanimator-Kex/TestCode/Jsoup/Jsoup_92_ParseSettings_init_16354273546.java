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
import java.lang.Boolean;

public class ParseSettings_init_16354273546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term6;
     Object term75;

    public ParseSettings_init_16354273546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = new Boolean(false);
        term6 = new Boolean(false);
        term75 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term75, term75.getClass(), "preserveTagCase", false);
        setBooleanField(term75, term75.getClass(), "preserveAttributeCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4;
        args[1] = term6;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75));
        assertTrue(recursiveEquals(term4, false));
        assertTrue(recursiveEquals(term6, false));
    }

};


