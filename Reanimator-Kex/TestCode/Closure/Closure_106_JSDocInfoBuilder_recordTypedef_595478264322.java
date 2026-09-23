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

public class JSDocInfoBuilder_recordTypedef_595478264322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137823;
     Object term138315;
     Object term138428;
     Object term138433;

    public JSDocInfoBuilder_recordTypedef_595478264322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term138075 = new HashMap();
        term137823 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term137903 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term138027 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term138221 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term137903, term137903.getClass(), "bitset", 0);
        setField(term138027, term138027.getClass(), "parameters", term138075);
        setField(term138027, term138027.getClass(), "baseType", null);
        setField(term137903, term137903.getClass(), "info", term138027);
        setField(term137903, term137903.getClass(), "thisType", term138221);
        setField(term137823, term137823.getClass(), "currentInfo", term137903);
        term138315 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term138431 = new HashMap();
        term138428 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term138429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term138430 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term138432 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term138430, term138430.getClass(), "baseType", null);
        setField(term138430, term138430.getClass(), "implementedInterfaces", null);
        setField(term138430, term138430.getClass(), "parameters", term138431);
        setField(term138430, term138430.getClass(), "thrownTypes", null);
        setField(term138430, term138430.getClass(), "templateTypeName", null);
        setField(term138430, term138430.getClass(), "description", null);
        setField(term138430, term138430.getClass(), "deprecated", null);
        setField(term138430, term138430.getClass(), "license", null);
        setField(term138430, term138430.getClass(), "suppressions", null);
        setField(term138429, term138429.getClass(), "info", term138430);
        setField(term138429, term138429.getClass(), "documentation", null);
        setField(term138429, term138429.getClass(), "sourceName", null);
        setField(term138429, term138429.getClass(), "visibility", null);
        setIntField(term138429, term138429.getClass(), "bitset", 0);
        setField(term138429, term138429.getClass(), "type", null);
        setField(term138432, term138432.getClass(), "root", null);
        setField(term138432, term138432.getClass(), "sourceName", null);
        setField(term138432, term138432.getClass(), "registry", null);
        setField(term138429, term138429.getClass(), "thisType", term138432);
        setBooleanField(term138429, term138429.getClass(), "includeDocumentation", false);
        setField(term138428, term138428.getClass(), "currentInfo", term138429);
        setBooleanField(term138428, term138428.getClass(), "populated", false);
        setBooleanField(term138428, term138428.getClass(), "parseDocumentation", false);
        setField(term138428, term138428.getClass(), "currentMarker", null);
        term138433 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term138433, term138433.getClass(), "root", null);
        setField(term138433, term138433.getClass(), "sourceName", null);
        setField(term138433, term138433.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term138315;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term137823, args);
        assertTrue(recursiveEquals(term137823, term138428));
        assertTrue(recursiveEquals(term138315, term138433));
        assertTrue(recursiveEquals(retValue, false));
    }

};


