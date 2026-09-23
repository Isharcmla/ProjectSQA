package org.apache.commons.lang3.reflect;

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
import java.lang.reflect.InvocationTargetException;
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public class TypeUtils_mapTypeVariablesToArguments_1913756514152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23658;

    public TypeUtils_mapTypeVariablesToArguments_1913756514152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23658 = Mockito.mock(Class.forName("java.lang.reflect.ParameterizedType"));
        Object term23659 = Mockito.mock(Class.forName("java.lang.reflect.ParameterizedType"));
        Mockito.when(((ParameterizedType)term23658).getOwnerType()).thenReturn((Type)term23659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.reflect.ParameterizedType");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term23658;
        args[2] = null;
        try {
            callMethod(klass, "mapTypeVariablesToArguments", argTypes, null, args);
            assertTrue(false);
        }
        catch (InvocationTargetException e) {
        }

    }

};


