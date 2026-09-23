package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExtendedProperties_getString_1271560376167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86137;

    public ExtendedProperties_getString_1271560376167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86137 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term86241 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term86241, term86241.getClass(), "defaults", null);
        setField(term86137, term86137.getClass(), "defaults", term86241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getString", argTypes, term86137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


