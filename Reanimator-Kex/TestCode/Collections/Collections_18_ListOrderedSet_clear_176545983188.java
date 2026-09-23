package org.apache.commons.collections.set;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListOrderedSet_clear_176545983188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12661;

    public ListOrderedSet_clear_176545983188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12661 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term12765 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term12869 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term12765, term12765.getClass(), "collection", term12869);
        setField(term12661, term12661.getClass(), "collection", term12765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term12661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


