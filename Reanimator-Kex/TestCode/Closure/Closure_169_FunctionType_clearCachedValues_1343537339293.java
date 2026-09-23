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

public class FunctionType_clearCachedValues_1343537339293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278579;
     Object term278819;

    public FunctionType_clearCachedValues_1343537339293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term278631 = new ArrayList();
        term278579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term278579, term278579.getClass(), "unknown", false);
        setField(term278579, term278579.getClass(), "subTypes", term278631);
        ArrayList term278820 = new ArrayList();
        term278819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term278819, term278819.getClass(), "call", null);
        setField(term278819, term278819.getClass(), "prototypeSlot", null);
        setField(term278819, term278819.getClass(), "kind", null);
        setField(term278819, term278819.getClass(), "propAccess", null);
        setField(term278819, term278819.getClass(), "typeOfThis", null);
        setField(term278819, term278819.getClass(), "source", null);
        setField(term278819, term278819.getClass(), "implementedInterfaces", null);
        setField(term278819, term278819.getClass(), "extendedInterfaces", null);
        setField(term278819, term278819.getClass(), "subTypes", term278820);
        setField(term278819, term278819.getClass(), "templateTypeNames", null);
        setField(term278819, term278819.getClass(), "className", null);
        setField(term278819, term278819.getClass(), "properties", null);
        setBooleanField(term278819, term278819.getClass(), "nativeType", false);
        setField(term278819, term278819.getClass(), "implicitPrototypeFallback", null);
        setField(term278819, term278819.getClass(), "ownerFunction", null);
        setBooleanField(term278819, term278819.getClass(), "prettyPrint", false);
        setBooleanField(term278819, term278819.getClass(), "visited", false);
        setField(term278819, term278819.getClass(), "docInfo", null);
        setBooleanField(term278819, term278819.getClass(), "unknown", true);
        setBooleanField(term278819, term278819.getClass(), "resolved", false);
        setField(term278819, term278819.getClass(), "resolveResult", null);
        setBooleanField(term278819, term278819.getClass(), "inTemplatedCheckVisit", false);
        setField(term278819, term278819.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term278579, args);
        assertTrue(recursiveEquals(term278579, term278819));
    }

};


