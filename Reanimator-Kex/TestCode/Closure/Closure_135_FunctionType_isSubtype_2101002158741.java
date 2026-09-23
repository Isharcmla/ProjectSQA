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
     Object term701838;
     Object term702490;
     Object term703385;
     Object term703393;

    public FunctionType_isSubtype_2101002158741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term703400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term703399 = ((Class) term703400).getDeclaredField((String) "ORDINARY");
        ((Field) term703399).setAccessible(true);
        Object enum1305 = ((Field) term703399).get((Object) null);
        Class<? extends Object> term703691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term703690 = ((Class) term703691).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term703690).setAccessible(true);
        Object enum1306 = ((Field) term703690).get((Object) null);
        term701838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term702382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term701838, term701838.getClass(), "kind", enum1305);
        setField(term702382, term702382.getClass(), "kind", enum1306);
        setField(term701838, term701838.getClass(), "typeOfThis", term702382);
        term702490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term702664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term702490, term702490.getClass(), "kind", enum1306);
        setField(term702490, term702490.getClass(), "typeOfThis", term702664);
        Class<? extends Object> term703991 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term703990 = ((Class) term703991).getDeclaredField((String) "INTERFACE");
        ((Field) term703990).setAccessible(true);
        Object enum1307 = ((Field) term703990).get((Object) null);
        Class<? extends Object> term704285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term704284 = ((Class) term704285).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term704284).setAccessible(true);
        Object enum1308 = ((Field) term704284).get((Object) null);
        term703385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term703389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term703385, term703385.getClass(), "this$0", null);
        setField(term703385, term703385.getClass(), "call", null);
        setField(term703385, term703385.getClass(), "prototype", null);
        setField(term703385, term703385.getClass(), "kind", enum1307);
        setField(term703389, term703389.getClass(), "call", null);
        setField(term703389, term703389.getClass(), "prototype", null);
        setField(term703389, term703389.getClass(), "kind", enum1308);
        setField(term703389, term703389.getClass(), "typeOfThis", null);
        setField(term703389, term703389.getClass(), "source", null);
        setField(term703389, term703389.getClass(), "implementedInterfaces", null);
        setField(term703389, term703389.getClass(), "subTypes", null);
        setField(term703389, term703389.getClass(), "templateTypeName", null);
        setField(term703389, term703389.getClass(), "className", null);
        setField(term703389, term703389.getClass(), "properties", null);
        setField(term703389, term703389.getClass(), "implicitPrototype", null);
        setBooleanField(term703389, term703389.getClass(), "nativeType", false);
        setBooleanField(term703389, term703389.getClass(), "visited", false);
        setField(term703389, term703389.getClass(), "docInfo", null);
        setBooleanField(term703389, term703389.getClass(), "unknown", false);
        setBooleanField(term703389, term703389.getClass(), "resolved", false);
        setField(term703389, term703389.getClass(), "resolveResult", null);
        setField(term703389, term703389.getClass(), "registry", null);
        setField(term703385, term703385.getClass(), "typeOfThis", term703389);
        setField(term703385, term703385.getClass(), "source", null);
        setField(term703385, term703385.getClass(), "implementedInterfaces", null);
        setField(term703385, term703385.getClass(), "subTypes", null);
        setField(term703385, term703385.getClass(), "templateTypeName", null);
        setField(term703385, term703385.getClass(), "className", null);
        setField(term703385, term703385.getClass(), "properties", null);
        setField(term703385, term703385.getClass(), "implicitPrototype", null);
        setBooleanField(term703385, term703385.getClass(), "nativeType", false);
        setBooleanField(term703385, term703385.getClass(), "visited", false);
        setField(term703385, term703385.getClass(), "docInfo", null);
        setBooleanField(term703385, term703385.getClass(), "unknown", false);
        setBooleanField(term703385, term703385.getClass(), "resolved", false);
        setField(term703385, term703385.getClass(), "resolveResult", null);
        setField(term703385, term703385.getClass(), "registry", null);
        Class<? extends Object> term704585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term704584 = ((Class) term704585).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term704584).setAccessible(true);
        Object enum1309 = ((Field) term704584).get((Object) null);
        term703393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term703397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term703393, term703393.getClass(), "this$0", null);
        setField(term703393, term703393.getClass(), "call", null);
        setField(term703393, term703393.getClass(), "prototype", null);
        setField(term703393, term703393.getClass(), "kind", enum1309);
        setField(term703397, term703397.getClass(), "call", null);
        setField(term703397, term703397.getClass(), "prototype", null);
        setField(term703397, term703397.getClass(), "kind", null);
        setField(term703397, term703397.getClass(), "typeOfThis", null);
        setField(term703397, term703397.getClass(), "source", null);
        setField(term703397, term703397.getClass(), "implementedInterfaces", null);
        setField(term703397, term703397.getClass(), "subTypes", null);
        setField(term703397, term703397.getClass(), "templateTypeName", null);
        setField(term703397, term703397.getClass(), "className", null);
        setField(term703397, term703397.getClass(), "properties", null);
        setField(term703397, term703397.getClass(), "implicitPrototype", null);
        setBooleanField(term703397, term703397.getClass(), "nativeType", false);
        setBooleanField(term703397, term703397.getClass(), "visited", false);
        setField(term703397, term703397.getClass(), "docInfo", null);
        setBooleanField(term703397, term703397.getClass(), "unknown", false);
        setBooleanField(term703397, term703397.getClass(), "resolved", false);
        setField(term703397, term703397.getClass(), "resolveResult", null);
        setField(term703397, term703397.getClass(), "registry", null);
        setField(term703393, term703393.getClass(), "typeOfThis", term703397);
        setField(term703393, term703393.getClass(), "source", null);
        setField(term703393, term703393.getClass(), "implementedInterfaces", null);
        setField(term703393, term703393.getClass(), "subTypes", null);
        setField(term703393, term703393.getClass(), "templateTypeName", null);
        setField(term703393, term703393.getClass(), "className", null);
        setField(term703393, term703393.getClass(), "properties", null);
        setField(term703393, term703393.getClass(), "implicitPrototype", null);
        setBooleanField(term703393, term703393.getClass(), "nativeType", false);
        setBooleanField(term703393, term703393.getClass(), "visited", false);
        setField(term703393, term703393.getClass(), "docInfo", null);
        setBooleanField(term703393, term703393.getClass(), "unknown", false);
        setBooleanField(term703393, term703393.getClass(), "resolved", false);
        setField(term703393, term703393.getClass(), "resolveResult", null);
        setField(term703393, term703393.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term702490;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term701838, args);
        assertTrue(recursiveEquals(term701838, term703385));
        assertTrue(recursiveEquals(term702490, term703393));
        assertTrue(recursiveEquals(retValue, false));
    }

};


