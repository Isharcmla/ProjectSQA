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

public class CollapseProperties_declareVarsForObjLitValues_90515142159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86005;
     Object term86109;
     Object term86331;

    public CollapseProperties_declareVarsForObjLitValues_90515142159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86005 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term87356 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term87355 = ((Class) term87356).getDeclaredField((String) "OTHER");
        ((Field) term87355).setAccessible(true);
        Object enum152 = ((Field) term87355).get((Object) null);
        term86109 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term86109, term86109.getClass(), "type", enum152);
        term86331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86331, term86331.getClass(), "first", term86401);
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
        args[0] = term86109;
        args[1] = null;
        args[2] = term86331;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "declareVarsForObjLitValues", argTypes, term86005, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


