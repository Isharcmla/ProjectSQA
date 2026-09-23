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

public class FunctionType_getImplementedInterfaces_281458626627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625773;
     Object term626511;

    public FunctionType_getImplementedInterfaces_281458626627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term626518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term626517 = ((Class) term626518).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term626517).setAccessible(true);
        Object enum963 = ((Field) term626517).get((Object) null);
        term625773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term626039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term626139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term625773, term625773.getClass(), "kind", enum963);
        setField(term626039, term626039.getClass(), "implicitPrototypeFallback", term626139);
        setField(term625773, term625773.getClass(), "prototype", term626039);
        Class<? extends Object> term626818 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term626817 = ((Class) term626818).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term626817).setAccessible(true);
        Object enum964 = ((Field) term626817).get((Object) null);
        term626511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term626512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term626513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term626511, term626511.getClass(), "call", null);
        setField(term626512, term626512.getClass(), "ownerFunction", null);
        setField(term626512, term626512.getClass(), "className", null);
        setField(term626512, term626512.getClass(), "properties", null);
        setBooleanField(term626512, term626512.getClass(), "nativeType", false);
        setField(term626513, term626513.getClass(), "name", null);
        setField(term626513, term626513.getClass(), "referencedType", null);
        setField(term626513, term626513.getClass(), "referencedObjType", null);
        setBooleanField(term626513, term626513.getClass(), "visited", false);
        setField(term626513, term626513.getClass(), "docInfo", null);
        setBooleanField(term626513, term626513.getClass(), "unknown", false);
        setBooleanField(term626513, term626513.getClass(), "resolved", false);
        setField(term626513, term626513.getClass(), "resolveResult", null);
        setField(term626513, term626513.getClass(), "registry", null);
        setField(term626512, term626512.getClass(), "implicitPrototypeFallback", term626513);
        setBooleanField(term626512, term626512.getClass(), "prettyPrint", false);
        setBooleanField(term626512, term626512.getClass(), "visited", false);
        setField(term626512, term626512.getClass(), "docInfo", null);
        setBooleanField(term626512, term626512.getClass(), "unknown", false);
        setBooleanField(term626512, term626512.getClass(), "resolved", false);
        setField(term626512, term626512.getClass(), "resolveResult", null);
        setField(term626512, term626512.getClass(), "registry", null);
        setField(term626511, term626511.getClass(), "prototype", term626512);
        setField(term626511, term626511.getClass(), "kind", enum964);
        setField(term626511, term626511.getClass(), "typeOfThis", null);
        setField(term626511, term626511.getClass(), "source", null);
        setField(term626511, term626511.getClass(), "implementedInterfaces", null);
        setField(term626511, term626511.getClass(), "subTypes", null);
        setField(term626511, term626511.getClass(), "templateTypeName", null);
        setField(term626511, term626511.getClass(), "className", null);
        setField(term626511, term626511.getClass(), "properties", null);
        setBooleanField(term626511, term626511.getClass(), "nativeType", false);
        setField(term626511, term626511.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term626511, term626511.getClass(), "prettyPrint", false);
        setBooleanField(term626511, term626511.getClass(), "visited", false);
        setField(term626511, term626511.getClass(), "docInfo", null);
        setBooleanField(term626511, term626511.getClass(), "unknown", false);
        setBooleanField(term626511, term626511.getClass(), "resolved", false);
        setField(term626511, term626511.getClass(), "resolveResult", null);
        setField(term626511, term626511.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term625773, args);
        assertTrue(recursiveEquals(term625773, term626511));
        assertTrue(recursiveEquals(retValue, null));
    }

};


