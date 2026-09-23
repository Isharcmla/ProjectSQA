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

public class FunctionType_isSubtype_21010021581003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1265107;
     Object term1265759;
     Object term1266960;
     Object term1266965;

    public FunctionType_isSubtype_21010021581003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1266972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1266971 = ((Class) term1266972).getDeclaredField((String) "ORDINARY");
        ((Field) term1266971).setAccessible(true);
        Object enum2273 = ((Field) term1266971).get((Object) null);
        Class<? extends Object> term1267263 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1267262 = ((Class) term1267263).getDeclaredField((String) "INTERFACE");
        ((Field) term1267262).setAccessible(true);
        Object enum2274 = ((Field) term1267262).get((Object) null);
        term1265107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1265651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1265107, term1265107.getClass(), "kind", enum2273);
        setField(term1265651, term1265651.getClass(), "kind", enum2274);
        setField(term1265107, term1265107.getClass(), "typeOfThis", term1265651);
        Class<? extends Object> term1267557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1267556 = ((Class) term1267557).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1267556).setAccessible(true);
        Object enum2275 = ((Field) term1267556).get((Object) null);
        term1265759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1265943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1265759, term1265759.getClass(), "kind", enum2275);
        setField(term1265759, term1265759.getClass(), "typeOfThis", term1265943);
        Class<? extends Object> term1267857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1267856 = ((Class) term1267857).getDeclaredField((String) "INTERFACE");
        ((Field) term1267856).setAccessible(true);
        Object enum2276 = ((Field) term1267856).get((Object) null);
        term1266960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1266964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1266960, term1266960.getClass(), "call", null);
        setField(term1266960, term1266960.getClass(), "prototype", null);
        setField(term1266960, term1266960.getClass(), "kind", enum2276);
        setField(term1266964, term1266964.getClass(), "call", null);
        setField(term1266964, term1266964.getClass(), "prototype", null);
        setField(term1266964, term1266964.getClass(), "kind", enum2276);
        setField(term1266964, term1266964.getClass(), "typeOfThis", null);
        setField(term1266964, term1266964.getClass(), "source", null);
        setField(term1266964, term1266964.getClass(), "implementedInterfaces", null);
        setField(term1266964, term1266964.getClass(), "subTypes", null);
        setField(term1266964, term1266964.getClass(), "templateTypeName", null);
        setField(term1266964, term1266964.getClass(), "className", null);
        setField(term1266964, term1266964.getClass(), "properties", null);
        setField(term1266964, term1266964.getClass(), "implicitPrototype", null);
        setBooleanField(term1266964, term1266964.getClass(), "nativeType", false);
        setBooleanField(term1266964, term1266964.getClass(), "prettyPrint", false);
        setBooleanField(term1266964, term1266964.getClass(), "visited", false);
        setField(term1266964, term1266964.getClass(), "docInfo", null);
        setBooleanField(term1266964, term1266964.getClass(), "unknown", false);
        setBooleanField(term1266964, term1266964.getClass(), "resolved", false);
        setField(term1266964, term1266964.getClass(), "resolveResult", null);
        setField(term1266964, term1266964.getClass(), "registry", null);
        setField(term1266960, term1266960.getClass(), "typeOfThis", term1266964);
        setField(term1266960, term1266960.getClass(), "source", null);
        setField(term1266960, term1266960.getClass(), "implementedInterfaces", null);
        setField(term1266960, term1266960.getClass(), "subTypes", null);
        setField(term1266960, term1266960.getClass(), "templateTypeName", null);
        setField(term1266960, term1266960.getClass(), "className", null);
        setField(term1266960, term1266960.getClass(), "properties", null);
        setField(term1266960, term1266960.getClass(), "implicitPrototype", null);
        setBooleanField(term1266960, term1266960.getClass(), "nativeType", false);
        setBooleanField(term1266960, term1266960.getClass(), "prettyPrint", false);
        setBooleanField(term1266960, term1266960.getClass(), "visited", false);
        setField(term1266960, term1266960.getClass(), "docInfo", null);
        setBooleanField(term1266960, term1266960.getClass(), "unknown", false);
        setBooleanField(term1266960, term1266960.getClass(), "resolved", false);
        setField(term1266960, term1266960.getClass(), "resolveResult", null);
        setField(term1266960, term1266960.getClass(), "registry", null);
        Class<? extends Object> term1268151 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1268150 = ((Class) term1268151).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1268150).setAccessible(true);
        Object enum2277 = ((Field) term1268150).get((Object) null);
        term1266965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1266969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1266965, term1266965.getClass(), "this$0", null);
        setField(term1266965, term1266965.getClass(), "call", null);
        setField(term1266965, term1266965.getClass(), "prototype", null);
        setField(term1266965, term1266965.getClass(), "kind", enum2277);
        setField(term1266969, term1266969.getClass(), "call", null);
        setField(term1266969, term1266969.getClass(), "prototype", null);
        setField(term1266969, term1266969.getClass(), "kind", null);
        setField(term1266969, term1266969.getClass(), "typeOfThis", null);
        setField(term1266969, term1266969.getClass(), "source", null);
        setField(term1266969, term1266969.getClass(), "implementedInterfaces", null);
        setField(term1266969, term1266969.getClass(), "subTypes", null);
        setField(term1266969, term1266969.getClass(), "templateTypeName", null);
        setField(term1266969, term1266969.getClass(), "className", null);
        setField(term1266969, term1266969.getClass(), "properties", null);
        setField(term1266969, term1266969.getClass(), "implicitPrototype", null);
        setBooleanField(term1266969, term1266969.getClass(), "nativeType", false);
        setBooleanField(term1266969, term1266969.getClass(), "prettyPrint", false);
        setBooleanField(term1266969, term1266969.getClass(), "visited", false);
        setField(term1266969, term1266969.getClass(), "docInfo", null);
        setBooleanField(term1266969, term1266969.getClass(), "unknown", false);
        setBooleanField(term1266969, term1266969.getClass(), "resolved", false);
        setField(term1266969, term1266969.getClass(), "resolveResult", null);
        setField(term1266969, term1266969.getClass(), "registry", null);
        setField(term1266965, term1266965.getClass(), "typeOfThis", term1266969);
        setField(term1266965, term1266965.getClass(), "source", null);
        setField(term1266965, term1266965.getClass(), "implementedInterfaces", null);
        setField(term1266965, term1266965.getClass(), "subTypes", null);
        setField(term1266965, term1266965.getClass(), "templateTypeName", null);
        setField(term1266965, term1266965.getClass(), "className", null);
        setField(term1266965, term1266965.getClass(), "properties", null);
        setField(term1266965, term1266965.getClass(), "implicitPrototype", null);
        setBooleanField(term1266965, term1266965.getClass(), "nativeType", false);
        setBooleanField(term1266965, term1266965.getClass(), "prettyPrint", false);
        setBooleanField(term1266965, term1266965.getClass(), "visited", false);
        setField(term1266965, term1266965.getClass(), "docInfo", null);
        setBooleanField(term1266965, term1266965.getClass(), "unknown", false);
        setBooleanField(term1266965, term1266965.getClass(), "resolved", false);
        setField(term1266965, term1266965.getClass(), "resolveResult", null);
        setField(term1266965, term1266965.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1265759;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1265107, args);
        assertTrue(recursiveEquals(term1265107, term1266960));
        assertTrue(recursiveEquals(term1265759, term1266965));
        assertTrue(recursiveEquals(retValue, false));
    }

};


