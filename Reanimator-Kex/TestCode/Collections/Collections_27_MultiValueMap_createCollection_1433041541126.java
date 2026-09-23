package org.apache.commons.collections4.map;

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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MultiValueMap_createCollection_1433041541126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20940;

    public MultiValueMap_createCollection_1433041541126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36557 = Class.forName((String) "java.lang.ref.ReferenceQueue$Null");
        Class<? extends Object> term36731 = Class.forName((String) "java.lang.ref.Reference");
        Object[] term36732 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term36732, 0, term36731);
        Method term21158 = ((Class) term36557).getDeclaredMethod((String) "enqueue", (Class[]) term36732);
        ((Method) term21158).setAccessible(false);
        term20940 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term21104 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term21104, term21104.getClass(), "iCloneMethod", term21158);
        setField(term20940, term20940.getClass(), "collectionFactory", term21104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term20940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


