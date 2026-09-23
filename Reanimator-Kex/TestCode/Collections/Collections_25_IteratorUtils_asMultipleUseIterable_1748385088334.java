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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.lang.Object;

public class IteratorUtils_asMultipleUseIterable_1748385088334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46906;
     Object term47632;
     Object term47628;

    public IteratorUtils_asMultipleUseIterable_1748385088334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46906 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyMapIterator"));
        term47632 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyMapIterator"));
        term47628 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable"));
        Object term47629 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyMapIterator"));
        Object term47630 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable$1"));
        setField(term47628, term47628.getClass(), "iterator", term47629);
        setField(term47630, term47630.getClass(), "val$iterator", term47629);
        setField(term47628, term47628.getClass(), "typeSafeIterator", term47630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term46906;
        Object retValue = callMethod(klass, "asMultipleUseIterable", argTypes, null, args);
        assertTrue(recursiveEquals(term46906, term47632));
        assertTrue(recursiveEquals(retValue, term47628));
    }

};


