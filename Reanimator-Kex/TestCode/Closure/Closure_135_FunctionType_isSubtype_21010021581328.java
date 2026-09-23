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

public class FunctionType_isSubtype_21010021581328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681225;
     Object term1681675;
     Object term1684189;
     Object term1684195;

    public FunctionType_isSubtype_21010021581328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1684203 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1684202 = ((Class) term1684203).getDeclaredField((String) "ORDINARY");
        ((Field) term1684202).setAccessible(true);
        Object enum3142 = ((Field) term1684202).get((Object) null);
        term1681225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1681473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1681567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1681225, term1681225.getClass(), "kind", enum3142);
        setField(term1681225, term1681225.getClass(), "typeOfThis", term1681473);
        setField(term1681225, term1681225.getClass(), "call", term1681567);
        Class<? extends Object> term1684494 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1684493 = ((Class) term1684494).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1684493).setAccessible(true);
        Object enum3143 = ((Field) term1684493).get((Object) null);
        term1681675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1681923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1682017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1681675, term1681675.getClass(), "kind", enum3143);
        setField(term1681675, term1681675.getClass(), "typeOfThis", term1681923);
        setField(term1681675, term1681675.getClass(), "call", term1682017);
        Class<? extends Object> term1684794 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1684793 = ((Class) term1684794).getDeclaredField((String) "ORDINARY");
        ((Field) term1684793).setAccessible(true);
        Object enum3144 = ((Field) term1684793).get((Object) null);
        term1684189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1684190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1684194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1684189, term1684189.getClass(), "this$0", null);
        setField(term1684190, term1684190.getClass(), "parameters", null);
        setField(term1684190, term1684190.getClass(), "returnType", null);
        setBooleanField(term1684190, term1684190.getClass(), "resolved", false);
        setField(term1684190, term1684190.getClass(), "resolveResult", null);
        setField(term1684190, term1684190.getClass(), "registry", null);
        setField(term1684189, term1684189.getClass(), "call", term1684190);
        setField(term1684189, term1684189.getClass(), "prototype", null);
        setField(term1684189, term1684189.getClass(), "kind", enum3144);
        setField(term1684194, term1684194.getClass(), "call", null);
        setField(term1684194, term1684194.getClass(), "prototype", null);
        setField(term1684194, term1684194.getClass(), "kind", null);
        setField(term1684194, term1684194.getClass(), "typeOfThis", null);
        setField(term1684194, term1684194.getClass(), "source", null);
        setField(term1684194, term1684194.getClass(), "implementedInterfaces", null);
        setField(term1684194, term1684194.getClass(), "subTypes", null);
        setField(term1684194, term1684194.getClass(), "templateTypeName", null);
        setField(term1684194, term1684194.getClass(), "className", null);
        setField(term1684194, term1684194.getClass(), "properties", null);
        setField(term1684194, term1684194.getClass(), "implicitPrototype", null);
        setBooleanField(term1684194, term1684194.getClass(), "nativeType", false);
        setBooleanField(term1684194, term1684194.getClass(), "visited", false);
        setField(term1684194, term1684194.getClass(), "docInfo", null);
        setBooleanField(term1684194, term1684194.getClass(), "unknown", false);
        setBooleanField(term1684194, term1684194.getClass(), "resolved", false);
        setField(term1684194, term1684194.getClass(), "resolveResult", null);
        setField(term1684194, term1684194.getClass(), "registry", null);
        setField(term1684189, term1684189.getClass(), "typeOfThis", term1684194);
        setField(term1684189, term1684189.getClass(), "source", null);
        setField(term1684189, term1684189.getClass(), "implementedInterfaces", null);
        setField(term1684189, term1684189.getClass(), "subTypes", null);
        setField(term1684189, term1684189.getClass(), "templateTypeName", null);
        setField(term1684189, term1684189.getClass(), "className", null);
        setField(term1684189, term1684189.getClass(), "properties", null);
        setField(term1684189, term1684189.getClass(), "implicitPrototype", null);
        setBooleanField(term1684189, term1684189.getClass(), "nativeType", false);
        setBooleanField(term1684189, term1684189.getClass(), "visited", false);
        setField(term1684189, term1684189.getClass(), "docInfo", null);
        setBooleanField(term1684189, term1684189.getClass(), "unknown", false);
        setBooleanField(term1684189, term1684189.getClass(), "resolved", false);
        setField(term1684189, term1684189.getClass(), "resolveResult", null);
        setField(term1684189, term1684189.getClass(), "registry", null);
        Class<? extends Object> term1685085 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1685084 = ((Class) term1685085).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1685084).setAccessible(true);
        Object enum3145 = ((Field) term1685084).get((Object) null);
        term1684195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1684196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1684200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1684195, term1684195.getClass(), "this$0", null);
        setField(term1684196, term1684196.getClass(), "parameters", null);
        setField(term1684196, term1684196.getClass(), "returnType", null);
        setBooleanField(term1684196, term1684196.getClass(), "resolved", false);
        setField(term1684196, term1684196.getClass(), "resolveResult", null);
        setField(term1684196, term1684196.getClass(), "registry", null);
        setField(term1684195, term1684195.getClass(), "call", term1684196);
        setField(term1684195, term1684195.getClass(), "prototype", null);
        setField(term1684195, term1684195.getClass(), "kind", enum3145);
        setField(term1684200, term1684200.getClass(), "leastSupertypeVisitor", null);
        setField(term1684200, term1684200.getClass(), "greatestSubtypeVisitor", null);
        setField(term1684200, term1684200.getClass(), "call", null);
        setField(term1684200, term1684200.getClass(), "prototype", null);
        setField(term1684200, term1684200.getClass(), "kind", null);
        setField(term1684200, term1684200.getClass(), "typeOfThis", null);
        setField(term1684200, term1684200.getClass(), "source", null);
        setField(term1684200, term1684200.getClass(), "implementedInterfaces", null);
        setField(term1684200, term1684200.getClass(), "subTypes", null);
        setField(term1684200, term1684200.getClass(), "templateTypeName", null);
        setField(term1684200, term1684200.getClass(), "className", null);
        setField(term1684200, term1684200.getClass(), "properties", null);
        setField(term1684200, term1684200.getClass(), "implicitPrototype", null);
        setBooleanField(term1684200, term1684200.getClass(), "nativeType", false);
        setBooleanField(term1684200, term1684200.getClass(), "visited", false);
        setField(term1684200, term1684200.getClass(), "docInfo", null);
        setBooleanField(term1684200, term1684200.getClass(), "unknown", false);
        setBooleanField(term1684200, term1684200.getClass(), "resolved", false);
        setField(term1684200, term1684200.getClass(), "resolveResult", null);
        setField(term1684200, term1684200.getClass(), "registry", null);
        setField(term1684195, term1684195.getClass(), "typeOfThis", term1684200);
        setField(term1684195, term1684195.getClass(), "source", null);
        setField(term1684195, term1684195.getClass(), "implementedInterfaces", null);
        setField(term1684195, term1684195.getClass(), "subTypes", null);
        setField(term1684195, term1684195.getClass(), "templateTypeName", null);
        setField(term1684195, term1684195.getClass(), "className", null);
        setField(term1684195, term1684195.getClass(), "properties", null);
        setField(term1684195, term1684195.getClass(), "implicitPrototype", null);
        setBooleanField(term1684195, term1684195.getClass(), "nativeType", false);
        setBooleanField(term1684195, term1684195.getClass(), "visited", false);
        setField(term1684195, term1684195.getClass(), "docInfo", null);
        setBooleanField(term1684195, term1684195.getClass(), "unknown", false);
        setBooleanField(term1684195, term1684195.getClass(), "resolved", false);
        setField(term1684195, term1684195.getClass(), "resolveResult", null);
        setField(term1684195, term1684195.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1681675;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1681225, args);
        assertTrue(recursiveEquals(term1681225, term1684189));
        assertTrue(recursiveEquals(term1681675, term1684195));
        assertTrue(recursiveEquals(retValue, true));
    }

};


