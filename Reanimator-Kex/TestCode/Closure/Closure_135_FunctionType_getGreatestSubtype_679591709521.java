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

public class FunctionType_getGreatestSubtype_679591709521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390467;
     Object term391019;
     Object term391769;
     Object term391773;
     Object term391683;

    public FunctionType_getGreatestSubtype_679591709521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term391778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term391777 = ((Class) term391778).getDeclaredField((String) "ORDINARY");
        ((Field) term391777).setAccessible(true);
        Object enum719 = ((Field) term391777).get((Object) null);
        term390467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term390467, term390467.getClass(), "kind", enum719);
        Class<? extends Object> term392069 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392068 = ((Class) term392069).getDeclaredField((String) "INTERFACE");
        ((Field) term392068).setAccessible(true);
        Object enum720 = ((Field) term392068).get((Object) null);
        term391019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term391019, term391019.getClass(), "kind", enum720);
        Class<? extends Object> term392363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392362 = ((Class) term392363).getDeclaredField((String) "INTERFACE");
        ((Field) term392362).setAccessible(true);
        Object enum721 = ((Field) term392362).get((Object) null);
        term391769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term391769, term391769.getClass(), "this$0", null);
        setField(term391769, term391769.getClass(), "call", null);
        setField(term391769, term391769.getClass(), "prototype", null);
        setField(term391769, term391769.getClass(), "kind", enum721);
        setField(term391769, term391769.getClass(), "typeOfThis", null);
        setField(term391769, term391769.getClass(), "source", null);
        setField(term391769, term391769.getClass(), "implementedInterfaces", null);
        setField(term391769, term391769.getClass(), "subTypes", null);
        setField(term391769, term391769.getClass(), "templateTypeName", null);
        setField(term391769, term391769.getClass(), "className", null);
        setField(term391769, term391769.getClass(), "properties", null);
        setField(term391769, term391769.getClass(), "implicitPrototype", null);
        setBooleanField(term391769, term391769.getClass(), "nativeType", false);
        setBooleanField(term391769, term391769.getClass(), "visited", false);
        setField(term391769, term391769.getClass(), "docInfo", null);
        setBooleanField(term391769, term391769.getClass(), "unknown", false);
        setBooleanField(term391769, term391769.getClass(), "resolved", false);
        setField(term391769, term391769.getClass(), "resolveResult", null);
        setField(term391769, term391769.getClass(), "registry", null);
        Class<? extends Object> term392657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392656 = ((Class) term392657).getDeclaredField((String) "INTERFACE");
        ((Field) term392656).setAccessible(true);
        Object enum722 = ((Field) term392656).get((Object) null);
        term391773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term391773, term391773.getClass(), "this$0", null);
        setField(term391773, term391773.getClass(), "call", null);
        setField(term391773, term391773.getClass(), "prototype", null);
        setField(term391773, term391773.getClass(), "kind", enum722);
        setField(term391773, term391773.getClass(), "typeOfThis", null);
        setField(term391773, term391773.getClass(), "source", null);
        setField(term391773, term391773.getClass(), "implementedInterfaces", null);
        setField(term391773, term391773.getClass(), "subTypes", null);
        setField(term391773, term391773.getClass(), "templateTypeName", null);
        setField(term391773, term391773.getClass(), "className", null);
        setField(term391773, term391773.getClass(), "properties", null);
        setField(term391773, term391773.getClass(), "implicitPrototype", null);
        setBooleanField(term391773, term391773.getClass(), "nativeType", false);
        setBooleanField(term391773, term391773.getClass(), "visited", false);
        setField(term391773, term391773.getClass(), "docInfo", null);
        setBooleanField(term391773, term391773.getClass(), "unknown", false);
        setBooleanField(term391773, term391773.getClass(), "resolved", false);
        setField(term391773, term391773.getClass(), "resolveResult", null);
        setField(term391773, term391773.getClass(), "registry", null);
        Class<? extends Object> term392951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392950 = ((Class) term392951).getDeclaredField((String) "INTERFACE");
        ((Field) term392950).setAccessible(true);
        Object enum723 = ((Field) term392950).get((Object) null);
        term391683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term391683, term391683.getClass(), "this$0", null);
        setField(term391683, term391683.getClass(), "call", null);
        setField(term391683, term391683.getClass(), "prototype", null);
        setField(term391683, term391683.getClass(), "kind", enum723);
        setField(term391683, term391683.getClass(), "typeOfThis", null);
        setField(term391683, term391683.getClass(), "source", null);
        setField(term391683, term391683.getClass(), "implementedInterfaces", null);
        setField(term391683, term391683.getClass(), "subTypes", null);
        setField(term391683, term391683.getClass(), "templateTypeName", null);
        setField(term391683, term391683.getClass(), "className", null);
        setField(term391683, term391683.getClass(), "properties", null);
        setField(term391683, term391683.getClass(), "implicitPrototype", null);
        setBooleanField(term391683, term391683.getClass(), "nativeType", false);
        setBooleanField(term391683, term391683.getClass(), "visited", false);
        setField(term391683, term391683.getClass(), "docInfo", null);
        setBooleanField(term391683, term391683.getClass(), "unknown", false);
        setBooleanField(term391683, term391683.getClass(), "resolved", false);
        setField(term391683, term391683.getClass(), "resolveResult", null);
        setField(term391683, term391683.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term391019;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term390467, args);
        assertTrue(recursiveEquals(term390467, term391769));
        assertTrue(recursiveEquals(term391019, term391773));
        assertTrue(recursiveEquals(retValue, term391683));
    }

};


