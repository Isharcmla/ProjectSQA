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

public class JSDocInfoBuilder_recordType_1891988247503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179811;
     Object term180303;
     Object term180983;
     Object term180988;

    public JSDocInfoBuilder_recordType_1891988247503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term180063 = new HashMap();
        term179811 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term179891 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term180015 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term180209 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term179891, term179891.getClass(), "bitset", 0);
        setField(term180015, term180015.getClass(), "parameters", term180063);
        setField(term180015, term180015.getClass(), "baseType", null);
        setField(term179891, term179891.getClass(), "info", term180015);
        setField(term179891, term179891.getClass(), "thisType", term180209);
        setField(term179811, term179811.getClass(), "currentInfo", term179891);
        term180303 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term180986 = new HashMap();
        term180983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term180984 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term180985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term180987 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term180985, term180985.getClass(), "baseType", null);
        setField(term180985, term180985.getClass(), "implementedInterfaces", null);
        setField(term180985, term180985.getClass(), "parameters", term180986);
        setField(term180985, term180985.getClass(), "thrownTypes", null);
        setField(term180985, term180985.getClass(), "templateTypeName", null);
        setField(term180985, term180985.getClass(), "description", null);
        setField(term180985, term180985.getClass(), "deprecated", null);
        setField(term180985, term180985.getClass(), "license", null);
        setField(term180985, term180985.getClass(), "suppressions", null);
        setField(term180984, term180984.getClass(), "info", term180985);
        setField(term180984, term180984.getClass(), "documentation", null);
        setField(term180984, term180984.getClass(), "sourceName", null);
        setField(term180984, term180984.getClass(), "visibility", null);
        setIntField(term180984, term180984.getClass(), "bitset", 0);
        setField(term180984, term180984.getClass(), "type", null);
        setField(term180987, term180987.getClass(), "root", null);
        setField(term180987, term180987.getClass(), "sourceName", null);
        setField(term180987, term180987.getClass(), "registry", null);
        setField(term180984, term180984.getClass(), "thisType", term180987);
        setBooleanField(term180984, term180984.getClass(), "includeDocumentation", false);
        setField(term180983, term180983.getClass(), "currentInfo", term180984);
        setBooleanField(term180983, term180983.getClass(), "populated", false);
        setBooleanField(term180983, term180983.getClass(), "parseDocumentation", false);
        setField(term180983, term180983.getClass(), "currentMarker", null);
        term180988 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term180988, term180988.getClass(), "root", null);
        setField(term180988, term180988.getClass(), "sourceName", null);
        setField(term180988, term180988.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term180303;
        Object retValue = callMethod(klass, "recordType", argTypes, term179811, args);
        assertTrue(recursiveEquals(term179811, term180983));
        assertTrue(recursiveEquals(term180303, term180988));
        assertTrue(recursiveEquals(retValue, false));
    }

};


