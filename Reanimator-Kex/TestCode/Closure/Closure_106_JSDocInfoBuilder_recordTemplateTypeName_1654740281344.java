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

public class JSDocInfoBuilder_recordTemplateTypeName_1654740281344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143865;
     Object term144086;

    public JSDocInfoBuilder_recordTemplateTypeName_1654740281344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143865 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term143945 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term144069 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term144069, term144069.getClass(), "templateTypeName", null);
        setField(term143945, term143945.getClass(), "info", term144069);
        setField(term143865, term143865.getClass(), "currentInfo", term143945);
        term144086 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term144087 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term144088 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term144088, term144088.getClass(), "baseType", null);
        setField(term144088, term144088.getClass(), "implementedInterfaces", null);
        setField(term144088, term144088.getClass(), "parameters", null);
        setField(term144088, term144088.getClass(), "thrownTypes", null);
        setField(term144088, term144088.getClass(), "templateTypeName", null);
        setField(term144088, term144088.getClass(), "description", null);
        setField(term144088, term144088.getClass(), "deprecated", null);
        setField(term144088, term144088.getClass(), "license", null);
        setField(term144088, term144088.getClass(), "suppressions", null);
        setField(term144087, term144087.getClass(), "info", term144088);
        setField(term144087, term144087.getClass(), "documentation", null);
        setField(term144087, term144087.getClass(), "sourceName", null);
        setField(term144087, term144087.getClass(), "visibility", null);
        setIntField(term144087, term144087.getClass(), "bitset", 0);
        setField(term144087, term144087.getClass(), "type", null);
        setField(term144087, term144087.getClass(), "thisType", null);
        setBooleanField(term144087, term144087.getClass(), "includeDocumentation", false);
        setField(term144086, term144086.getClass(), "currentInfo", term144087);
        setBooleanField(term144086, term144086.getClass(), "populated", true);
        setBooleanField(term144086, term144086.getClass(), "parseDocumentation", false);
        setField(term144086, term144086.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordTemplateTypeName", argTypes, term143865, args);
        assertTrue(recursiveEquals(term143865, term144086));
        assertTrue(recursiveEquals(retValue, true));
    }

};


