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

public class FunctionType_isSubtype_2101002158960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1060288;
     Object term1060738;
     Object term1065255;
     Object term1065261;

    public FunctionType_isSubtype_2101002158960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1065271 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1065270 = ((Class) term1065271).getDeclaredField((String) "ORDINARY");
        ((Field) term1065270).setAccessible(true);
        Object enum1983 = ((Field) term1065270).get((Object) null);
        term1060288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1060536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1060630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1060288, term1060288.getClass(), "kind", enum1983);
        setField(term1060536, term1060536.getClass(), "kind", enum1983);
        setField(term1060288, term1060288.getClass(), "typeOfThis", term1060536);
        setField(term1060288, term1060288.getClass(), "call", term1060630);
        Class<? extends Object> term1065562 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1065561 = ((Class) term1065562).getDeclaredField((String) "INTERFACE");
        ((Field) term1065561).setAccessible(true);
        Object enum1984 = ((Field) term1065561).get((Object) null);
        term1060738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1060920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1060738, term1060738.getClass(), "kind", enum1983);
        setField(term1060920, term1060920.getClass(), "kind", enum1984);
        setField(term1060738, term1060738.getClass(), "typeOfThis", term1060920);
        setField(term1060738, term1060738.getClass(), "call", null);
        Class<? extends Object> term1065856 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1065855 = ((Class) term1065856).getDeclaredField((String) "ORDINARY");
        ((Field) term1065855).setAccessible(true);
        Object enum1985 = ((Field) term1065855).get((Object) null);
        term1065255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1065256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1065260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1065255, term1065255.getClass(), "this$0", null);
        setField(term1065256, term1065256.getClass(), "parameters", null);
        setField(term1065256, term1065256.getClass(), "returnType", null);
        setBooleanField(term1065256, term1065256.getClass(), "resolved", false);
        setField(term1065256, term1065256.getClass(), "resolveResult", null);
        setField(term1065256, term1065256.getClass(), "registry", null);
        setField(term1065255, term1065255.getClass(), "call", term1065256);
        setField(term1065255, term1065255.getClass(), "prototype", null);
        setField(term1065255, term1065255.getClass(), "kind", enum1985);
        setField(term1065260, term1065260.getClass(), "call", null);
        setField(term1065260, term1065260.getClass(), "prototype", null);
        setField(term1065260, term1065260.getClass(), "kind", enum1985);
        setField(term1065260, term1065260.getClass(), "typeOfThis", null);
        setField(term1065260, term1065260.getClass(), "source", null);
        setField(term1065260, term1065260.getClass(), "implementedInterfaces", null);
        setField(term1065260, term1065260.getClass(), "subTypes", null);
        setField(term1065260, term1065260.getClass(), "templateTypeName", null);
        setField(term1065260, term1065260.getClass(), "className", null);
        setField(term1065260, term1065260.getClass(), "properties", null);
        setField(term1065260, term1065260.getClass(), "implicitPrototype", null);
        setBooleanField(term1065260, term1065260.getClass(), "nativeType", false);
        setBooleanField(term1065260, term1065260.getClass(), "visited", false);
        setField(term1065260, term1065260.getClass(), "docInfo", null);
        setBooleanField(term1065260, term1065260.getClass(), "unknown", false);
        setBooleanField(term1065260, term1065260.getClass(), "resolved", false);
        setField(term1065260, term1065260.getClass(), "resolveResult", null);
        setField(term1065260, term1065260.getClass(), "registry", null);
        setField(term1065255, term1065255.getClass(), "typeOfThis", term1065260);
        setField(term1065255, term1065255.getClass(), "source", null);
        setField(term1065255, term1065255.getClass(), "implementedInterfaces", null);
        setField(term1065255, term1065255.getClass(), "subTypes", null);
        setField(term1065255, term1065255.getClass(), "templateTypeName", null);
        setField(term1065255, term1065255.getClass(), "className", null);
        setField(term1065255, term1065255.getClass(), "properties", null);
        setField(term1065255, term1065255.getClass(), "implicitPrototype", null);
        setBooleanField(term1065255, term1065255.getClass(), "nativeType", false);
        setBooleanField(term1065255, term1065255.getClass(), "visited", false);
        setField(term1065255, term1065255.getClass(), "docInfo", null);
        setBooleanField(term1065255, term1065255.getClass(), "unknown", false);
        setBooleanField(term1065255, term1065255.getClass(), "resolved", false);
        setField(term1065255, term1065255.getClass(), "resolveResult", null);
        setField(term1065255, term1065255.getClass(), "registry", null);
        Class<? extends Object> term1066147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1066146 = ((Class) term1066147).getDeclaredField((String) "ORDINARY");
        ((Field) term1066146).setAccessible(true);
        Object enum1986 = ((Field) term1066146).get((Object) null);
        Class<? extends Object> term1066438 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1066437 = ((Class) term1066438).getDeclaredField((String) "INTERFACE");
        ((Field) term1066437).setAccessible(true);
        Object enum1987 = ((Field) term1066437).get((Object) null);
        term1065261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1065265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1065261, term1065261.getClass(), "this$0", null);
        setField(term1065261, term1065261.getClass(), "call", null);
        setField(term1065261, term1065261.getClass(), "prototype", null);
        setField(term1065261, term1065261.getClass(), "kind", enum1986);
        setField(term1065265, term1065265.getClass(), "this$0", null);
        setField(term1065265, term1065265.getClass(), "call", null);
        setField(term1065265, term1065265.getClass(), "prototype", null);
        setField(term1065265, term1065265.getClass(), "kind", enum1987);
        setField(term1065265, term1065265.getClass(), "typeOfThis", null);
        setField(term1065265, term1065265.getClass(), "source", null);
        setField(term1065265, term1065265.getClass(), "implementedInterfaces", null);
        setField(term1065265, term1065265.getClass(), "subTypes", null);
        setField(term1065265, term1065265.getClass(), "templateTypeName", null);
        setField(term1065265, term1065265.getClass(), "className", null);
        setField(term1065265, term1065265.getClass(), "properties", null);
        setField(term1065265, term1065265.getClass(), "implicitPrototype", null);
        setBooleanField(term1065265, term1065265.getClass(), "nativeType", false);
        setBooleanField(term1065265, term1065265.getClass(), "visited", false);
        setField(term1065265, term1065265.getClass(), "docInfo", null);
        setBooleanField(term1065265, term1065265.getClass(), "unknown", false);
        setBooleanField(term1065265, term1065265.getClass(), "resolved", false);
        setField(term1065265, term1065265.getClass(), "resolveResult", null);
        setField(term1065265, term1065265.getClass(), "registry", null);
        setField(term1065261, term1065261.getClass(), "typeOfThis", term1065265);
        setField(term1065261, term1065261.getClass(), "source", null);
        setField(term1065261, term1065261.getClass(), "implementedInterfaces", null);
        setField(term1065261, term1065261.getClass(), "subTypes", null);
        setField(term1065261, term1065261.getClass(), "templateTypeName", null);
        setField(term1065261, term1065261.getClass(), "className", null);
        setField(term1065261, term1065261.getClass(), "properties", null);
        setField(term1065261, term1065261.getClass(), "implicitPrototype", null);
        setBooleanField(term1065261, term1065261.getClass(), "nativeType", false);
        setBooleanField(term1065261, term1065261.getClass(), "visited", false);
        setField(term1065261, term1065261.getClass(), "docInfo", null);
        setBooleanField(term1065261, term1065261.getClass(), "unknown", false);
        setBooleanField(term1065261, term1065261.getClass(), "resolved", false);
        setField(term1065261, term1065261.getClass(), "resolveResult", null);
        setField(term1065261, term1065261.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1060738;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1060288, args);
        assertTrue(recursiveEquals(term1060288, term1065255));
        assertTrue(recursiveEquals(term1060738, term1065261));
        assertTrue(recursiveEquals(retValue, false));
    }

};


