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
import java.lang.String;
import org.mockito.Mockito;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public class TypeUtils_isAssignable_1549447596145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23735;
     Object term23683;

    public TypeUtils_isAssignable_1549447596145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23735 = Class.forName((String) "java.nio.file.attribute.UserPrincipalLookupService");
        term23683 = Mockito.mock(Class.forName("java.lang.reflect.WildcardType"));
        Object[] term23684 = (Object[]) newArray("java.lang.reflect.Type", 489);
        Mockito.when(((WildcardType)term23683).getUpperBounds()).thenReturn((Type[])term23684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.WildcardType");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term23735;
        args[1] = term23683;
        args[2] = null;
        callMethod(klass, "isAssignable", argTypes, null, args);
    }

};


