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

public class SetUniqueList_subList_1846553148104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24540;

    public SetUniqueList_subList_1846553148104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24540 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term24644 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term24748 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term24644, term24644.getClass(), "collection", term24748);
        setField(term24540, term24540.getClass(), "collection", term24644);
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
            callMethod(klass, "subList", argTypes, term24540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


