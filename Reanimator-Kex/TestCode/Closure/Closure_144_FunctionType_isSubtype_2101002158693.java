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

public class FunctionType_isSubtype_2101002158693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726895;
     Object term727151;
     Object term727988;
     Object term727992;

    public FunctionType_isSubtype_2101002158693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term727998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term727997 = ((Class) term727998).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term727997).setAccessible(true);
        Object enum1310 = ((Field) term727997).get((Object) null);
        term726895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term726895, term726895.getClass(), "kind", enum1310);
        Class<? extends Object> term728298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term728297 = ((Class) term728298).getDeclaredField((String) "INTERFACE");
        ((Field) term728297).setAccessible(true);
        Object enum1311 = ((Field) term728297).get((Object) null);
        term727151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term727151, term727151.getClass(), "kind", enum1311);
        Class<? extends Object> term728592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term728591 = ((Class) term728592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term728591).setAccessible(true);
        Object enum1312 = ((Field) term728591).get((Object) null);
        term727988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term727988, term727988.getClass(), "call", null);
        setField(term727988, term727988.getClass(), "prototype", null);
        setField(term727988, term727988.getClass(), "kind", enum1312);
        setField(term727988, term727988.getClass(), "typeOfThis", null);
        setField(term727988, term727988.getClass(), "source", null);
        setField(term727988, term727988.getClass(), "implementedInterfaces", null);
        setField(term727988, term727988.getClass(), "subTypes", null);
        setField(term727988, term727988.getClass(), "templateTypeName", null);
        setField(term727988, term727988.getClass(), "className", null);
        setField(term727988, term727988.getClass(), "properties", null);
        setField(term727988, term727988.getClass(), "implicitPrototype", null);
        setBooleanField(term727988, term727988.getClass(), "nativeType", false);
        setBooleanField(term727988, term727988.getClass(), "prettyPrint", false);
        setBooleanField(term727988, term727988.getClass(), "visited", false);
        setField(term727988, term727988.getClass(), "docInfo", null);
        setBooleanField(term727988, term727988.getClass(), "unknown", false);
        setBooleanField(term727988, term727988.getClass(), "resolved", false);
        setField(term727988, term727988.getClass(), "resolveResult", null);
        setField(term727988, term727988.getClass(), "registry", null);
        Class<? extends Object> term728892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term728891 = ((Class) term728892).getDeclaredField((String) "INTERFACE");
        ((Field) term728891).setAccessible(true);
        Object enum1313 = ((Field) term728891).get((Object) null);
        term727992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term727992, term727992.getClass(), "this$0", null);
        setField(term727992, term727992.getClass(), "call", null);
        setField(term727992, term727992.getClass(), "prototype", null);
        setField(term727992, term727992.getClass(), "kind", enum1313);
        setField(term727992, term727992.getClass(), "typeOfThis", null);
        setField(term727992, term727992.getClass(), "source", null);
        setField(term727992, term727992.getClass(), "implementedInterfaces", null);
        setField(term727992, term727992.getClass(), "subTypes", null);
        setField(term727992, term727992.getClass(), "templateTypeName", null);
        setField(term727992, term727992.getClass(), "className", null);
        setField(term727992, term727992.getClass(), "properties", null);
        setField(term727992, term727992.getClass(), "implicitPrototype", null);
        setBooleanField(term727992, term727992.getClass(), "nativeType", false);
        setBooleanField(term727992, term727992.getClass(), "prettyPrint", false);
        setBooleanField(term727992, term727992.getClass(), "visited", false);
        setField(term727992, term727992.getClass(), "docInfo", null);
        setBooleanField(term727992, term727992.getClass(), "unknown", false);
        setBooleanField(term727992, term727992.getClass(), "resolved", false);
        setField(term727992, term727992.getClass(), "resolveResult", null);
        setField(term727992, term727992.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term727151;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term726895, args);
        assertTrue(recursiveEquals(term726895, term727988));
        assertTrue(recursiveEquals(term727151, term727992));
        assertTrue(recursiveEquals(retValue, true));
    }

};


