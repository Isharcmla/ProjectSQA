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

public class FunctionType_isSubtype_21010021581413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2011394;
     Object term2012146;
     Object term2013233;
     Object term2013239;

    public FunctionType_isSubtype_21010021581413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2013249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2013248 = ((Class) term2013249).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2013248).setAccessible(true);
        Object enum3573 = ((Field) term2013248).get((Object) null);
        term2011394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2011938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2012038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2011394, term2011394.getClass(), "kind", enum3573);
        setField(term2011938, term2011938.getClass(), "kind", enum3573);
        setField(term2011938, term2011938.getClass(), "typeOfThis", term2012038);
        setField(term2011394, term2011394.getClass(), "typeOfThis", term2011938);
        Class<? extends Object> term2013549 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2013548 = ((Class) term2013549).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2013548).setAccessible(true);
        Object enum3574 = ((Field) term2013548).get((Object) null);
        term2012146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2012330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2012146, term2012146.getClass(), "kind", enum3574);
        setField(term2012330, term2012330.getClass(), "kind", enum3573);
        setField(term2012330, term2012330.getClass(), "typeOfThis", null);
        setField(term2012146, term2012146.getClass(), "typeOfThis", term2012330);
        Class<? extends Object> term2013849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2013848 = ((Class) term2013849).getDeclaredField((String) "INTERFACE");
        ((Field) term2013848).setAccessible(true);
        Object enum3575 = ((Field) term2013848).get((Object) null);
        term2013233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2013237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2013238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2013233, term2013233.getClass(), "this$0", null);
        setField(term2013233, term2013233.getClass(), "call", null);
        setField(term2013233, term2013233.getClass(), "prototype", null);
        setField(term2013233, term2013233.getClass(), "kind", enum3575);
        setField(term2013237, term2013237.getClass(), "call", null);
        setField(term2013237, term2013237.getClass(), "prototype", null);
        setField(term2013237, term2013237.getClass(), "kind", enum3575);
        setField(term2013238, term2013238.getClass(), "leastSupertypeVisitor", null);
        setField(term2013238, term2013238.getClass(), "greatestSubtypeVisitor", null);
        setField(term2013238, term2013238.getClass(), "call", null);
        setField(term2013238, term2013238.getClass(), "prototype", null);
        setField(term2013238, term2013238.getClass(), "kind", null);
        setField(term2013238, term2013238.getClass(), "typeOfThis", null);
        setField(term2013238, term2013238.getClass(), "source", null);
        setField(term2013238, term2013238.getClass(), "implementedInterfaces", null);
        setField(term2013238, term2013238.getClass(), "subTypes", null);
        setField(term2013238, term2013238.getClass(), "templateTypeName", null);
        setField(term2013238, term2013238.getClass(), "className", null);
        setField(term2013238, term2013238.getClass(), "properties", null);
        setField(term2013238, term2013238.getClass(), "implicitPrototype", null);
        setBooleanField(term2013238, term2013238.getClass(), "nativeType", false);
        setBooleanField(term2013238, term2013238.getClass(), "prettyPrint", false);
        setBooleanField(term2013238, term2013238.getClass(), "visited", false);
        setField(term2013238, term2013238.getClass(), "docInfo", null);
        setBooleanField(term2013238, term2013238.getClass(), "unknown", false);
        setBooleanField(term2013238, term2013238.getClass(), "resolved", false);
        setField(term2013238, term2013238.getClass(), "resolveResult", null);
        setField(term2013238, term2013238.getClass(), "registry", null);
        setField(term2013237, term2013237.getClass(), "typeOfThis", term2013238);
        setField(term2013237, term2013237.getClass(), "source", null);
        setField(term2013237, term2013237.getClass(), "implementedInterfaces", null);
        setField(term2013237, term2013237.getClass(), "subTypes", null);
        setField(term2013237, term2013237.getClass(), "templateTypeName", null);
        setField(term2013237, term2013237.getClass(), "className", null);
        setField(term2013237, term2013237.getClass(), "properties", null);
        setField(term2013237, term2013237.getClass(), "implicitPrototype", null);
        setBooleanField(term2013237, term2013237.getClass(), "nativeType", false);
        setBooleanField(term2013237, term2013237.getClass(), "prettyPrint", false);
        setBooleanField(term2013237, term2013237.getClass(), "visited", false);
        setField(term2013237, term2013237.getClass(), "docInfo", null);
        setBooleanField(term2013237, term2013237.getClass(), "unknown", false);
        setBooleanField(term2013237, term2013237.getClass(), "resolved", false);
        setField(term2013237, term2013237.getClass(), "resolveResult", null);
        setField(term2013237, term2013237.getClass(), "registry", null);
        setField(term2013233, term2013233.getClass(), "typeOfThis", term2013237);
        setField(term2013233, term2013233.getClass(), "source", null);
        setField(term2013233, term2013233.getClass(), "implementedInterfaces", null);
        setField(term2013233, term2013233.getClass(), "subTypes", null);
        setField(term2013233, term2013233.getClass(), "templateTypeName", null);
        setField(term2013233, term2013233.getClass(), "className", null);
        setField(term2013233, term2013233.getClass(), "properties", null);
        setField(term2013233, term2013233.getClass(), "implicitPrototype", null);
        setBooleanField(term2013233, term2013233.getClass(), "nativeType", false);
        setBooleanField(term2013233, term2013233.getClass(), "prettyPrint", false);
        setBooleanField(term2013233, term2013233.getClass(), "visited", false);
        setField(term2013233, term2013233.getClass(), "docInfo", null);
        setBooleanField(term2013233, term2013233.getClass(), "unknown", false);
        setBooleanField(term2013233, term2013233.getClass(), "resolved", false);
        setField(term2013233, term2013233.getClass(), "resolveResult", null);
        setField(term2013233, term2013233.getClass(), "registry", null);
        Class<? extends Object> term2014143 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2014142 = ((Class) term2014143).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2014142).setAccessible(true);
        Object enum3576 = ((Field) term2014142).get((Object) null);
        Class<? extends Object> term2014443 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2014442 = ((Class) term2014443).getDeclaredField((String) "INTERFACE");
        ((Field) term2014442).setAccessible(true);
        Object enum3577 = ((Field) term2014442).get((Object) null);
        term2013239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2013243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2013239, term2013239.getClass(), "this$0", null);
        setField(term2013239, term2013239.getClass(), "call", null);
        setField(term2013239, term2013239.getClass(), "prototype", null);
        setField(term2013239, term2013239.getClass(), "kind", enum3576);
        setField(term2013243, term2013243.getClass(), "call", null);
        setField(term2013243, term2013243.getClass(), "prototype", null);
        setField(term2013243, term2013243.getClass(), "kind", enum3577);
        setField(term2013243, term2013243.getClass(), "typeOfThis", null);
        setField(term2013243, term2013243.getClass(), "source", null);
        setField(term2013243, term2013243.getClass(), "implementedInterfaces", null);
        setField(term2013243, term2013243.getClass(), "subTypes", null);
        setField(term2013243, term2013243.getClass(), "templateTypeName", null);
        setField(term2013243, term2013243.getClass(), "className", null);
        setField(term2013243, term2013243.getClass(), "properties", null);
        setField(term2013243, term2013243.getClass(), "implicitPrototype", null);
        setBooleanField(term2013243, term2013243.getClass(), "nativeType", false);
        setBooleanField(term2013243, term2013243.getClass(), "prettyPrint", false);
        setBooleanField(term2013243, term2013243.getClass(), "visited", false);
        setField(term2013243, term2013243.getClass(), "docInfo", null);
        setBooleanField(term2013243, term2013243.getClass(), "unknown", false);
        setBooleanField(term2013243, term2013243.getClass(), "resolved", false);
        setField(term2013243, term2013243.getClass(), "resolveResult", null);
        setField(term2013243, term2013243.getClass(), "registry", null);
        setField(term2013239, term2013239.getClass(), "typeOfThis", term2013243);
        setField(term2013239, term2013239.getClass(), "source", null);
        setField(term2013239, term2013239.getClass(), "implementedInterfaces", null);
        setField(term2013239, term2013239.getClass(), "subTypes", null);
        setField(term2013239, term2013239.getClass(), "templateTypeName", null);
        setField(term2013239, term2013239.getClass(), "className", null);
        setField(term2013239, term2013239.getClass(), "properties", null);
        setField(term2013239, term2013239.getClass(), "implicitPrototype", null);
        setBooleanField(term2013239, term2013239.getClass(), "nativeType", false);
        setBooleanField(term2013239, term2013239.getClass(), "prettyPrint", false);
        setBooleanField(term2013239, term2013239.getClass(), "visited", false);
        setField(term2013239, term2013239.getClass(), "docInfo", null);
        setBooleanField(term2013239, term2013239.getClass(), "unknown", false);
        setBooleanField(term2013239, term2013239.getClass(), "resolved", false);
        setField(term2013239, term2013239.getClass(), "resolveResult", null);
        setField(term2013239, term2013239.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2012146;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2011394, args);
        assertTrue(recursiveEquals(term2011394, term2013233));
        assertTrue(recursiveEquals(term2012146, term2013239));
        assertTrue(recursiveEquals(retValue, false));
    }

};


