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

public class IteratorUtils_getIterator_1779268560152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17850;
     Object term19181;
     Object term19178;

    public IteratorUtils_getIterator_1779268560152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17850 = newInstance(Class.forName("java.util.Vector$1"));
        term19181 = newInstance(Class.forName("java.util.Vector$1"));
        setIntField(term19181, term19181.getClass(), "count", 0);
        setField(term19181, term19181.getClass(), "this$0", null);
        term19178 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EnumerationIterator"));
        Object term19179 = newInstance(Class.forName("java.util.Vector$1"));
        setField(term19178, term19178.getClass(), "collection", null);
        setIntField(term19179, term19179.getClass(), "count", 0);
        setField(term19179, term19179.getClass(), "this$0", null);
        setField(term19178, term19178.getClass(), "enumeration", term19179);
        setField(term19178, term19178.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17850;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term17850, term19181));
        assertTrue(recursiveEquals(retValue, term19178));
    }

};


