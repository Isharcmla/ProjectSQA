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

public class JSDocInfoBuilder_recordReturnType_1443313287127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105157;
     Object term105331;
     Object term105916;
     Object term105918;

    public JSDocInfoBuilder_recordReturnType_1443313287127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105157 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term105237 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term105237, term105237.getClass(), "bitset", -2147483648);
        setField(term105157, term105157.getClass(), "currentInfo", term105237);
        term105331 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term105916 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term105917 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term105917, term105917.getClass(), "info", null);
        setField(term105917, term105917.getClass(), "documentation", null);
        setField(term105917, term105917.getClass(), "sourceName", null);
        setField(term105917, term105917.getClass(), "visibility", null);
        setIntField(term105917, term105917.getClass(), "bitset", -2147483648);
        setField(term105917, term105917.getClass(), "type", null);
        setField(term105917, term105917.getClass(), "thisType", null);
        setBooleanField(term105917, term105917.getClass(), "includeDocumentation", false);
        setField(term105916, term105916.getClass(), "currentInfo", term105917);
        setBooleanField(term105916, term105916.getClass(), "populated", false);
        setBooleanField(term105916, term105916.getClass(), "parseDocumentation", false);
        setField(term105916, term105916.getClass(), "currentMarker", null);
        term105918 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term105918, term105918.getClass(), "root", null);
        setField(term105918, term105918.getClass(), "sourceName", null);
        setField(term105918, term105918.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term105331;
        Object retValue = callMethod(klass, "recordReturnType", argTypes, term105157, args);
        assertTrue(recursiveEquals(term105157, term105916));
        assertTrue(recursiveEquals(term105331, term105918));
        assertTrue(recursiveEquals(retValue, false));
    }

};


