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

public class IteratorUtils_getIterator_1779268560183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22691;
     Object term23316;
     Object term23310;

    public IteratorUtils_getIterator_1779268560183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22691 = (Object[]) newArray("java.lang.Object", 0);
        term23316 = (Object[]) newArray("java.lang.Object", 0);
        term23310 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        Object[] term23311 = (Object[]) newArray("java.lang.Object", 0);
        setField(term23310, term23310.getClass(), "array", term23311);
        setIntField(term23310, term23310.getClass(), "startIndex", 0);
        setIntField(term23310, term23310.getClass(), "endIndex", 0);
        setIntField(term23310, term23310.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22691;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term22691, term23316));
        assertTrue(recursiveEquals(retValue, term23310));
    }

};


