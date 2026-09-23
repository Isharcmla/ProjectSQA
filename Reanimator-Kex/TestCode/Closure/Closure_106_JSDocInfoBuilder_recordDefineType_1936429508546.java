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

public class JSDocInfoBuilder_recordDefineType_1936429508546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193648;
     Object term193946;
     Object term194142;
     Object term194145;

    public JSDocInfoBuilder_recordDefineType_1936429508546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193648 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term193728 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term193852 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term193728, term193728.getClass(), "bitset", 536870912);
        setField(term193852, term193852.getClass(), "parameters", null);
        setField(term193852, term193852.getClass(), "baseType", null);
        setField(term193728, term193728.getClass(), "info", term193852);
        setField(term193728, term193728.getClass(), "thisType", null);
        setField(term193648, term193648.getClass(), "currentInfo", term193728);
        term193946 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term194142 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term194143 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term194144 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term194144, term194144.getClass(), "baseType", null);
        setField(term194144, term194144.getClass(), "implementedInterfaces", null);
        setField(term194144, term194144.getClass(), "parameters", null);
        setField(term194144, term194144.getClass(), "thrownTypes", null);
        setField(term194144, term194144.getClass(), "templateTypeName", null);
        setField(term194144, term194144.getClass(), "description", null);
        setField(term194144, term194144.getClass(), "deprecated", null);
        setField(term194144, term194144.getClass(), "license", null);
        setField(term194144, term194144.getClass(), "suppressions", null);
        setField(term194143, term194143.getClass(), "info", term194144);
        setField(term194143, term194143.getClass(), "documentation", null);
        setField(term194143, term194143.getClass(), "sourceName", null);
        setField(term194143, term194143.getClass(), "visibility", null);
        setIntField(term194143, term194143.getClass(), "bitset", 536870912);
        setField(term194143, term194143.getClass(), "type", null);
        setField(term194143, term194143.getClass(), "thisType", null);
        setBooleanField(term194143, term194143.getClass(), "includeDocumentation", false);
        setField(term194142, term194142.getClass(), "currentInfo", term194143);
        setBooleanField(term194142, term194142.getClass(), "populated", false);
        setBooleanField(term194142, term194142.getClass(), "parseDocumentation", false);
        setField(term194142, term194142.getClass(), "currentMarker", null);
        term194145 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term194145, term194145.getClass(), "root", null);
        setField(term194145, term194145.getClass(), "sourceName", null);
        setField(term194145, term194145.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term193946;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term193648, args);
        assertTrue(recursiveEquals(term193648, term194142));
        assertTrue(recursiveEquals(term193946, term194145));
        assertTrue(recursiveEquals(retValue, false));
    }

};


