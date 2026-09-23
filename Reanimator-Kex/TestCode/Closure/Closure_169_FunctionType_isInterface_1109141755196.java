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

public class FunctionType_isInterface_1109141755196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100565;
     Object term221091;

    public FunctionType_isInterface_1109141755196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221096 = ((Class) term221097).getDeclaredField((String) "INTERFACE");
        ((Field) term221096).setAccessible(true);
        Object enum419 = ((Field) term221096).get((Object) null);
        term100565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100565, term100565.getClass(), "kind", enum419);
        Class<? extends Object> term221391 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term221390 = ((Class) term221391).getDeclaredField((String) "INTERFACE");
        ((Field) term221390).setAccessible(true);
        Object enum420 = ((Field) term221390).get((Object) null);
        term221091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term221091, term221091.getClass(), "call", null);
        setField(term221091, term221091.getClass(), "prototypeSlot", null);
        setField(term221091, term221091.getClass(), "kind", enum420);
        setField(term221091, term221091.getClass(), "propAccess", null);
        setField(term221091, term221091.getClass(), "typeOfThis", null);
        setField(term221091, term221091.getClass(), "source", null);
        setField(term221091, term221091.getClass(), "implementedInterfaces", null);
        setField(term221091, term221091.getClass(), "extendedInterfaces", null);
        setField(term221091, term221091.getClass(), "subTypes", null);
        setField(term221091, term221091.getClass(), "templateTypeNames", null);
        setField(term221091, term221091.getClass(), "className", null);
        setField(term221091, term221091.getClass(), "properties", null);
        setBooleanField(term221091, term221091.getClass(), "nativeType", false);
        setField(term221091, term221091.getClass(), "implicitPrototypeFallback", null);
        setField(term221091, term221091.getClass(), "ownerFunction", null);
        setBooleanField(term221091, term221091.getClass(), "prettyPrint", false);
        setBooleanField(term221091, term221091.getClass(), "visited", false);
        setField(term221091, term221091.getClass(), "docInfo", null);
        setBooleanField(term221091, term221091.getClass(), "unknown", false);
        setBooleanField(term221091, term221091.getClass(), "resolved", false);
        setField(term221091, term221091.getClass(), "resolveResult", null);
        setBooleanField(term221091, term221091.getClass(), "inTemplatedCheckVisit", false);
        setField(term221091, term221091.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term100565, args);
        assertTrue(recursiveEquals(term100565, term221091));
        assertTrue(recursiveEquals(retValue, true));
    }

};


