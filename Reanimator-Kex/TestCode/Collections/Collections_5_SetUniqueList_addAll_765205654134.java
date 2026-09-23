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

public class SetUniqueList_addAll_765205654134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33632;

    public SetUniqueList_addAll_765205654134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33632 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term33736 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term33840 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term33840, term33840.getClass(), "collection", term33840);
        setField(term33736, term33736.getClass(), "collection", term33840);
        setField(term33632, term33632.getClass(), "collection", term33736);
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
            callMethod(klass, "addAll", argTypes, term33632, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


