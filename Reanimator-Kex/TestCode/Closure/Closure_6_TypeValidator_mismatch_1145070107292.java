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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_mismatch_1145070107292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86919;
     Object term87009;
     Object term87117;
     Object term87211;
     Object term87413;

    public TypeValidator_mismatch_1145070107292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86919 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term86919, term86919.getClass(), "shouldReport", false);
        term87009 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term87009, term87009.getClass(), "sourceName", "");
        term87117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87117, term87117.getClass(), "sourcePosition", 0);
        term87211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term87305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term87211, term87211.getClass(), "referencedType", term87305);
        term87413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
        args[0] = term87009;
        args[1] = term87117;
        args[2] = null;
        args[3] = term87211;
        args[4] = term87413;
        callMethod(klass, "mismatch", argTypes, term86919, args);
    }

};


