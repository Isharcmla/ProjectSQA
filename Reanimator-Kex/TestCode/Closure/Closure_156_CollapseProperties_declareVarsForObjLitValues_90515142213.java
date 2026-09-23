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
import java.lang.String;
import java.lang.Object;

public class CollapseProperties_declareVarsForObjLitValues_90515142213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117312;
     Object term117416;
     Object term117638;

    public CollapseProperties_declareVarsForObjLitValues_90515142213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117312 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term118772 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term118771 = ((Class) term118772).getDeclaredField((String) "GET");
        ((Field) term118771).setAccessible(true);
        Object enum194 = ((Field) term118771).get((Object) null);
        term117416 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term117416, term117416.getClass(), "type", enum194);
        term117638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117708, term117708.getClass(), "first", term117638);
        setField(term117708, term117708.getClass(), "next", term117778);
        setIntField(term117708, term117708.getClass(), "type", 39);
        setField(term117638, term117638.getClass(), "first", term117708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = term117416;
        args[1] = null;
        args[2] = term117638;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "declareVarsForObjLitValues", argTypes, term117312, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


