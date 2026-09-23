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

public class FunctionType_getAllImplementedInterfaces_572683533198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98287;
     Object term99585;
     Object term99578;

    public FunctionType_getAllImplementedInterfaces_572683533198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term99591 = ((Class) term99592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term99591).setAccessible(true);
        Object enum204 = ((Field) term99591).get((Object) null);
        ArrayList term98783 = new ArrayList();
        term98287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98287, term98287.getClass(), "kind", enum204);
        setField(term98287, term98287.getClass(), "implementedInterfaces", term98783);
        Class<? extends Object> term99892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term99891 = ((Class) term99892).getDeclaredField((String) "ORDINARY");
        ((Field) term99891).setAccessible(true);
        Object enum205 = ((Field) term99891).get((Object) null);
        ArrayList term99589 = new ArrayList();
        term99585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term99585, term99585.getClass(), "call", null);
        setField(term99585, term99585.getClass(), "prototype", null);
        setField(term99585, term99585.getClass(), "kind", enum205);
        setField(term99585, term99585.getClass(), "typeOfThis", null);
        setField(term99585, term99585.getClass(), "source", null);
        setField(term99585, term99585.getClass(), "implementedInterfaces", term99589);
        setField(term99585, term99585.getClass(), "subTypes", null);
        setField(term99585, term99585.getClass(), "templateTypeName", null);
        setField(term99585, term99585.getClass(), "className", null);
        setField(term99585, term99585.getClass(), "properties", null);
        setBooleanField(term99585, term99585.getClass(), "nativeType", false);
        setField(term99585, term99585.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term99585, term99585.getClass(), "prettyPrint", false);
        setBooleanField(term99585, term99585.getClass(), "visited", false);
        setField(term99585, term99585.getClass(), "docInfo", null);
        setBooleanField(term99585, term99585.getClass(), "unknown", false);
        setBooleanField(term99585, term99585.getClass(), "resolved", false);
        setField(term99585, term99585.getClass(), "resolveResult", null);
        setField(term99585, term99585.getClass(), "registry", null);
        LinkedHashMap term99579 = new LinkedHashMap();
        Set<Object> term100182 =  ((Map) term99579).keySet();
        term99578 = new LinkedHashSet((Collection<? extends Object>) term100182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term98287, args);
        assertTrue(recursiveEquals(term98287, term99585));
        assertTrue(recursiveEquals(retValue, term99578));
    }

};


