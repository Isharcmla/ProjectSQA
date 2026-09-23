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

public class IteratorUtils_toString_1330970036530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100126;
     Object term101254;
     Object term101255;

    public IteratorUtils_toString_1330970036530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100126 = newInstance(Class.forName("org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator"));
        term101254 = newInstance(Class.forName("org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator"));
        setField(term101254, term101254.getClass(), "this$0", null);
        setField(term101254, term101254.getClass(), "orderType", null);
        setField(term101254, term101254.getClass(), "lastReturnedNode", null);
        setField(term101254, term101254.getClass(), "nextNode", null);
        setField(term101254, term101254.getClass(), "previousNode", null);
        setIntField(term101254, term101254.getClass(), "expectedModifications", 0);
        term101255 = newInstance(Class.forName("org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator"));
        setField(term101255, term101255.getClass(), "this$0", null);
        setField(term101255, term101255.getClass(), "orderType", null);
        setField(term101255, term101255.getClass(), "lastReturnedNode", null);
        setField(term101255, term101255.getClass(), "nextNode", null);
        setField(term101255, term101255.getClass(), "previousNode", null);
        setIntField(term101255, term101255.getClass(), "expectedModifications", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term100126;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term100126, term101255));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


