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

public class TypeValidator_mismatch_1145070107246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78807;
     Object term78897;
     Object term79033;
     Object term79243;

    public TypeValidator_mismatch_1145070107246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78807 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term78897 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term78897, term78897.getClass(), "sourceName", "");
        term79033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term79145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term79033, term79033.getClass(), "referencedType", term79145);
        term79243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
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
        args[0] = term78897;
        args[1] = null;
        args[2] = null;
        args[3] = term79033;
        args[4] = term79243;
        try {
            callMethod(klass, "mismatch", argTypes, term78807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


