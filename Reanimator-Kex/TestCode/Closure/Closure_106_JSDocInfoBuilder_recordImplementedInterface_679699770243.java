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
import java.util.ArrayList;

public class JSDocInfoBuilder_recordImplementedInterface_679699770243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123211;
     Object term123671;

    public JSDocInfoBuilder_recordImplementedInterface_679699770243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123211 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term123291 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term123291, term123291.getClass(), "info", null);
        setField(term123211, term123211.getClass(), "currentInfo", term123291);
        ArrayList term123674 = new ArrayList();
        ((ArrayList) term123674).add((Object)null);
        term123671 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term123672 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term123673 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term123673, term123673.getClass(), "baseType", null);
        setField(term123673, term123673.getClass(), "implementedInterfaces", term123674);
        setField(term123673, term123673.getClass(), "parameters", null);
        setField(term123673, term123673.getClass(), "thrownTypes", null);
        setField(term123673, term123673.getClass(), "templateTypeName", null);
        setField(term123673, term123673.getClass(), "description", null);
        setField(term123673, term123673.getClass(), "deprecated", null);
        setField(term123673, term123673.getClass(), "license", null);
        setField(term123673, term123673.getClass(), "suppressions", null);
        setField(term123672, term123672.getClass(), "info", term123673);
        setField(term123672, term123672.getClass(), "documentation", null);
        setField(term123672, term123672.getClass(), "sourceName", null);
        setField(term123672, term123672.getClass(), "visibility", null);
        setIntField(term123672, term123672.getClass(), "bitset", 0);
        setField(term123672, term123672.getClass(), "type", null);
        setField(term123672, term123672.getClass(), "thisType", null);
        setBooleanField(term123672, term123672.getClass(), "includeDocumentation", false);
        setField(term123671, term123671.getClass(), "currentInfo", term123672);
        setBooleanField(term123671, term123671.getClass(), "populated", true);
        setBooleanField(term123671, term123671.getClass(), "parseDocumentation", false);
        setField(term123671, term123671.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordImplementedInterface", argTypes, term123211, args);
        assertTrue(recursiveEquals(term123211, term123671));
        assertTrue(recursiveEquals(retValue, true));
    }

};


