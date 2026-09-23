package org.apache.commons.lang3;

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
import java.lang.ClassNotFoundException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClassUtils_getClass_1417606069113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ClassUtils_getClass_1417606069113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.ClassLoader");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "  \t  \t\t\n \n\t \n\n \t  \t\n \t   \n\n  \n\n\n\t\t \t \t \t \n\t   \t\t\t  \t\n \t  \n\t\n \n\n    \n \n \n \t\t \n \n  \n\t  \n\n \n     \t \n   \t  \n\t    \n\t  \t\n\t\n  \n \n \t \n\n\n\t \t \n\t \t\t \t  \t   \n\t \n\t \n\n  \n \t \t   \t\t \t\t\t     \t\n\n \t\t \n   \t\t \t\t\t\t\n \t  \t\n   \n  \t\t\t\n\n\n\t  \n \n\t \t \n\t\t  \n \t\t  \n   \t \n  \t \n\t  \t\t \n\t\t \t \n\t  \n\t\t    \t\t\n\t\t \n\t\t \t  \t\t \t   \n\n\n  \t\n\t\t \t ";
        args[2] = false;
        try {
            callMethod(klass, "getClass", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassNotFoundException e) {
        }

    }

};


