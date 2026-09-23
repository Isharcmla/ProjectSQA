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

public class TypeValidator_mismatch_1931343499202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64748;
     Object term64970;
     Object term65074;

    public TypeValidator_mismatch_1931343499202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term64828 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term64748, term64748.getClass(), "shouldReport", true);
        setField(term64748, term64748.getClass(), "compiler", term64828);
        term64970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term65074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term65074, term65074.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "";
        args[1] = null;
        args[2] = null;
        args[3] = term64970;
        args[4] = term65074;
        try {
            callMethod(klass, "mismatch", argTypes, term64748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


