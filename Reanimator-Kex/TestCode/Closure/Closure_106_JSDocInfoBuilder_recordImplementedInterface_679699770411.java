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

public class JSDocInfoBuilder_recordImplementedInterface_679699770411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159222;
     Object term159729;

    public JSDocInfoBuilder_recordImplementedInterface_679699770411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159222 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term159302 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term159302, term159302.getClass(), "info", null);
        setField(term159222, term159222.getClass(), "currentInfo", term159302);
        ArrayList term159732 = new ArrayList();
        ((ArrayList) term159732).add((Object)null);
        term159729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term159730 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term159731 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term159731, term159731.getClass(), "baseType", null);
        setField(term159731, term159731.getClass(), "implementedInterfaces", term159732);
        setField(term159731, term159731.getClass(), "parameters", null);
        setField(term159731, term159731.getClass(), "thrownTypes", null);
        setField(term159731, term159731.getClass(), "templateTypeName", null);
        setField(term159731, term159731.getClass(), "description", null);
        setField(term159731, term159731.getClass(), "deprecated", null);
        setField(term159731, term159731.getClass(), "license", null);
        setField(term159731, term159731.getClass(), "suppressions", null);
        setField(term159730, term159730.getClass(), "info", term159731);
        setField(term159730, term159730.getClass(), "documentation", null);
        setField(term159730, term159730.getClass(), "sourceName", null);
        setField(term159730, term159730.getClass(), "visibility", null);
        setIntField(term159730, term159730.getClass(), "bitset", 0);
        setField(term159730, term159730.getClass(), "type", null);
        setField(term159730, term159730.getClass(), "thisType", null);
        setBooleanField(term159730, term159730.getClass(), "includeDocumentation", false);
        setField(term159729, term159729.getClass(), "currentInfo", term159730);
        setBooleanField(term159729, term159729.getClass(), "populated", true);
        setBooleanField(term159729, term159729.getClass(), "parseDocumentation", false);
        setField(term159729, term159729.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordImplementedInterface", argTypes, term159222, args);
        assertTrue(recursiveEquals(term159222, term159729));
        assertTrue(recursiveEquals(retValue, true));
    }

};


