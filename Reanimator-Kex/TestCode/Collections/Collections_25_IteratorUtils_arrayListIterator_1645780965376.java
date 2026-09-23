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

public class IteratorUtils_arrayListIterator_1645780965376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56707;
     Object term56738;
     Object term56729;

    public IteratorUtils_arrayListIterator_1645780965376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56707 = (Object[]) newArray("java.lang.Object", 489);
        term56738 = (Object[]) newArray("java.lang.Object", 489);
        term56729 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        Object[] term56731 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term56729, term56729.getClass(), "lastItemIndex", -1);
        setField(term56729, term56729.getClass(), "array", term56731);
        setIntField(term56729, term56729.getClass(), "startIndex", 0);
        setIntField(term56729, term56729.getClass(), "endIndex", 489);
        setIntField(term56729, term56729.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term56707;
        args[1] = 0;
        Object retValue = callMethod(klass, "arrayListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term56707, term56738));
        assertTrue(recursiveEquals(retValue, term56729));
    }

};


