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

public class SetUniqueList_removeAll_17700880995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21824;

    public SetUniqueList_removeAll_17700880995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21824 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21928 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term22032 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term22136 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term22032, term22032.getClass(), "collection", term22136);
        setField(term21928, term21928.getClass(), "collection", term22032);
        setField(term21824, term21824.getClass(), "collection", term21928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeAll", argTypes, term21824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


