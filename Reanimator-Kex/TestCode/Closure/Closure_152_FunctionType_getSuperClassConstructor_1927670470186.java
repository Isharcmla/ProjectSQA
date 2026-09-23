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

public class FunctionType_getSuperClassConstructor_1927670470186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92371;
     Object term94294;

    public FunctionType_getSuperClassConstructor_1927670470186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term94300 = ((Class) term94301).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term94300).setAccessible(true);
        Object enum196 = ((Field) term94300).get((Object) null);
        term92371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term92735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term92371, term92371.getClass(), "kind", enum196);
        setField(term92637, term92637.getClass(), "implicitPrototypeFallback", term92735);
        setField(term92371, term92371.getClass(), "prototype", term92637);
        Class<? extends Object> term94601 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term94600 = ((Class) term94601).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term94600).setAccessible(true);
        Object enum197 = ((Field) term94600).get((Object) null);
        term94294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term94295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term94296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term94294, term94294.getClass(), "call", null);
        setField(term94295, term94295.getClass(), "ownerFunction", null);
        setField(term94295, term94295.getClass(), "className", null);
        setField(term94295, term94295.getClass(), "properties", null);
        setBooleanField(term94295, term94295.getClass(), "nativeType", false);
        setField(term94296, term94296.getClass(), "indexType", null);
        setField(term94296, term94296.getClass(), "referencedType", null);
        setField(term94296, term94296.getClass(), "referencedObjType", null);
        setBooleanField(term94296, term94296.getClass(), "visited", false);
        setField(term94296, term94296.getClass(), "docInfo", null);
        setBooleanField(term94296, term94296.getClass(), "unknown", false);
        setBooleanField(term94296, term94296.getClass(), "resolved", false);
        setField(term94296, term94296.getClass(), "resolveResult", null);
        setField(term94296, term94296.getClass(), "registry", null);
        setField(term94295, term94295.getClass(), "implicitPrototypeFallback", term94296);
        setBooleanField(term94295, term94295.getClass(), "prettyPrint", false);
        setBooleanField(term94295, term94295.getClass(), "visited", false);
        setField(term94295, term94295.getClass(), "docInfo", null);
        setBooleanField(term94295, term94295.getClass(), "unknown", false);
        setBooleanField(term94295, term94295.getClass(), "resolved", false);
        setField(term94295, term94295.getClass(), "resolveResult", null);
        setField(term94295, term94295.getClass(), "registry", null);
        setField(term94294, term94294.getClass(), "prototype", term94295);
        setField(term94294, term94294.getClass(), "kind", enum197);
        setField(term94294, term94294.getClass(), "typeOfThis", null);
        setField(term94294, term94294.getClass(), "source", null);
        setField(term94294, term94294.getClass(), "implementedInterfaces", null);
        setField(term94294, term94294.getClass(), "subTypes", null);
        setField(term94294, term94294.getClass(), "templateTypeName", null);
        setField(term94294, term94294.getClass(), "className", null);
        setField(term94294, term94294.getClass(), "properties", null);
        setBooleanField(term94294, term94294.getClass(), "nativeType", false);
        setField(term94294, term94294.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term94294, term94294.getClass(), "prettyPrint", false);
        setBooleanField(term94294, term94294.getClass(), "visited", false);
        setField(term94294, term94294.getClass(), "docInfo", null);
        setBooleanField(term94294, term94294.getClass(), "unknown", false);
        setBooleanField(term94294, term94294.getClass(), "resolved", false);
        setField(term94294, term94294.getClass(), "resolveResult", null);
        setField(term94294, term94294.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSuperClassConstructor", argTypes, term92371, args);
        assertTrue(recursiveEquals(term92371, term94294));
        assertTrue(recursiveEquals(retValue, null));
    }

};


