package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Integer;

public class CollectionUtils_index_59023526977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term29;
     Object term4079;
     Object term4075;

    public CollectionUtils_index_59023526977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("java.lang.Object"));
        term29 = new Integer(568599855);
        term4079 = newInstance(Class.forName("java.lang.Object"));
        term4075 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = term29;
        Object retValue = callMethod(klass, "index", argTypes, null, args);
        assertTrue(recursiveEquals(term28, term4079));
        assertTrue(recursiveEquals(term29, 568599855));
        assertTrue(recursiveEquals(retValue, term4075));
    }

};


