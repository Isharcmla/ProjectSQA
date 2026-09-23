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

public class JSDocInfoBuilder_recordDeprecationReason_1063612912235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122102;
     Object term122428;

    public JSDocInfoBuilder_recordDeprecationReason_1063612912235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122182 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term122182, term122182.getClass(), "info", null);
        setField(term122102, term122102.getClass(), "currentInfo", term122182);
        term122428 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term122430 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term122430, term122430.getClass(), "baseType", null);
        setField(term122430, term122430.getClass(), "implementedInterfaces", null);
        setField(term122430, term122430.getClass(), "parameters", null);
        setField(term122430, term122430.getClass(), "thrownTypes", null);
        setField(term122430, term122430.getClass(), "templateTypeName", null);
        setField(term122430, term122430.getClass(), "description", null);
        setField(term122430, term122430.getClass(), "deprecated", null);
        setField(term122430, term122430.getClass(), "license", null);
        setField(term122430, term122430.getClass(), "suppressions", null);
        setField(term122429, term122429.getClass(), "info", term122430);
        setField(term122429, term122429.getClass(), "documentation", null);
        setField(term122429, term122429.getClass(), "sourceName", null);
        setField(term122429, term122429.getClass(), "visibility", null);
        setIntField(term122429, term122429.getClass(), "bitset", 0);
        setField(term122429, term122429.getClass(), "type", null);
        setField(term122429, term122429.getClass(), "thisType", null);
        setBooleanField(term122429, term122429.getClass(), "includeDocumentation", false);
        setField(term122428, term122428.getClass(), "currentInfo", term122429);
        setBooleanField(term122428, term122428.getClass(), "populated", true);
        setBooleanField(term122428, term122428.getClass(), "parseDocumentation", false);
        setField(term122428, term122428.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordDeprecationReason", argTypes, term122102, args);
        assertTrue(recursiveEquals(term122102, term122428));
        assertTrue(recursiveEquals(retValue, true));
    }

};


