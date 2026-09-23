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

public class SetUniqueList_addAll_765205654131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30799;

    public SetUniqueList_addAll_765205654131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30799 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30903 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31007 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term31007, term31007.getClass(), "collection", term31007);
        setField(term30903, term30903.getClass(), "collection", term31007);
        setField(term30799, term30799.getClass(), "collection", term30903);
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
            callMethod(klass, "addAll", argTypes, term30799, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


