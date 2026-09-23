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

public class SetUniqueList_remove_1563697573103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23254;

    public SetUniqueList_remove_1563697573103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23254 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term23358 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term23462 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term23358, term23358.getClass(), "collection", term23462);
        setField(term23254, term23254.getClass(), "collection", term23358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "remove", argTypes, term23254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


