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

public class JSDocInfoBuilder_recordDefineType_1936429508500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179154;
     Object term179546;
     Object term179642;
     Object term179646;

    public JSDocInfoBuilder_recordDefineType_1936429508500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179154 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term179234 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term179358 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term179452 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term179234, term179234.getClass(), "bitset", 0);
        setField(term179358, term179358.getClass(), "parameters", null);
        setField(term179358, term179358.getClass(), "baseType", term179452);
        setField(term179234, term179234.getClass(), "info", term179358);
        setField(term179154, term179154.getClass(), "currentInfo", term179234);
        term179546 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term179642 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term179643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term179644 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term179645 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term179645, term179645.getClass(), "root", null);
        setField(term179645, term179645.getClass(), "sourceName", null);
        setField(term179645, term179645.getClass(), "registry", null);
        setField(term179644, term179644.getClass(), "baseType", term179645);
        setField(term179644, term179644.getClass(), "implementedInterfaces", null);
        setField(term179644, term179644.getClass(), "parameters", null);
        setField(term179644, term179644.getClass(), "thrownTypes", null);
        setField(term179644, term179644.getClass(), "templateTypeName", null);
        setField(term179644, term179644.getClass(), "description", null);
        setField(term179644, term179644.getClass(), "deprecated", null);
        setField(term179644, term179644.getClass(), "license", null);
        setField(term179644, term179644.getClass(), "suppressions", null);
        setField(term179643, term179643.getClass(), "info", term179644);
        setField(term179643, term179643.getClass(), "documentation", null);
        setField(term179643, term179643.getClass(), "sourceName", null);
        setField(term179643, term179643.getClass(), "visibility", null);
        setIntField(term179643, term179643.getClass(), "bitset", 0);
        setField(term179643, term179643.getClass(), "type", null);
        setField(term179643, term179643.getClass(), "thisType", null);
        setBooleanField(term179643, term179643.getClass(), "includeDocumentation", false);
        setField(term179642, term179642.getClass(), "currentInfo", term179643);
        setBooleanField(term179642, term179642.getClass(), "populated", false);
        setBooleanField(term179642, term179642.getClass(), "parseDocumentation", false);
        setField(term179642, term179642.getClass(), "currentMarker", null);
        term179646 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term179646, term179646.getClass(), "root", null);
        setField(term179646, term179646.getClass(), "sourceName", null);
        setField(term179646, term179646.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term179546;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term179154, args);
        assertTrue(recursiveEquals(term179154, term179642));
        assertTrue(recursiveEquals(term179546, term179646));
        assertTrue(recursiveEquals(retValue, false));
    }

};


