package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_calculateHashCode_93527685142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;
     Object term2104;
     Object term4558;
     Object term4559;

    public MultiKey_calculateHashCode_93527685142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term2104 = (Object[]) newArray("java.lang.Object", 491);
        Object term2350 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setElement(term2104, 0, term2350);
        setElement(term2104, 1, term2350);
        setElement(term2104, 2, term2350);
        term4558 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term4558, term4558.getClass(), "keys", null);
        term4559 = (Object[]) newArray("java.lang.Object", 491);
        Object term4560 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term4560, term4560.getClass(), "keys", null);
        setElement(term4559, 0, term4560);
        setElement(term4559, 1, term4560);
        setElement(term4559, 2, term4560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2104;
        callMethod(klass, "calculateHashCode", argTypes, term2246, args);
        assertTrue(recursiveEquals(term2246, term4558));
        assertTrue(recursiveEquals(term2104, term4559));
    }

};


