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

public class Attribute_equals_1077004095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151621;
     Object term151745;
     Object term151753;
     Object term151754;

    public Attribute_equals_1077004095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151621 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term151745 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueSpliterator"));
        term151753 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term151753, term151753.getClass(), "key", null);
        setField(term151753, term151753.getClass(), "val", null);
        setField(term151753, term151753.getClass(), "parent", null);
        term151754 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueSpliterator"));
        setField(term151754, term151754.getClass(), "comparator", null);
        setField(term151754, term151754.getClass(), "fence", null);
        setField(term151754, term151754.getClass(), "row", null);
        setField(term151754, term151754.getClass(), "current", null);
        setLongField(term151754, term151754.getClass(), "est", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151745;
        Object retValue = callMethod(klass, "equals", argTypes, term151621, args);
        assertTrue(recursiveEquals(term151621, term151753));
        assertTrue(recursiveEquals(term151745, term151754));
        assertTrue(recursiveEquals(retValue, false));
    }

};


