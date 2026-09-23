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

public class FunctionType_isSubtype_2101002158913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986888;
     Object term987486;
     Object term989069;
     Object term989078;

    public FunctionType_isSubtype_2101002158913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term989088 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989087 = ((Class) term989088).getDeclaredField((String) "ORDINARY");
        ((Field) term989087).setAccessible(true);
        Object enum1843 = ((Field) term989087).get((Object) null);
        Class<? extends Object> term989379 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989378 = ((Class) term989379).getDeclaredField((String) "INTERFACE");
        ((Field) term989378).setAccessible(true);
        Object enum1844 = ((Field) term989378).get((Object) null);
        term986888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term987136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term987378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term986888, term986888.getClass(), "kind", enum1843);
        setField(term987136, term987136.getClass(), "kind", enum1844);
        setField(term986888, term986888.getClass(), "typeOfThis", term987136);
        setField(term986888, term986888.getClass(), "call", term987378);
        Class<? extends Object> term989673 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989672 = ((Class) term989673).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term989672).setAccessible(true);
        Object enum1845 = ((Field) term989672).get((Object) null);
        term987486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term987668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term987486, term987486.getClass(), "kind", enum1843);
        setField(term987668, term987668.getClass(), "kind", enum1845);
        setField(term987486, term987486.getClass(), "typeOfThis", term987668);
        setField(term987486, term987486.getClass(), "call", null);
        Class<? extends Object> term989973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989972 = ((Class) term989973).getDeclaredField((String) "ORDINARY");
        ((Field) term989972).setAccessible(true);
        Object enum1846 = ((Field) term989972).get((Object) null);
        Class<? extends Object> term990264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term990263 = ((Class) term990264).getDeclaredField((String) "INTERFACE");
        ((Field) term990263).setAccessible(true);
        Object enum1847 = ((Field) term990263).get((Object) null);
        term989069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term989070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term989074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term989069, term989069.getClass(), "this$0", null);
        setField(term989070, term989070.getClass(), "parameters", null);
        setField(term989070, term989070.getClass(), "returnType", null);
        setBooleanField(term989070, term989070.getClass(), "resolved", false);
        setField(term989070, term989070.getClass(), "resolveResult", null);
        setField(term989070, term989070.getClass(), "registry", null);
        setField(term989069, term989069.getClass(), "call", term989070);
        setField(term989069, term989069.getClass(), "prototype", null);
        setField(term989069, term989069.getClass(), "kind", enum1846);
        setField(term989074, term989074.getClass(), "call", null);
        setField(term989074, term989074.getClass(), "prototype", null);
        setField(term989074, term989074.getClass(), "kind", enum1847);
        setField(term989074, term989074.getClass(), "typeOfThis", null);
        setField(term989074, term989074.getClass(), "source", null);
        setField(term989074, term989074.getClass(), "implementedInterfaces", null);
        setField(term989074, term989074.getClass(), "subTypes", null);
        setField(term989074, term989074.getClass(), "templateTypeName", null);
        setField(term989074, term989074.getClass(), "className", null);
        setField(term989074, term989074.getClass(), "properties", null);
        setField(term989074, term989074.getClass(), "implicitPrototype", null);
        setBooleanField(term989074, term989074.getClass(), "nativeType", false);
        setBooleanField(term989074, term989074.getClass(), "visited", false);
        setField(term989074, term989074.getClass(), "docInfo", null);
        setBooleanField(term989074, term989074.getClass(), "unknown", false);
        setBooleanField(term989074, term989074.getClass(), "resolved", false);
        setField(term989074, term989074.getClass(), "resolveResult", null);
        setField(term989074, term989074.getClass(), "registry", null);
        setField(term989069, term989069.getClass(), "typeOfThis", term989074);
        setField(term989069, term989069.getClass(), "source", null);
        setField(term989069, term989069.getClass(), "implementedInterfaces", null);
        setField(term989069, term989069.getClass(), "subTypes", null);
        setField(term989069, term989069.getClass(), "templateTypeName", null);
        setField(term989069, term989069.getClass(), "className", null);
        setField(term989069, term989069.getClass(), "properties", null);
        setField(term989069, term989069.getClass(), "implicitPrototype", null);
        setBooleanField(term989069, term989069.getClass(), "nativeType", false);
        setBooleanField(term989069, term989069.getClass(), "visited", false);
        setField(term989069, term989069.getClass(), "docInfo", null);
        setBooleanField(term989069, term989069.getClass(), "unknown", false);
        setBooleanField(term989069, term989069.getClass(), "resolved", false);
        setField(term989069, term989069.getClass(), "resolveResult", null);
        setField(term989069, term989069.getClass(), "registry", null);
        Class<? extends Object> term990558 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term990557 = ((Class) term990558).getDeclaredField((String) "ORDINARY");
        ((Field) term990557).setAccessible(true);
        Object enum1848 = ((Field) term990557).get((Object) null);
        Class<? extends Object> term990849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term990848 = ((Class) term990849).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term990848).setAccessible(true);
        Object enum1849 = ((Field) term990848).get((Object) null);
        term989078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term989082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term989078, term989078.getClass(), "this$0", null);
        setField(term989078, term989078.getClass(), "call", null);
        setField(term989078, term989078.getClass(), "prototype", null);
        setField(term989078, term989078.getClass(), "kind", enum1848);
        setField(term989082, term989082.getClass(), "this$0", null);
        setField(term989082, term989082.getClass(), "call", null);
        setField(term989082, term989082.getClass(), "prototype", null);
        setField(term989082, term989082.getClass(), "kind", enum1849);
        setField(term989082, term989082.getClass(), "typeOfThis", null);
        setField(term989082, term989082.getClass(), "source", null);
        setField(term989082, term989082.getClass(), "implementedInterfaces", null);
        setField(term989082, term989082.getClass(), "subTypes", null);
        setField(term989082, term989082.getClass(), "templateTypeName", null);
        setField(term989082, term989082.getClass(), "className", null);
        setField(term989082, term989082.getClass(), "properties", null);
        setField(term989082, term989082.getClass(), "implicitPrototype", null);
        setBooleanField(term989082, term989082.getClass(), "nativeType", false);
        setBooleanField(term989082, term989082.getClass(), "visited", false);
        setField(term989082, term989082.getClass(), "docInfo", null);
        setBooleanField(term989082, term989082.getClass(), "unknown", false);
        setBooleanField(term989082, term989082.getClass(), "resolved", false);
        setField(term989082, term989082.getClass(), "resolveResult", null);
        setField(term989082, term989082.getClass(), "registry", null);
        setField(term989078, term989078.getClass(), "typeOfThis", term989082);
        setField(term989078, term989078.getClass(), "source", null);
        setField(term989078, term989078.getClass(), "implementedInterfaces", null);
        setField(term989078, term989078.getClass(), "subTypes", null);
        setField(term989078, term989078.getClass(), "templateTypeName", null);
        setField(term989078, term989078.getClass(), "className", null);
        setField(term989078, term989078.getClass(), "properties", null);
        setField(term989078, term989078.getClass(), "implicitPrototype", null);
        setBooleanField(term989078, term989078.getClass(), "nativeType", false);
        setBooleanField(term989078, term989078.getClass(), "visited", false);
        setField(term989078, term989078.getClass(), "docInfo", null);
        setBooleanField(term989078, term989078.getClass(), "unknown", false);
        setBooleanField(term989078, term989078.getClass(), "resolved", false);
        setField(term989078, term989078.getClass(), "resolveResult", null);
        setField(term989078, term989078.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term987486;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term986888, args);
        assertTrue(recursiveEquals(term986888, term989069));
        assertTrue(recursiveEquals(term987486, term989078));
        assertTrue(recursiveEquals(retValue, false));
    }

};


