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

public class CollapseProperties_addStubsForUndeclaredProperties_27152836135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75193;
     Object term75297;

    public CollapseProperties_addStubsForUndeclaredProperties_27152836135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75193 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term78208 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term78207 = ((Class) term78208).getDeclaredField((String) "OTHER");
        ((Field) term78207).setAccessible(true);
        Object enum142 = ((Field) term78207).get((Object) null);
        term75297 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term75297, term75297.getClass(), "type", enum142);
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
        args[0] = term75297;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "addStubsForUndeclaredProperties", argTypes, term75193, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


