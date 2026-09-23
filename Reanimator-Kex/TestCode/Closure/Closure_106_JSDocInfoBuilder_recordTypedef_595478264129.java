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

public class JSDocInfoBuilder_recordTypedef_595478264129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105484;
     Object term105882;
     Object term106189;
     Object term106193;

    public JSDocInfoBuilder_recordTypedef_595478264129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term105736 = new HashMap();
        term105484 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term105564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term105688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term105564, term105564.getClass(), "bitset", 1073741824);
        setField(term105688, term105688.getClass(), "parameters", term105736);
        setField(term105564, term105564.getClass(), "info", term105688);
        setField(term105484, term105484.getClass(), "currentInfo", term105564);
        term105882 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term106192 = new HashMap();
        term106189 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106190 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term106191 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term106191, term106191.getClass(), "baseType", null);
        setField(term106191, term106191.getClass(), "implementedInterfaces", null);
        setField(term106191, term106191.getClass(), "parameters", term106192);
        setField(term106191, term106191.getClass(), "thrownTypes", null);
        setField(term106191, term106191.getClass(), "templateTypeName", null);
        setField(term106191, term106191.getClass(), "description", null);
        setField(term106191, term106191.getClass(), "deprecated", null);
        setField(term106191, term106191.getClass(), "license", null);
        setField(term106191, term106191.getClass(), "suppressions", null);
        setField(term106190, term106190.getClass(), "info", term106191);
        setField(term106190, term106190.getClass(), "documentation", null);
        setField(term106190, term106190.getClass(), "sourceName", null);
        setField(term106190, term106190.getClass(), "visibility", null);
        setIntField(term106190, term106190.getClass(), "bitset", 1073741824);
        setField(term106190, term106190.getClass(), "type", null);
        setField(term106190, term106190.getClass(), "thisType", null);
        setBooleanField(term106190, term106190.getClass(), "includeDocumentation", false);
        setField(term106189, term106189.getClass(), "currentInfo", term106190);
        setBooleanField(term106189, term106189.getClass(), "populated", false);
        setBooleanField(term106189, term106189.getClass(), "parseDocumentation", false);
        setField(term106189, term106189.getClass(), "currentMarker", null);
        term106193 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term106193, term106193.getClass(), "root", null);
        setField(term106193, term106193.getClass(), "sourceName", null);
        setField(term106193, term106193.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term105882;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term105484, args);
        assertTrue(recursiveEquals(term105484, term106189));
        assertTrue(recursiveEquals(term105882, term106193));
        assertTrue(recursiveEquals(retValue, false));
    }

};


