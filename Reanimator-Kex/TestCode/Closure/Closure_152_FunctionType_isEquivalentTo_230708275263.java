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

public class FunctionType_isEquivalentTo_230708275263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142778;
     Object term143332;
     Object term144960;
     Object term144964;

    public FunctionType_isEquivalentTo_230708275263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144970 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term144969 = ((Class) term144970).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term144969).setAccessible(true);
        Object enum265 = ((Field) term144969).get((Object) null);
        term142778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term142778, term142778.getClass(), "kind", enum265);
        Class<? extends Object> term145270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term145269 = ((Class) term145270).getDeclaredField((String) "INTERFACE");
        ((Field) term145269).setAccessible(true);
        Object enum266 = ((Field) term145269).get((Object) null);
        term143332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term143332, term143332.getClass(), "kind", enum266);
        Class<? extends Object> term145564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term145563 = ((Class) term145564).getDeclaredField((String) "ORDINARY");
        ((Field) term145563).setAccessible(true);
        Object enum267 = ((Field) term145563).get((Object) null);
        term144960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term144960, term144960.getClass(), "call", null);
        setField(term144960, term144960.getClass(), "prototype", null);
        setField(term144960, term144960.getClass(), "kind", enum267);
        setField(term144960, term144960.getClass(), "typeOfThis", null);
        setField(term144960, term144960.getClass(), "source", null);
        setField(term144960, term144960.getClass(), "implementedInterfaces", null);
        setField(term144960, term144960.getClass(), "subTypes", null);
        setField(term144960, term144960.getClass(), "templateTypeName", null);
        setField(term144960, term144960.getClass(), "className", null);
        setField(term144960, term144960.getClass(), "properties", null);
        setBooleanField(term144960, term144960.getClass(), "nativeType", false);
        setField(term144960, term144960.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term144960, term144960.getClass(), "prettyPrint", false);
        setBooleanField(term144960, term144960.getClass(), "visited", false);
        setField(term144960, term144960.getClass(), "docInfo", null);
        setBooleanField(term144960, term144960.getClass(), "unknown", false);
        setBooleanField(term144960, term144960.getClass(), "resolved", false);
        setField(term144960, term144960.getClass(), "resolveResult", null);
        setField(term144960, term144960.getClass(), "registry", null);
        Class<? extends Object> term145855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term145854 = ((Class) term145855).getDeclaredField((String) "INTERFACE");
        ((Field) term145854).setAccessible(true);
        Object enum268 = ((Field) term145854).get((Object) null);
        term144964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term144964, term144964.getClass(), "call", null);
        setField(term144964, term144964.getClass(), "prototype", null);
        setField(term144964, term144964.getClass(), "kind", enum268);
        setField(term144964, term144964.getClass(), "typeOfThis", null);
        setField(term144964, term144964.getClass(), "source", null);
        setField(term144964, term144964.getClass(), "implementedInterfaces", null);
        setField(term144964, term144964.getClass(), "subTypes", null);
        setField(term144964, term144964.getClass(), "templateTypeName", null);
        setField(term144964, term144964.getClass(), "className", null);
        setField(term144964, term144964.getClass(), "properties", null);
        setBooleanField(term144964, term144964.getClass(), "nativeType", false);
        setField(term144964, term144964.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term144964, term144964.getClass(), "prettyPrint", false);
        setBooleanField(term144964, term144964.getClass(), "visited", false);
        setField(term144964, term144964.getClass(), "docInfo", null);
        setBooleanField(term144964, term144964.getClass(), "unknown", false);
        setBooleanField(term144964, term144964.getClass(), "resolved", false);
        setField(term144964, term144964.getClass(), "resolveResult", null);
        setField(term144964, term144964.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term143332;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term142778, args);
        assertTrue(recursiveEquals(term142778, term144960));
        assertTrue(recursiveEquals(term143332, term144964));
        assertTrue(recursiveEquals(retValue, false));
    }

};


