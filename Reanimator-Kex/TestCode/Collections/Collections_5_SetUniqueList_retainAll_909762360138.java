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

public class SetUniqueList_retainAll_909762360138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34291;

    public SetUniqueList_retainAll_909762360138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34291 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term34395 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term34499 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term34499, term34499.getClass(), "collection", term34499);
        setField(term34395, term34395.getClass(), "collection", term34499);
        setField(term34291, term34291.getClass(), "collection", term34395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "retainAll", argTypes, term34291, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


