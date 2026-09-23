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

public class TypeValidator_mismatch_1145070107184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46585;
     Object term46675;
     Object term46745;
     Object term46839;
     Object term46947;

    public TypeValidator_mismatch_1145070107184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46585 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term46675 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term46675, term46675.getClass(), "sourceName", null);
        term46745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term46839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term46947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
        args[0] = term46675;
        args[1] = term46745;
        args[2] = null;
        args[3] = term46839;
        args[4] = term46947;
        try {
            callMethod(klass, "mismatch", argTypes, term46585, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


