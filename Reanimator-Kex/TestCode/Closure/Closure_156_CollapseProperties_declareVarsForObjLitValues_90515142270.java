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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CollapseProperties_declareVarsForObjLitValues_90515142270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153600;
     Object term153704;
     Object term153926;

    public CollapseProperties_declareVarsForObjLitValues_90515142270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153600 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term168210 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term168209 = ((Class) term168210).getDeclaredField((String) "GET");
        ((Field) term168209).setAccessible(true);
        Object enum228 = ((Field) term168209).get((Object) null);
        term153704 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term153704, term153704.getClass(), "type", enum228);
        term153926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term153996, term153996.getClass(), "first", null);
        setField(term153996, term153996.getClass(), "next", term154066);
        setIntField(term153996, term153996.getClass(), "type", 148);
        setField(term153926, term153926.getClass(), "first", term153996);
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
        args[0] = term153704;
        args[1] = null;
        args[2] = term153926;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "declareVarsForObjLitValues", argTypes, term153600, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


