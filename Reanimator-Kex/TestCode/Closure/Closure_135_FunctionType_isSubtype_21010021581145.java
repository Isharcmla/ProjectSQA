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

public class FunctionType_isSubtype_21010021581145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360687;
     Object term1361349;
     Object term1362684;
     Object term1362692;

    public FunctionType_isSubtype_21010021581145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1362699 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1362698 = ((Class) term1362699).getDeclaredField((String) "ORDINARY");
        ((Field) term1362698).setAccessible(true);
        Object enum2549 = ((Field) term1362698).get((Object) null);
        Class<? extends Object> term1362990 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1362989 = ((Class) term1362990).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1362989).setAccessible(true);
        Object enum2550 = ((Field) term1362989).get((Object) null);
        term1360687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1361241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1360687, term1360687.getClass(), "kind", enum2549);
        setField(term1361241, term1361241.getClass(), "kind", enum2550);
        setField(term1360687, term1360687.getClass(), "typeOfThis", term1361241);
        Class<? extends Object> term1363290 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363289 = ((Class) term1363290).getDeclaredField((String) "INTERFACE");
        ((Field) term1363289).setAccessible(true);
        Object enum2551 = ((Field) term1363289).get((Object) null);
        term1361349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1361679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1361349, term1361349.getClass(), "kind", enum2549);
        setField(term1361679, term1361679.getClass(), "kind", enum2551);
        setField(term1361349, term1361349.getClass(), "typeOfThis", term1361679);
        Class<? extends Object> term1363584 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363583 = ((Class) term1363584).getDeclaredField((String) "INTERFACE");
        ((Field) term1363583).setAccessible(true);
        Object enum2552 = ((Field) term1363583).get((Object) null);
        Class<? extends Object> term1363878 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363877 = ((Class) term1363878).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1363877).setAccessible(true);
        Object enum2553 = ((Field) term1363877).get((Object) null);
        term1362684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1362688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1362684, term1362684.getClass(), "this$0", null);
        setField(term1362684, term1362684.getClass(), "call", null);
        setField(term1362684, term1362684.getClass(), "prototype", null);
        setField(term1362684, term1362684.getClass(), "kind", enum2552);
        setField(term1362688, term1362688.getClass(), "call", null);
        setField(term1362688, term1362688.getClass(), "prototype", null);
        setField(term1362688, term1362688.getClass(), "kind", enum2553);
        setField(term1362688, term1362688.getClass(), "typeOfThis", null);
        setField(term1362688, term1362688.getClass(), "source", null);
        setField(term1362688, term1362688.getClass(), "implementedInterfaces", null);
        setField(term1362688, term1362688.getClass(), "subTypes", null);
        setField(term1362688, term1362688.getClass(), "templateTypeName", null);
        setField(term1362688, term1362688.getClass(), "className", null);
        setField(term1362688, term1362688.getClass(), "properties", null);
        setField(term1362688, term1362688.getClass(), "implicitPrototype", null);
        setBooleanField(term1362688, term1362688.getClass(), "nativeType", false);
        setBooleanField(term1362688, term1362688.getClass(), "visited", false);
        setField(term1362688, term1362688.getClass(), "docInfo", null);
        setBooleanField(term1362688, term1362688.getClass(), "unknown", false);
        setBooleanField(term1362688, term1362688.getClass(), "resolved", false);
        setField(term1362688, term1362688.getClass(), "resolveResult", null);
        setField(term1362688, term1362688.getClass(), "registry", null);
        setField(term1362684, term1362684.getClass(), "typeOfThis", term1362688);
        setField(term1362684, term1362684.getClass(), "source", null);
        setField(term1362684, term1362684.getClass(), "implementedInterfaces", null);
        setField(term1362684, term1362684.getClass(), "subTypes", null);
        setField(term1362684, term1362684.getClass(), "templateTypeName", null);
        setField(term1362684, term1362684.getClass(), "className", null);
        setField(term1362684, term1362684.getClass(), "properties", null);
        setField(term1362684, term1362684.getClass(), "implicitPrototype", null);
        setBooleanField(term1362684, term1362684.getClass(), "nativeType", false);
        setBooleanField(term1362684, term1362684.getClass(), "visited", false);
        setField(term1362684, term1362684.getClass(), "docInfo", null);
        setBooleanField(term1362684, term1362684.getClass(), "unknown", false);
        setBooleanField(term1362684, term1362684.getClass(), "resolved", false);
        setField(term1362684, term1362684.getClass(), "resolveResult", null);
        setField(term1362684, term1362684.getClass(), "registry", null);
        Class<? extends Object> term1364178 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1364177 = ((Class) term1364178).getDeclaredField((String) "INTERFACE");
        ((Field) term1364177).setAccessible(true);
        Object enum2554 = ((Field) term1364177).get((Object) null);
        term1362692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1362696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1362692, term1362692.getClass(), "this$0", null);
        setField(term1362692, term1362692.getClass(), "call", null);
        setField(term1362692, term1362692.getClass(), "prototype", null);
        setField(term1362692, term1362692.getClass(), "kind", enum2554);
        setField(term1362696, term1362696.getClass(), "this$0", null);
        setField(term1362696, term1362696.getClass(), "call", null);
        setField(term1362696, term1362696.getClass(), "prototype", null);
        setField(term1362696, term1362696.getClass(), "kind", enum2554);
        setField(term1362696, term1362696.getClass(), "typeOfThis", null);
        setField(term1362696, term1362696.getClass(), "source", null);
        setField(term1362696, term1362696.getClass(), "implementedInterfaces", null);
        setField(term1362696, term1362696.getClass(), "subTypes", null);
        setField(term1362696, term1362696.getClass(), "templateTypeName", null);
        setField(term1362696, term1362696.getClass(), "className", null);
        setField(term1362696, term1362696.getClass(), "properties", null);
        setField(term1362696, term1362696.getClass(), "implicitPrototype", null);
        setBooleanField(term1362696, term1362696.getClass(), "nativeType", false);
        setBooleanField(term1362696, term1362696.getClass(), "visited", false);
        setField(term1362696, term1362696.getClass(), "docInfo", null);
        setBooleanField(term1362696, term1362696.getClass(), "unknown", false);
        setBooleanField(term1362696, term1362696.getClass(), "resolved", false);
        setField(term1362696, term1362696.getClass(), "resolveResult", null);
        setField(term1362696, term1362696.getClass(), "registry", null);
        setField(term1362692, term1362692.getClass(), "typeOfThis", term1362696);
        setField(term1362692, term1362692.getClass(), "source", null);
        setField(term1362692, term1362692.getClass(), "implementedInterfaces", null);
        setField(term1362692, term1362692.getClass(), "subTypes", null);
        setField(term1362692, term1362692.getClass(), "templateTypeName", null);
        setField(term1362692, term1362692.getClass(), "className", null);
        setField(term1362692, term1362692.getClass(), "properties", null);
        setField(term1362692, term1362692.getClass(), "implicitPrototype", null);
        setBooleanField(term1362692, term1362692.getClass(), "nativeType", false);
        setBooleanField(term1362692, term1362692.getClass(), "visited", false);
        setField(term1362692, term1362692.getClass(), "docInfo", null);
        setBooleanField(term1362692, term1362692.getClass(), "unknown", false);
        setBooleanField(term1362692, term1362692.getClass(), "resolved", false);
        setField(term1362692, term1362692.getClass(), "resolveResult", null);
        setField(term1362692, term1362692.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1361349;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1360687, args);
        assertTrue(recursiveEquals(term1360687, term1362684));
        assertTrue(recursiveEquals(term1361349, term1362692));
        assertTrue(recursiveEquals(retValue, true));
    }

};


