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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllImplementedInterfaces_572683533271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152146;
     Object term153342;
     Object term153335;

    public FunctionType_getAllImplementedInterfaces_572683533271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term153349 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term153348 = ((Class) term153349).getDeclaredField((String) "INTERFACE");
        ((Field) term153348).setAccessible(true);
        Object enum281 = ((Field) term153348).get((Object) null);
        ArrayList term152346 = new ArrayList();
        term152146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term152146, term152146.getClass(), "kind", enum281);
        setField(term152146, term152146.getClass(), "implementedInterfaces", term152346);
        Class<? extends Object> term153643 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term153642 = ((Class) term153643).getDeclaredField((String) "INTERFACE");
        ((Field) term153642).setAccessible(true);
        Object enum282 = ((Field) term153642).get((Object) null);
        ArrayList term153346 = new ArrayList();
        term153342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term153342, term153342.getClass(), "call", null);
        setField(term153342, term153342.getClass(), "prototype", null);
        setField(term153342, term153342.getClass(), "kind", enum282);
        setField(term153342, term153342.getClass(), "typeOfThis", null);
        setField(term153342, term153342.getClass(), "source", null);
        setField(term153342, term153342.getClass(), "implementedInterfaces", term153346);
        setField(term153342, term153342.getClass(), "subTypes", null);
        setField(term153342, term153342.getClass(), "templateTypeName", null);
        setField(term153342, term153342.getClass(), "className", null);
        setField(term153342, term153342.getClass(), "properties", null);
        setBooleanField(term153342, term153342.getClass(), "nativeType", false);
        setField(term153342, term153342.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term153342, term153342.getClass(), "prettyPrint", false);
        setBooleanField(term153342, term153342.getClass(), "visited", false);
        setField(term153342, term153342.getClass(), "docInfo", null);
        setBooleanField(term153342, term153342.getClass(), "unknown", false);
        setBooleanField(term153342, term153342.getClass(), "resolved", false);
        setField(term153342, term153342.getClass(), "resolveResult", null);
        setField(term153342, term153342.getClass(), "registry", null);
        LinkedHashMap term153336 = new LinkedHashMap();
        Set<Object> term153936 =  ((Map) term153336).keySet();
        term153335 = new LinkedHashSet((Collection<? extends Object>) term153936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term152146, args);
        assertTrue(recursiveEquals(term152146, term153342));
        assertTrue(recursiveEquals(retValue, term153335));
    }

};


