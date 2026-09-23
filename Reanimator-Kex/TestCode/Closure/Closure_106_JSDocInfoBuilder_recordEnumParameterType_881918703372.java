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

public class JSDocInfoBuilder_recordEnumParameterType_881918703372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149183;
     Object term149481;
     Object term149529;
     Object term149532;

    public JSDocInfoBuilder_recordEnumParameterType_881918703372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149183 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term149263 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term149387 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term149263, term149263.getClass(), "bitset", 1073741824);
        setField(term149387, term149387.getClass(), "parameters", null);
        setField(term149263, term149263.getClass(), "info", term149387);
        setField(term149183, term149183.getClass(), "currentInfo", term149263);
        term149481 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term149529 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term149530 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term149531 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term149531, term149531.getClass(), "baseType", null);
        setField(term149531, term149531.getClass(), "implementedInterfaces", null);
        setField(term149531, term149531.getClass(), "parameters", null);
        setField(term149531, term149531.getClass(), "thrownTypes", null);
        setField(term149531, term149531.getClass(), "templateTypeName", null);
        setField(term149531, term149531.getClass(), "description", null);
        setField(term149531, term149531.getClass(), "deprecated", null);
        setField(term149531, term149531.getClass(), "license", null);
        setField(term149531, term149531.getClass(), "suppressions", null);
        setField(term149530, term149530.getClass(), "info", term149531);
        setField(term149530, term149530.getClass(), "documentation", null);
        setField(term149530, term149530.getClass(), "sourceName", null);
        setField(term149530, term149530.getClass(), "visibility", null);
        setIntField(term149530, term149530.getClass(), "bitset", 1073741824);
        setField(term149530, term149530.getClass(), "type", null);
        setField(term149530, term149530.getClass(), "thisType", null);
        setBooleanField(term149530, term149530.getClass(), "includeDocumentation", false);
        setField(term149529, term149529.getClass(), "currentInfo", term149530);
        setBooleanField(term149529, term149529.getClass(), "populated", false);
        setBooleanField(term149529, term149529.getClass(), "parseDocumentation", false);
        setField(term149529, term149529.getClass(), "currentMarker", null);
        term149532 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term149532, term149532.getClass(), "root", null);
        setField(term149532, term149532.getClass(), "sourceName", null);
        setField(term149532, term149532.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term149481;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term149183, args);
        assertTrue(recursiveEquals(term149183, term149529));
        assertTrue(recursiveEquals(term149481, term149532));
        assertTrue(recursiveEquals(retValue, false));
    }

};


