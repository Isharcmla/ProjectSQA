package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isOrdinaryFunction_979887802111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61603;
     Object term62375;

    public FunctionType_isOrdinaryFunction_979887802111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62381 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62380 = ((Class) term62381).getDeclaredField((String) "ORDINARY");
        ((Field) term62380).setAccessible(true);
        Object enum156 = ((Field) term62380).get((Object) null);
        term61603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61603, term61603.getClass(), "kind", enum156);
        Class<? extends Object> term62672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62671 = ((Class) term62672).getDeclaredField((String) "INTERFACE");
        ((Field) term62671).setAccessible(true);
        Object enum157 = ((Field) term62671).get((Object) null);
        term62375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62375, term62375.getClass(), "call", null);
        setField(term62375, term62375.getClass(), "prototype", null);
        setField(term62375, term62375.getClass(), "kind", enum157);
        setField(term62375, term62375.getClass(), "typeOfThis", null);
        setField(term62375, term62375.getClass(), "source", null);
        setField(term62375, term62375.getClass(), "implementedInterfaces", null);
        setField(term62375, term62375.getClass(), "subTypes", null);
        setField(term62375, term62375.getClass(), "templateTypeName", null);
        setField(term62375, term62375.getClass(), "className", null);
        setField(term62375, term62375.getClass(), "properties", null);
        setBooleanField(term62375, term62375.getClass(), "nativeType", false);
        setField(term62375, term62375.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term62375, term62375.getClass(), "prettyPrint", false);
        setBooleanField(term62375, term62375.getClass(), "visited", false);
        setField(term62375, term62375.getClass(), "docInfo", null);
        setBooleanField(term62375, term62375.getClass(), "unknown", false);
        setBooleanField(term62375, term62375.getClass(), "resolved", false);
        setField(term62375, term62375.getClass(), "resolveResult", null);
        setField(term62375, term62375.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term61603, args);
        assertTrue(recursiveEquals(term61603, term62375));
        assertTrue(recursiveEquals(retValue, false));
    }

};


