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

public class FunctionType_setPrototypeBasedOn_1012666130635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634128;
     Object term634386;
     Object term634866;
     Object term634873;

    public FunctionType_setPrototypeBasedOn_1012666130635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term634875 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term634874 = ((Class) term634875).getDeclaredField((String) "INTERFACE");
        ((Field) term634874).setAccessible(true);
        Object enum978 = ((Field) term634874).get((Object) null);
        term634128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term634128, term634128.getClass(), "prototype", null);
        setField(term634128, term634128.getClass(), "registry", null);
        setBooleanField(term634128, term634128.getClass(), "nativeType", true);
        setField(term634128, term634128.getClass(), "kind", enum978);
        term634386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term635169 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term635168 = ((Class) term635169).getDeclaredField((String) "INTERFACE");
        ((Field) term635168).setAccessible(true);
        Object enum979 = ((Field) term635168).get((Object) null);
        term634866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term634867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term634868 = newInstance(Class.forName("java.util.TreeMap"));
        Object term634869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term634866, term634866.getClass(), "call", null);
        setField(term634867, term634867.getClass(), "ownerFunction", term634866);
        setField(term634867, term634867.getClass(), "className", null);
        setField(term634868, term634868.getClass(), "comparator", null);
        setField(term634868, term634868.getClass(), "root", null);
        setIntField(term634868, term634868.getClass(), "size", 0);
        setIntField(term634868, term634868.getClass(), "modCount", 0);
        setField(term634868, term634868.getClass(), "entrySet", null);
        setField(term634868, term634868.getClass(), "navigableKeySet", null);
        setField(term634868, term634868.getClass(), "descendingMap", null);
        setField(term634868, term634868.getClass(), "keySet", null);
        setField(term634868, term634868.getClass(), "values", null);
        setField(term634867, term634867.getClass(), "properties", term634868);
        setBooleanField(term634867, term634867.getClass(), "nativeType", true);
        setField(term634869, term634869.getClass(), "call", null);
        setField(term634869, term634869.getClass(), "prototype", null);
        setField(term634869, term634869.getClass(), "kind", null);
        setField(term634869, term634869.getClass(), "typeOfThis", null);
        setField(term634869, term634869.getClass(), "source", null);
        setField(term634869, term634869.getClass(), "implementedInterfaces", null);
        setField(term634869, term634869.getClass(), "subTypes", null);
        setField(term634869, term634869.getClass(), "templateTypeName", null);
        setField(term634869, term634869.getClass(), "className", null);
        setField(term634869, term634869.getClass(), "properties", null);
        setBooleanField(term634869, term634869.getClass(), "nativeType", false);
        setField(term634869, term634869.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term634869, term634869.getClass(), "prettyPrint", false);
        setBooleanField(term634869, term634869.getClass(), "visited", false);
        setField(term634869, term634869.getClass(), "docInfo", null);
        setBooleanField(term634869, term634869.getClass(), "unknown", false);
        setBooleanField(term634869, term634869.getClass(), "resolved", false);
        setField(term634869, term634869.getClass(), "resolveResult", null);
        setField(term634869, term634869.getClass(), "registry", null);
        setField(term634867, term634867.getClass(), "implicitPrototypeFallback", term634869);
        setBooleanField(term634867, term634867.getClass(), "prettyPrint", false);
        setBooleanField(term634867, term634867.getClass(), "visited", false);
        setField(term634867, term634867.getClass(), "docInfo", null);
        setBooleanField(term634867, term634867.getClass(), "unknown", true);
        setBooleanField(term634867, term634867.getClass(), "resolved", false);
        setField(term634867, term634867.getClass(), "resolveResult", null);
        setField(term634867, term634867.getClass(), "registry", null);
        setField(term634866, term634866.getClass(), "prototype", term634867);
        setField(term634866, term634866.getClass(), "kind", enum979);
        setField(term634866, term634866.getClass(), "typeOfThis", null);
        setField(term634866, term634866.getClass(), "source", null);
        setField(term634866, term634866.getClass(), "implementedInterfaces", null);
        setField(term634866, term634866.getClass(), "subTypes", null);
        setField(term634866, term634866.getClass(), "templateTypeName", null);
        setField(term634866, term634866.getClass(), "className", null);
        setField(term634866, term634866.getClass(), "properties", null);
        setBooleanField(term634866, term634866.getClass(), "nativeType", true);
        setField(term634866, term634866.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term634866, term634866.getClass(), "prettyPrint", false);
        setBooleanField(term634866, term634866.getClass(), "visited", false);
        setField(term634866, term634866.getClass(), "docInfo", null);
        setBooleanField(term634866, term634866.getClass(), "unknown", false);
        setBooleanField(term634866, term634866.getClass(), "resolved", false);
        setField(term634866, term634866.getClass(), "resolveResult", null);
        setField(term634866, term634866.getClass(), "registry", null);
        term634873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term634873, term634873.getClass(), "call", null);
        setField(term634873, term634873.getClass(), "prototype", null);
        setField(term634873, term634873.getClass(), "kind", null);
        setField(term634873, term634873.getClass(), "typeOfThis", null);
        setField(term634873, term634873.getClass(), "source", null);
        setField(term634873, term634873.getClass(), "implementedInterfaces", null);
        setField(term634873, term634873.getClass(), "subTypes", null);
        setField(term634873, term634873.getClass(), "templateTypeName", null);
        setField(term634873, term634873.getClass(), "className", null);
        setField(term634873, term634873.getClass(), "properties", null);
        setBooleanField(term634873, term634873.getClass(), "nativeType", false);
        setField(term634873, term634873.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term634873, term634873.getClass(), "prettyPrint", false);
        setBooleanField(term634873, term634873.getClass(), "visited", false);
        setField(term634873, term634873.getClass(), "docInfo", null);
        setBooleanField(term634873, term634873.getClass(), "unknown", false);
        setBooleanField(term634873, term634873.getClass(), "resolved", false);
        setField(term634873, term634873.getClass(), "resolveResult", null);
        setField(term634873, term634873.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term634386;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term634128, args);
        assertTrue(recursiveEquals(term634128, term634866));
        assertTrue(recursiveEquals(term634386, term634873));
    }

};


