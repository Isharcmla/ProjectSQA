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

public class FunctionType_hasUnknownSupertype_259494629319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210409;
     Object term211197;

    public FunctionType_hasUnknownSupertype_259494629319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211204 = ((Class) term211205).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term211204).setAccessible(true);
        Object enum372 = ((Field) term211204).get((Object) null);
        term210409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term210789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term210409, term210409.getClass(), "kind", enum372);
        setBooleanField(term210409, term210409.getClass(), "unknown", false);
        setField(term210675, term210675.getClass(), "implicitPrototypeFallback", term210789);
        setField(term210409, term210409.getClass(), "prototype", term210675);
        Class<? extends Object> term211505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211504 = ((Class) term211505).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term211504).setAccessible(true);
        Object enum373 = ((Field) term211504).get((Object) null);
        term211197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term211198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term211199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term211197, term211197.getClass(), "call", null);
        setField(term211198, term211198.getClass(), "ownerFunction", null);
        setField(term211198, term211198.getClass(), "className", null);
        setField(term211198, term211198.getClass(), "properties", null);
        setBooleanField(term211198, term211198.getClass(), "nativeType", false);
        setField(term211199, term211199.getClass(), "className", null);
        setField(term211199, term211199.getClass(), "properties", null);
        setBooleanField(term211199, term211199.getClass(), "nativeType", false);
        setField(term211199, term211199.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term211199, term211199.getClass(), "prettyPrint", false);
        setBooleanField(term211199, term211199.getClass(), "visited", false);
        setField(term211199, term211199.getClass(), "docInfo", null);
        setBooleanField(term211199, term211199.getClass(), "unknown", false);
        setBooleanField(term211199, term211199.getClass(), "resolved", false);
        setField(term211199, term211199.getClass(), "resolveResult", null);
        setField(term211199, term211199.getClass(), "registry", null);
        setField(term211198, term211198.getClass(), "implicitPrototypeFallback", term211199);
        setBooleanField(term211198, term211198.getClass(), "prettyPrint", false);
        setBooleanField(term211198, term211198.getClass(), "visited", false);
        setField(term211198, term211198.getClass(), "docInfo", null);
        setBooleanField(term211198, term211198.getClass(), "unknown", false);
        setBooleanField(term211198, term211198.getClass(), "resolved", false);
        setField(term211198, term211198.getClass(), "resolveResult", null);
        setField(term211198, term211198.getClass(), "registry", null);
        setField(term211197, term211197.getClass(), "prototype", term211198);
        setField(term211197, term211197.getClass(), "kind", enum373);
        setField(term211197, term211197.getClass(), "typeOfThis", null);
        setField(term211197, term211197.getClass(), "source", null);
        setField(term211197, term211197.getClass(), "implementedInterfaces", null);
        setField(term211197, term211197.getClass(), "subTypes", null);
        setField(term211197, term211197.getClass(), "templateTypeName", null);
        setField(term211197, term211197.getClass(), "className", null);
        setField(term211197, term211197.getClass(), "properties", null);
        setBooleanField(term211197, term211197.getClass(), "nativeType", false);
        setField(term211197, term211197.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term211197, term211197.getClass(), "prettyPrint", false);
        setBooleanField(term211197, term211197.getClass(), "visited", false);
        setField(term211197, term211197.getClass(), "docInfo", null);
        setBooleanField(term211197, term211197.getClass(), "unknown", false);
        setBooleanField(term211197, term211197.getClass(), "resolved", false);
        setField(term211197, term211197.getClass(), "resolveResult", null);
        setField(term211197, term211197.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term210409, args);
        assertTrue(recursiveEquals(term210409, term211197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


