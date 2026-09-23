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

public class IteratorUtils_toString_1330970036191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23888;
     Object term23929;

    public IteratorUtils_toString_1330970036191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23888 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        term23929 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        setField(term23929, term23929.getClass(), "self", null);
        setIntField(term23929, term23929.getClass(), "end", 0);
        setBooleanField(term23929, term23929.getClass(), "resolving", false);
        setField(term23929, term23929.getClass(), "ifNotPresent", null);
        setIntField(term23929, term23929.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term23888;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term23888, term23929));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


