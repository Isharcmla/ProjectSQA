package org.apache.commons.collections.keyvalue;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MultiKey_getKey_136845192120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term39;

    public MultiKey_getKey_136845192120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term34 = (Object[]) newArray("java.lang.Object", 4);
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        setElement(term34, 0, term35);
        setElement(term34, 1, term36);
        setElement(term34, 2, term37);
        setElement(term34, 3, term38);
        setField(term33, term33.getClass(), "keys", term34);
        term39 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39;
        try {
            callMethod(klass, "getKey", argTypes, term33, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


