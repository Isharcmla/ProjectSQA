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
import java.lang.Object;

public class TypeValidator_mismatch_1145070107248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79747;
     Object term79837;
     Object term79973;
     Object term80171;

    public TypeValidator_mismatch_1145070107248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79747 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term79837 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term79837, term79837.getClass(), "sourceName", "");
        term79973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term80073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term79973, term79973.getClass(), "referencedType", term80073);
        term80171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term79837;
        args[1] = null;
        args[2] = null;
        args[3] = term79973;
        args[4] = term80171;
        try {
            callMethod(klass, "mismatch", argTypes, term79747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


