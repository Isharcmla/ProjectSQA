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

public class TypeValidator_expectUndeclaredVariable_328555518277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79577;
     Object term79682;
     Object term79764;

    public TypeValidator_expectUndeclaredVariable_328555518277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79577 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term79682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79682, term79682.getClass(), "type", 147);
        setField(term79682, term79682.getClass(), "propListHead", null);
        term79764 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term79860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term79764, term79764.getClass(), "type", term79860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term79682;
        args[3] = term79682;
        args[4] = term79764;
        args[5] = null;
        args[6] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term79577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


