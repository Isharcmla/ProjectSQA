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

public class FunctionType_getAllImplementedInterfaces_572683533192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98935;
     Object term219854;
     Object term219847;

    public FunctionType_getAllImplementedInterfaces_572683533192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term219860 = ((Class) term219861).getDeclaredField((String) "INTERFACE");
        ((Field) term219860).setAccessible(true);
        Object enum417 = ((Field) term219860).get((Object) null);
        ArrayList term99431 = new ArrayList();
        term98935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98935, term98935.getClass(), "kind", enum417);
        setField(term98935, term98935.getClass(), "implementedInterfaces", term99431);
        Class<? extends Object> term220155 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term220154 = ((Class) term220155).getDeclaredField((String) "INTERFACE");
        ((Field) term220154).setAccessible(true);
        Object enum418 = ((Field) term220154).get((Object) null);
        ArrayList term219858 = new ArrayList();
        term219854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term219854, term219854.getClass(), "call", null);
        setField(term219854, term219854.getClass(), "prototypeSlot", null);
        setField(term219854, term219854.getClass(), "kind", enum418);
        setField(term219854, term219854.getClass(), "propAccess", null);
        setField(term219854, term219854.getClass(), "typeOfThis", null);
        setField(term219854, term219854.getClass(), "source", null);
        setField(term219854, term219854.getClass(), "implementedInterfaces", term219858);
        setField(term219854, term219854.getClass(), "extendedInterfaces", null);
        setField(term219854, term219854.getClass(), "subTypes", null);
        setField(term219854, term219854.getClass(), "templateTypeNames", null);
        setField(term219854, term219854.getClass(), "className", null);
        setField(term219854, term219854.getClass(), "properties", null);
        setBooleanField(term219854, term219854.getClass(), "nativeType", false);
        setField(term219854, term219854.getClass(), "implicitPrototypeFallback", null);
        setField(term219854, term219854.getClass(), "ownerFunction", null);
        setBooleanField(term219854, term219854.getClass(), "prettyPrint", false);
        setBooleanField(term219854, term219854.getClass(), "visited", false);
        setField(term219854, term219854.getClass(), "docInfo", null);
        setBooleanField(term219854, term219854.getClass(), "unknown", false);
        setBooleanField(term219854, term219854.getClass(), "resolved", false);
        setField(term219854, term219854.getClass(), "resolveResult", null);
        setBooleanField(term219854, term219854.getClass(), "inTemplatedCheckVisit", false);
        setField(term219854, term219854.getClass(), "registry", null);
        LinkedHashMap term219848 = new LinkedHashMap();
        Set<Object> term220448 =  ((Map) term219848).keySet();
        term219847 = new LinkedHashSet((Collection<? extends Object>) term220448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term98935, args);
        assertTrue(recursiveEquals(term98935, term219854));
        assertTrue(recursiveEquals(retValue, term219847));
    }

};


