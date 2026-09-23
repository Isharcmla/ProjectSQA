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
import java.util.HashMap;
import java.lang.String;

public class ClosureCodingConvention_applySubclassRelationship_100325156495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159507;
     Object term159607;
     Object term159825;
     Object enum23;

    public ClosureCodingConvention_applySubclassRelationship_100325156495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159507 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term159607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term159725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term159607, term159607.getClass(), "prototype", term159725);
        setField(term159607, term159607.getClass(), "source", null);
        HashMap term159873 = new HashMap();
        term159825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term159825, term159825.getClass(), "properties", term159873);
        Class<? extends Object> term160751 = Class.forName((String) "com.google.javascript.jscomp.CodingConvention$SubclassType");
        Field term160750 = ((Class) term160751).getDeclaredField((String) "INHERITS");
        ((Field) term160750).setAccessible(true);
        enum23 = ((Field) term160750).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodingConvention$SubclassType");
        Object[] args = new Object[3];
        args[0] = term159607;
        args[1] = term159825;
        args[2] = enum23;
        try {
            callMethod(klass, "applySubclassRelationship", argTypes, term159507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


