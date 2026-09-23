package org.apache.commons.collections.list;

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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_subList_1846553148129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30471;

    public SetUniqueList_subList_1846553148129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30471 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30575 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30679 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term30679, term30679.getClass(), "collection", term30679);
        setField(term30575, term30575.getClass(), "collection", term30679);
        setField(term30471, term30471.getClass(), "collection", term30575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        try {
            callMethod(klass, "subList", argTypes, term30471, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


