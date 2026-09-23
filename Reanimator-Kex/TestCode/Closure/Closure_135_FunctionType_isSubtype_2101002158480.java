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

public class FunctionType_isSubtype_2101002158480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336083;
     Object term336533;
     Object term338401;
     Object term338407;

    public FunctionType_isSubtype_2101002158480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term338414 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term338413 = ((Class) term338414).getDeclaredField((String) "ORDINARY");
        ((Field) term338413).setAccessible(true);
        Object enum617 = ((Field) term338413).get((Object) null);
        term336083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term336331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term336425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term336083, term336083.getClass(), "kind", enum617);
        setField(term336083, term336083.getClass(), "typeOfThis", term336331);
        setField(term336083, term336083.getClass(), "call", term336425);
        Class<? extends Object> term338705 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term338704 = ((Class) term338705).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term338704).setAccessible(true);
        Object enum618 = ((Field) term338704).get((Object) null);
        term336533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term336781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term336533, term336533.getClass(), "kind", enum618);
        setField(term336533, term336533.getClass(), "typeOfThis", term336781);
        setField(term336533, term336533.getClass(), "call", null);
        Class<? extends Object> term339005 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339004 = ((Class) term339005).getDeclaredField((String) "ORDINARY");
        ((Field) term339004).setAccessible(true);
        Object enum619 = ((Field) term339004).get((Object) null);
        term338401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term338402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term338406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term338401, term338401.getClass(), "this$0", null);
        setField(term338402, term338402.getClass(), "parameters", null);
        setField(term338402, term338402.getClass(), "returnType", null);
        setBooleanField(term338402, term338402.getClass(), "resolved", false);
        setField(term338402, term338402.getClass(), "resolveResult", null);
        setField(term338402, term338402.getClass(), "registry", null);
        setField(term338401, term338401.getClass(), "call", term338402);
        setField(term338401, term338401.getClass(), "prototype", null);
        setField(term338401, term338401.getClass(), "kind", enum619);
        setField(term338406, term338406.getClass(), "call", null);
        setField(term338406, term338406.getClass(), "prototype", null);
        setField(term338406, term338406.getClass(), "kind", null);
        setField(term338406, term338406.getClass(), "typeOfThis", null);
        setField(term338406, term338406.getClass(), "source", null);
        setField(term338406, term338406.getClass(), "implementedInterfaces", null);
        setField(term338406, term338406.getClass(), "subTypes", null);
        setField(term338406, term338406.getClass(), "templateTypeName", null);
        setField(term338406, term338406.getClass(), "className", null);
        setField(term338406, term338406.getClass(), "properties", null);
        setField(term338406, term338406.getClass(), "implicitPrototype", null);
        setBooleanField(term338406, term338406.getClass(), "nativeType", false);
        setBooleanField(term338406, term338406.getClass(), "visited", false);
        setField(term338406, term338406.getClass(), "docInfo", null);
        setBooleanField(term338406, term338406.getClass(), "unknown", false);
        setBooleanField(term338406, term338406.getClass(), "resolved", false);
        setField(term338406, term338406.getClass(), "resolveResult", null);
        setField(term338406, term338406.getClass(), "registry", null);
        setField(term338401, term338401.getClass(), "typeOfThis", term338406);
        setField(term338401, term338401.getClass(), "source", null);
        setField(term338401, term338401.getClass(), "implementedInterfaces", null);
        setField(term338401, term338401.getClass(), "subTypes", null);
        setField(term338401, term338401.getClass(), "templateTypeName", null);
        setField(term338401, term338401.getClass(), "className", null);
        setField(term338401, term338401.getClass(), "properties", null);
        setField(term338401, term338401.getClass(), "implicitPrototype", null);
        setBooleanField(term338401, term338401.getClass(), "nativeType", false);
        setBooleanField(term338401, term338401.getClass(), "visited", false);
        setField(term338401, term338401.getClass(), "docInfo", null);
        setBooleanField(term338401, term338401.getClass(), "unknown", false);
        setBooleanField(term338401, term338401.getClass(), "resolved", false);
        setField(term338401, term338401.getClass(), "resolveResult", null);
        setField(term338401, term338401.getClass(), "registry", null);
        Class<? extends Object> term339296 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339295 = ((Class) term339296).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term339295).setAccessible(true);
        Object enum620 = ((Field) term339295).get((Object) null);
        term338407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term338411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term338407, term338407.getClass(), "this$0", null);
        setField(term338407, term338407.getClass(), "call", null);
        setField(term338407, term338407.getClass(), "prototype", null);
        setField(term338407, term338407.getClass(), "kind", enum620);
        setField(term338411, term338411.getClass(), "leastSupertypeVisitor", null);
        setField(term338411, term338411.getClass(), "greatestSubtypeVisitor", null);
        setField(term338411, term338411.getClass(), "call", null);
        setField(term338411, term338411.getClass(), "prototype", null);
        setField(term338411, term338411.getClass(), "kind", null);
        setField(term338411, term338411.getClass(), "typeOfThis", null);
        setField(term338411, term338411.getClass(), "source", null);
        setField(term338411, term338411.getClass(), "implementedInterfaces", null);
        setField(term338411, term338411.getClass(), "subTypes", null);
        setField(term338411, term338411.getClass(), "templateTypeName", null);
        setField(term338411, term338411.getClass(), "className", null);
        setField(term338411, term338411.getClass(), "properties", null);
        setField(term338411, term338411.getClass(), "implicitPrototype", null);
        setBooleanField(term338411, term338411.getClass(), "nativeType", false);
        setBooleanField(term338411, term338411.getClass(), "visited", false);
        setField(term338411, term338411.getClass(), "docInfo", null);
        setBooleanField(term338411, term338411.getClass(), "unknown", false);
        setBooleanField(term338411, term338411.getClass(), "resolved", false);
        setField(term338411, term338411.getClass(), "resolveResult", null);
        setField(term338411, term338411.getClass(), "registry", null);
        setField(term338407, term338407.getClass(), "typeOfThis", term338411);
        setField(term338407, term338407.getClass(), "source", null);
        setField(term338407, term338407.getClass(), "implementedInterfaces", null);
        setField(term338407, term338407.getClass(), "subTypes", null);
        setField(term338407, term338407.getClass(), "templateTypeName", null);
        setField(term338407, term338407.getClass(), "className", null);
        setField(term338407, term338407.getClass(), "properties", null);
        setField(term338407, term338407.getClass(), "implicitPrototype", null);
        setBooleanField(term338407, term338407.getClass(), "nativeType", false);
        setBooleanField(term338407, term338407.getClass(), "visited", false);
        setField(term338407, term338407.getClass(), "docInfo", null);
        setBooleanField(term338407, term338407.getClass(), "unknown", false);
        setBooleanField(term338407, term338407.getClass(), "resolved", false);
        setField(term338407, term338407.getClass(), "resolveResult", null);
        setField(term338407, term338407.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term336533;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term336083, args);
        assertTrue(recursiveEquals(term336083, term338401));
        assertTrue(recursiveEquals(term336533, term338407));
        assertTrue(recursiveEquals(retValue, false));
    }

};


