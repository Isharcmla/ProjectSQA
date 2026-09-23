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
import java.util.ArrayList;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_984870457108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69198;
     Object term69374;

    public ReflectiveTypeAdapterFactory_excludeField_984870457108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69322 = new ArrayList();
        term69198 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term69270 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term69270, term69270.getClass(), "version", 1.0);
        setBooleanField(term69270, term69270.getClass(), "serializeInnerClasses", true);
        setField(term69270, term69270.getClass(), "deserializationStrategies", term69322);
        setField(term69198, term69198.getClass(), "excluder", term69270);
        Class<? extends Object> term70781 = Class.forName((String) "java.io.ObjectStreamClass$ClassDataSlot");
        term69374 = ((Class) term70781).getDeclaredField((String) "desc");
        ((Field) term69374).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term69374;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term69198, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


