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
     Object term150381;
     Object term150455;
     Object term150465;
     Object term150466;

    public Attribute_equals_1077004095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150381 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term150455 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        term150465 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term150465, term150465.getClass(), "key", null);
        setField(term150465, term150465.getClass(), "val", null);
        setField(term150465, term150465.getClass(), "parent", null);
        term150466 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        setField(term150466, term150466.getClass(), "array", null);
        setIntField(term150466, term150466.getClass(), "index", 0);
        setIntField(term150466, term150466.getClass(), "fence", 0);
        setIntField(term150466, term150466.getClass(), "expectedModCount", 0);
        setField(term150466, term150466.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150455;
        Object retValue = callMethod(klass, "equals", argTypes, term150381, args);
        assertTrue(recursiveEquals(term150381, term150465));
        assertTrue(recursiveEquals(term150455, term150466));
        assertTrue(recursiveEquals(retValue, false));
    }

};


