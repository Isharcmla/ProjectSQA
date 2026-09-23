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

public class FunctionType_hasInstanceType_305420673185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96845;
     Object term98498;

    public FunctionType_hasInstanceType_305420673185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98504 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98503 = ((Class) term98504).getDeclaredField((String) "ORDINARY");
        ((Field) term98503).setAccessible(true);
        Object enum204 = ((Field) term98503).get((Object) null);
        term96845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96845, term96845.getClass(), "kind", enum204);
        Class<? extends Object> term98795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98794 = ((Class) term98795).getDeclaredField((String) "INTERFACE");
        ((Field) term98794).setAccessible(true);
        Object enum205 = ((Field) term98794).get((Object) null);
        term98498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98498, term98498.getClass(), "call", null);
        setField(term98498, term98498.getClass(), "prototype", null);
        setField(term98498, term98498.getClass(), "kind", enum205);
        setField(term98498, term98498.getClass(), "typeOfThis", null);
        setField(term98498, term98498.getClass(), "source", null);
        setField(term98498, term98498.getClass(), "implementedInterfaces", null);
        setField(term98498, term98498.getClass(), "subTypes", null);
        setField(term98498, term98498.getClass(), "templateTypeName", null);
        setField(term98498, term98498.getClass(), "className", null);
        setField(term98498, term98498.getClass(), "properties", null);
        setBooleanField(term98498, term98498.getClass(), "nativeType", false);
        setField(term98498, term98498.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term98498, term98498.getClass(), "prettyPrint", false);
        setBooleanField(term98498, term98498.getClass(), "visited", false);
        setField(term98498, term98498.getClass(), "docInfo", null);
        setBooleanField(term98498, term98498.getClass(), "unknown", false);
        setBooleanField(term98498, term98498.getClass(), "resolved", false);
        setField(term98498, term98498.getClass(), "resolveResult", null);
        setField(term98498, term98498.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasInstanceType", argTypes, term96845, args);
        assertTrue(recursiveEquals(term96845, term98498));
        assertTrue(recursiveEquals(retValue, true));
    }

};


