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

public class JSDocInfoBuilder_recordBaseType_1476256102199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116230;
     Object term116528;
     Object term116922;
     Object term116926;

    public JSDocInfoBuilder_recordBaseType_1476256102199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116230 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term116310 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term116434 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term116310, term116310.getClass(), "bitset", 0);
        setField(term116434, term116434.getClass(), "baseType", null);
        setField(term116310, term116310.getClass(), "info", term116434);
        setField(term116230, term116230.getClass(), "currentInfo", term116310);
        term116528 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term116922 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term116923 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term116924 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term116925 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term116925, term116925.getClass(), "root", null);
        setField(term116925, term116925.getClass(), "sourceName", null);
        setField(term116925, term116925.getClass(), "registry", null);
        setField(term116924, term116924.getClass(), "baseType", term116925);
        setField(term116924, term116924.getClass(), "implementedInterfaces", null);
        setField(term116924, term116924.getClass(), "parameters", null);
        setField(term116924, term116924.getClass(), "thrownTypes", null);
        setField(term116924, term116924.getClass(), "templateTypeName", null);
        setField(term116924, term116924.getClass(), "description", null);
        setField(term116924, term116924.getClass(), "deprecated", null);
        setField(term116924, term116924.getClass(), "license", null);
        setField(term116924, term116924.getClass(), "suppressions", null);
        setField(term116923, term116923.getClass(), "info", term116924);
        setField(term116923, term116923.getClass(), "documentation", null);
        setField(term116923, term116923.getClass(), "sourceName", null);
        setField(term116923, term116923.getClass(), "visibility", null);
        setIntField(term116923, term116923.getClass(), "bitset", 0);
        setField(term116923, term116923.getClass(), "type", null);
        setField(term116923, term116923.getClass(), "thisType", null);
        setBooleanField(term116923, term116923.getClass(), "includeDocumentation", false);
        setField(term116922, term116922.getClass(), "currentInfo", term116923);
        setBooleanField(term116922, term116922.getClass(), "populated", true);
        setBooleanField(term116922, term116922.getClass(), "parseDocumentation", false);
        setField(term116922, term116922.getClass(), "currentMarker", null);
        term116926 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term116926, term116926.getClass(), "root", null);
        setField(term116926, term116926.getClass(), "sourceName", null);
        setField(term116926, term116926.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term116528;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term116230, args);
        assertTrue(recursiveEquals(term116230, term116922));
        assertTrue(recursiveEquals(term116528, term116926));
        assertTrue(recursiveEquals(retValue, true));
    }

};


