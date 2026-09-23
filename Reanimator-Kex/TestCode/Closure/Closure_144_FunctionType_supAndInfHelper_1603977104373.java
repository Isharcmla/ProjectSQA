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

public class FunctionType_supAndInfHelper_1603977104373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270036;
     Object term270398;
     Object term271248;
     Object term271253;
     Object term271133;

    public FunctionType_supAndInfHelper_1603977104373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271257 = ((Class) term271258).getDeclaredField((String) "INTERFACE");
        ((Field) term271257).setAccessible(true);
        Object enum499 = ((Field) term271257).get((Object) null);
        term270036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term270288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term270036, term270036.getClass(), "kind", enum499);
        setField(term270036, term270036.getClass(), "registry", term270288);
        Class<? extends Object> term271552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271551 = ((Class) term271552).getDeclaredField((String) "ORDINARY");
        ((Field) term271551).setAccessible(true);
        Object enum500 = ((Field) term271551).get((Object) null);
        term270398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term270398, term270398.getClass(), "kind", enum500);
        Class<? extends Object> term271843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271842 = ((Class) term271843).getDeclaredField((String) "INTERFACE");
        ((Field) term271842).setAccessible(true);
        Object enum501 = ((Field) term271842).get((Object) null);
        term271248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term271252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term271248, term271248.getClass(), "leastSupertypeVisitor", null);
        setField(term271248, term271248.getClass(), "greatestSubtypeVisitor", null);
        setField(term271248, term271248.getClass(), "call", null);
        setField(term271248, term271248.getClass(), "prototype", null);
        setField(term271248, term271248.getClass(), "kind", enum501);
        setField(term271248, term271248.getClass(), "typeOfThis", null);
        setField(term271248, term271248.getClass(), "source", null);
        setField(term271248, term271248.getClass(), "implementedInterfaces", null);
        setField(term271248, term271248.getClass(), "subTypes", null);
        setField(term271248, term271248.getClass(), "templateTypeName", null);
        setField(term271248, term271248.getClass(), "className", null);
        setField(term271248, term271248.getClass(), "properties", null);
        setField(term271248, term271248.getClass(), "implicitPrototype", null);
        setBooleanField(term271248, term271248.getClass(), "nativeType", false);
        setBooleanField(term271248, term271248.getClass(), "prettyPrint", false);
        setBooleanField(term271248, term271248.getClass(), "visited", false);
        setField(term271248, term271248.getClass(), "docInfo", null);
        setBooleanField(term271248, term271248.getClass(), "unknown", false);
        setBooleanField(term271248, term271248.getClass(), "resolved", false);
        setField(term271248, term271248.getClass(), "resolveResult", null);
        setField(term271252, term271252.getClass(), "reporter", null);
        setField(term271252, term271252.getClass(), "nativeTypes", null);
        setField(term271252, term271252.getClass(), "namesToTypes", null);
        setField(term271252, term271252.getClass(), "namespaces", null);
        setField(term271252, term271252.getClass(), "enumTypeNames", null);
        setField(term271252, term271252.getClass(), "forwardDeclaredTypes", null);
        setField(term271252, term271252.getClass(), "typesIndexedByProperty", null);
        setField(term271252, term271252.getClass(), "greatestSubtypeByProperty", null);
        setField(term271252, term271252.getClass(), "interfaceToImplementors", null);
        setField(term271252, term271252.getClass(), "unresolvedNamedTypes", null);
        setField(term271252, term271252.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term271252, term271252.getClass(), "lastGeneration", false);
        setField(term271252, term271252.getClass(), "templateTypeName", null);
        setField(term271252, term271252.getClass(), "templateType", null);
        setBooleanField(term271252, term271252.getClass(), "tolerateUndefinedValues", false);
        setField(term271252, term271252.getClass(), "resolveMode", null);
        setField(term271248, term271248.getClass(), "registry", term271252);
        Class<? extends Object> term272137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272136 = ((Class) term272137).getDeclaredField((String) "ORDINARY");
        ((Field) term272136).setAccessible(true);
        Object enum502 = ((Field) term272136).get((Object) null);
        term271253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term271253, term271253.getClass(), "call", null);
        setField(term271253, term271253.getClass(), "prototype", null);
        setField(term271253, term271253.getClass(), "kind", enum502);
        setField(term271253, term271253.getClass(), "typeOfThis", null);
        setField(term271253, term271253.getClass(), "source", null);
        setField(term271253, term271253.getClass(), "implementedInterfaces", null);
        setField(term271253, term271253.getClass(), "subTypes", null);
        setField(term271253, term271253.getClass(), "templateTypeName", null);
        setField(term271253, term271253.getClass(), "className", null);
        setField(term271253, term271253.getClass(), "properties", null);
        setField(term271253, term271253.getClass(), "implicitPrototype", null);
        setBooleanField(term271253, term271253.getClass(), "nativeType", false);
        setBooleanField(term271253, term271253.getClass(), "prettyPrint", false);
        setBooleanField(term271253, term271253.getClass(), "visited", false);
        setField(term271253, term271253.getClass(), "docInfo", null);
        setBooleanField(term271253, term271253.getClass(), "unknown", false);
        setBooleanField(term271253, term271253.getClass(), "resolved", false);
        setField(term271253, term271253.getClass(), "resolveResult", null);
        setField(term271253, term271253.getClass(), "registry", null);
        Class<? extends Object> term272428 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term272427 = ((Class) term272428).getDeclaredField((String) "INTERFACE");
        ((Field) term272427).setAccessible(true);
        Object enum503 = ((Field) term272427).get((Object) null);
        term271133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term271152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term271133, term271133.getClass(), "leastSupertypeVisitor", null);
        setField(term271133, term271133.getClass(), "greatestSubtypeVisitor", null);
        setField(term271133, term271133.getClass(), "call", null);
        setField(term271133, term271133.getClass(), "prototype", null);
        setField(term271133, term271133.getClass(), "kind", enum503);
        setField(term271133, term271133.getClass(), "typeOfThis", null);
        setField(term271133, term271133.getClass(), "source", null);
        setField(term271133, term271133.getClass(), "implementedInterfaces", null);
        setField(term271133, term271133.getClass(), "subTypes", null);
        setField(term271133, term271133.getClass(), "templateTypeName", null);
        setField(term271133, term271133.getClass(), "className", null);
        setField(term271133, term271133.getClass(), "properties", null);
        setField(term271133, term271133.getClass(), "implicitPrototype", null);
        setBooleanField(term271133, term271133.getClass(), "nativeType", false);
        setBooleanField(term271133, term271133.getClass(), "prettyPrint", false);
        setBooleanField(term271133, term271133.getClass(), "visited", false);
        setField(term271133, term271133.getClass(), "docInfo", null);
        setBooleanField(term271133, term271133.getClass(), "unknown", false);
        setBooleanField(term271133, term271133.getClass(), "resolved", false);
        setField(term271133, term271133.getClass(), "resolveResult", null);
        setField(term271152, term271152.getClass(), "reporter", null);
        setField(term271152, term271152.getClass(), "nativeTypes", null);
        setField(term271152, term271152.getClass(), "namesToTypes", null);
        setField(term271152, term271152.getClass(), "namespaces", null);
        setField(term271152, term271152.getClass(), "enumTypeNames", null);
        setField(term271152, term271152.getClass(), "forwardDeclaredTypes", null);
        setField(term271152, term271152.getClass(), "typesIndexedByProperty", null);
        setField(term271152, term271152.getClass(), "greatestSubtypeByProperty", null);
        setField(term271152, term271152.getClass(), "interfaceToImplementors", null);
        setField(term271152, term271152.getClass(), "unresolvedNamedTypes", null);
        setField(term271152, term271152.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term271152, term271152.getClass(), "lastGeneration", false);
        setField(term271152, term271152.getClass(), "templateTypeName", null);
        setField(term271152, term271152.getClass(), "templateType", null);
        setBooleanField(term271152, term271152.getClass(), "tolerateUndefinedValues", false);
        setField(term271152, term271152.getClass(), "resolveMode", null);
        setField(term271133, term271133.getClass(), "registry", term271152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term270398;
        args[1] = false;
        Object retValue = callMethod(klass, "supAndInfHelper", argTypes, term270036, args);
        assertTrue(recursiveEquals(term270036, term271248));
        assertTrue(recursiveEquals(term270398, term271253));
        assertTrue(recursiveEquals(retValue, term271133));
    }

};


