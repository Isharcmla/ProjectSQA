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

public class SetUniqueList_addAll_76526523690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20153;

    public SetUniqueList_addAll_76526523690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20153 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term20257 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term20361 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term20257, term20257.getClass(), "collection", term20361);
        setField(term20153, term20153.getClass(), "collection", term20257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addAll", argTypes, term20153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


