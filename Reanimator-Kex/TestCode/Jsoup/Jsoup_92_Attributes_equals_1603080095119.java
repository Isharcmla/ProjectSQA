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

public class Attributes_equals_1603080095119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84468;
     Object term84497;
     Object term84508;
     Object term84509;

    public Attributes_equals_1603080095119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84468 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term84497 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term84508 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84508, term84508.getClass(), "size", 0);
        setField(term84508, term84508.getClass(), "keys", null);
        setField(term84508, term84508.getClass(), "vals", null);
        term84509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84509, term84509.getClass(), "size", 0);
        setField(term84509, term84509.getClass(), "keys", null);
        setField(term84509, term84509.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84497;
        Object retValue = callMethod(klass, "equals", argTypes, term84468, args);
        assertTrue(recursiveEquals(term84468, term84508));
        assertTrue(recursiveEquals(term84497, term84509));
        assertTrue(recursiveEquals(retValue, true));
    }

};


