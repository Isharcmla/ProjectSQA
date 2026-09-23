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

public class Attribute_equals_10770040119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156710;
     Object term156783;
     Object term156979;
     Object term156982;

    public Attribute_equals_10770040119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156710 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156710, term156710.getClass(), "key", null);
        setField(term156710, term156710.getClass(), "val", "java.lang.Object");
        term156783 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156783, term156783.getClass(), "key", null);
        term156979 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156979, term156979.getClass(), "key", null);
        setField(term156979, term156979.getClass(), "val", "java.lang.Object");
        setField(term156979, term156979.getClass(), "parent", null);
        term156982 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156982, term156982.getClass(), "key", null);
        setField(term156982, term156982.getClass(), "val", null);
        setField(term156982, term156982.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156783;
        Object retValue = callMethod(klass, "equals", argTypes, term156710, args);
        assertTrue(recursiveEquals(term156710, term156979));
        assertTrue(recursiveEquals(term156783, term156982));
        assertTrue(recursiveEquals(retValue, false));
    }

};


