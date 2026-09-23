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

public class FunctionType_setPrototype_1918602805159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81338;
     Object term81604;
     Object term82219;
     Object term82224;

    public FunctionType_setPrototype_1918602805159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term82226 = ((Class) term82227).getDeclaredField((String) "ORDINARY");
        ((Field) term82226).setAccessible(true);
        Object enum186 = ((Field) term82226).get((Object) null);
        term81338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term81338, term81338.getClass(), "kind", enum186);
        term81604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term82518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term82517 = ((Class) term82518).getDeclaredField((String) "ORDINARY");
        ((Field) term82517).setAccessible(true);
        Object enum187 = ((Field) term82517).get((Object) null);
        term82219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term82220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term82219, term82219.getClass(), "call", null);
        setField(term82220, term82220.getClass(), "ownerFunction", null);
        setField(term82220, term82220.getClass(), "className", null);
        setField(term82220, term82220.getClass(), "properties", null);
        setBooleanField(term82220, term82220.getClass(), "nativeType", false);
        setField(term82220, term82220.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82220, term82220.getClass(), "prettyPrint", false);
        setBooleanField(term82220, term82220.getClass(), "visited", false);
        setField(term82220, term82220.getClass(), "docInfo", null);
        setBooleanField(term82220, term82220.getClass(), "unknown", false);
        setBooleanField(term82220, term82220.getClass(), "resolved", false);
        setField(term82220, term82220.getClass(), "resolveResult", null);
        setField(term82220, term82220.getClass(), "registry", null);
        setField(term82219, term82219.getClass(), "prototype", term82220);
        setField(term82219, term82219.getClass(), "kind", enum187);
        setField(term82219, term82219.getClass(), "typeOfThis", null);
        setField(term82219, term82219.getClass(), "source", null);
        setField(term82219, term82219.getClass(), "implementedInterfaces", null);
        setField(term82219, term82219.getClass(), "subTypes", null);
        setField(term82219, term82219.getClass(), "templateTypeName", null);
        setField(term82219, term82219.getClass(), "className", null);
        setField(term82219, term82219.getClass(), "properties", null);
        setBooleanField(term82219, term82219.getClass(), "nativeType", false);
        setField(term82219, term82219.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82219, term82219.getClass(), "prettyPrint", false);
        setBooleanField(term82219, term82219.getClass(), "visited", false);
        setField(term82219, term82219.getClass(), "docInfo", null);
        setBooleanField(term82219, term82219.getClass(), "unknown", false);
        setBooleanField(term82219, term82219.getClass(), "resolved", false);
        setField(term82219, term82219.getClass(), "resolveResult", null);
        setField(term82219, term82219.getClass(), "registry", null);
        term82224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term82224, term82224.getClass(), "ownerFunction", null);
        setField(term82224, term82224.getClass(), "className", null);
        setField(term82224, term82224.getClass(), "properties", null);
        setBooleanField(term82224, term82224.getClass(), "nativeType", false);
        setField(term82224, term82224.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82224, term82224.getClass(), "prettyPrint", false);
        setBooleanField(term82224, term82224.getClass(), "visited", false);
        setField(term82224, term82224.getClass(), "docInfo", null);
        setBooleanField(term82224, term82224.getClass(), "unknown", false);
        setBooleanField(term82224, term82224.getClass(), "resolved", false);
        setField(term82224, term82224.getClass(), "resolveResult", null);
        setField(term82224, term82224.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term81604;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term81338, args);
        assertTrue(recursiveEquals(term81338, term82219));
        assertTrue(recursiveEquals(term81604, term82224));
        assertTrue(recursiveEquals(retValue, true));
    }

};


