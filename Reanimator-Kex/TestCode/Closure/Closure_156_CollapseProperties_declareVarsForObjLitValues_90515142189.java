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
import java.lang.String;
import java.lang.Object;

public class CollapseProperties_declareVarsForObjLitValues_90515142189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103652;
     Object term103756;
     Object term103978;

    public CollapseProperties_declareVarsForObjLitValues_90515142189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103652 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term105283 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term105282 = ((Class) term105283).getDeclaredField((String) "GET");
        ((Field) term105282).setAccessible(true);
        Object enum176 = ((Field) term105282).get((Object) null);
        term103756 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term103756, term103756.getClass(), "type", enum176);
        term103978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104048, term104048.getClass(), "first", null);
        setField(term104048, term104048.getClass(), "next", null);
        setIntField(term104048, term104048.getClass(), "type", 39);
        setField(term103978, term103978.getClass(), "first", term104048);
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
        args[0] = term103756;
        args[1] = null;
        args[2] = term103978;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "declareVarsForObjLitValues", argTypes, term103652, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


