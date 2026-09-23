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

public class JSDocInfoBuilder_recordDefineType_1936429508512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182507;
     Object term182899;
     Object term183070;
     Object term183074;

    public JSDocInfoBuilder_recordDefineType_1936429508512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182507 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term182587 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term182711 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term182805 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term182587, term182587.getClass(), "bitset", 0);
        setField(term182711, term182711.getClass(), "parameters", null);
        setField(term182711, term182711.getClass(), "baseType", null);
        setField(term182587, term182587.getClass(), "info", term182711);
        setField(term182587, term182587.getClass(), "thisType", term182805);
        setField(term182507, term182507.getClass(), "currentInfo", term182587);
        term182899 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term183070 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term183071 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term183072 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term183073 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term183072, term183072.getClass(), "baseType", null);
        setField(term183072, term183072.getClass(), "implementedInterfaces", null);
        setField(term183072, term183072.getClass(), "parameters", null);
        setField(term183072, term183072.getClass(), "thrownTypes", null);
        setField(term183072, term183072.getClass(), "templateTypeName", null);
        setField(term183072, term183072.getClass(), "description", null);
        setField(term183072, term183072.getClass(), "deprecated", null);
        setField(term183072, term183072.getClass(), "license", null);
        setField(term183072, term183072.getClass(), "suppressions", null);
        setField(term183071, term183071.getClass(), "info", term183072);
        setField(term183071, term183071.getClass(), "documentation", null);
        setField(term183071, term183071.getClass(), "sourceName", null);
        setField(term183071, term183071.getClass(), "visibility", null);
        setIntField(term183071, term183071.getClass(), "bitset", 0);
        setField(term183071, term183071.getClass(), "type", null);
        setField(term183073, term183073.getClass(), "root", null);
        setField(term183073, term183073.getClass(), "sourceName", null);
        setField(term183073, term183073.getClass(), "registry", null);
        setField(term183071, term183071.getClass(), "thisType", term183073);
        setBooleanField(term183071, term183071.getClass(), "includeDocumentation", false);
        setField(term183070, term183070.getClass(), "currentInfo", term183071);
        setBooleanField(term183070, term183070.getClass(), "populated", false);
        setBooleanField(term183070, term183070.getClass(), "parseDocumentation", false);
        setField(term183070, term183070.getClass(), "currentMarker", null);
        term183074 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term183074, term183074.getClass(), "root", null);
        setField(term183074, term183074.getClass(), "sourceName", null);
        setField(term183074, term183074.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term182899;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term182507, args);
        assertTrue(recursiveEquals(term182507, term183070));
        assertTrue(recursiveEquals(term182899, term183074));
        assertTrue(recursiveEquals(retValue, false));
    }

};


