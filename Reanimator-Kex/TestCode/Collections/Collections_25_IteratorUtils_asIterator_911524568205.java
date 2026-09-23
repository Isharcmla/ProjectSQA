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

public class IteratorUtils_asIterator_911524568205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24835;
     Object term25089;
     Object term25087;

    public IteratorUtils_asIterator_911524568205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24835 = newInstance(Class.forName("java.util.Collections$3"));
        term25089 = newInstance(Class.forName("java.util.Collections$3"));
        setField(term25089, term25089.getClass(), "i", null);
        setField(term25089, term25089.getClass(), "val$c", null);
        term25087 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EnumerationIterator"));
        Object term25088 = newInstance(Class.forName("java.util.Collections$3"));
        setField(term25087, term25087.getClass(), "collection", null);
        setField(term25088, term25088.getClass(), "i", null);
        setField(term25088, term25088.getClass(), "val$c", null);
        setField(term25087, term25087.getClass(), "enumeration", term25088);
        setField(term25087, term25087.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Enumeration");
        Object[] args = new Object[1];
        args[0] = term24835;
        Object retValue = callMethod(klass, "asIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term24835, term25089));
        assertTrue(recursiveEquals(retValue, term25087));
    }

};


