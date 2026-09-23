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

public class MultiValueMap_createCollection_175430867350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7867;
     Object term8215;

    public MultiValueMap_createCollection_175430867350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7867 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term8045 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory"));
        setField(term7867, term7867.getClass(), "collectionFactory", term8045);
        term8215 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term8216 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory"));
        setField(term8216, term8216.getClass(), "iPrototype", null);
        setField(term8215, term8215.getClass(), "collectionFactory", term8216);
        setField(term8215, term8215.getClass(), "values", null);
        setField(term8215, term8215.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term7867, args);
        assertTrue(recursiveEquals(term7867, term8215));
        assertTrue(recursiveEquals(retValue, null));
    }

};


