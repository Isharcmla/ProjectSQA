package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class CollectionUtils_collect_1714056259118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9898;
     Object term9947;

    public CollectionUtils_collect_1714056259118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9898 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        term9947 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setField(term9947, term9947.getClass(), "this$0", null);
        setField(term9947, term9947.getClass(), "next", null);
        setField(term9947, term9947.getClass(), "lastReturned", null);
        setIntField(term9947, term9947.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections.Transformer");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term9898;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "collect", argTypes, null, args);
        assertTrue(recursiveEquals(term9898, null));
    }

};


