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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MultiValueMap_createCollection_1754308673147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32591;

    public MultiValueMap_createCollection_1754308673147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38622 = Class.forName((String) "java.nio.file.attribute.AttributeView");
        Object[] term38781 = (Object[]) newArray("java.lang.Class", 0);
        Method term32807 = ((Class) term38622).getDeclaredMethod((String) "name", (Class[]) term38781);
        ((Method) term32807).setAccessible(false);
        term32591 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term32753 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term32753, term32753.getClass(), "iCloneMethod", term32807);
        setField(term32591, term32591.getClass(), "collectionFactory", term32753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term32591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


