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

public class FunctionType_isSubtype_21010021581682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279664;
     Object term2280324;
     Object term2283246;
     Object term2283251;

    public FunctionType_isSubtype_21010021581682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2283261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283260 = ((Class) term2283261).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2283260).setAccessible(true);
        Object enum4263 = ((Field) term2283260).get((Object) null);
        term2279664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2280216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2279664, term2279664.getClass(), "kind", enum4263);
        setField(term2280216, term2280216.getClass(), "kind", enum4263);
        setField(term2279664, term2279664.getClass(), "typeOfThis", term2280216);
        Class<? extends Object> term2283561 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283560 = ((Class) term2283561).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2283560).setAccessible(true);
        Object enum4264 = ((Field) term2283560).get((Object) null);
        Class<? extends Object> term2283861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283860 = ((Class) term2283861).getDeclaredField((String) "INTERFACE");
        ((Field) term2283860).setAccessible(true);
        Object enum4265 = ((Field) term2283860).get((Object) null);
        term2280324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2280506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2280324, term2280324.getClass(), "kind", enum4264);
        setField(term2280506, term2280506.getClass(), "kind", enum4265);
        setField(term2280324, term2280324.getClass(), "typeOfThis", term2280506);
        Class<? extends Object> term2284155 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2284154 = ((Class) term2284155).getDeclaredField((String) "INTERFACE");
        ((Field) term2284154).setAccessible(true);
        Object enum4266 = ((Field) term2284154).get((Object) null);
        term2283246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2283250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2283246, term2283246.getClass(), "this$0", null);
        setField(term2283246, term2283246.getClass(), "call", null);
        setField(term2283246, term2283246.getClass(), "prototype", null);
        setField(term2283246, term2283246.getClass(), "kind", enum4266);
        setField(term2283250, term2283250.getClass(), "this$0", null);
        setField(term2283250, term2283250.getClass(), "call", null);
        setField(term2283250, term2283250.getClass(), "prototype", null);
        setField(term2283250, term2283250.getClass(), "kind", enum4266);
        setField(term2283250, term2283250.getClass(), "typeOfThis", null);
        setField(term2283250, term2283250.getClass(), "source", null);
        setField(term2283250, term2283250.getClass(), "implementedInterfaces", null);
        setField(term2283250, term2283250.getClass(), "subTypes", null);
        setField(term2283250, term2283250.getClass(), "templateTypeName", null);
        setField(term2283250, term2283250.getClass(), "className", null);
        setField(term2283250, term2283250.getClass(), "properties", null);
        setField(term2283250, term2283250.getClass(), "implicitPrototype", null);
        setBooleanField(term2283250, term2283250.getClass(), "nativeType", false);
        setBooleanField(term2283250, term2283250.getClass(), "visited", false);
        setField(term2283250, term2283250.getClass(), "docInfo", null);
        setBooleanField(term2283250, term2283250.getClass(), "unknown", false);
        setBooleanField(term2283250, term2283250.getClass(), "resolved", false);
        setField(term2283250, term2283250.getClass(), "resolveResult", null);
        setField(term2283250, term2283250.getClass(), "registry", null);
        setField(term2283246, term2283246.getClass(), "typeOfThis", term2283250);
        setField(term2283246, term2283246.getClass(), "source", null);
        setField(term2283246, term2283246.getClass(), "implementedInterfaces", null);
        setField(term2283246, term2283246.getClass(), "subTypes", null);
        setField(term2283246, term2283246.getClass(), "templateTypeName", null);
        setField(term2283246, term2283246.getClass(), "className", null);
        setField(term2283246, term2283246.getClass(), "properties", null);
        setField(term2283246, term2283246.getClass(), "implicitPrototype", null);
        setBooleanField(term2283246, term2283246.getClass(), "nativeType", false);
        setBooleanField(term2283246, term2283246.getClass(), "visited", false);
        setField(term2283246, term2283246.getClass(), "docInfo", null);
        setBooleanField(term2283246, term2283246.getClass(), "unknown", false);
        setBooleanField(term2283246, term2283246.getClass(), "resolved", false);
        setField(term2283246, term2283246.getClass(), "resolveResult", null);
        setField(term2283246, term2283246.getClass(), "registry", null);
        Class<? extends Object> term2284449 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2284448 = ((Class) term2284449).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2284448).setAccessible(true);
        Object enum4267 = ((Field) term2284448).get((Object) null);
        Class<? extends Object> term2284749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2284748 = ((Class) term2284749).getDeclaredField((String) "INTERFACE");
        ((Field) term2284748).setAccessible(true);
        Object enum4268 = ((Field) term2284748).get((Object) null);
        term2283251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2283255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2283251, term2283251.getClass(), "this$0", null);
        setField(term2283251, term2283251.getClass(), "call", null);
        setField(term2283251, term2283251.getClass(), "prototype", null);
        setField(term2283251, term2283251.getClass(), "kind", enum4267);
        setField(term2283255, term2283255.getClass(), "this$0", null);
        setField(term2283255, term2283255.getClass(), "call", null);
        setField(term2283255, term2283255.getClass(), "prototype", null);
        setField(term2283255, term2283255.getClass(), "kind", enum4268);
        setField(term2283255, term2283255.getClass(), "typeOfThis", null);
        setField(term2283255, term2283255.getClass(), "source", null);
        setField(term2283255, term2283255.getClass(), "implementedInterfaces", null);
        setField(term2283255, term2283255.getClass(), "subTypes", null);
        setField(term2283255, term2283255.getClass(), "templateTypeName", null);
        setField(term2283255, term2283255.getClass(), "className", null);
        setField(term2283255, term2283255.getClass(), "properties", null);
        setField(term2283255, term2283255.getClass(), "implicitPrototype", null);
        setBooleanField(term2283255, term2283255.getClass(), "nativeType", false);
        setBooleanField(term2283255, term2283255.getClass(), "visited", false);
        setField(term2283255, term2283255.getClass(), "docInfo", null);
        setBooleanField(term2283255, term2283255.getClass(), "unknown", false);
        setBooleanField(term2283255, term2283255.getClass(), "resolved", false);
        setField(term2283255, term2283255.getClass(), "resolveResult", null);
        setField(term2283255, term2283255.getClass(), "registry", null);
        setField(term2283251, term2283251.getClass(), "typeOfThis", term2283255);
        setField(term2283251, term2283251.getClass(), "source", null);
        setField(term2283251, term2283251.getClass(), "implementedInterfaces", null);
        setField(term2283251, term2283251.getClass(), "subTypes", null);
        setField(term2283251, term2283251.getClass(), "templateTypeName", null);
        setField(term2283251, term2283251.getClass(), "className", null);
        setField(term2283251, term2283251.getClass(), "properties", null);
        setField(term2283251, term2283251.getClass(), "implicitPrototype", null);
        setBooleanField(term2283251, term2283251.getClass(), "nativeType", false);
        setBooleanField(term2283251, term2283251.getClass(), "visited", false);
        setField(term2283251, term2283251.getClass(), "docInfo", null);
        setBooleanField(term2283251, term2283251.getClass(), "unknown", false);
        setBooleanField(term2283251, term2283251.getClass(), "resolved", false);
        setField(term2283251, term2283251.getClass(), "resolveResult", null);
        setField(term2283251, term2283251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2280324;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2279664, args);
        assertTrue(recursiveEquals(term2279664, term2283246));
        assertTrue(recursiveEquals(term2280324, term2283251));
        assertTrue(recursiveEquals(retValue, false));
    }

};


