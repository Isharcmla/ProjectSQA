package org.apache.commons.collections4.list;

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
import static org.apache.commons.collections4.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SetUniqueList_addAll_60414084685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15408;
     Object term15514;

    public SetUniqueList_addAll_60414084685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15408 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        term15514 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term15514, term15514.getClass(), "collection", term15514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term15514;
        try {
            callMethod(klass, "addAll", argTypes, term15408, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


