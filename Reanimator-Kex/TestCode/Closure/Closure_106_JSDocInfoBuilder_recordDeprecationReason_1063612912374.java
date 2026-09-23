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

public class JSDocInfoBuilder_recordDeprecationReason_1063612912374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149647;
     Object term149873;

    public JSDocInfoBuilder_recordDeprecationReason_1063612912374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149647 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term149727 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term149851 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term149851, term149851.getClass(), "deprecated", null);
        setField(term149727, term149727.getClass(), "info", term149851);
        setField(term149647, term149647.getClass(), "currentInfo", term149727);
        term149873 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term149874 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term149875 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term149875, term149875.getClass(), "baseType", null);
        setField(term149875, term149875.getClass(), "implementedInterfaces", null);
        setField(term149875, term149875.getClass(), "parameters", null);
        setField(term149875, term149875.getClass(), "thrownTypes", null);
        setField(term149875, term149875.getClass(), "templateTypeName", null);
        setField(term149875, term149875.getClass(), "description", null);
        setField(term149875, term149875.getClass(), "deprecated", null);
        setField(term149875, term149875.getClass(), "license", null);
        setField(term149875, term149875.getClass(), "suppressions", null);
        setField(term149874, term149874.getClass(), "info", term149875);
        setField(term149874, term149874.getClass(), "documentation", null);
        setField(term149874, term149874.getClass(), "sourceName", null);
        setField(term149874, term149874.getClass(), "visibility", null);
        setIntField(term149874, term149874.getClass(), "bitset", 0);
        setField(term149874, term149874.getClass(), "type", null);
        setField(term149874, term149874.getClass(), "thisType", null);
        setBooleanField(term149874, term149874.getClass(), "includeDocumentation", false);
        setField(term149873, term149873.getClass(), "currentInfo", term149874);
        setBooleanField(term149873, term149873.getClass(), "populated", true);
        setBooleanField(term149873, term149873.getClass(), "parseDocumentation", false);
        setField(term149873, term149873.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordDeprecationReason", argTypes, term149647, args);
        assertTrue(recursiveEquals(term149647, term149873));
        assertTrue(recursiveEquals(retValue, true));
    }

};


