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

public class FunctionType_getAllImplementedInterfaces_572683533239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118207;
     Object term119037;
     Object term119031;

    public FunctionType_getAllImplementedInterfaces_572683533239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term119043 = ((Class) term119044).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term119043).setAccessible(true);
        Object enum231 = ((Field) term119043).get((Object) null);
        ArrayList term118703 = new ArrayList();
        term118207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term118207, term118207.getClass(), "kind", enum231);
        setField(term118207, term118207.getClass(), "implementedInterfaces", term118703);
        Class<? extends Object> term119344 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term119343 = ((Class) term119344).getDeclaredField((String) "ORDINARY");
        ((Field) term119343).setAccessible(true);
        Object enum232 = ((Field) term119343).get((Object) null);
        ArrayList term119041 = new ArrayList();
        term119037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119037, term119037.getClass(), "call", null);
        setField(term119037, term119037.getClass(), "prototype", null);
        setField(term119037, term119037.getClass(), "kind", enum232);
        setField(term119037, term119037.getClass(), "typeOfThis", null);
        setField(term119037, term119037.getClass(), "source", null);
        setField(term119037, term119037.getClass(), "implementedInterfaces", term119041);
        setField(term119037, term119037.getClass(), "subTypes", null);
        setField(term119037, term119037.getClass(), "templateTypeName", null);
        setField(term119037, term119037.getClass(), "className", null);
        setField(term119037, term119037.getClass(), "properties", null);
        setField(term119037, term119037.getClass(), "implicitPrototype", null);
        setBooleanField(term119037, term119037.getClass(), "nativeType", false);
        setBooleanField(term119037, term119037.getClass(), "visited", false);
        setField(term119037, term119037.getClass(), "docInfo", null);
        setBooleanField(term119037, term119037.getClass(), "unknown", false);
        setBooleanField(term119037, term119037.getClass(), "resolved", false);
        setField(term119037, term119037.getClass(), "resolveResult", null);
        setField(term119037, term119037.getClass(), "registry", null);
        HashMap term119032 = new HashMap();
        Set<Object> term119634 =  ((Map) term119032).keySet();
        term119031 = new HashSet((Collection<? extends Object>) term119634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term118207, args);
        assertTrue(recursiveEquals(term118207, term119037));
        assertTrue(recursiveEquals(retValue, term119031));
    }

};


