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

public class Attribute_equals_1077004087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146882;
     Object term146956;
     Object term146966;
     Object term146967;

    public Attribute_equals_1077004087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146882 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term146956 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        term146966 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term146966, term146966.getClass(), "key", null);
        setField(term146966, term146966.getClass(), "val", null);
        setField(term146966, term146966.getClass(), "parent", null);
        term146967 = newInstance(Class.forName("java.util.Vector$VectorSpliterator"));
        setField(term146967, term146967.getClass(), "array", null);
        setIntField(term146967, term146967.getClass(), "index", 0);
        setIntField(term146967, term146967.getClass(), "fence", 0);
        setIntField(term146967, term146967.getClass(), "expectedModCount", 0);
        setField(term146967, term146967.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146956;
        Object retValue = callMethod(klass, "equals", argTypes, term146882, args);
        assertTrue(recursiveEquals(term146882, term146966));
        assertTrue(recursiveEquals(term146956, term146967));
        assertTrue(recursiveEquals(retValue, false));
    }

};


