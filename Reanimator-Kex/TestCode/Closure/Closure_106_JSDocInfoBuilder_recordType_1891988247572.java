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

public class JSDocInfoBuilder_recordType_1891988247572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201453;
     Object term201945;
     Object term202043;
     Object term202048;

    public JSDocInfoBuilder_recordType_1891988247572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term201705 = new HashMap();
        term201453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term201533 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term201657 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term201851 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term201533, term201533.getClass(), "bitset", 0);
        setField(term201657, term201657.getClass(), "parameters", term201705);
        setField(term201657, term201657.getClass(), "baseType", term201851);
        setField(term201533, term201533.getClass(), "info", term201657);
        setField(term201453, term201453.getClass(), "currentInfo", term201533);
        term201945 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term202047 = new HashMap();
        term202043 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term202044 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term202045 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term202046 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term202046, term202046.getClass(), "root", null);
        setField(term202046, term202046.getClass(), "sourceName", null);
        setField(term202046, term202046.getClass(), "registry", null);
        setField(term202045, term202045.getClass(), "baseType", term202046);
        setField(term202045, term202045.getClass(), "implementedInterfaces", null);
        setField(term202045, term202045.getClass(), "parameters", term202047);
        setField(term202045, term202045.getClass(), "thrownTypes", null);
        setField(term202045, term202045.getClass(), "templateTypeName", null);
        setField(term202045, term202045.getClass(), "description", null);
        setField(term202045, term202045.getClass(), "deprecated", null);
        setField(term202045, term202045.getClass(), "license", null);
        setField(term202045, term202045.getClass(), "suppressions", null);
        setField(term202044, term202044.getClass(), "info", term202045);
        setField(term202044, term202044.getClass(), "documentation", null);
        setField(term202044, term202044.getClass(), "sourceName", null);
        setField(term202044, term202044.getClass(), "visibility", null);
        setIntField(term202044, term202044.getClass(), "bitset", 0);
        setField(term202044, term202044.getClass(), "type", null);
        setField(term202044, term202044.getClass(), "thisType", null);
        setBooleanField(term202044, term202044.getClass(), "includeDocumentation", false);
        setField(term202043, term202043.getClass(), "currentInfo", term202044);
        setBooleanField(term202043, term202043.getClass(), "populated", false);
        setBooleanField(term202043, term202043.getClass(), "parseDocumentation", false);
        setField(term202043, term202043.getClass(), "currentMarker", null);
        term202048 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term202048, term202048.getClass(), "root", null);
        setField(term202048, term202048.getClass(), "sourceName", null);
        setField(term202048, term202048.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term201945;
        Object retValue = callMethod(klass, "recordType", argTypes, term201453, args);
        assertTrue(recursiveEquals(term201453, term202043));
        assertTrue(recursiveEquals(term201945, term202048));
        assertTrue(recursiveEquals(retValue, false));
    }

};


