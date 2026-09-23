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

public class JSDocInfoBuilder_recordType_1891988247564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199035;
     Object term199433;
     Object term199506;
     Object term199510;

    public JSDocInfoBuilder_recordType_1891988247564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term199287 = new HashMap();
        term199035 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term199115 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term199239 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term199115, term199115.getClass(), "bitset", 1073741824);
        setField(term199239, term199239.getClass(), "parameters", term199287);
        setField(term199115, term199115.getClass(), "info", term199239);
        setField(term199035, term199035.getClass(), "currentInfo", term199115);
        term199433 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term199509 = new HashMap();
        term199506 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term199507 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term199508 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term199508, term199508.getClass(), "baseType", null);
        setField(term199508, term199508.getClass(), "implementedInterfaces", null);
        setField(term199508, term199508.getClass(), "parameters", term199509);
        setField(term199508, term199508.getClass(), "thrownTypes", null);
        setField(term199508, term199508.getClass(), "templateTypeName", null);
        setField(term199508, term199508.getClass(), "description", null);
        setField(term199508, term199508.getClass(), "deprecated", null);
        setField(term199508, term199508.getClass(), "license", null);
        setField(term199508, term199508.getClass(), "suppressions", null);
        setField(term199507, term199507.getClass(), "info", term199508);
        setField(term199507, term199507.getClass(), "documentation", null);
        setField(term199507, term199507.getClass(), "sourceName", null);
        setField(term199507, term199507.getClass(), "visibility", null);
        setIntField(term199507, term199507.getClass(), "bitset", 1073741824);
        setField(term199507, term199507.getClass(), "type", null);
        setField(term199507, term199507.getClass(), "thisType", null);
        setBooleanField(term199507, term199507.getClass(), "includeDocumentation", false);
        setField(term199506, term199506.getClass(), "currentInfo", term199507);
        setBooleanField(term199506, term199506.getClass(), "populated", false);
        setBooleanField(term199506, term199506.getClass(), "parseDocumentation", false);
        setField(term199506, term199506.getClass(), "currentMarker", null);
        term199510 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term199510, term199510.getClass(), "root", null);
        setField(term199510, term199510.getClass(), "sourceName", null);
        setField(term199510, term199510.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term199433;
        Object retValue = callMethod(klass, "recordType", argTypes, term199035, args);
        assertTrue(recursiveEquals(term199035, term199506));
        assertTrue(recursiveEquals(term199433, term199510));
        assertTrue(recursiveEquals(retValue, false));
    }

};


