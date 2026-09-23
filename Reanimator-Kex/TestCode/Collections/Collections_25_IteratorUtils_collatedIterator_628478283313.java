package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IteratorUtils_collatedIterator_628478283313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42508;
     Object term42632;

    public IteratorUtils_collatedIterator_628478283313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42508 = newInstance(Class.forName("java.io.ObjectStreamClass$4"));
        term42632 = newInstance(Class.forName("org.apache.commons.collections4.iterators.CollatingIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Comparator");
        argTypes[1] = Class.forName("java.util.Iterator");
        argTypes[2] = Class.forName("java.util.Iterator");
        Object[] args = new Object[3];
        args[0] = term42508;
        args[1] = term42632;
        args[2] = null;
        try {
            callMethod(klass, "collatedIterator", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


