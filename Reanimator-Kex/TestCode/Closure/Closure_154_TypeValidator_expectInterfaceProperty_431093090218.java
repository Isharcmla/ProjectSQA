package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_expectInterfaceProperty_431093090218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70137;
     Object term70229;

    public TypeValidator_expectInterfaceProperty_431093090218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70137 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term70229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term70229;
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "expectInterfaceProperty", argTypes, term70137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


