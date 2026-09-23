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

public class FunctionType_isSubtype_21010021581708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2323641;
     Object term2323897;
     Object term2324352;
     Object term2324356;

    public FunctionType_isSubtype_21010021581708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2324362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2324361 = ((Class) term2324362).getDeclaredField((String) "INTERFACE");
        ((Field) term2324361).setAccessible(true);
        Object enum4342 = ((Field) term2324361).get((Object) null);
        term2323641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2323641, term2323641.getClass(), "kind", enum4342);
        term2323897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2323897, term2323897.getClass(), "kind", enum4342);
        Class<? extends Object> term2324656 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2324655 = ((Class) term2324656).getDeclaredField((String) "INTERFACE");
        ((Field) term2324655).setAccessible(true);
        Object enum4343 = ((Field) term2324655).get((Object) null);
        term2324352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2324352, term2324352.getClass(), "this$0", null);
        setField(term2324352, term2324352.getClass(), "call", null);
        setField(term2324352, term2324352.getClass(), "prototype", null);
        setField(term2324352, term2324352.getClass(), "kind", enum4343);
        setField(term2324352, term2324352.getClass(), "typeOfThis", null);
        setField(term2324352, term2324352.getClass(), "source", null);
        setField(term2324352, term2324352.getClass(), "implementedInterfaces", null);
        setField(term2324352, term2324352.getClass(), "subTypes", null);
        setField(term2324352, term2324352.getClass(), "templateTypeName", null);
        setField(term2324352, term2324352.getClass(), "className", null);
        setField(term2324352, term2324352.getClass(), "properties", null);
        setField(term2324352, term2324352.getClass(), "implicitPrototype", null);
        setBooleanField(term2324352, term2324352.getClass(), "nativeType", false);
        setBooleanField(term2324352, term2324352.getClass(), "visited", false);
        setField(term2324352, term2324352.getClass(), "docInfo", null);
        setBooleanField(term2324352, term2324352.getClass(), "unknown", false);
        setBooleanField(term2324352, term2324352.getClass(), "resolved", false);
        setField(term2324352, term2324352.getClass(), "resolveResult", null);
        setField(term2324352, term2324352.getClass(), "registry", null);
        Class<? extends Object> term2324950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2324949 = ((Class) term2324950).getDeclaredField((String) "INTERFACE");
        ((Field) term2324949).setAccessible(true);
        Object enum4344 = ((Field) term2324949).get((Object) null);
        term2324356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2324356, term2324356.getClass(), "this$0", null);
        setField(term2324356, term2324356.getClass(), "call", null);
        setField(term2324356, term2324356.getClass(), "prototype", null);
        setField(term2324356, term2324356.getClass(), "kind", enum4344);
        setField(term2324356, term2324356.getClass(), "typeOfThis", null);
        setField(term2324356, term2324356.getClass(), "source", null);
        setField(term2324356, term2324356.getClass(), "implementedInterfaces", null);
        setField(term2324356, term2324356.getClass(), "subTypes", null);
        setField(term2324356, term2324356.getClass(), "templateTypeName", null);
        setField(term2324356, term2324356.getClass(), "className", null);
        setField(term2324356, term2324356.getClass(), "properties", null);
        setField(term2324356, term2324356.getClass(), "implicitPrototype", null);
        setBooleanField(term2324356, term2324356.getClass(), "nativeType", false);
        setBooleanField(term2324356, term2324356.getClass(), "visited", false);
        setField(term2324356, term2324356.getClass(), "docInfo", null);
        setBooleanField(term2324356, term2324356.getClass(), "unknown", false);
        setBooleanField(term2324356, term2324356.getClass(), "resolved", false);
        setField(term2324356, term2324356.getClass(), "resolveResult", null);
        setField(term2324356, term2324356.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2323897;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2323641, args);
        assertTrue(recursiveEquals(term2323641, term2324352));
        assertTrue(recursiveEquals(term2323897, term2324356));
        assertTrue(recursiveEquals(retValue, true));
    }

};


