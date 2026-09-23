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

public class SetUniqueList_removeAll_177008809119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29300;

    public SetUniqueList_removeAll_177008809119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29300 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term29404 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term29508 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term29508, term29508.getClass(), "collection", term29508);
        setField(term29404, term29404.getClass(), "collection", term29508);
        setField(term29300, term29300.getClass(), "collection", term29404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeAll", argTypes, term29300, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


