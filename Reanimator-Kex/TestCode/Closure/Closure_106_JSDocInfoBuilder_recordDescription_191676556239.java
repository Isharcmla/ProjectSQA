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

public class JSDocInfoBuilder_recordDescription_191676556239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122578;
     Object term123062;

    public JSDocInfoBuilder_recordDescription_191676556239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122578 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122658 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term122658, term122658.getClass(), "info", null);
        setField(term122578, term122578.getClass(), "currentInfo", term122658);
        term123062 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term123063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term123064 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term123064, term123064.getClass(), "baseType", null);
        setField(term123064, term123064.getClass(), "implementedInterfaces", null);
        setField(term123064, term123064.getClass(), "parameters", null);
        setField(term123064, term123064.getClass(), "thrownTypes", null);
        setField(term123064, term123064.getClass(), "templateTypeName", null);
        setField(term123064, term123064.getClass(), "description", "");
        setField(term123064, term123064.getClass(), "deprecated", null);
        setField(term123064, term123064.getClass(), "license", null);
        setField(term123064, term123064.getClass(), "suppressions", null);
        setField(term123063, term123063.getClass(), "info", term123064);
        setField(term123063, term123063.getClass(), "documentation", null);
        setField(term123063, term123063.getClass(), "sourceName", null);
        setField(term123063, term123063.getClass(), "visibility", null);
        setIntField(term123063, term123063.getClass(), "bitset", 0);
        setField(term123063, term123063.getClass(), "type", null);
        setField(term123063, term123063.getClass(), "thisType", null);
        setBooleanField(term123063, term123063.getClass(), "includeDocumentation", false);
        setField(term123062, term123062.getClass(), "currentInfo", term123063);
        setBooleanField(term123062, term123062.getClass(), "populated", true);
        setBooleanField(term123062, term123062.getClass(), "parseDocumentation", false);
        setField(term123062, term123062.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "recordDescription", argTypes, term122578, args);
        assertTrue(recursiveEquals(term122578, term123062));
        assertTrue(recursiveEquals(retValue, true));
    }

};


