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

public class FunctionType_setPrototype_1918602805143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75158;
     Object term75424;
     Object term76661;
     Object term76666;

    public FunctionType_setPrototype_1918602805143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76669 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term76668 = ((Class) term76669).getDeclaredField((String) "ORDINARY");
        ((Field) term76668).setAccessible(true);
        Object enum177 = ((Field) term76668).get((Object) null);
        term75158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75158, term75158.getClass(), "kind", enum177);
        term75424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term76960 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term76959 = ((Class) term76960).getDeclaredField((String) "ORDINARY");
        ((Field) term76959).setAccessible(true);
        Object enum178 = ((Field) term76959).get((Object) null);
        term76661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76661, term76661.getClass(), "call", null);
        setField(term76662, term76662.getClass(), "ownerFunction", null);
        setField(term76662, term76662.getClass(), "className", null);
        setField(term76662, term76662.getClass(), "properties", null);
        setBooleanField(term76662, term76662.getClass(), "nativeType", false);
        setField(term76662, term76662.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76662, term76662.getClass(), "prettyPrint", false);
        setBooleanField(term76662, term76662.getClass(), "visited", false);
        setField(term76662, term76662.getClass(), "docInfo", null);
        setBooleanField(term76662, term76662.getClass(), "unknown", false);
        setBooleanField(term76662, term76662.getClass(), "resolved", false);
        setField(term76662, term76662.getClass(), "resolveResult", null);
        setField(term76662, term76662.getClass(), "registry", null);
        setField(term76661, term76661.getClass(), "prototype", term76662);
        setField(term76661, term76661.getClass(), "kind", enum178);
        setField(term76661, term76661.getClass(), "typeOfThis", null);
        setField(term76661, term76661.getClass(), "source", null);
        setField(term76661, term76661.getClass(), "implementedInterfaces", null);
        setField(term76661, term76661.getClass(), "subTypes", null);
        setField(term76661, term76661.getClass(), "templateTypeName", null);
        setField(term76661, term76661.getClass(), "className", null);
        setField(term76661, term76661.getClass(), "properties", null);
        setBooleanField(term76661, term76661.getClass(), "nativeType", false);
        setField(term76661, term76661.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76661, term76661.getClass(), "prettyPrint", false);
        setBooleanField(term76661, term76661.getClass(), "visited", false);
        setField(term76661, term76661.getClass(), "docInfo", null);
        setBooleanField(term76661, term76661.getClass(), "unknown", false);
        setBooleanField(term76661, term76661.getClass(), "resolved", false);
        setField(term76661, term76661.getClass(), "resolveResult", null);
        setField(term76661, term76661.getClass(), "registry", null);
        term76666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76666, term76666.getClass(), "ownerFunction", null);
        setField(term76666, term76666.getClass(), "className", null);
        setField(term76666, term76666.getClass(), "properties", null);
        setBooleanField(term76666, term76666.getClass(), "nativeType", false);
        setField(term76666, term76666.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76666, term76666.getClass(), "prettyPrint", false);
        setBooleanField(term76666, term76666.getClass(), "visited", false);
        setField(term76666, term76666.getClass(), "docInfo", null);
        setBooleanField(term76666, term76666.getClass(), "unknown", false);
        setBooleanField(term76666, term76666.getClass(), "resolved", false);
        setField(term76666, term76666.getClass(), "resolveResult", null);
        setField(term76666, term76666.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term75424;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term75158, args);
        assertTrue(recursiveEquals(term75158, term76661));
        assertTrue(recursiveEquals(term75424, term76666));
        assertTrue(recursiveEquals(retValue, true));
    }

};


