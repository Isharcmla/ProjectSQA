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

public class Attribute_equals_10770040111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154694;
     Object term154768;
     Object term154778;
     Object term154779;

    public Attribute_equals_10770040111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154694 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154768 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        term154778 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154778, term154778.getClass(), "key", null);
        setField(term154778, term154778.getClass(), "val", null);
        setField(term154778, term154778.getClass(), "parent", null);
        term154779 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        setField(term154779, term154779.getClass(), "array", null);
        setIntField(term154779, term154779.getClass(), "index", 0);
        setIntField(term154779, term154779.getClass(), "fence", 0);
        setIntField(term154779, term154779.getClass(), "expectedModCount", 0);
        setField(term154779, term154779.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154768;
        Object retValue = callMethod(klass, "equals", argTypes, term154694, args);
        assertTrue(recursiveEquals(term154694, term154778));
        assertTrue(recursiveEquals(term154768, term154779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


