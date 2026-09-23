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

public class IteratorUtils_arrayIterator_666302615214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25450;
     Object term25583;
     Object term25575;

    public IteratorUtils_arrayIterator_666302615214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25450 = (Object[]) newArray("java.lang.Object", 490);
        term25583 = (Object[]) newArray("java.lang.Object", 490);
        term25575 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        Object[] term25576 = (Object[]) newArray("java.lang.Object", 490);
        setField(term25575, term25575.getClass(), "array", term25576);
        setIntField(term25575, term25575.getClass(), "startIndex", 235);
        setIntField(term25575, term25575.getClass(), "endIndex", 490);
        setIntField(term25575, term25575.getClass(), "index", 235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25450;
        args[1] = 235;
        Object retValue = callMethod(klass, "arrayIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25450, term25583));
        assertTrue(recursiveEquals(retValue, term25575));
    }

};


