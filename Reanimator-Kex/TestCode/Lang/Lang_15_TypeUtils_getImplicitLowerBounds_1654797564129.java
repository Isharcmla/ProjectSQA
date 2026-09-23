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
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public class TypeUtils_getImplicitLowerBounds_1654797564129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21590;

    public TypeUtils_getImplicitLowerBounds_1654797564129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21590 = Mockito.mock(Class.forName("java.lang.reflect.WildcardType"));
        Object[] term21591 = (Object[]) newArray("java.lang.reflect.Type", 489);
        Mockito.when(((WildcardType)term21590).getLowerBounds()).thenReturn((Type[])term21591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.WildcardType");
        Object[] args = new Object[1];
        args[0] = term21590;
        callMethod(klass, "getImplicitLowerBounds", argTypes, null, args);
    }

};


