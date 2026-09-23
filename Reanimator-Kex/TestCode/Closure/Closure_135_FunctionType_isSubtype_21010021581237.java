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

public class FunctionType_isSubtype_21010021581237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527374;
     Object term1527980;
     Object term1530446;
     Object term1530455;

    public FunctionType_isSubtype_21010021581237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1530462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1530461 = ((Class) term1530462).getDeclaredField((String) "ORDINARY");
        ((Field) term1530461).setAccessible(true);
        Object enum2855 = ((Field) term1530461).get((Object) null);
        Class<? extends Object> term1530753 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1530752 = ((Class) term1530753).getDeclaredField((String) "INTERFACE");
        ((Field) term1530752).setAccessible(true);
        Object enum2856 = ((Field) term1530752).get((Object) null);
        term1527374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1527630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1527872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1527374, term1527374.getClass(), "kind", enum2855);
        setField(term1527630, term1527630.getClass(), "kind", enum2856);
        setField(term1527374, term1527374.getClass(), "typeOfThis", term1527630);
        setField(term1527374, term1527374.getClass(), "call", term1527872);
        term1527980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1528162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1527980, term1527980.getClass(), "kind", enum2855);
        setField(term1528162, term1528162.getClass(), "kind", enum2855);
        setField(term1527980, term1527980.getClass(), "typeOfThis", term1528162);
        setField(term1527980, term1527980.getClass(), "call", null);
        Class<? extends Object> term1531047 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1531046 = ((Class) term1531047).getDeclaredField((String) "ORDINARY");
        ((Field) term1531046).setAccessible(true);
        Object enum2857 = ((Field) term1531046).get((Object) null);
        Class<? extends Object> term1531338 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1531337 = ((Class) term1531338).getDeclaredField((String) "INTERFACE");
        ((Field) term1531337).setAccessible(true);
        Object enum2858 = ((Field) term1531337).get((Object) null);
        term1530446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1530447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1530451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1530446, term1530446.getClass(), "this$0", null);
        setField(term1530447, term1530447.getClass(), "parameters", null);
        setField(term1530447, term1530447.getClass(), "returnType", null);
        setBooleanField(term1530447, term1530447.getClass(), "resolved", false);
        setField(term1530447, term1530447.getClass(), "resolveResult", null);
        setField(term1530447, term1530447.getClass(), "registry", null);
        setField(term1530446, term1530446.getClass(), "call", term1530447);
        setField(term1530446, term1530446.getClass(), "prototype", null);
        setField(term1530446, term1530446.getClass(), "kind", enum2857);
        setField(term1530451, term1530451.getClass(), "this$0", null);
        setField(term1530451, term1530451.getClass(), "call", null);
        setField(term1530451, term1530451.getClass(), "prototype", null);
        setField(term1530451, term1530451.getClass(), "kind", enum2858);
        setField(term1530451, term1530451.getClass(), "typeOfThis", null);
        setField(term1530451, term1530451.getClass(), "source", null);
        setField(term1530451, term1530451.getClass(), "implementedInterfaces", null);
        setField(term1530451, term1530451.getClass(), "subTypes", null);
        setField(term1530451, term1530451.getClass(), "templateTypeName", null);
        setField(term1530451, term1530451.getClass(), "className", null);
        setField(term1530451, term1530451.getClass(), "properties", null);
        setField(term1530451, term1530451.getClass(), "implicitPrototype", null);
        setBooleanField(term1530451, term1530451.getClass(), "nativeType", false);
        setBooleanField(term1530451, term1530451.getClass(), "visited", false);
        setField(term1530451, term1530451.getClass(), "docInfo", null);
        setBooleanField(term1530451, term1530451.getClass(), "unknown", false);
        setBooleanField(term1530451, term1530451.getClass(), "resolved", false);
        setField(term1530451, term1530451.getClass(), "resolveResult", null);
        setField(term1530451, term1530451.getClass(), "registry", null);
        setField(term1530446, term1530446.getClass(), "typeOfThis", term1530451);
        setField(term1530446, term1530446.getClass(), "source", null);
        setField(term1530446, term1530446.getClass(), "implementedInterfaces", null);
        setField(term1530446, term1530446.getClass(), "subTypes", null);
        setField(term1530446, term1530446.getClass(), "templateTypeName", null);
        setField(term1530446, term1530446.getClass(), "className", null);
        setField(term1530446, term1530446.getClass(), "properties", null);
        setField(term1530446, term1530446.getClass(), "implicitPrototype", null);
        setBooleanField(term1530446, term1530446.getClass(), "nativeType", false);
        setBooleanField(term1530446, term1530446.getClass(), "visited", false);
        setField(term1530446, term1530446.getClass(), "docInfo", null);
        setBooleanField(term1530446, term1530446.getClass(), "unknown", false);
        setBooleanField(term1530446, term1530446.getClass(), "resolved", false);
        setField(term1530446, term1530446.getClass(), "resolveResult", null);
        setField(term1530446, term1530446.getClass(), "registry", null);
        Class<? extends Object> term1531632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1531631 = ((Class) term1531632).getDeclaredField((String) "ORDINARY");
        ((Field) term1531631).setAccessible(true);
        Object enum2859 = ((Field) term1531631).get((Object) null);
        term1530455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1530459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1530455, term1530455.getClass(), "this$0", null);
        setField(term1530455, term1530455.getClass(), "call", null);
        setField(term1530455, term1530455.getClass(), "prototype", null);
        setField(term1530455, term1530455.getClass(), "kind", enum2859);
        setField(term1530459, term1530459.getClass(), "this$0", null);
        setField(term1530459, term1530459.getClass(), "call", null);
        setField(term1530459, term1530459.getClass(), "prototype", null);
        setField(term1530459, term1530459.getClass(), "kind", enum2859);
        setField(term1530459, term1530459.getClass(), "typeOfThis", null);
        setField(term1530459, term1530459.getClass(), "source", null);
        setField(term1530459, term1530459.getClass(), "implementedInterfaces", null);
        setField(term1530459, term1530459.getClass(), "subTypes", null);
        setField(term1530459, term1530459.getClass(), "templateTypeName", null);
        setField(term1530459, term1530459.getClass(), "className", null);
        setField(term1530459, term1530459.getClass(), "properties", null);
        setField(term1530459, term1530459.getClass(), "implicitPrototype", null);
        setBooleanField(term1530459, term1530459.getClass(), "nativeType", false);
        setBooleanField(term1530459, term1530459.getClass(), "visited", false);
        setField(term1530459, term1530459.getClass(), "docInfo", null);
        setBooleanField(term1530459, term1530459.getClass(), "unknown", false);
        setBooleanField(term1530459, term1530459.getClass(), "resolved", false);
        setField(term1530459, term1530459.getClass(), "resolveResult", null);
        setField(term1530459, term1530459.getClass(), "registry", null);
        setField(term1530455, term1530455.getClass(), "typeOfThis", term1530459);
        setField(term1530455, term1530455.getClass(), "source", null);
        setField(term1530455, term1530455.getClass(), "implementedInterfaces", null);
        setField(term1530455, term1530455.getClass(), "subTypes", null);
        setField(term1530455, term1530455.getClass(), "templateTypeName", null);
        setField(term1530455, term1530455.getClass(), "className", null);
        setField(term1530455, term1530455.getClass(), "properties", null);
        setField(term1530455, term1530455.getClass(), "implicitPrototype", null);
        setBooleanField(term1530455, term1530455.getClass(), "nativeType", false);
        setBooleanField(term1530455, term1530455.getClass(), "visited", false);
        setField(term1530455, term1530455.getClass(), "docInfo", null);
        setBooleanField(term1530455, term1530455.getClass(), "unknown", false);
        setBooleanField(term1530455, term1530455.getClass(), "resolved", false);
        setField(term1530455, term1530455.getClass(), "resolveResult", null);
        setField(term1530455, term1530455.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1527980;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1527374, args);
        assertTrue(recursiveEquals(term1527374, term1530446));
        assertTrue(recursiveEquals(term1527980, term1530455));
        assertTrue(recursiveEquals(retValue, false));
    }

};


