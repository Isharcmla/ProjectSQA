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

public class FunctionType_isSubtype_2101002158835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853369;
     Object term854121;
     Object term855474;
     Object term855480;

    public FunctionType_isSubtype_2101002158835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term855490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term855489 = ((Class) term855490).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term855489).setAccessible(true);
        Object enum1594 = ((Field) term855489).get((Object) null);
        Class<? extends Object> term855790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term855789 = ((Class) term855790).getDeclaredField((String) "INTERFACE");
        ((Field) term855789).setAccessible(true);
        Object enum1595 = ((Field) term855789).get((Object) null);
        term853369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term853913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term854013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term853369, term853369.getClass(), "kind", enum1594);
        setField(term853913, term853913.getClass(), "kind", enum1595);
        setField(term853913, term853913.getClass(), "typeOfThis", term854013);
        setField(term853369, term853369.getClass(), "typeOfThis", term853913);
        Class<? extends Object> term856084 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856083 = ((Class) term856084).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term856083).setAccessible(true);
        Object enum1596 = ((Field) term856083).get((Object) null);
        term854121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term854443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term854121, term854121.getClass(), "kind", enum1594);
        setField(term854443, term854443.getClass(), "kind", enum1596);
        setField(term854443, term854443.getClass(), "typeOfThis", null);
        setField(term854121, term854121.getClass(), "typeOfThis", term854443);
        Class<? extends Object> term856384 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856383 = ((Class) term856384).getDeclaredField((String) "INTERFACE");
        ((Field) term856383).setAccessible(true);
        Object enum1597 = ((Field) term856383).get((Object) null);
        term855474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term855478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term855479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term855474, term855474.getClass(), "this$0", null);
        setField(term855474, term855474.getClass(), "call", null);
        setField(term855474, term855474.getClass(), "prototype", null);
        setField(term855474, term855474.getClass(), "kind", enum1597);
        setField(term855478, term855478.getClass(), "call", null);
        setField(term855478, term855478.getClass(), "prototype", null);
        setField(term855478, term855478.getClass(), "kind", enum1597);
        setField(term855479, term855479.getClass(), "call", null);
        setField(term855479, term855479.getClass(), "prototype", null);
        setField(term855479, term855479.getClass(), "kind", null);
        setField(term855479, term855479.getClass(), "typeOfThis", null);
        setField(term855479, term855479.getClass(), "source", null);
        setField(term855479, term855479.getClass(), "implementedInterfaces", null);
        setField(term855479, term855479.getClass(), "subTypes", null);
        setField(term855479, term855479.getClass(), "templateTypeName", null);
        setField(term855479, term855479.getClass(), "className", null);
        setField(term855479, term855479.getClass(), "properties", null);
        setField(term855479, term855479.getClass(), "implicitPrototype", null);
        setBooleanField(term855479, term855479.getClass(), "nativeType", false);
        setBooleanField(term855479, term855479.getClass(), "visited", false);
        setField(term855479, term855479.getClass(), "docInfo", null);
        setBooleanField(term855479, term855479.getClass(), "unknown", false);
        setBooleanField(term855479, term855479.getClass(), "resolved", false);
        setField(term855479, term855479.getClass(), "resolveResult", null);
        setField(term855479, term855479.getClass(), "registry", null);
        setField(term855478, term855478.getClass(), "typeOfThis", term855479);
        setField(term855478, term855478.getClass(), "source", null);
        setField(term855478, term855478.getClass(), "implementedInterfaces", null);
        setField(term855478, term855478.getClass(), "subTypes", null);
        setField(term855478, term855478.getClass(), "templateTypeName", null);
        setField(term855478, term855478.getClass(), "className", null);
        setField(term855478, term855478.getClass(), "properties", null);
        setField(term855478, term855478.getClass(), "implicitPrototype", null);
        setBooleanField(term855478, term855478.getClass(), "nativeType", false);
        setBooleanField(term855478, term855478.getClass(), "visited", false);
        setField(term855478, term855478.getClass(), "docInfo", null);
        setBooleanField(term855478, term855478.getClass(), "unknown", false);
        setBooleanField(term855478, term855478.getClass(), "resolved", false);
        setField(term855478, term855478.getClass(), "resolveResult", null);
        setField(term855478, term855478.getClass(), "registry", null);
        setField(term855474, term855474.getClass(), "typeOfThis", term855478);
        setField(term855474, term855474.getClass(), "source", null);
        setField(term855474, term855474.getClass(), "implementedInterfaces", null);
        setField(term855474, term855474.getClass(), "subTypes", null);
        setField(term855474, term855474.getClass(), "templateTypeName", null);
        setField(term855474, term855474.getClass(), "className", null);
        setField(term855474, term855474.getClass(), "properties", null);
        setField(term855474, term855474.getClass(), "implicitPrototype", null);
        setBooleanField(term855474, term855474.getClass(), "nativeType", false);
        setBooleanField(term855474, term855474.getClass(), "visited", false);
        setField(term855474, term855474.getClass(), "docInfo", null);
        setBooleanField(term855474, term855474.getClass(), "unknown", false);
        setBooleanField(term855474, term855474.getClass(), "resolved", false);
        setField(term855474, term855474.getClass(), "resolveResult", null);
        setField(term855474, term855474.getClass(), "registry", null);
        Class<? extends Object> term856678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856677 = ((Class) term856678).getDeclaredField((String) "INTERFACE");
        ((Field) term856677).setAccessible(true);
        Object enum1598 = ((Field) term856677).get((Object) null);
        Class<? extends Object> term856972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856971 = ((Class) term856972).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term856971).setAccessible(true);
        Object enum1599 = ((Field) term856971).get((Object) null);
        term855480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term855484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term855480, term855480.getClass(), "this$0", null);
        setField(term855480, term855480.getClass(), "call", null);
        setField(term855480, term855480.getClass(), "prototype", null);
        setField(term855480, term855480.getClass(), "kind", enum1598);
        setField(term855484, term855484.getClass(), "call", null);
        setField(term855484, term855484.getClass(), "prototype", null);
        setField(term855484, term855484.getClass(), "kind", enum1599);
        setField(term855484, term855484.getClass(), "typeOfThis", null);
        setField(term855484, term855484.getClass(), "source", null);
        setField(term855484, term855484.getClass(), "implementedInterfaces", null);
        setField(term855484, term855484.getClass(), "subTypes", null);
        setField(term855484, term855484.getClass(), "templateTypeName", null);
        setField(term855484, term855484.getClass(), "className", null);
        setField(term855484, term855484.getClass(), "properties", null);
        setField(term855484, term855484.getClass(), "implicitPrototype", null);
        setBooleanField(term855484, term855484.getClass(), "nativeType", false);
        setBooleanField(term855484, term855484.getClass(), "visited", false);
        setField(term855484, term855484.getClass(), "docInfo", null);
        setBooleanField(term855484, term855484.getClass(), "unknown", false);
        setBooleanField(term855484, term855484.getClass(), "resolved", false);
        setField(term855484, term855484.getClass(), "resolveResult", null);
        setField(term855484, term855484.getClass(), "registry", null);
        setField(term855480, term855480.getClass(), "typeOfThis", term855484);
        setField(term855480, term855480.getClass(), "source", null);
        setField(term855480, term855480.getClass(), "implementedInterfaces", null);
        setField(term855480, term855480.getClass(), "subTypes", null);
        setField(term855480, term855480.getClass(), "templateTypeName", null);
        setField(term855480, term855480.getClass(), "className", null);
        setField(term855480, term855480.getClass(), "properties", null);
        setField(term855480, term855480.getClass(), "implicitPrototype", null);
        setBooleanField(term855480, term855480.getClass(), "nativeType", false);
        setBooleanField(term855480, term855480.getClass(), "visited", false);
        setField(term855480, term855480.getClass(), "docInfo", null);
        setBooleanField(term855480, term855480.getClass(), "unknown", false);
        setBooleanField(term855480, term855480.getClass(), "resolved", false);
        setField(term855480, term855480.getClass(), "resolveResult", null);
        setField(term855480, term855480.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term854121;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term853369, args);
        assertTrue(recursiveEquals(term853369, term855474));
        assertTrue(recursiveEquals(term854121, term855480));
        assertTrue(recursiveEquals(retValue, true));
    }

};


