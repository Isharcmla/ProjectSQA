package com.google.gson.internal.bind;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Boolean;

public class ReflectiveTypeAdapterFactory_excludeField_9848704578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term28;
     Object term156;

    public ReflectiveTypeAdapterFactory_excludeField_9848704578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16 = new HashMap();
        term14 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term15 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        Object term21 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term26 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term15, term15.getClass(), "instanceCreators", term16);
        setField(term14, term14.getClass(), "constructorConstructor", term15);
        setField(term14, term14.getClass(), "fieldNamingPolicy", null);
        setDoubleField(term21, term21.getClass(), "version", -1.0);
        setIntField(term21, term21.getClass(), "modifiers", 136);
        setBooleanField(term21, term21.getClass(), "serializeInnerClasses", true);
        setBooleanField(term21, term21.getClass(), "requireExpose", false);
        setIntField(term26, term26.getClass(), "modCount", 0);
        setField(term21, term21.getClass(), "serializationStrategies", term26);
        setField(term21, term21.getClass(), "deserializationStrategies", term26);
        setField(term14, term14.getClass(), "excluder", term21);
        Class<? extends Object> term2873 = Class.forName((String) "java.util.ArrayList");
        term28 = ((Class) term2873).getDeclaredField((String) "EMPTY_ELEMENTDATA");
        ((Field) term28).setAccessible(true);
        term156 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = term156;
        try {
            callMethod(klass, "excludeField", argTypes, term14, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


