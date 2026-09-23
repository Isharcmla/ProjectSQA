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

public class JSDocInfoBuilder_recordBaseType_1476256102198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115918;
     Object term116092;
     Object term116865;
     Object term116867;

    public JSDocInfoBuilder_recordBaseType_1476256102198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115918 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115998 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115998, term115998.getClass(), "bitset", -2147483648);
        setField(term115918, term115918.getClass(), "currentInfo", term115998);
        term116092 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term116865 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term116866 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term116866, term116866.getClass(), "info", null);
        setField(term116866, term116866.getClass(), "documentation", null);
        setField(term116866, term116866.getClass(), "sourceName", null);
        setField(term116866, term116866.getClass(), "visibility", null);
        setIntField(term116866, term116866.getClass(), "bitset", -2147483648);
        setField(term116866, term116866.getClass(), "type", null);
        setField(term116866, term116866.getClass(), "thisType", null);
        setBooleanField(term116866, term116866.getClass(), "includeDocumentation", false);
        setField(term116865, term116865.getClass(), "currentInfo", term116866);
        setBooleanField(term116865, term116865.getClass(), "populated", false);
        setBooleanField(term116865, term116865.getClass(), "parseDocumentation", false);
        setField(term116865, term116865.getClass(), "currentMarker", null);
        term116867 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term116867, term116867.getClass(), "root", null);
        setField(term116867, term116867.getClass(), "sourceName", null);
        setField(term116867, term116867.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term116092;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term115918, args);
        assertTrue(recursiveEquals(term115918, term116865));
        assertTrue(recursiveEquals(term116092, term116867));
        assertTrue(recursiveEquals(retValue, false));
    }

};


