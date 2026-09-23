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

public class IteratorUtils_arrayIterator_123527643197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24088;
     Object term24131;
     Object term24123;

    public IteratorUtils_arrayIterator_123527643197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24088 = (Object[]) newArray("java.lang.Object", 489);
        term24131 = (Object[]) newArray("java.lang.Object", 489);
        term24123 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        Object[] term24124 = (Object[]) newArray("java.lang.Object", 489);
        setField(term24123, term24123.getClass(), "array", term24124);
        setIntField(term24123, term24123.getClass(), "startIndex", 0);
        setIntField(term24123, term24123.getClass(), "endIndex", 489);
        setIntField(term24123, term24123.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term24088;
        args[1] = 0;
        args[2] = 489;
        Object retValue = callMethod(klass, "arrayIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term24088, term24131));
        assertTrue(recursiveEquals(retValue, term24123));
    }

};


