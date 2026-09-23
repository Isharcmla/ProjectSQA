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

public class FunctionType_isSubtype_2101002158365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219992;
     Object term220652;
     Object term221260;
     Object term221265;

    public FunctionType_isSubtype_2101002158365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221271 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221270 = ((Class) term221271).getDeclaredField((String) "INTERFACE");
        ((Field) term221270).setAccessible(true);
        Object enum399 = ((Field) term221270).get((Object) null);
        term219992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term220544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term219992, term219992.getClass(), "kind", enum399);
        setField(term219992, term219992.getClass(), "typeOfThis", term220544);
        term220652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term220652, term220652.getClass(), "kind", enum399);
        setField(term220652, term220652.getClass(), "typeOfThis", null);
        Class<? extends Object> term221565 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221564 = ((Class) term221565).getDeclaredField((String) "INTERFACE");
        ((Field) term221564).setAccessible(true);
        Object enum400 = ((Field) term221564).get((Object) null);
        term221260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term221264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term221260, term221260.getClass(), "call", null);
        setField(term221260, term221260.getClass(), "prototype", null);
        setField(term221260, term221260.getClass(), "kind", enum400);
        setField(term221264, term221264.getClass(), "this$0", null);
        setField(term221264, term221264.getClass(), "call", null);
        setField(term221264, term221264.getClass(), "prototype", null);
        setField(term221264, term221264.getClass(), "kind", null);
        setField(term221264, term221264.getClass(), "typeOfThis", null);
        setField(term221264, term221264.getClass(), "source", null);
        setField(term221264, term221264.getClass(), "implementedInterfaces", null);
        setField(term221264, term221264.getClass(), "subTypes", null);
        setField(term221264, term221264.getClass(), "templateTypeName", null);
        setField(term221264, term221264.getClass(), "className", null);
        setField(term221264, term221264.getClass(), "properties", null);
        setField(term221264, term221264.getClass(), "implicitPrototype", null);
        setBooleanField(term221264, term221264.getClass(), "nativeType", false);
        setBooleanField(term221264, term221264.getClass(), "visited", false);
        setField(term221264, term221264.getClass(), "docInfo", null);
        setBooleanField(term221264, term221264.getClass(), "unknown", false);
        setBooleanField(term221264, term221264.getClass(), "resolved", false);
        setField(term221264, term221264.getClass(), "resolveResult", null);
        setField(term221264, term221264.getClass(), "registry", null);
        setField(term221260, term221260.getClass(), "typeOfThis", term221264);
        setField(term221260, term221260.getClass(), "source", null);
        setField(term221260, term221260.getClass(), "implementedInterfaces", null);
        setField(term221260, term221260.getClass(), "subTypes", null);
        setField(term221260, term221260.getClass(), "templateTypeName", null);
        setField(term221260, term221260.getClass(), "className", null);
        setField(term221260, term221260.getClass(), "properties", null);
        setField(term221260, term221260.getClass(), "implicitPrototype", null);
        setBooleanField(term221260, term221260.getClass(), "nativeType", false);
        setBooleanField(term221260, term221260.getClass(), "visited", false);
        setField(term221260, term221260.getClass(), "docInfo", null);
        setBooleanField(term221260, term221260.getClass(), "unknown", false);
        setBooleanField(term221260, term221260.getClass(), "resolved", false);
        setField(term221260, term221260.getClass(), "resolveResult", null);
        setField(term221260, term221260.getClass(), "registry", null);
        Class<? extends Object> term221859 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221858 = ((Class) term221859).getDeclaredField((String) "INTERFACE");
        ((Field) term221858).setAccessible(true);
        Object enum401 = ((Field) term221858).get((Object) null);
        term221265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term221265, term221265.getClass(), "this$0", null);
        setField(term221265, term221265.getClass(), "call", null);
        setField(term221265, term221265.getClass(), "prototype", null);
        setField(term221265, term221265.getClass(), "kind", enum401);
        setField(term221265, term221265.getClass(), "typeOfThis", null);
        setField(term221265, term221265.getClass(), "source", null);
        setField(term221265, term221265.getClass(), "implementedInterfaces", null);
        setField(term221265, term221265.getClass(), "subTypes", null);
        setField(term221265, term221265.getClass(), "templateTypeName", null);
        setField(term221265, term221265.getClass(), "className", null);
        setField(term221265, term221265.getClass(), "properties", null);
        setField(term221265, term221265.getClass(), "implicitPrototype", null);
        setBooleanField(term221265, term221265.getClass(), "nativeType", false);
        setBooleanField(term221265, term221265.getClass(), "visited", false);
        setField(term221265, term221265.getClass(), "docInfo", null);
        setBooleanField(term221265, term221265.getClass(), "unknown", false);
        setBooleanField(term221265, term221265.getClass(), "resolved", false);
        setField(term221265, term221265.getClass(), "resolveResult", null);
        setField(term221265, term221265.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term220652;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term219992, args);
        assertTrue(recursiveEquals(term219992, term221260));
        assertTrue(recursiveEquals(term220652, term221265));
        assertTrue(recursiveEquals(retValue, true));
    }

};


