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

public class JSDocInfoBuilder_recordImplementedInterface_679699770414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159870;
     Object term160394;

    public JSDocInfoBuilder_recordImplementedInterface_679699770414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159870 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term159950 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term160074 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term160074, term160074.getClass(), "implementedInterfaces", null);
        setField(term159950, term159950.getClass(), "info", term160074);
        setField(term159870, term159870.getClass(), "currentInfo", term159950);
        ArrayList term160397 = new ArrayList();
        ((ArrayList) term160397).add((Object)null);
        term160394 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term160395 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term160396 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term160396, term160396.getClass(), "baseType", null);
        setField(term160396, term160396.getClass(), "implementedInterfaces", term160397);
        setField(term160396, term160396.getClass(), "parameters", null);
        setField(term160396, term160396.getClass(), "thrownTypes", null);
        setField(term160396, term160396.getClass(), "templateTypeName", null);
        setField(term160396, term160396.getClass(), "description", null);
        setField(term160396, term160396.getClass(), "deprecated", null);
        setField(term160396, term160396.getClass(), "license", null);
        setField(term160396, term160396.getClass(), "suppressions", null);
        setField(term160395, term160395.getClass(), "info", term160396);
        setField(term160395, term160395.getClass(), "documentation", null);
        setField(term160395, term160395.getClass(), "sourceName", null);
        setField(term160395, term160395.getClass(), "visibility", null);
        setIntField(term160395, term160395.getClass(), "bitset", 0);
        setField(term160395, term160395.getClass(), "type", null);
        setField(term160395, term160395.getClass(), "thisType", null);
        setBooleanField(term160395, term160395.getClass(), "includeDocumentation", false);
        setField(term160394, term160394.getClass(), "currentInfo", term160395);
        setBooleanField(term160394, term160394.getClass(), "populated", true);
        setBooleanField(term160394, term160394.getClass(), "parseDocumentation", false);
        setField(term160394, term160394.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordImplementedInterface", argTypes, term159870, args);
        assertTrue(recursiveEquals(term159870, term160394));
        assertTrue(recursiveEquals(retValue, true));
    }

};


