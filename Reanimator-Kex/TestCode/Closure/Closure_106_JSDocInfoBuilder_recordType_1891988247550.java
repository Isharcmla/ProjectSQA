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

public class JSDocInfoBuilder_recordType_1891988247550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194840;
     Object term195138;
     Object term195436;
     Object term195439;

    public JSDocInfoBuilder_recordType_1891988247550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194840 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term194920 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term195044 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term194920, term194920.getClass(), "bitset", 1610612736);
        setField(term195044, term195044.getClass(), "parameters", null);
        setField(term195044, term195044.getClass(), "baseType", null);
        setField(term194920, term194920.getClass(), "info", term195044);
        setField(term194920, term194920.getClass(), "thisType", null);
        setField(term194840, term194840.getClass(), "currentInfo", term194920);
        term195138 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term195436 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term195437 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term195438 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term195438, term195438.getClass(), "baseType", null);
        setField(term195438, term195438.getClass(), "implementedInterfaces", null);
        setField(term195438, term195438.getClass(), "parameters", null);
        setField(term195438, term195438.getClass(), "thrownTypes", null);
        setField(term195438, term195438.getClass(), "templateTypeName", null);
        setField(term195438, term195438.getClass(), "description", null);
        setField(term195438, term195438.getClass(), "deprecated", null);
        setField(term195438, term195438.getClass(), "license", null);
        setField(term195438, term195438.getClass(), "suppressions", null);
        setField(term195437, term195437.getClass(), "info", term195438);
        setField(term195437, term195437.getClass(), "documentation", null);
        setField(term195437, term195437.getClass(), "sourceName", null);
        setField(term195437, term195437.getClass(), "visibility", null);
        setIntField(term195437, term195437.getClass(), "bitset", 1610612736);
        setField(term195437, term195437.getClass(), "type", null);
        setField(term195437, term195437.getClass(), "thisType", null);
        setBooleanField(term195437, term195437.getClass(), "includeDocumentation", false);
        setField(term195436, term195436.getClass(), "currentInfo", term195437);
        setBooleanField(term195436, term195436.getClass(), "populated", false);
        setBooleanField(term195436, term195436.getClass(), "parseDocumentation", false);
        setField(term195436, term195436.getClass(), "currentMarker", null);
        term195439 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term195439, term195439.getClass(), "root", null);
        setField(term195439, term195439.getClass(), "sourceName", null);
        setField(term195439, term195439.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term195138;
        Object retValue = callMethod(klass, "recordType", argTypes, term194840, args);
        assertTrue(recursiveEquals(term194840, term195436));
        assertTrue(recursiveEquals(term195138, term195439));
        assertTrue(recursiveEquals(retValue, false));
    }

};


