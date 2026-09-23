package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209643;
     Object term210535;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term209895 = new HashMap();
        term209643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term209723 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term209847 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term209723, term209723.getClass(), "bitset", 536870912);
        setField(term209847, term209847.getClass(), "parameters", term209895);
        setField(term209847, term209847.getClass(), "baseType", null);
        setField(term209723, term209723.getClass(), "info", term209847);
        setField(term209723, term209723.getClass(), "thisType", null);
        setField(term209643, term209643.getClass(), "currentInfo", term209723);
        HashMap term210538 = new HashMap();
        term210535 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term210536 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term210537 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term210537, term210537.getClass(), "baseType", null);
        setField(term210537, term210537.getClass(), "implementedInterfaces", null);
        setField(term210537, term210537.getClass(), "parameters", term210538);
        setField(term210537, term210537.getClass(), "thrownTypes", null);
        setField(term210537, term210537.getClass(), "templateTypeName", null);
        setField(term210537, term210537.getClass(), "description", null);
        setField(term210537, term210537.getClass(), "deprecated", null);
        setField(term210537, term210537.getClass(), "license", null);
        setField(term210537, term210537.getClass(), "suppressions", null);
        setField(term210536, term210536.getClass(), "info", term210537);
        setField(term210536, term210536.getClass(), "documentation", null);
        setField(term210536, term210536.getClass(), "sourceName", null);
        setField(term210536, term210536.getClass(), "visibility", null);
        setIntField(term210536, term210536.getClass(), "bitset", 536870912);
        setField(term210536, term210536.getClass(), "type", null);
        setField(term210536, term210536.getClass(), "thisType", null);
        setBooleanField(term210536, term210536.getClass(), "includeDocumentation", false);
        setField(term210535, term210535.getClass(), "currentInfo", term210536);
        setBooleanField(term210535, term210535.getClass(), "populated", false);
        setBooleanField(term210535, term210535.getClass(), "parseDocumentation", false);
        setField(term210535, term210535.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term209643, args);
        assertTrue(recursiveEquals(term209643, term210535));
        assertTrue(recursiveEquals(retValue, true));
    }

};


