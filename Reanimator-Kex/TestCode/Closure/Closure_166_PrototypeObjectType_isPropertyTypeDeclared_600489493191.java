package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_isPropertyTypeDeclared_600489493191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33837;

    public PrototypeObjectType_isPropertyTypeDeclared_600489493191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33885 = new HashMap();
        ArrayList term33989 = new ArrayList();
        ArrayList term34141 = new ArrayList();
        ((ArrayList) term34141).add(term33989);
        term33837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term34089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term33837, term33837.getClass(), "properties", term33885);
        setField(term33837, term33837.getClass(), "implicitPrototypeFallback", null);
        setField(term34089, term34089.getClass(), "extendedInterfaces", term34141);
        setField(term33837, term33837.getClass(), "ownerFunction", term34089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isPropertyTypeDeclared", argTypes, term33837, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


