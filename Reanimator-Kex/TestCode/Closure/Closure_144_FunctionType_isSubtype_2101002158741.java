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

public class FunctionType_isSubtype_2101002158741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808468;
     Object term808932;
     Object term809925;
     Object term809931;

    public FunctionType_isSubtype_2101002158741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term809940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term809939 = ((Class) term809940).getDeclaredField((String) "ORDINARY");
        ((Field) term809939).setAccessible(true);
        Object enum1457 = ((Field) term809939).get((Object) null);
        term808468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term808724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term808822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term808468, term808468.getClass(), "kind", enum1457);
        setField(term808724, term808724.getClass(), "kind", enum1457);
        setField(term808724, term808724.getClass(), "typeOfThis", term808822);
        setField(term808468, term808468.getClass(), "typeOfThis", term808724);
        Class<? extends Object> term810231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term810230 = ((Class) term810231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term810230).setAccessible(true);
        Object enum1458 = ((Field) term810230).get((Object) null);
        term808932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term809114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term808932, term808932.getClass(), "kind", enum1457);
        setField(term809114, term809114.getClass(), "kind", enum1458);
        setField(term809114, term809114.getClass(), "typeOfThis", null);
        setField(term808932, term808932.getClass(), "typeOfThis", term809114);
        Class<? extends Object> term810531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term810530 = ((Class) term810531).getDeclaredField((String) "ORDINARY");
        ((Field) term810530).setAccessible(true);
        Object enum1459 = ((Field) term810530).get((Object) null);
        term809925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term809929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term809930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term809925, term809925.getClass(), "leastSupertypeVisitor", null);
        setField(term809925, term809925.getClass(), "greatestSubtypeVisitor", null);
        setField(term809925, term809925.getClass(), "call", null);
        setField(term809925, term809925.getClass(), "prototype", null);
        setField(term809925, term809925.getClass(), "kind", enum1459);
        setField(term809929, term809929.getClass(), "this$0", null);
        setField(term809929, term809929.getClass(), "call", null);
        setField(term809929, term809929.getClass(), "prototype", null);
        setField(term809929, term809929.getClass(), "kind", enum1459);
        setField(term809930, term809930.getClass(), "indexType", null);
        setField(term809930, term809930.getClass(), "referencedType", null);
        setBooleanField(term809930, term809930.getClass(), "visited", false);
        setField(term809930, term809930.getClass(), "docInfo", null);
        setBooleanField(term809930, term809930.getClass(), "unknown", false);
        setBooleanField(term809930, term809930.getClass(), "resolved", false);
        setField(term809930, term809930.getClass(), "resolveResult", null);
        setField(term809930, term809930.getClass(), "registry", null);
        setField(term809929, term809929.getClass(), "typeOfThis", term809930);
        setField(term809929, term809929.getClass(), "source", null);
        setField(term809929, term809929.getClass(), "implementedInterfaces", null);
        setField(term809929, term809929.getClass(), "subTypes", null);
        setField(term809929, term809929.getClass(), "templateTypeName", null);
        setField(term809929, term809929.getClass(), "className", null);
        setField(term809929, term809929.getClass(), "properties", null);
        setField(term809929, term809929.getClass(), "implicitPrototype", null);
        setBooleanField(term809929, term809929.getClass(), "nativeType", false);
        setBooleanField(term809929, term809929.getClass(), "prettyPrint", false);
        setBooleanField(term809929, term809929.getClass(), "visited", false);
        setField(term809929, term809929.getClass(), "docInfo", null);
        setBooleanField(term809929, term809929.getClass(), "unknown", false);
        setBooleanField(term809929, term809929.getClass(), "resolved", false);
        setField(term809929, term809929.getClass(), "resolveResult", null);
        setField(term809929, term809929.getClass(), "registry", null);
        setField(term809925, term809925.getClass(), "typeOfThis", term809929);
        setField(term809925, term809925.getClass(), "source", null);
        setField(term809925, term809925.getClass(), "implementedInterfaces", null);
        setField(term809925, term809925.getClass(), "subTypes", null);
        setField(term809925, term809925.getClass(), "templateTypeName", null);
        setField(term809925, term809925.getClass(), "className", null);
        setField(term809925, term809925.getClass(), "properties", null);
        setField(term809925, term809925.getClass(), "implicitPrototype", null);
        setBooleanField(term809925, term809925.getClass(), "nativeType", false);
        setBooleanField(term809925, term809925.getClass(), "prettyPrint", false);
        setBooleanField(term809925, term809925.getClass(), "visited", false);
        setField(term809925, term809925.getClass(), "docInfo", null);
        setBooleanField(term809925, term809925.getClass(), "unknown", false);
        setBooleanField(term809925, term809925.getClass(), "resolved", false);
        setField(term809925, term809925.getClass(), "resolveResult", null);
        setField(term809925, term809925.getClass(), "registry", null);
        Class<? extends Object> term810822 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term810821 = ((Class) term810822).getDeclaredField((String) "ORDINARY");
        ((Field) term810821).setAccessible(true);
        Object enum1460 = ((Field) term810821).get((Object) null);
        Class<? extends Object> term811113 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term811112 = ((Class) term811113).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term811112).setAccessible(true);
        Object enum1461 = ((Field) term811112).get((Object) null);
        term809931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term809935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term809931, term809931.getClass(), "call", null);
        setField(term809931, term809931.getClass(), "prototype", null);
        setField(term809931, term809931.getClass(), "kind", enum1460);
        setField(term809935, term809935.getClass(), "this$0", null);
        setField(term809935, term809935.getClass(), "call", null);
        setField(term809935, term809935.getClass(), "prototype", null);
        setField(term809935, term809935.getClass(), "kind", enum1461);
        setField(term809935, term809935.getClass(), "typeOfThis", null);
        setField(term809935, term809935.getClass(), "source", null);
        setField(term809935, term809935.getClass(), "implementedInterfaces", null);
        setField(term809935, term809935.getClass(), "subTypes", null);
        setField(term809935, term809935.getClass(), "templateTypeName", null);
        setField(term809935, term809935.getClass(), "className", null);
        setField(term809935, term809935.getClass(), "properties", null);
        setField(term809935, term809935.getClass(), "implicitPrototype", null);
        setBooleanField(term809935, term809935.getClass(), "nativeType", false);
        setBooleanField(term809935, term809935.getClass(), "prettyPrint", false);
        setBooleanField(term809935, term809935.getClass(), "visited", false);
        setField(term809935, term809935.getClass(), "docInfo", null);
        setBooleanField(term809935, term809935.getClass(), "unknown", false);
        setBooleanField(term809935, term809935.getClass(), "resolved", false);
        setField(term809935, term809935.getClass(), "resolveResult", null);
        setField(term809935, term809935.getClass(), "registry", null);
        setField(term809931, term809931.getClass(), "typeOfThis", term809935);
        setField(term809931, term809931.getClass(), "source", null);
        setField(term809931, term809931.getClass(), "implementedInterfaces", null);
        setField(term809931, term809931.getClass(), "subTypes", null);
        setField(term809931, term809931.getClass(), "templateTypeName", null);
        setField(term809931, term809931.getClass(), "className", null);
        setField(term809931, term809931.getClass(), "properties", null);
        setField(term809931, term809931.getClass(), "implicitPrototype", null);
        setBooleanField(term809931, term809931.getClass(), "nativeType", false);
        setBooleanField(term809931, term809931.getClass(), "prettyPrint", false);
        setBooleanField(term809931, term809931.getClass(), "visited", false);
        setField(term809931, term809931.getClass(), "docInfo", null);
        setBooleanField(term809931, term809931.getClass(), "unknown", false);
        setBooleanField(term809931, term809931.getClass(), "resolved", false);
        setField(term809931, term809931.getClass(), "resolveResult", null);
        setField(term809931, term809931.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term808932;
        callMethod(klass, "isSubtype", argTypes, term808468, args);
        assertTrue(recursiveEquals(term808468, term809925));
        assertTrue(recursiveEquals(term808932, term809931));
    }

};


