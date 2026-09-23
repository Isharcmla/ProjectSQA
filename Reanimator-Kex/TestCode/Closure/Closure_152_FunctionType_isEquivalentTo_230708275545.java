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

public class FunctionType_isEquivalentTo_230708275545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504225;
     Object term504887;
     Object term506137;
     Object term506142;

    public FunctionType_isEquivalentTo_230708275545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term506152 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term506151 = ((Class) term506152).getDeclaredField((String) "INTERFACE");
        ((Field) term506151).setAccessible(true);
        Object enum807 = ((Field) term506151).get((Object) null);
        Class<? extends Object> term506446 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term506445 = ((Class) term506446).getDeclaredField((String) "INTERFACE");
        ((Field) term506445).setAccessible(true);
        Object enum808 = ((Field) term506445).get((Object) null);
        term504225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term504777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term504225, term504225.getClass(), "kind", enum807);
        setField(term504777, term504777.getClass(), "kind", enum808);
        setField(term504225, term504225.getClass(), "typeOfThis", term504777);
        Class<? extends Object> term506740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term506739 = ((Class) term506740).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term506739).setAccessible(true);
        Object enum809 = ((Field) term506739).get((Object) null);
        term504887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term505069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term504887, term504887.getClass(), "kind", enum809);
        setField(term505069, term505069.getClass(), "kind", enum808);
        setField(term504887, term504887.getClass(), "typeOfThis", term505069);
        Class<? extends Object> term507040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term507039 = ((Class) term507040).getDeclaredField((String) "INTERFACE");
        ((Field) term507039).setAccessible(true);
        Object enum810 = ((Field) term507039).get((Object) null);
        term506137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term506141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term506137, term506137.getClass(), "call", null);
        setField(term506137, term506137.getClass(), "prototype", null);
        setField(term506137, term506137.getClass(), "kind", enum810);
        setField(term506141, term506141.getClass(), "this$0", null);
        setField(term506141, term506141.getClass(), "call", null);
        setField(term506141, term506141.getClass(), "prototype", null);
        setField(term506141, term506141.getClass(), "kind", enum810);
        setField(term506141, term506141.getClass(), "typeOfThis", null);
        setField(term506141, term506141.getClass(), "source", null);
        setField(term506141, term506141.getClass(), "implementedInterfaces", null);
        setField(term506141, term506141.getClass(), "subTypes", null);
        setField(term506141, term506141.getClass(), "templateTypeName", null);
        setField(term506141, term506141.getClass(), "className", null);
        setField(term506141, term506141.getClass(), "properties", null);
        setBooleanField(term506141, term506141.getClass(), "nativeType", false);
        setField(term506141, term506141.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term506141, term506141.getClass(), "prettyPrint", false);
        setBooleanField(term506141, term506141.getClass(), "visited", false);
        setField(term506141, term506141.getClass(), "docInfo", null);
        setBooleanField(term506141, term506141.getClass(), "unknown", false);
        setBooleanField(term506141, term506141.getClass(), "resolved", false);
        setField(term506141, term506141.getClass(), "resolveResult", null);
        setField(term506141, term506141.getClass(), "registry", null);
        setField(term506137, term506137.getClass(), "typeOfThis", term506141);
        setField(term506137, term506137.getClass(), "source", null);
        setField(term506137, term506137.getClass(), "implementedInterfaces", null);
        setField(term506137, term506137.getClass(), "subTypes", null);
        setField(term506137, term506137.getClass(), "templateTypeName", null);
        setField(term506137, term506137.getClass(), "className", null);
        setField(term506137, term506137.getClass(), "properties", null);
        setBooleanField(term506137, term506137.getClass(), "nativeType", false);
        setField(term506137, term506137.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term506137, term506137.getClass(), "prettyPrint", false);
        setBooleanField(term506137, term506137.getClass(), "visited", false);
        setField(term506137, term506137.getClass(), "docInfo", null);
        setBooleanField(term506137, term506137.getClass(), "unknown", false);
        setBooleanField(term506137, term506137.getClass(), "resolved", false);
        setField(term506137, term506137.getClass(), "resolveResult", null);
        setField(term506137, term506137.getClass(), "registry", null);
        Class<? extends Object> term507334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term507333 = ((Class) term507334).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term507333).setAccessible(true);
        Object enum811 = ((Field) term507333).get((Object) null);
        Class<? extends Object> term507634 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term507633 = ((Class) term507634).getDeclaredField((String) "INTERFACE");
        ((Field) term507633).setAccessible(true);
        Object enum812 = ((Field) term507633).get((Object) null);
        term506142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term506146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term506142, term506142.getClass(), "call", null);
        setField(term506142, term506142.getClass(), "prototype", null);
        setField(term506142, term506142.getClass(), "kind", enum811);
        setField(term506146, term506146.getClass(), "this$0", null);
        setField(term506146, term506146.getClass(), "call", null);
        setField(term506146, term506146.getClass(), "prototype", null);
        setField(term506146, term506146.getClass(), "kind", enum812);
        setField(term506146, term506146.getClass(), "typeOfThis", null);
        setField(term506146, term506146.getClass(), "source", null);
        setField(term506146, term506146.getClass(), "implementedInterfaces", null);
        setField(term506146, term506146.getClass(), "subTypes", null);
        setField(term506146, term506146.getClass(), "templateTypeName", null);
        setField(term506146, term506146.getClass(), "className", null);
        setField(term506146, term506146.getClass(), "properties", null);
        setBooleanField(term506146, term506146.getClass(), "nativeType", false);
        setField(term506146, term506146.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term506146, term506146.getClass(), "prettyPrint", false);
        setBooleanField(term506146, term506146.getClass(), "visited", false);
        setField(term506146, term506146.getClass(), "docInfo", null);
        setBooleanField(term506146, term506146.getClass(), "unknown", false);
        setBooleanField(term506146, term506146.getClass(), "resolved", false);
        setField(term506146, term506146.getClass(), "resolveResult", null);
        setField(term506146, term506146.getClass(), "registry", null);
        setField(term506142, term506142.getClass(), "typeOfThis", term506146);
        setField(term506142, term506142.getClass(), "source", null);
        setField(term506142, term506142.getClass(), "implementedInterfaces", null);
        setField(term506142, term506142.getClass(), "subTypes", null);
        setField(term506142, term506142.getClass(), "templateTypeName", null);
        setField(term506142, term506142.getClass(), "className", null);
        setField(term506142, term506142.getClass(), "properties", null);
        setBooleanField(term506142, term506142.getClass(), "nativeType", false);
        setField(term506142, term506142.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term506142, term506142.getClass(), "prettyPrint", false);
        setBooleanField(term506142, term506142.getClass(), "visited", false);
        setField(term506142, term506142.getClass(), "docInfo", null);
        setBooleanField(term506142, term506142.getClass(), "unknown", false);
        setBooleanField(term506142, term506142.getClass(), "resolved", false);
        setField(term506142, term506142.getClass(), "resolveResult", null);
        setField(term506142, term506142.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term504887;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term504225, args);
        assertTrue(recursiveEquals(term504225, term506137));
        assertTrue(recursiveEquals(term504887, term506142));
        assertTrue(recursiveEquals(retValue, false));
    }

};


