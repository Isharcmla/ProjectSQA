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
import static org.apache.commons.lang3.reflect.EqualityUtils.*;
import java.lang.String;
import org.mockito.Mockito;

public class TypeUtils_isAssignable_1335172470107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16418;
     Object term16374;
     Object term16901;

    public TypeUtils_isAssignable_1335172470107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16418 = Class.forName((String) "java.lang.Character$UnicodeBlock");
        term16374 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        term16901 = Class.forName((String) "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.TypeVariable");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term16418;
        args[1] = term16374;
        args[2] = null;
        Object retValue = callMethod(klass, "isAssignable", argTypes, null, args);
        assertTrue(recursiveEquals(term16418, term16901));
        assertTrue(recursiveEquals(term16374, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


