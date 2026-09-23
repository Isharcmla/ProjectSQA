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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_getKey_136845192129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1208;
     Object term1605;

    public MultiKey_getKey_136845192129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1208 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term1096 = (Object[]) newArray("java.lang.Object", 489);
        setField(term1208, term1208.getClass(), "keys", term1096);
        term1605 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term1606 = (Object[]) newArray("java.lang.Object", 489);
        setField(term1605, term1605.getClass(), "keys", term1606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 488;
        Object retValue = callMethod(klass, "getKey", argTypes, term1208, args);
        assertTrue(recursiveEquals(term1208, term1605));
        assertTrue(recursiveEquals(retValue, null));
    }

};


