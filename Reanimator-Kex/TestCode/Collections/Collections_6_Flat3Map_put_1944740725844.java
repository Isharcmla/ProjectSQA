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
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_put_1944740725844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219006;

    public Flat3Map_put_1944740725844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219006 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219081 = newInstance(Class.forName("java.lang.StackStreamFactory$LiveStackInfoTraverser$LiveStackFrameBuffer"));
        setField(term219006, term219006.getClass(), "delegateMap", null);
        setIntField(term219006, term219006.getClass(), "size", 3);
        setIntField(term219006, term219006.getClass(), "hash3", 0);
        setField(term219006, term219006.getClass(), "value3", term219081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term219006;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term219006, args);
        assertTrue(recursiveEquals(term219006, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


