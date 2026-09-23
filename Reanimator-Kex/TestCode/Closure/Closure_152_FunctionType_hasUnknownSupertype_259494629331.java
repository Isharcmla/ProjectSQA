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

public class FunctionType_hasUnknownSupertype_259494629331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221168;
     Object term221956;

    public FunctionType_hasUnknownSupertype_259494629331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221964 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221963 = ((Class) term221964).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term221963).setAccessible(true);
        Object enum388 = ((Field) term221963).get((Object) null);
        term221168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term221434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term221548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term221168, term221168.getClass(), "kind", enum388);
        setBooleanField(term221168, term221168.getClass(), "unknown", false);
        setField(term221434, term221434.getClass(), "implicitPrototypeFallback", term221548);
        setField(term221168, term221168.getClass(), "prototype", term221434);
        Class<? extends Object> term222264 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term222263 = ((Class) term222264).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term222263).setAccessible(true);
        Object enum389 = ((Field) term222263).get((Object) null);
        term221956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term221957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term221958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term221956, term221956.getClass(), "call", null);
        setField(term221957, term221957.getClass(), "ownerFunction", null);
        setField(term221957, term221957.getClass(), "className", null);
        setField(term221957, term221957.getClass(), "properties", null);
        setBooleanField(term221957, term221957.getClass(), "nativeType", false);
        setField(term221958, term221958.getClass(), "className", null);
        setField(term221958, term221958.getClass(), "properties", null);
        setBooleanField(term221958, term221958.getClass(), "nativeType", false);
        setField(term221958, term221958.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term221958, term221958.getClass(), "prettyPrint", false);
        setBooleanField(term221958, term221958.getClass(), "visited", false);
        setField(term221958, term221958.getClass(), "docInfo", null);
        setBooleanField(term221958, term221958.getClass(), "unknown", false);
        setBooleanField(term221958, term221958.getClass(), "resolved", false);
        setField(term221958, term221958.getClass(), "resolveResult", null);
        setField(term221958, term221958.getClass(), "registry", null);
        setField(term221957, term221957.getClass(), "implicitPrototypeFallback", term221958);
        setBooleanField(term221957, term221957.getClass(), "prettyPrint", false);
        setBooleanField(term221957, term221957.getClass(), "visited", false);
        setField(term221957, term221957.getClass(), "docInfo", null);
        setBooleanField(term221957, term221957.getClass(), "unknown", false);
        setBooleanField(term221957, term221957.getClass(), "resolved", false);
        setField(term221957, term221957.getClass(), "resolveResult", null);
        setField(term221957, term221957.getClass(), "registry", null);
        setField(term221956, term221956.getClass(), "prototype", term221957);
        setField(term221956, term221956.getClass(), "kind", enum389);
        setField(term221956, term221956.getClass(), "typeOfThis", null);
        setField(term221956, term221956.getClass(), "source", null);
        setField(term221956, term221956.getClass(), "implementedInterfaces", null);
        setField(term221956, term221956.getClass(), "subTypes", null);
        setField(term221956, term221956.getClass(), "templateTypeName", null);
        setField(term221956, term221956.getClass(), "className", null);
        setField(term221956, term221956.getClass(), "properties", null);
        setBooleanField(term221956, term221956.getClass(), "nativeType", false);
        setField(term221956, term221956.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term221956, term221956.getClass(), "prettyPrint", false);
        setBooleanField(term221956, term221956.getClass(), "visited", false);
        setField(term221956, term221956.getClass(), "docInfo", null);
        setBooleanField(term221956, term221956.getClass(), "unknown", false);
        setBooleanField(term221956, term221956.getClass(), "resolved", false);
        setField(term221956, term221956.getClass(), "resolveResult", null);
        setField(term221956, term221956.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term221168, args);
        assertTrue(recursiveEquals(term221168, term221956));
        assertTrue(recursiveEquals(retValue, false));
    }

};


