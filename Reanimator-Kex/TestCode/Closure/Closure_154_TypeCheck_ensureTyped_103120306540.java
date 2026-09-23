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

public class TypeCheck_ensureTyped_103120306540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149997;
     Object term150067;

    public TypeCheck_ensureTyped_103120306540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149997 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term150067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150163 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term150067, term150067.getClass(), "type", -106);
        setIntField(term150163, term150163.getClass(), "type", 0);
        setField(term150163, term150163.getClass(), "next", term150163);
        setField(term150067, term150067.getClass(), "propListHead", term150163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term150067;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term149997, args);
    }

};


