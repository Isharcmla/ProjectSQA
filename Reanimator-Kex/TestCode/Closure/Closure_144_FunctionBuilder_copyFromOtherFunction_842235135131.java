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

public class FunctionBuilder_copyFromOtherFunction_842235135131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91974;
     Object term92396;
     Object term93142;
     Object term93146;
     Object term93136;

    public FunctionBuilder_copyFromOtherFunction_842235135131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term92082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term91974, term91974.getClass(), "name", "");
        setField(term91974, term91974.getClass(), "sourceNode", term92082);
        setField(term91974, term91974.getClass(), "parametersNode", term92152);
        setField(term91974, term91974.getClass(), "returnType", null);
        setField(term91974, term91974.getClass(), "typeOfThis", term92250);
        setField(term91974, term91974.getClass(), "templateTypeName", "");
        Class<? extends Object> term93155 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93154 = ((Class) term93155).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term93154).setAccessible(true);
        Object enum138 = ((Field) term93154).get((Object) null);
        term92396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term92490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term92586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term92396, term92396.getClass(), "className", null);
        setField(term92396, term92396.getClass(), "source", null);
        setField(term92490, term92490.getClass(), "parameters", null);
        setField(term92490, term92490.getClass(), "returnType", term92586);
        setField(term92396, term92396.getClass(), "call", term92490);
        setField(term92396, term92396.getClass(), "typeOfThis", term92586);
        setField(term92396, term92396.getClass(), "templateTypeName", "");
        setField(term92396, term92396.getClass(), "kind", enum138);
        term93142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term93143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term93142, term93142.getClass(), "registry", null);
        setField(term93142, term93142.getClass(), "name", null);
        setField(term93142, term93142.getClass(), "sourceNode", null);
        setField(term93142, term93142.getClass(), "parametersNode", null);
        setField(term93143, term93143.getClass(), "properties", null);
        setBooleanField(term93143, term93143.getClass(), "isFrozen", false);
        setField(term93143, term93143.getClass(), "className", null);
        setField(term93143, term93143.getClass(), "implicitPrototype", null);
        setBooleanField(term93143, term93143.getClass(), "nativeType", false);
        setBooleanField(term93143, term93143.getClass(), "prettyPrint", false);
        setBooleanField(term93143, term93143.getClass(), "visited", false);
        setField(term93143, term93143.getClass(), "docInfo", null);
        setBooleanField(term93143, term93143.getClass(), "unknown", false);
        setBooleanField(term93143, term93143.getClass(), "resolved", false);
        setField(term93143, term93143.getClass(), "resolveResult", null);
        setField(term93143, term93143.getClass(), "registry", null);
        setField(term93142, term93142.getClass(), "returnType", term93143);
        setField(term93142, term93142.getClass(), "typeOfThis", term93143);
        setField(term93142, term93142.getClass(), "templateTypeName", "");
        setBooleanField(term93142, term93142.getClass(), "inferredReturnType", false);
        setBooleanField(term93142, term93142.getClass(), "isConstructor", true);
        setBooleanField(term93142, term93142.getClass(), "isNativeType", false);
        Class<? extends Object> term93455 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93454 = ((Class) term93455).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term93454).setAccessible(true);
        Object enum139 = ((Field) term93454).get((Object) null);
        term93146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term93147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term93148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term93146, term93146.getClass(), "this$0", null);
        setField(term93147, term93147.getClass(), "parameters", null);
        setField(term93148, term93148.getClass(), "properties", null);
        setBooleanField(term93148, term93148.getClass(), "isFrozen", false);
        setField(term93148, term93148.getClass(), "className", null);
        setField(term93148, term93148.getClass(), "implicitPrototype", null);
        setBooleanField(term93148, term93148.getClass(), "nativeType", false);
        setBooleanField(term93148, term93148.getClass(), "prettyPrint", false);
        setBooleanField(term93148, term93148.getClass(), "visited", false);
        setField(term93148, term93148.getClass(), "docInfo", null);
        setBooleanField(term93148, term93148.getClass(), "unknown", false);
        setBooleanField(term93148, term93148.getClass(), "resolved", false);
        setField(term93148, term93148.getClass(), "resolveResult", null);
        setField(term93148, term93148.getClass(), "registry", null);
        setField(term93147, term93147.getClass(), "returnType", term93148);
        setBooleanField(term93147, term93147.getClass(), "returnTypeInferred", false);
        setBooleanField(term93147, term93147.getClass(), "resolved", false);
        setField(term93147, term93147.getClass(), "resolveResult", null);
        setField(term93147, term93147.getClass(), "registry", null);
        setField(term93146, term93146.getClass(), "call", term93147);
        setField(term93146, term93146.getClass(), "prototype", null);
        setField(term93146, term93146.getClass(), "kind", enum139);
        setField(term93146, term93146.getClass(), "typeOfThis", term93148);
        setField(term93146, term93146.getClass(), "source", null);
        setField(term93146, term93146.getClass(), "implementedInterfaces", null);
        setField(term93146, term93146.getClass(), "subTypes", null);
        setField(term93146, term93146.getClass(), "templateTypeName", "");
        setField(term93146, term93146.getClass(), "className", null);
        setField(term93146, term93146.getClass(), "properties", null);
        setField(term93146, term93146.getClass(), "implicitPrototype", null);
        setBooleanField(term93146, term93146.getClass(), "nativeType", false);
        setBooleanField(term93146, term93146.getClass(), "prettyPrint", false);
        setBooleanField(term93146, term93146.getClass(), "visited", false);
        setField(term93146, term93146.getClass(), "docInfo", null);
        setBooleanField(term93146, term93146.getClass(), "unknown", false);
        setBooleanField(term93146, term93146.getClass(), "resolved", false);
        setField(term93146, term93146.getClass(), "resolveResult", null);
        setField(term93146, term93146.getClass(), "registry", null);
        term93136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term93076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term93136, term93136.getClass(), "registry", null);
        setField(term93136, term93136.getClass(), "name", null);
        setField(term93136, term93136.getClass(), "sourceNode", null);
        setField(term93136, term93136.getClass(), "parametersNode", null);
        setField(term93076, term93076.getClass(), "properties", null);
        setBooleanField(term93076, term93076.getClass(), "isFrozen", false);
        setField(term93076, term93076.getClass(), "className", null);
        setField(term93076, term93076.getClass(), "implicitPrototype", null);
        setBooleanField(term93076, term93076.getClass(), "nativeType", false);
        setBooleanField(term93076, term93076.getClass(), "prettyPrint", false);
        setBooleanField(term93076, term93076.getClass(), "visited", false);
        setField(term93076, term93076.getClass(), "docInfo", null);
        setBooleanField(term93076, term93076.getClass(), "unknown", false);
        setBooleanField(term93076, term93076.getClass(), "resolved", false);
        setField(term93076, term93076.getClass(), "resolveResult", null);
        setField(term93076, term93076.getClass(), "registry", null);
        setField(term93136, term93136.getClass(), "returnType", term93076);
        setField(term93136, term93136.getClass(), "typeOfThis", term93076);
        setField(term93136, term93136.getClass(), "templateTypeName", "");
        setBooleanField(term93136, term93136.getClass(), "inferredReturnType", false);
        setBooleanField(term93136, term93136.getClass(), "isConstructor", true);
        setBooleanField(term93136, term93136.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term92396;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term91974, args);
        assertTrue(recursiveEquals(term91974, term93142));
        assertTrue(recursiveEquals(term92396, term93146));
        assertTrue(recursiveEquals(retValue, term93136));
    }

};


