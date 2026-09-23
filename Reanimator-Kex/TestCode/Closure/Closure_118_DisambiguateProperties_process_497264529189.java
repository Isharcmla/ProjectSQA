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
import java.util.ArrayList;

public class DisambiguateProperties_process_497264529189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76953;

    public DisambiguateProperties_process_497264529189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78403 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term78402 = ((Class) term78403).getDeclaredField((String) "NORMALIZED");
        ((Field) term78402).setAccessible(true);
        Object enum41 = ((Field) term78402).get((Object) null);
        Object term77455 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term77559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term77455, term77455.getClass(), "typeA", term77559);
        setField(term77455, term77455.getClass(), "src", null);
        ArrayList term77339 = new ArrayList();
        ((ArrayList) term77339).add(term77455);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        ((ArrayList) term77339).add((Object)null);
        term76953 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term77033 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term77287 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term77705 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term77033, term77033.getClass(), "stage", enum41);
        setField(term77287, term77287.getClass(), "mismatches", term77339);
        setField(term77033, term77033.getClass(), "typeValidator", term77287);
        setField(term76953, term76953.getClass(), "compiler", term77033);
        setField(term76953, term76953.getClass(), "typeSystem", term77705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term76953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


