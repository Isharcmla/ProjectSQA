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

public class TypeCheck_ensureTyped_103120306291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76652;
     Object term76722;

    public TypeCheck_ensureTyped_103120306291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76652 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term76722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76818 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term76722, term76722.getClass(), "type", -106);
        setIntField(term76818, term76818.getClass(), "type", 0);
        setField(term76818, term76818.getClass(), "next", term76818);
        setField(term76722, term76722.getClass(), "propListHead", term76818);
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
        args[1] = term76722;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term76652, args);
    }

};


