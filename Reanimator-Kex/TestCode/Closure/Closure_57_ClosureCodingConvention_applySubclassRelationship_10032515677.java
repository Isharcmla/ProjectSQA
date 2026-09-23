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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class ClosureCodingConvention_applySubclassRelationship_10032515677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45138;
     Object enum18;
     Object term46000;
     Object enum19;

    public ClosureCodingConvention_applySubclassRelationship_10032515677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45138 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Class<? extends Object> term46005 = Class.forName((String) "com.google.javascript.jscomp.CodingConvention$SubclassType");
        Field term46004 = ((Class) term46005).getDeclaredField((String) "MIXIN");
        ((Field) term46004).setAccessible(true);
        enum18 = ((Field) term46004).get((Object) null);
        term46000 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term46000, term46000.getClass(), "propertyTestFunctions", null);
        Class<? extends Object> term46317 = Class.forName((String) "com.google.javascript.jscomp.CodingConvention$SubclassType");
        Field term46316 = ((Class) term46317).getDeclaredField((String) "MIXIN");
        ((Field) term46316).setAccessible(true);
        enum19 = ((Field) term46316).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodingConvention$SubclassType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = enum18;
        callMethod(klass, "applySubclassRelationship", argTypes, term45138, args);
        assertTrue(recursiveEquals(term45138, term46000));
        assertTrue(recursiveEquals(enum18, enum19));
    }

};


