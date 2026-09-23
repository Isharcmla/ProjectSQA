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

public class FunctionType_getImplementedInterfaces_281458626587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569554;
     Object term570298;

    public FunctionType_getImplementedInterfaces_281458626587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term570305 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term570304 = ((Class) term570305).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term570304).setAccessible(true);
        Object enum884 = ((Field) term570304).get((Object) null);
        term569554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term569820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term569926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term569554, term569554.getClass(), "kind", enum884);
        setField(term569820, term569820.getClass(), "implicitPrototypeFallback", term569926);
        setField(term569554, term569554.getClass(), "prototype", term569820);
        Class<? extends Object> term570605 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term570604 = ((Class) term570605).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term570604).setAccessible(true);
        Object enum885 = ((Field) term570604).get((Object) null);
        term570298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term570299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term570300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term570298, term570298.getClass(), "call", null);
        setField(term570299, term570299.getClass(), "ownerFunction", null);
        setField(term570299, term570299.getClass(), "className", null);
        setField(term570299, term570299.getClass(), "properties", null);
        setBooleanField(term570299, term570299.getClass(), "nativeType", false);
        setField(term570300, term570300.getClass(), "primitiveType", null);
        setField(term570300, term570300.getClass(), "primitiveObjectType", null);
        setField(term570300, term570300.getClass(), "name", null);
        setBooleanField(term570300, term570300.getClass(), "visited", false);
        setField(term570300, term570300.getClass(), "docInfo", null);
        setBooleanField(term570300, term570300.getClass(), "unknown", false);
        setBooleanField(term570300, term570300.getClass(), "resolved", false);
        setField(term570300, term570300.getClass(), "resolveResult", null);
        setField(term570300, term570300.getClass(), "registry", null);
        setField(term570299, term570299.getClass(), "implicitPrototypeFallback", term570300);
        setBooleanField(term570299, term570299.getClass(), "prettyPrint", false);
        setBooleanField(term570299, term570299.getClass(), "visited", false);
        setField(term570299, term570299.getClass(), "docInfo", null);
        setBooleanField(term570299, term570299.getClass(), "unknown", false);
        setBooleanField(term570299, term570299.getClass(), "resolved", false);
        setField(term570299, term570299.getClass(), "resolveResult", null);
        setField(term570299, term570299.getClass(), "registry", null);
        setField(term570298, term570298.getClass(), "prototype", term570299);
        setField(term570298, term570298.getClass(), "kind", enum885);
        setField(term570298, term570298.getClass(), "typeOfThis", null);
        setField(term570298, term570298.getClass(), "source", null);
        setField(term570298, term570298.getClass(), "implementedInterfaces", null);
        setField(term570298, term570298.getClass(), "subTypes", null);
        setField(term570298, term570298.getClass(), "templateTypeName", null);
        setField(term570298, term570298.getClass(), "className", null);
        setField(term570298, term570298.getClass(), "properties", null);
        setBooleanField(term570298, term570298.getClass(), "nativeType", false);
        setField(term570298, term570298.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term570298, term570298.getClass(), "prettyPrint", false);
        setBooleanField(term570298, term570298.getClass(), "visited", false);
        setField(term570298, term570298.getClass(), "docInfo", null);
        setBooleanField(term570298, term570298.getClass(), "unknown", false);
        setBooleanField(term570298, term570298.getClass(), "resolved", false);
        setField(term570298, term570298.getClass(), "resolveResult", null);
        setField(term570298, term570298.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term569554, args);
        assertTrue(recursiveEquals(term569554, term570298));
        assertTrue(recursiveEquals(retValue, null));
    }

};


