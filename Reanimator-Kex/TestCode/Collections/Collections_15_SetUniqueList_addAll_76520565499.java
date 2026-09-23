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

public class SetUniqueList_addAll_76520565499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22367;

    public SetUniqueList_addAll_76520565499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22367 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term22471 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term22575 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term22679 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term22575, term22575.getClass(), "collection", term22679);
        setField(term22471, term22471.getClass(), "collection", term22575);
        setField(term22367, term22367.getClass(), "collection", term22471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "addAll", argTypes, term22367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


