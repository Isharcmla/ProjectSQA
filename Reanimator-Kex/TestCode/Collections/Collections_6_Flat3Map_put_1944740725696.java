package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166851;

    public Flat3Map_put_1944740725696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166851 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term166909 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setField(term166851, term166851.getClass(), "delegateMap", null);
        setIntField(term166851, term166851.getClass(), "size", 1);
        setIntField(term166851, term166851.getClass(), "hash1", 0);
        setField(term166851, term166851.getClass(), "value1", term166909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term166851;
        args[1] = null;
        callMethod(klass, "put", argTypes, term166851, args);
    }

};


