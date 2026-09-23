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

public class FunctionType_isSubtype_21010021581760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2406518;
     Object term2407116;
     Object term2409549;
     Object term2409558;

    public FunctionType_isSubtype_21010021581760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2409569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2409568 = ((Class) term2409569).getDeclaredField((String) "ORDINARY");
        ((Field) term2409568).setAccessible(true);
        Object enum4499 = ((Field) term2409568).get((Object) null);
        Class<? extends Object> term2409860 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2409859 = ((Class) term2409860).getDeclaredField((String) "INTERFACE");
        ((Field) term2409859).setAccessible(true);
        Object enum4500 = ((Field) term2409859).get((Object) null);
        term2406518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2406766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2407008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2406518, term2406518.getClass(), "kind", enum4499);
        setField(term2406766, term2406766.getClass(), "kind", enum4500);
        setField(term2406766, term2406766.getClass(), "className", null);
        setField(term2406518, term2406518.getClass(), "typeOfThis", term2406766);
        setField(term2406518, term2406518.getClass(), "call", term2407008);
        term2407116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2407298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2407466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2407116, term2407116.getClass(), "kind", enum4499);
        setField(term2407298, term2407298.getClass(), "kind", enum4500);
        setField(term2407298, term2407298.getClass(), "className", null);
        setField(term2407116, term2407116.getClass(), "typeOfThis", term2407298);
        setField(term2407116, term2407116.getClass(), "call", term2407466);
        Class<? extends Object> term2410154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2410153 = ((Class) term2410154).getDeclaredField((String) "ORDINARY");
        ((Field) term2410153).setAccessible(true);
        Object enum4501 = ((Field) term2410153).get((Object) null);
        Class<? extends Object> term2410445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2410444 = ((Class) term2410445).getDeclaredField((String) "INTERFACE");
        ((Field) term2410444).setAccessible(true);
        Object enum4502 = ((Field) term2410444).get((Object) null);
        term2409549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2409550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2409554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2409549, term2409549.getClass(), "this$0", null);
        setField(term2409550, term2409550.getClass(), "parameters", null);
        setField(term2409550, term2409550.getClass(), "returnType", null);
        setBooleanField(term2409550, term2409550.getClass(), "resolved", false);
        setField(term2409550, term2409550.getClass(), "resolveResult", null);
        setField(term2409550, term2409550.getClass(), "registry", null);
        setField(term2409549, term2409549.getClass(), "call", term2409550);
        setField(term2409549, term2409549.getClass(), "prototype", null);
        setField(term2409549, term2409549.getClass(), "kind", enum4501);
        setField(term2409554, term2409554.getClass(), "call", null);
        setField(term2409554, term2409554.getClass(), "prototype", null);
        setField(term2409554, term2409554.getClass(), "kind", enum4502);
        setField(term2409554, term2409554.getClass(), "typeOfThis", null);
        setField(term2409554, term2409554.getClass(), "source", null);
        setField(term2409554, term2409554.getClass(), "implementedInterfaces", null);
        setField(term2409554, term2409554.getClass(), "subTypes", null);
        setField(term2409554, term2409554.getClass(), "templateTypeName", null);
        setField(term2409554, term2409554.getClass(), "className", null);
        setField(term2409554, term2409554.getClass(), "properties", null);
        setField(term2409554, term2409554.getClass(), "implicitPrototype", null);
        setBooleanField(term2409554, term2409554.getClass(), "nativeType", false);
        setBooleanField(term2409554, term2409554.getClass(), "visited", false);
        setField(term2409554, term2409554.getClass(), "docInfo", null);
        setBooleanField(term2409554, term2409554.getClass(), "unknown", false);
        setBooleanField(term2409554, term2409554.getClass(), "resolved", false);
        setField(term2409554, term2409554.getClass(), "resolveResult", null);
        setField(term2409554, term2409554.getClass(), "registry", null);
        setField(term2409549, term2409549.getClass(), "typeOfThis", term2409554);
        setField(term2409549, term2409549.getClass(), "source", null);
        setField(term2409549, term2409549.getClass(), "implementedInterfaces", null);
        setField(term2409549, term2409549.getClass(), "subTypes", null);
        setField(term2409549, term2409549.getClass(), "templateTypeName", null);
        setField(term2409549, term2409549.getClass(), "className", null);
        setField(term2409549, term2409549.getClass(), "properties", null);
        setField(term2409549, term2409549.getClass(), "implicitPrototype", null);
        setBooleanField(term2409549, term2409549.getClass(), "nativeType", false);
        setBooleanField(term2409549, term2409549.getClass(), "visited", false);
        setField(term2409549, term2409549.getClass(), "docInfo", null);
        setBooleanField(term2409549, term2409549.getClass(), "unknown", false);
        setBooleanField(term2409549, term2409549.getClass(), "resolved", false);
        setField(term2409549, term2409549.getClass(), "resolveResult", null);
        setField(term2409549, term2409549.getClass(), "registry", null);
        Class<? extends Object> term2410739 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2410738 = ((Class) term2410739).getDeclaredField((String) "ORDINARY");
        ((Field) term2410738).setAccessible(true);
        Object enum4503 = ((Field) term2410738).get((Object) null);
        Class<? extends Object> term2411030 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2411029 = ((Class) term2411030).getDeclaredField((String) "INTERFACE");
        ((Field) term2411029).setAccessible(true);
        Object enum4504 = ((Field) term2411029).get((Object) null);
        term2409558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2409559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2409563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2409558, term2409558.getClass(), "this$0", null);
        setField(term2409559, term2409559.getClass(), "parameters", null);
        setField(term2409559, term2409559.getClass(), "returnType", null);
        setBooleanField(term2409559, term2409559.getClass(), "resolved", false);
        setField(term2409559, term2409559.getClass(), "resolveResult", null);
        setField(term2409559, term2409559.getClass(), "registry", null);
        setField(term2409558, term2409558.getClass(), "call", term2409559);
        setField(term2409558, term2409558.getClass(), "prototype", null);
        setField(term2409558, term2409558.getClass(), "kind", enum4503);
        setField(term2409563, term2409563.getClass(), "this$0", null);
        setField(term2409563, term2409563.getClass(), "call", null);
        setField(term2409563, term2409563.getClass(), "prototype", null);
        setField(term2409563, term2409563.getClass(), "kind", enum4504);
        setField(term2409563, term2409563.getClass(), "typeOfThis", null);
        setField(term2409563, term2409563.getClass(), "source", null);
        setField(term2409563, term2409563.getClass(), "implementedInterfaces", null);
        setField(term2409563, term2409563.getClass(), "subTypes", null);
        setField(term2409563, term2409563.getClass(), "templateTypeName", null);
        setField(term2409563, term2409563.getClass(), "className", null);
        setField(term2409563, term2409563.getClass(), "properties", null);
        setField(term2409563, term2409563.getClass(), "implicitPrototype", null);
        setBooleanField(term2409563, term2409563.getClass(), "nativeType", false);
        setBooleanField(term2409563, term2409563.getClass(), "visited", false);
        setField(term2409563, term2409563.getClass(), "docInfo", null);
        setBooleanField(term2409563, term2409563.getClass(), "unknown", false);
        setBooleanField(term2409563, term2409563.getClass(), "resolved", false);
        setField(term2409563, term2409563.getClass(), "resolveResult", null);
        setField(term2409563, term2409563.getClass(), "registry", null);
        setField(term2409558, term2409558.getClass(), "typeOfThis", term2409563);
        setField(term2409558, term2409558.getClass(), "source", null);
        setField(term2409558, term2409558.getClass(), "implementedInterfaces", null);
        setField(term2409558, term2409558.getClass(), "subTypes", null);
        setField(term2409558, term2409558.getClass(), "templateTypeName", null);
        setField(term2409558, term2409558.getClass(), "className", null);
        setField(term2409558, term2409558.getClass(), "properties", null);
        setField(term2409558, term2409558.getClass(), "implicitPrototype", null);
        setBooleanField(term2409558, term2409558.getClass(), "nativeType", false);
        setBooleanField(term2409558, term2409558.getClass(), "visited", false);
        setField(term2409558, term2409558.getClass(), "docInfo", null);
        setBooleanField(term2409558, term2409558.getClass(), "unknown", false);
        setBooleanField(term2409558, term2409558.getClass(), "resolved", false);
        setField(term2409558, term2409558.getClass(), "resolveResult", null);
        setField(term2409558, term2409558.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2407116;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2406518, args);
        assertTrue(recursiveEquals(term2406518, term2409549));
        assertTrue(recursiveEquals(term2407116, term2409558));
        assertTrue(recursiveEquals(retValue, true));
    }

};


