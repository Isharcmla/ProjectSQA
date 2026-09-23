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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632718;
     Object term635758;

    public FunctionType_clearCachedValues_1343537339652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term632770 = new ArrayList();
        Class<? extends Object> term635766 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term635765 = ((Class) term635766).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term635765).setAccessible(true);
        Object enum1039 = ((Field) term635765).get((Object) null);
        term632718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term633022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term632718, term632718.getClass(), "unknown", false);
        setField(term632718, term632718.getClass(), "subTypes", term632770);
        setBooleanField(term632718, term632718.getClass(), "nativeType", false);
        setField(term632718, term632718.getClass(), "kind", enum1039);
        setBooleanField(term633022, term633022.getClass(), "unknown", false);
        setField(term633022, term633022.getClass(), "subTypes", null);
        setBooleanField(term633022, term633022.getClass(), "nativeType", true);
        setField(term632718, term632718.getClass(), "typeOfThis", term633022);
        Class<? extends Object> term636066 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term636065 = ((Class) term636066).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term636065).setAccessible(true);
        Object enum1040 = ((Field) term636065).get((Object) null);
        ArrayList term635763 = new ArrayList();
        term635758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term635762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term635758, term635758.getClass(), "call", null);
        setField(term635758, term635758.getClass(), "prototypeSlot", null);
        setField(term635758, term635758.getClass(), "kind", enum1040);
        setField(term635758, term635758.getClass(), "propAccess", null);
        setField(term635762, term635762.getClass(), "call", null);
        setField(term635762, term635762.getClass(), "prototypeSlot", null);
        setField(term635762, term635762.getClass(), "kind", null);
        setField(term635762, term635762.getClass(), "propAccess", null);
        setField(term635762, term635762.getClass(), "typeOfThis", null);
        setField(term635762, term635762.getClass(), "source", null);
        setField(term635762, term635762.getClass(), "implementedInterfaces", null);
        setField(term635762, term635762.getClass(), "extendedInterfaces", null);
        setField(term635762, term635762.getClass(), "subTypes", null);
        setField(term635762, term635762.getClass(), "templateTypeNames", null);
        setField(term635762, term635762.getClass(), "className", null);
        setField(term635762, term635762.getClass(), "properties", null);
        setBooleanField(term635762, term635762.getClass(), "nativeType", true);
        setField(term635762, term635762.getClass(), "implicitPrototypeFallback", null);
        setField(term635762, term635762.getClass(), "ownerFunction", null);
        setBooleanField(term635762, term635762.getClass(), "prettyPrint", false);
        setBooleanField(term635762, term635762.getClass(), "visited", false);
        setField(term635762, term635762.getClass(), "docInfo", null);
        setBooleanField(term635762, term635762.getClass(), "unknown", true);
        setBooleanField(term635762, term635762.getClass(), "resolved", false);
        setField(term635762, term635762.getClass(), "resolveResult", null);
        setBooleanField(term635762, term635762.getClass(), "inTemplatedCheckVisit", false);
        setField(term635762, term635762.getClass(), "registry", null);
        setField(term635758, term635758.getClass(), "typeOfThis", term635762);
        setField(term635758, term635758.getClass(), "source", null);
        setField(term635758, term635758.getClass(), "implementedInterfaces", null);
        setField(term635758, term635758.getClass(), "extendedInterfaces", null);
        setField(term635758, term635758.getClass(), "subTypes", term635763);
        setField(term635758, term635758.getClass(), "templateTypeNames", null);
        setField(term635758, term635758.getClass(), "className", null);
        setField(term635758, term635758.getClass(), "properties", null);
        setBooleanField(term635758, term635758.getClass(), "nativeType", false);
        setField(term635758, term635758.getClass(), "implicitPrototypeFallback", null);
        setField(term635758, term635758.getClass(), "ownerFunction", null);
        setBooleanField(term635758, term635758.getClass(), "prettyPrint", false);
        setBooleanField(term635758, term635758.getClass(), "visited", false);
        setField(term635758, term635758.getClass(), "docInfo", null);
        setBooleanField(term635758, term635758.getClass(), "unknown", true);
        setBooleanField(term635758, term635758.getClass(), "resolved", false);
        setField(term635758, term635758.getClass(), "resolveResult", null);
        setBooleanField(term635758, term635758.getClass(), "inTemplatedCheckVisit", false);
        setField(term635758, term635758.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term632718, args);
        assertTrue(recursiveEquals(term632718, term635758));
    }

};


