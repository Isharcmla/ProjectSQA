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

public class FunctionType_isSubtype_2101002158917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994215;
     Object term994471;
     Object term995304;
     Object term995308;

    public FunctionType_isSubtype_2101002158917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term995314 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995313 = ((Class) term995314).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term995313).setAccessible(true);
        Object enum1858 = ((Field) term995313).get((Object) null);
        term994215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term994215, term994215.getClass(), "kind", enum1858);
        Class<? extends Object> term995614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995613 = ((Class) term995614).getDeclaredField((String) "INTERFACE");
        ((Field) term995613).setAccessible(true);
        Object enum1859 = ((Field) term995613).get((Object) null);
        term994471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term994471, term994471.getClass(), "kind", enum1859);
        Class<? extends Object> term995908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995907 = ((Class) term995908).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term995907).setAccessible(true);
        Object enum1860 = ((Field) term995907).get((Object) null);
        term995304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term995304, term995304.getClass(), "this$0", null);
        setField(term995304, term995304.getClass(), "call", null);
        setField(term995304, term995304.getClass(), "prototype", null);
        setField(term995304, term995304.getClass(), "kind", enum1860);
        setField(term995304, term995304.getClass(), "typeOfThis", null);
        setField(term995304, term995304.getClass(), "source", null);
        setField(term995304, term995304.getClass(), "implementedInterfaces", null);
        setField(term995304, term995304.getClass(), "subTypes", null);
        setField(term995304, term995304.getClass(), "templateTypeName", null);
        setField(term995304, term995304.getClass(), "className", null);
        setField(term995304, term995304.getClass(), "properties", null);
        setField(term995304, term995304.getClass(), "implicitPrototype", null);
        setBooleanField(term995304, term995304.getClass(), "nativeType", false);
        setBooleanField(term995304, term995304.getClass(), "visited", false);
        setField(term995304, term995304.getClass(), "docInfo", null);
        setBooleanField(term995304, term995304.getClass(), "unknown", false);
        setBooleanField(term995304, term995304.getClass(), "resolved", false);
        setField(term995304, term995304.getClass(), "resolveResult", null);
        setField(term995304, term995304.getClass(), "registry", null);
        Class<? extends Object> term996208 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term996207 = ((Class) term996208).getDeclaredField((String) "INTERFACE");
        ((Field) term996207).setAccessible(true);
        Object enum1861 = ((Field) term996207).get((Object) null);
        term995308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term995308, term995308.getClass(), "this$0", null);
        setField(term995308, term995308.getClass(), "call", null);
        setField(term995308, term995308.getClass(), "prototype", null);
        setField(term995308, term995308.getClass(), "kind", enum1861);
        setField(term995308, term995308.getClass(), "typeOfThis", null);
        setField(term995308, term995308.getClass(), "source", null);
        setField(term995308, term995308.getClass(), "implementedInterfaces", null);
        setField(term995308, term995308.getClass(), "subTypes", null);
        setField(term995308, term995308.getClass(), "templateTypeName", null);
        setField(term995308, term995308.getClass(), "className", null);
        setField(term995308, term995308.getClass(), "properties", null);
        setField(term995308, term995308.getClass(), "implicitPrototype", null);
        setBooleanField(term995308, term995308.getClass(), "nativeType", false);
        setBooleanField(term995308, term995308.getClass(), "visited", false);
        setField(term995308, term995308.getClass(), "docInfo", null);
        setBooleanField(term995308, term995308.getClass(), "unknown", false);
        setBooleanField(term995308, term995308.getClass(), "resolved", false);
        setField(term995308, term995308.getClass(), "resolveResult", null);
        setField(term995308, term995308.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term994471;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term994215, args);
        assertTrue(recursiveEquals(term994215, term995304));
        assertTrue(recursiveEquals(term994471, term995308));
        assertTrue(recursiveEquals(retValue, true));
    }

};


