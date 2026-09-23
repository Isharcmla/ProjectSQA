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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_addAll_765205654124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31452;

    public SetUniqueList_addAll_765205654124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31452 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31556 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31660 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term31660, term31660.getClass(), "collection", term31660);
        setField(term31556, term31556.getClass(), "collection", term31660);
        setField(term31452, term31452.getClass(), "collection", term31556);
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
        callMethod(klass, "addAll", argTypes, term31452, args);
    }

};


