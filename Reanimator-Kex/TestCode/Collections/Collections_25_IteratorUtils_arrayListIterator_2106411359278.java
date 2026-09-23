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

public class IteratorUtils_arrayListIterator_2106411359278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37809;
     Object term37847;
     Object term37838;

    public IteratorUtils_arrayListIterator_2106411359278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37809 = (Object[]) newArray("java.lang.Object", 490);
        term37847 = (Object[]) newArray("java.lang.Object", 490);
        term37838 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        Object[] term37840 = (Object[]) newArray("java.lang.Object", 490);
        setIntField(term37838, term37838.getClass(), "lastItemIndex", -1);
        setField(term37838, term37838.getClass(), "array", term37840);
        setIntField(term37838, term37838.getClass(), "startIndex", 235);
        setIntField(term37838, term37838.getClass(), "endIndex", 490);
        setIntField(term37838, term37838.getClass(), "index", 235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term37809;
        args[1] = 235;
        args[2] = 490;
        Object retValue = callMethod(klass, "arrayListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term37809, term37847));
        assertTrue(recursiveEquals(retValue, term37838));
    }

};


