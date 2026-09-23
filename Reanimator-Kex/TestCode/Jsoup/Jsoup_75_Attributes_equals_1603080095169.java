package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attributes_equals_1603080095169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346296;
     Object term346325;
     Object term346335;
     Object term346336;

    public Attributes_equals_1603080095169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346296 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term346296, term346296.getClass(), "size", 2048);
        term346325 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term346325, term346325.getClass(), "size", 0);
        term346335 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term346335, term346335.getClass(), "size", 2048);
        setField(term346335, term346335.getClass(), "keys", null);
        setField(term346335, term346335.getClass(), "vals", null);
        term346336 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term346336, term346336.getClass(), "size", 0);
        setField(term346336, term346336.getClass(), "keys", null);
        setField(term346336, term346336.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term346325;
        Object retValue = callMethod(klass, "equals", argTypes, term346296, args);
        assertTrue(recursiveEquals(term346296, term346335));
        assertTrue(recursiveEquals(term346325, term346336));
        assertTrue(recursiveEquals(retValue, false));
    }

};


