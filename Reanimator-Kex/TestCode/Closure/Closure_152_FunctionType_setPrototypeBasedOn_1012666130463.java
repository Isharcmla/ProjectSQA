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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeBasedOn_1012666130463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391244;
     Object term391955;

    public FunctionType_setPrototypeBasedOn_1012666130463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term391963 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term391962 = ((Class) term391963).getDeclaredField((String) "INTERFACE");
        ((Field) term391962).setAccessible(true);
        Object enum656 = ((Field) term391962).get((Object) null);
        term391244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term391348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term391244, term391244.getClass(), "prototype", null);
        setField(term391244, term391244.getClass(), "registry", term391348);
        setBooleanField(term391244, term391244.getClass(), "nativeType", true);
        setField(term391244, term391244.getClass(), "kind", enum656);
        Class<? extends Object> term392257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392256 = ((Class) term392257).getDeclaredField((String) "INTERFACE");
        ((Field) term392256).setAccessible(true);
        Object enum657 = ((Field) term392256).get((Object) null);
        term391955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term391956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term391957 = newInstance(Class.forName("java.util.TreeMap"));
        Object term391958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term391955, term391955.getClass(), "call", null);
        setField(term391956, term391956.getClass(), "ownerFunction", term391955);
        setField(term391956, term391956.getClass(), "className", null);
        setField(term391957, term391957.getClass(), "comparator", null);
        setField(term391957, term391957.getClass(), "root", null);
        setIntField(term391957, term391957.getClass(), "size", 0);
        setIntField(term391957, term391957.getClass(), "modCount", 0);
        setField(term391957, term391957.getClass(), "entrySet", null);
        setField(term391957, term391957.getClass(), "navigableKeySet", null);
        setField(term391957, term391957.getClass(), "descendingMap", null);
        setField(term391957, term391957.getClass(), "keySet", null);
        setField(term391957, term391957.getClass(), "values", null);
        setField(term391956, term391956.getClass(), "properties", term391957);
        setBooleanField(term391956, term391956.getClass(), "nativeType", true);
        setField(term391956, term391956.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term391956, term391956.getClass(), "prettyPrint", false);
        setBooleanField(term391956, term391956.getClass(), "visited", false);
        setField(term391956, term391956.getClass(), "docInfo", null);
        setBooleanField(term391956, term391956.getClass(), "unknown", true);
        setBooleanField(term391956, term391956.getClass(), "resolved", false);
        setField(term391956, term391956.getClass(), "resolveResult", null);
        setField(term391958, term391958.getClass(), "reporter", null);
        setField(term391958, term391958.getClass(), "nativeTypes", null);
        setField(term391958, term391958.getClass(), "namesToTypes", null);
        setField(term391958, term391958.getClass(), "namespaces", null);
        setField(term391958, term391958.getClass(), "enumTypeNames", null);
        setField(term391958, term391958.getClass(), "forwardDeclaredTypes", null);
        setField(term391958, term391958.getClass(), "typesIndexedByProperty", null);
        setField(term391958, term391958.getClass(), "greatestSubtypeByProperty", null);
        setField(term391958, term391958.getClass(), "interfaceToImplementors", null);
        setField(term391958, term391958.getClass(), "unresolvedNamedTypes", null);
        setField(term391958, term391958.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term391958, term391958.getClass(), "lastGeneration", false);
        setField(term391958, term391958.getClass(), "templateTypeName", null);
        setField(term391958, term391958.getClass(), "templateType", null);
        setBooleanField(term391958, term391958.getClass(), "tolerateUndefinedValues", false);
        setField(term391958, term391958.getClass(), "resolveMode", null);
        setField(term391956, term391956.getClass(), "registry", term391958);
        setField(term391955, term391955.getClass(), "prototype", term391956);
        setField(term391955, term391955.getClass(), "kind", enum657);
        setField(term391955, term391955.getClass(), "typeOfThis", null);
        setField(term391955, term391955.getClass(), "source", null);
        setField(term391955, term391955.getClass(), "implementedInterfaces", null);
        setField(term391955, term391955.getClass(), "subTypes", null);
        setField(term391955, term391955.getClass(), "templateTypeName", null);
        setField(term391955, term391955.getClass(), "className", null);
        setField(term391955, term391955.getClass(), "properties", null);
        setBooleanField(term391955, term391955.getClass(), "nativeType", true);
        setField(term391955, term391955.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term391955, term391955.getClass(), "prettyPrint", false);
        setBooleanField(term391955, term391955.getClass(), "visited", false);
        setField(term391955, term391955.getClass(), "docInfo", null);
        setBooleanField(term391955, term391955.getClass(), "unknown", false);
        setBooleanField(term391955, term391955.getClass(), "resolved", false);
        setField(term391955, term391955.getClass(), "resolveResult", null);
        setField(term391955, term391955.getClass(), "registry", term391958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term391244, args);
        assertTrue(recursiveEquals(term391244, term391955));
    }

};


