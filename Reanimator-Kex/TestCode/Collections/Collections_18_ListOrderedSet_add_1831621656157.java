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

public class ListOrderedSet_add_1831621656157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122184;

    public ListOrderedSet_add_1831621656157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122184 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122288 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122392 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122496 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122600 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122704 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122808 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term122912 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term122912, term122912.getClass(), "collection", null);
        setField(term122808, term122808.getClass(), "collection", term122912);
        setField(term122704, term122704.getClass(), "collection", term122808);
        setField(term122600, term122600.getClass(), "collection", term122704);
        setField(term122496, term122496.getClass(), "collection", term122600);
        setField(term122392, term122392.getClass(), "collection", term122496);
        setField(term122288, term122288.getClass(), "collection", term122392);
        setField(term122184, term122184.getClass(), "collection", term122288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "add", argTypes, term122184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


