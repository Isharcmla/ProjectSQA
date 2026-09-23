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

public class Attribute_equals_1077004061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138340;
     Object term138410;
     Object term138417;
     Object term138418;

    public Attribute_equals_1077004061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138340 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term138410 = newInstance(Class.forName("java.util.concurrent.Executors$2"));
        term138417 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term138417, term138417.getClass(), "key", null);
        setField(term138417, term138417.getClass(), "val", null);
        setField(term138417, term138417.getClass(), "parent", null);
        term138418 = newInstance(Class.forName("java.util.concurrent.Executors$2"));
        setField(term138418, term138418.getClass(), "val$action", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138410;
        Object retValue = callMethod(klass, "equals", argTypes, term138340, args);
        assertTrue(recursiveEquals(term138340, term138417));
        assertTrue(recursiveEquals(term138410, term138418));
        assertTrue(recursiveEquals(retValue, false));
    }

};


