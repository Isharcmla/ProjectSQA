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
import java.lang.NullPointerException;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_removeAll_177008809126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29911;

    public SetUniqueList_removeAll_177008809126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29911 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30015 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30119 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term30015, term30015.getClass(), "collection", term30119);
        setField(term29911, term29911.getClass(), "collection", term30015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeAll", argTypes, term29911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


