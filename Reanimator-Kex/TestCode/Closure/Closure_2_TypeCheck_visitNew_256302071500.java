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

public class TypeCheck_visitNew_256302071500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483215;
     Object term483285;

    public TypeCheck_visitNew_256302071500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483215 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term488481 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term488480 = ((Class) term488481).getDeclaredField((String) "ORDINARY");
        ((Field) term488480).setAccessible(true);
        Object enum54 = ((Field) term488480).get((Object) null);
        term483285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term483443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term483443, term483443.getClass(), "kind", enum54);
        setField(term483355, term483355.getClass(), "jsType", term483443);
        setField(term483285, term483285.getClass(), "first", term483355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term483285;
        try {
            callMethod(klass, "visitNew", argTypes, term483215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


