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

public class FunctionType_defineProperty_1349755729381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280159;
     Object term280691;
     Object term281043;
     Object term281051;

    public FunctionType_defineProperty_1349755729381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281053 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term281052 = ((Class) term281053).getDeclaredField((String) "INTERFACE");
        ((Field) term281052).setAccessible(true);
        Object enum487 = ((Field) term281052).get((Object) null);
        term280159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term280277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term280381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term280159, term280159.getClass(), "prototype", term280277);
        setField(term280159, term280159.getClass(), "registry", term280381);
        setBooleanField(term280159, term280159.getClass(), "nativeType", false);
        setField(term280159, term280159.getClass(), "kind", enum487);
        term280691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Class<? extends Object> term281356 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term281355 = ((Class) term281356).getDeclaredField((String) "INTERFACE");
        ((Field) term281355).setAccessible(true);
        Object enum488 = ((Field) term281355).get((Object) null);
        term281043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term281044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term281048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term281043, term281043.getClass(), "leastSupertypeVisitor", null);
        setField(term281043, term281043.getClass(), "greatestSubtypeVisitor", null);
        setField(term281043, term281043.getClass(), "call", null);
        setField(term281044, term281044.getClass(), "ownerFunction", null);
        setField(term281044, term281044.getClass(), "className", null);
        setField(term281044, term281044.getClass(), "properties", null);
        setBooleanField(term281044, term281044.getClass(), "nativeType", false);
        setField(term281044, term281044.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term281044, term281044.getClass(), "prettyPrint", false);
        setBooleanField(term281044, term281044.getClass(), "visited", false);
        setField(term281044, term281044.getClass(), "docInfo", null);
        setBooleanField(term281044, term281044.getClass(), "unknown", false);
        setBooleanField(term281044, term281044.getClass(), "resolved", false);
        setField(term281044, term281044.getClass(), "resolveResult", null);
        setField(term281044, term281044.getClass(), "registry", null);
        setField(term281043, term281043.getClass(), "prototype", term281044);
        setField(term281043, term281043.getClass(), "kind", enum488);
        setField(term281043, term281043.getClass(), "typeOfThis", null);
        setField(term281043, term281043.getClass(), "source", null);
        setField(term281043, term281043.getClass(), "implementedInterfaces", null);
        setField(term281043, term281043.getClass(), "subTypes", null);
        setField(term281043, term281043.getClass(), "templateTypeName", null);
        setField(term281043, term281043.getClass(), "className", null);
        setField(term281043, term281043.getClass(), "properties", null);
        setBooleanField(term281043, term281043.getClass(), "nativeType", false);
        setField(term281043, term281043.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term281043, term281043.getClass(), "prettyPrint", false);
        setBooleanField(term281043, term281043.getClass(), "visited", false);
        setField(term281043, term281043.getClass(), "docInfo", null);
        setBooleanField(term281043, term281043.getClass(), "unknown", false);
        setBooleanField(term281043, term281043.getClass(), "resolved", false);
        setField(term281043, term281043.getClass(), "resolveResult", null);
        setField(term281048, term281048.getClass(), "reporter", null);
        setField(term281048, term281048.getClass(), "nativeTypes", null);
        setField(term281048, term281048.getClass(), "namesToTypes", null);
        setField(term281048, term281048.getClass(), "namespaces", null);
        setField(term281048, term281048.getClass(), "nonNullableTypeNames", null);
        setField(term281048, term281048.getClass(), "forwardDeclaredTypes", null);
        setField(term281048, term281048.getClass(), "typesIndexedByProperty", null);
        setField(term281048, term281048.getClass(), "greatestSubtypeByProperty", null);
        setField(term281048, term281048.getClass(), "interfaceToImplementors", null);
        setField(term281048, term281048.getClass(), "unresolvedNamedTypes", null);
        setField(term281048, term281048.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term281048, term281048.getClass(), "lastGeneration", false);
        setField(term281048, term281048.getClass(), "templateTypeName", null);
        setField(term281048, term281048.getClass(), "templateType", null);
        setBooleanField(term281048, term281048.getClass(), "tolerateUndefinedValues", false);
        setField(term281048, term281048.getClass(), "resolveMode", null);
        setField(term281043, term281043.getClass(), "registry", term281048);
        term281051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term281051, term281051.getClass(), "typeExpr", null);
        setField(term281051, term281051.getClass(), "sourceName", null);
        setBooleanField(term281051, term281051.getClass(), "forgiving", false);
        setBooleanField(term281051, term281051.getClass(), "isChecked", false);
        setBooleanField(term281051, term281051.getClass(), "visited", false);
        setField(term281051, term281051.getClass(), "docInfo", null);
        setBooleanField(term281051, term281051.getClass(), "unknown", false);
        setBooleanField(term281051, term281051.getClass(), "resolved", false);
        setField(term281051, term281051.getClass(), "resolveResult", null);
        setField(term281051, term281051.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term280691;
        args[2] = false;
        args[3] = false;
        callMethod(klass, "defineProperty", argTypes, term280159, args);
        assertTrue(recursiveEquals(term280159, term281043));
        assertTrue(recursiveEquals(term280691, term281051));
    }

};


