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

public class JSDocInfoBuilder_recordTypedef_595478264358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146022;
     Object term146420;
     Object term146562;
     Object term146566;

    public JSDocInfoBuilder_recordTypedef_595478264358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term146274 = new HashMap();
        term146022 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term146102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term146226 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term146102, term146102.getClass(), "bitset", 1610612736);
        setField(term146226, term146226.getClass(), "parameters", term146274);
        setField(term146226, term146226.getClass(), "baseType", null);
        setField(term146102, term146102.getClass(), "info", term146226);
        setField(term146102, term146102.getClass(), "thisType", null);
        setField(term146022, term146022.getClass(), "currentInfo", term146102);
        term146420 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term146565 = new HashMap();
        term146562 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term146563 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term146564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term146564, term146564.getClass(), "baseType", null);
        setField(term146564, term146564.getClass(), "implementedInterfaces", null);
        setField(term146564, term146564.getClass(), "parameters", term146565);
        setField(term146564, term146564.getClass(), "thrownTypes", null);
        setField(term146564, term146564.getClass(), "templateTypeName", null);
        setField(term146564, term146564.getClass(), "description", null);
        setField(term146564, term146564.getClass(), "deprecated", null);
        setField(term146564, term146564.getClass(), "license", null);
        setField(term146564, term146564.getClass(), "suppressions", null);
        setField(term146563, term146563.getClass(), "info", term146564);
        setField(term146563, term146563.getClass(), "documentation", null);
        setField(term146563, term146563.getClass(), "sourceName", null);
        setField(term146563, term146563.getClass(), "visibility", null);
        setIntField(term146563, term146563.getClass(), "bitset", 1610612736);
        setField(term146563, term146563.getClass(), "type", null);
        setField(term146563, term146563.getClass(), "thisType", null);
        setBooleanField(term146563, term146563.getClass(), "includeDocumentation", false);
        setField(term146562, term146562.getClass(), "currentInfo", term146563);
        setBooleanField(term146562, term146562.getClass(), "populated", false);
        setBooleanField(term146562, term146562.getClass(), "parseDocumentation", false);
        setField(term146562, term146562.getClass(), "currentMarker", null);
        term146566 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term146566, term146566.getClass(), "root", null);
        setField(term146566, term146566.getClass(), "sourceName", null);
        setField(term146566, term146566.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term146420;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term146022, args);
        assertTrue(recursiveEquals(term146022, term146562));
        assertTrue(recursiveEquals(term146420, term146566));
        assertTrue(recursiveEquals(retValue, false));
    }

};


