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
import java.lang.String;

public class ClosureCodingConvention_applySubclassRelationship_100325156145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66711;
     Object term66811;
     Object term67039;
     Object enum21;

    public ClosureCodingConvention_applySubclassRelationship_100325156145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66711 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term66811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term66811, term66811.getClass(), "prototype", term66929);
        setField(term66811, term66811.getClass(), "source", null);
        term67039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term67799 = Class.forName((String) "com.google.javascript.jscomp.CodingConvention$SubclassType");
        Field term67798 = ((Class) term67799).getDeclaredField((String) "INHERITS");
        ((Field) term67798).setAccessible(true);
        enum21 = ((Field) term67798).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodingConvention$SubclassType");
        Object[] args = new Object[3];
        args[0] = term66811;
        args[1] = term67039;
        args[2] = enum21;
        try {
            callMethod(klass, "applySubclassRelationship", argTypes, term66711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


