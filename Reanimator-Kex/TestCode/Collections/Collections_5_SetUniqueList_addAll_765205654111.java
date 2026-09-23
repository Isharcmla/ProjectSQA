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

public class SetUniqueList_addAll_765205654111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26957;

    public SetUniqueList_addAll_765205654111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26957 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27061 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27165 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27269 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term27165, term27165.getClass(), "collection", term27269);
        setField(term27061, term27061.getClass(), "collection", term27165);
        setField(term26957, term26957.getClass(), "collection", term27061);
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
            callMethod(klass, "addAll", argTypes, term26957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


