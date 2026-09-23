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

public class Flat3Map_put_1944740725803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213591;
     Object term213667;

    public Flat3Map_put_1944740725803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term213591, term213591.getClass(), "delegateMap", null);
        setIntField(term213591, term213591.getClass(), "size", 2);
        setIntField(term213591, term213591.getClass(), "hash2", 0);
        term213667 = newInstance(Class.forName("java.util.stream.SliceOps$SliceTask"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term213667;
        args[1] = null;
        callMethod(klass, "put", argTypes, term213591, args);
    }

};


