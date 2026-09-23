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

public class CollapseProperties_addStubsForUndeclaredProperties_27152836162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88190;
     Object term88294;

    public CollapseProperties_addStubsForUndeclaredProperties_27152836162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88190 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term89754 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term89753 = ((Class) term89754).getDeclaredField((String) "SET");
        ((Field) term89753).setAccessible(true);
        Object enum156 = ((Field) term89753).get((Object) null);
        term88294 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term88294, term88294.getClass(), "type", enum156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = term88294;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "addStubsForUndeclaredProperties", argTypes, term88190, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


