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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70584;
     Object term71415;
     Object term71409;

    public FunctionType_getAllImplementedInterfaces_572683533133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71422 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71421 = ((Class) term71422).getDeclaredField((String) "ORDINARY");
        ((Field) term71421).setAccessible(true);
        Object enum174 = ((Field) term71421).get((Object) null);
        ArrayList term71080 = new ArrayList();
        term70584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term70584, term70584.getClass(), "kind", enum174);
        setField(term70584, term70584.getClass(), "implementedInterfaces", term71080);
        Class<? extends Object> term71713 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71712 = ((Class) term71713).getDeclaredField((String) "ORDINARY");
        ((Field) term71712).setAccessible(true);
        Object enum175 = ((Field) term71712).get((Object) null);
        ArrayList term71419 = new ArrayList();
        term71415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term71415, term71415.getClass(), "call", null);
        setField(term71415, term71415.getClass(), "prototype", null);
        setField(term71415, term71415.getClass(), "kind", enum175);
        setField(term71415, term71415.getClass(), "typeOfThis", null);
        setField(term71415, term71415.getClass(), "source", null);
        setField(term71415, term71415.getClass(), "implementedInterfaces", term71419);
        setField(term71415, term71415.getClass(), "subTypes", null);
        setField(term71415, term71415.getClass(), "templateTypeName", null);
        setField(term71415, term71415.getClass(), "className", null);
        setField(term71415, term71415.getClass(), "properties", null);
        setField(term71415, term71415.getClass(), "implicitPrototype", null);
        setBooleanField(term71415, term71415.getClass(), "nativeType", false);
        setBooleanField(term71415, term71415.getClass(), "prettyPrint", false);
        setBooleanField(term71415, term71415.getClass(), "visited", false);
        setField(term71415, term71415.getClass(), "docInfo", null);
        setBooleanField(term71415, term71415.getClass(), "unknown", false);
        setBooleanField(term71415, term71415.getClass(), "resolved", false);
        setField(term71415, term71415.getClass(), "resolveResult", null);
        setField(term71415, term71415.getClass(), "registry", null);
        HashMap term71410 = new HashMap();
        Set<Object> term72003 =  ((Map) term71410).keySet();
        term71409 = new HashSet((Collection<? extends Object>) term72003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term70584, args);
        assertTrue(recursiveEquals(term70584, term71415));
        assertTrue(recursiveEquals(retValue, term71409));
    }

};


