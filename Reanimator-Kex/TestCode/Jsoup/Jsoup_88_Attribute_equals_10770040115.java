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

public class Attribute_equals_10770040115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157362;
     Object term157397;
     Object term157458;
     Object term157459;

    public Attribute_equals_10770040115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157362 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term157362, term157362.getClass(), "key", null);
        term157397 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term157397, term157397.getClass(), "key", "byte[]");
        term157458 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term157458, term157458.getClass(), "key", null);
        setField(term157458, term157458.getClass(), "val", null);
        setField(term157458, term157458.getClass(), "parent", null);
        term157459 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term157459, term157459.getClass(), "key", "byte[]");
        setField(term157459, term157459.getClass(), "val", null);
        setField(term157459, term157459.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term157397;
        Object retValue = callMethod(klass, "equals", argTypes, term157362, args);
        assertTrue(recursiveEquals(term157362, term157458));
        assertTrue(recursiveEquals(term157397, term157459));
        assertTrue(recursiveEquals(retValue, false));
    }

};


