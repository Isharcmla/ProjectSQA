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

public class FunctionType_isSubtype_2101002158882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930350;
     Object term931108;
     Object term935513;
     Object term935519;

    public FunctionType_isSubtype_2101002158882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term935529 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term935528 = ((Class) term935529).getDeclaredField((String) "INTERFACE");
        ((Field) term935528).setAccessible(true);
        Object enum1740 = ((Field) term935528).get((Object) null);
        Class<? extends Object> term935823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term935822 = ((Class) term935823).getDeclaredField((String) "INTERFACE");
        ((Field) term935822).setAccessible(true);
        Object enum1741 = ((Field) term935822).get((Object) null);
        term930350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term930894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term931000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term930350, term930350.getClass(), "kind", enum1740);
        setField(term930894, term930894.getClass(), "kind", enum1741);
        setField(term930894, term930894.getClass(), "typeOfThis", term931000);
        setField(term930350, term930350.getClass(), "typeOfThis", term930894);
        Class<? extends Object> term936117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term936116 = ((Class) term936117).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term936116).setAccessible(true);
        Object enum1742 = ((Field) term936116).get((Object) null);
        term931108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term931438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term931108, term931108.getClass(), "kind", enum1740);
        setField(term931438, term931438.getClass(), "kind", enum1742);
        setField(term931438, term931438.getClass(), "typeOfThis", null);
        setField(term931108, term931108.getClass(), "typeOfThis", term931438);
        Class<? extends Object> term936417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term936416 = ((Class) term936417).getDeclaredField((String) "INTERFACE");
        ((Field) term936416).setAccessible(true);
        Object enum1743 = ((Field) term936416).get((Object) null);
        term935513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term935517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term935518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term935513, term935513.getClass(), "this$0", null);
        setField(term935513, term935513.getClass(), "call", null);
        setField(term935513, term935513.getClass(), "prototype", null);
        setField(term935513, term935513.getClass(), "kind", enum1743);
        setField(term935517, term935517.getClass(), "call", null);
        setField(term935517, term935517.getClass(), "prototype", null);
        setField(term935517, term935517.getClass(), "kind", enum1743);
        setField(term935518, term935518.getClass(), "primitiveType", null);
        setField(term935518, term935518.getClass(), "primitiveObjectType", null);
        setField(term935518, term935518.getClass(), "name", null);
        setBooleanField(term935518, term935518.getClass(), "visited", false);
        setField(term935518, term935518.getClass(), "docInfo", null);
        setBooleanField(term935518, term935518.getClass(), "unknown", false);
        setBooleanField(term935518, term935518.getClass(), "resolved", false);
        setField(term935518, term935518.getClass(), "resolveResult", null);
        setField(term935518, term935518.getClass(), "registry", null);
        setField(term935517, term935517.getClass(), "typeOfThis", term935518);
        setField(term935517, term935517.getClass(), "source", null);
        setField(term935517, term935517.getClass(), "implementedInterfaces", null);
        setField(term935517, term935517.getClass(), "subTypes", null);
        setField(term935517, term935517.getClass(), "templateTypeName", null);
        setField(term935517, term935517.getClass(), "className", null);
        setField(term935517, term935517.getClass(), "properties", null);
        setField(term935517, term935517.getClass(), "implicitPrototype", null);
        setBooleanField(term935517, term935517.getClass(), "nativeType", false);
        setBooleanField(term935517, term935517.getClass(), "visited", false);
        setField(term935517, term935517.getClass(), "docInfo", null);
        setBooleanField(term935517, term935517.getClass(), "unknown", false);
        setBooleanField(term935517, term935517.getClass(), "resolved", false);
        setField(term935517, term935517.getClass(), "resolveResult", null);
        setField(term935517, term935517.getClass(), "registry", null);
        setField(term935513, term935513.getClass(), "typeOfThis", term935517);
        setField(term935513, term935513.getClass(), "source", null);
        setField(term935513, term935513.getClass(), "implementedInterfaces", null);
        setField(term935513, term935513.getClass(), "subTypes", null);
        setField(term935513, term935513.getClass(), "templateTypeName", null);
        setField(term935513, term935513.getClass(), "className", null);
        setField(term935513, term935513.getClass(), "properties", null);
        setField(term935513, term935513.getClass(), "implicitPrototype", null);
        setBooleanField(term935513, term935513.getClass(), "nativeType", false);
        setBooleanField(term935513, term935513.getClass(), "visited", false);
        setField(term935513, term935513.getClass(), "docInfo", null);
        setBooleanField(term935513, term935513.getClass(), "unknown", false);
        setBooleanField(term935513, term935513.getClass(), "resolved", false);
        setField(term935513, term935513.getClass(), "resolveResult", null);
        setField(term935513, term935513.getClass(), "registry", null);
        Class<? extends Object> term936711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term936710 = ((Class) term936711).getDeclaredField((String) "INTERFACE");
        ((Field) term936710).setAccessible(true);
        Object enum1744 = ((Field) term936710).get((Object) null);
        Class<? extends Object> term937005 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term937004 = ((Class) term937005).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term937004).setAccessible(true);
        Object enum1745 = ((Field) term937004).get((Object) null);
        term935519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term935523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term935519, term935519.getClass(), "this$0", null);
        setField(term935519, term935519.getClass(), "call", null);
        setField(term935519, term935519.getClass(), "prototype", null);
        setField(term935519, term935519.getClass(), "kind", enum1744);
        setField(term935523, term935523.getClass(), "this$0", null);
        setField(term935523, term935523.getClass(), "call", null);
        setField(term935523, term935523.getClass(), "prototype", null);
        setField(term935523, term935523.getClass(), "kind", enum1745);
        setField(term935523, term935523.getClass(), "typeOfThis", null);
        setField(term935523, term935523.getClass(), "source", null);
        setField(term935523, term935523.getClass(), "implementedInterfaces", null);
        setField(term935523, term935523.getClass(), "subTypes", null);
        setField(term935523, term935523.getClass(), "templateTypeName", null);
        setField(term935523, term935523.getClass(), "className", null);
        setField(term935523, term935523.getClass(), "properties", null);
        setField(term935523, term935523.getClass(), "implicitPrototype", null);
        setBooleanField(term935523, term935523.getClass(), "nativeType", false);
        setBooleanField(term935523, term935523.getClass(), "visited", false);
        setField(term935523, term935523.getClass(), "docInfo", null);
        setBooleanField(term935523, term935523.getClass(), "unknown", false);
        setBooleanField(term935523, term935523.getClass(), "resolved", false);
        setField(term935523, term935523.getClass(), "resolveResult", null);
        setField(term935523, term935523.getClass(), "registry", null);
        setField(term935519, term935519.getClass(), "typeOfThis", term935523);
        setField(term935519, term935519.getClass(), "source", null);
        setField(term935519, term935519.getClass(), "implementedInterfaces", null);
        setField(term935519, term935519.getClass(), "subTypes", null);
        setField(term935519, term935519.getClass(), "templateTypeName", null);
        setField(term935519, term935519.getClass(), "className", null);
        setField(term935519, term935519.getClass(), "properties", null);
        setField(term935519, term935519.getClass(), "implicitPrototype", null);
        setBooleanField(term935519, term935519.getClass(), "nativeType", false);
        setBooleanField(term935519, term935519.getClass(), "visited", false);
        setField(term935519, term935519.getClass(), "docInfo", null);
        setBooleanField(term935519, term935519.getClass(), "unknown", false);
        setBooleanField(term935519, term935519.getClass(), "resolved", false);
        setField(term935519, term935519.getClass(), "resolveResult", null);
        setField(term935519, term935519.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term931108;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term930350, args);
        assertTrue(recursiveEquals(term930350, term935513));
        assertTrue(recursiveEquals(term931108, term935519));
        assertTrue(recursiveEquals(retValue, true));
    }

};


