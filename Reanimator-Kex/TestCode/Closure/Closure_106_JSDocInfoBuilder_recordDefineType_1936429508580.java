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

public class JSDocInfoBuilder_recordDefineType_1936429508580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204450;
     Object term204895;
     Object term205025;
     Object term205030;

    public JSDocInfoBuilder_recordDefineType_1936429508580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term204702 = new HashMap();
        term204450 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term204530 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term204654 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        term204895 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term204530, term204530.getClass(), "bitset", 0);
        setField(term204654, term204654.getClass(), "parameters", term204702);
        setField(term204654, term204654.getClass(), "baseType", term204895);
        setField(term204530, term204530.getClass(), "info", term204654);
        setField(term204450, term204450.getClass(), "currentInfo", term204530);
        HashMap term205029 = new HashMap();
        term205025 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term205026 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term205027 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term205028 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term205028, term205028.getClass(), "root", null);
        setField(term205028, term205028.getClass(), "sourceName", null);
        setField(term205028, term205028.getClass(), "registry", null);
        setField(term205027, term205027.getClass(), "baseType", term205028);
        setField(term205027, term205027.getClass(), "implementedInterfaces", null);
        setField(term205027, term205027.getClass(), "parameters", term205029);
        setField(term205027, term205027.getClass(), "thrownTypes", null);
        setField(term205027, term205027.getClass(), "templateTypeName", null);
        setField(term205027, term205027.getClass(), "description", null);
        setField(term205027, term205027.getClass(), "deprecated", null);
        setField(term205027, term205027.getClass(), "license", null);
        setField(term205027, term205027.getClass(), "suppressions", null);
        setField(term205026, term205026.getClass(), "info", term205027);
        setField(term205026, term205026.getClass(), "documentation", null);
        setField(term205026, term205026.getClass(), "sourceName", null);
        setField(term205026, term205026.getClass(), "visibility", null);
        setIntField(term205026, term205026.getClass(), "bitset", 0);
        setField(term205026, term205026.getClass(), "type", null);
        setField(term205026, term205026.getClass(), "thisType", null);
        setBooleanField(term205026, term205026.getClass(), "includeDocumentation", false);
        setField(term205025, term205025.getClass(), "currentInfo", term205026);
        setBooleanField(term205025, term205025.getClass(), "populated", false);
        setBooleanField(term205025, term205025.getClass(), "parseDocumentation", false);
        setField(term205025, term205025.getClass(), "currentMarker", null);
        term205030 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term205030, term205030.getClass(), "root", null);
        setField(term205030, term205030.getClass(), "sourceName", null);
        setField(term205030, term205030.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term204895;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term204450, args);
        assertTrue(recursiveEquals(term204450, term205025));
        assertTrue(recursiveEquals(term204895, term205030));
        assertTrue(recursiveEquals(retValue, false));
    }

};


