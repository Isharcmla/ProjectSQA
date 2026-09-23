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

public class IteratorUtils_toString_1330970036276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37492;
     Object term37776;

    public IteratorUtils_toString_1330970036276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37492 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        term37776 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        setField(term37776, term37776.getClass(), "self", null);
        setIntField(term37776, term37776.getClass(), "end", 0);
        setBooleanField(term37776, term37776.getClass(), "resolving", false);
        setField(term37776, term37776.getClass(), "ifNotPresent", null);
        setIntField(term37776, term37776.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term37492;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term37492, term37776));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


