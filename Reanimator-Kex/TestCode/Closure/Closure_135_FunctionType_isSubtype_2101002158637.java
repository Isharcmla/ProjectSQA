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

public class FunctionType_isSubtype_2101002158637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554612;
     Object term555266;
     Object term555880;
     Object term555885;

    public FunctionType_isSubtype_2101002158637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term555891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term555890 = ((Class) term555891).getDeclaredField((String) "INTERFACE");
        ((Field) term555890).setAccessible(true);
        Object enum1026 = ((Field) term555890).get((Object) null);
        term554612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term555156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term554612, term554612.getClass(), "kind", enum1026);
        setField(term554612, term554612.getClass(), "typeOfThis", term555156);
        term555266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term555266, term555266.getClass(), "kind", enum1026);
        setField(term555266, term555266.getClass(), "typeOfThis", null);
        Class<? extends Object> term556185 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556184 = ((Class) term556185).getDeclaredField((String) "INTERFACE");
        ((Field) term556184).setAccessible(true);
        Object enum1027 = ((Field) term556184).get((Object) null);
        term555880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term555884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term555880, term555880.getClass(), "this$0", null);
        setField(term555880, term555880.getClass(), "call", null);
        setField(term555880, term555880.getClass(), "prototype", null);
        setField(term555880, term555880.getClass(), "kind", enum1027);
        setField(term555884, term555884.getClass(), "leastSupertypeVisitor", null);
        setField(term555884, term555884.getClass(), "greatestSubtypeVisitor", null);
        setField(term555884, term555884.getClass(), "call", null);
        setField(term555884, term555884.getClass(), "prototype", null);
        setField(term555884, term555884.getClass(), "kind", null);
        setField(term555884, term555884.getClass(), "typeOfThis", null);
        setField(term555884, term555884.getClass(), "source", null);
        setField(term555884, term555884.getClass(), "implementedInterfaces", null);
        setField(term555884, term555884.getClass(), "subTypes", null);
        setField(term555884, term555884.getClass(), "templateTypeName", null);
        setField(term555884, term555884.getClass(), "className", null);
        setField(term555884, term555884.getClass(), "properties", null);
        setField(term555884, term555884.getClass(), "implicitPrototype", null);
        setBooleanField(term555884, term555884.getClass(), "nativeType", false);
        setBooleanField(term555884, term555884.getClass(), "visited", false);
        setField(term555884, term555884.getClass(), "docInfo", null);
        setBooleanField(term555884, term555884.getClass(), "unknown", false);
        setBooleanField(term555884, term555884.getClass(), "resolved", false);
        setField(term555884, term555884.getClass(), "resolveResult", null);
        setField(term555884, term555884.getClass(), "registry", null);
        setField(term555880, term555880.getClass(), "typeOfThis", term555884);
        setField(term555880, term555880.getClass(), "source", null);
        setField(term555880, term555880.getClass(), "implementedInterfaces", null);
        setField(term555880, term555880.getClass(), "subTypes", null);
        setField(term555880, term555880.getClass(), "templateTypeName", null);
        setField(term555880, term555880.getClass(), "className", null);
        setField(term555880, term555880.getClass(), "properties", null);
        setField(term555880, term555880.getClass(), "implicitPrototype", null);
        setBooleanField(term555880, term555880.getClass(), "nativeType", false);
        setBooleanField(term555880, term555880.getClass(), "visited", false);
        setField(term555880, term555880.getClass(), "docInfo", null);
        setBooleanField(term555880, term555880.getClass(), "unknown", false);
        setBooleanField(term555880, term555880.getClass(), "resolved", false);
        setField(term555880, term555880.getClass(), "resolveResult", null);
        setField(term555880, term555880.getClass(), "registry", null);
        Class<? extends Object> term556479 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556478 = ((Class) term556479).getDeclaredField((String) "INTERFACE");
        ((Field) term556478).setAccessible(true);
        Object enum1028 = ((Field) term556478).get((Object) null);
        term555885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term555885, term555885.getClass(), "call", null);
        setField(term555885, term555885.getClass(), "prototype", null);
        setField(term555885, term555885.getClass(), "kind", enum1028);
        setField(term555885, term555885.getClass(), "typeOfThis", null);
        setField(term555885, term555885.getClass(), "source", null);
        setField(term555885, term555885.getClass(), "implementedInterfaces", null);
        setField(term555885, term555885.getClass(), "subTypes", null);
        setField(term555885, term555885.getClass(), "templateTypeName", null);
        setField(term555885, term555885.getClass(), "className", null);
        setField(term555885, term555885.getClass(), "properties", null);
        setField(term555885, term555885.getClass(), "implicitPrototype", null);
        setBooleanField(term555885, term555885.getClass(), "nativeType", false);
        setBooleanField(term555885, term555885.getClass(), "visited", false);
        setField(term555885, term555885.getClass(), "docInfo", null);
        setBooleanField(term555885, term555885.getClass(), "unknown", false);
        setBooleanField(term555885, term555885.getClass(), "resolved", false);
        setField(term555885, term555885.getClass(), "resolveResult", null);
        setField(term555885, term555885.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term555266;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term554612, args);
        assertTrue(recursiveEquals(term554612, term555880));
        assertTrue(recursiveEquals(term555266, term555885));
        assertTrue(recursiveEquals(retValue, true));
    }

};


