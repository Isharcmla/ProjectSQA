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

public class IteratorUtils_isEmpty_564450106368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55556;

    public IteratorUtils_isEmpty_564450106368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55556 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$KeySetIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term55556;
        try {
            callMethod(klass, "isEmpty", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


