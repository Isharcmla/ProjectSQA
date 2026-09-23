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

public class SetUniqueList_addAll_76520565463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13131;

    public SetUniqueList_addAll_76520565463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13131 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term13235 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term13339 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term13235, term13235.getClass(), "collection", term13339);
        setField(term13131, term13131.getClass(), "collection", term13235);
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
            callMethod(klass, "addAll", argTypes, term13131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


