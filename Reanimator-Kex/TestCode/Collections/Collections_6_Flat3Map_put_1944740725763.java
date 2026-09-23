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

public class Flat3Map_put_1944740725763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191839;
     Object term192115;

    public Flat3Map_put_1944740725763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191931 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term191839, term191839.getClass(), "delegateMap", null);
        setIntField(term191839, term191839.getClass(), "size", 2);
        setIntField(term191839, term191839.getClass(), "hash2", 0);
        setField(term191931, term191931.getClass(), "delegateMap", null);
        setIntField(term191931, term191931.getClass(), "size", -3);
        setField(term191839, term191839.getClass(), "key2", term191931);
        setIntField(term191839, term191839.getClass(), "hash1", 0);
        setField(term192023, term192023.getClass(), "delegateMap", null);
        setIntField(term192023, term192023.getClass(), "size", 2);
        setField(term191839, term191839.getClass(), "key1", term192023);
        term192115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192209 = newInstance(Class.forName("java.util.concurrent.LinkedTransferQueue$Itr"));
        setField(term192115, term192115.getClass(), "delegateMap", null);
        setIntField(term192115, term192115.getClass(), "size", 2);
        setIntField(term192115, term192115.getClass(), "hash2", 0);
        setField(term192115, term192115.getClass(), "value2", null);
        setIntField(term192115, term192115.getClass(), "hash1", 0);
        setField(term192115, term192115.getClass(), "value1", null);
        setField(term192115, term192115.getClass(), "key2", term192209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term192115;
        args[1] = null;
        callMethod(klass, "put", argTypes, term191839, args);
    }

};


