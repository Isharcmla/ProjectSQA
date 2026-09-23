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

public class IteratorUtils_toArray_1321955988346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49873;
     Object term50039;
     Object term50038;

    public IteratorUtils_toArray_1321955988346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49873 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        term50039 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        setField(term50039, term50039.getClass(), "this$0", null);
        setField(term50039, term50039.getClass(), "lastReturned", null);
        setField(term50039, term50039.getClass(), "next", null);
        setField(term50039, term50039.getClass(), "fenceKey", null);
        setIntField(term50039, term50039.getClass(), "expectedModCount", 0);
        term50038 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term49873;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term49873, term50039));
        assertTrue(recursiveEquals(retValue, term50038));
    }

};


