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
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.String;

public class CollapseVariableDeclarations_init_67480712637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21364;

    public CollapseVariableDeclarations_init_67480712637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21236 = new ArrayList();
        HashSet term21284 = new HashSet();
        Object term21184 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term21184, term21184.getClass(), "collapses", term21236);
        setField(term21184, term21184.getClass(), "nodesToCollapse", term21284);
        Class<? extends Object> term21858 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term21857 = ((Class) term21858).getDeclaredField((String) "RAW");
        ((Field) term21857).setAccessible(true);
        Object enum6 = ((Field) term21857).get((Object) null);
        term21364 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21364, term21364.getClass(), "stage", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term21364;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


