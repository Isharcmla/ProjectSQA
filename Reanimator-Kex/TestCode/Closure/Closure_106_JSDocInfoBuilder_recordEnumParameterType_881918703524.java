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

public class JSDocInfoBuilder_recordEnumParameterType_881918703524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186226;
     Object term186718;
     Object term186846;
     Object term186851;

    public JSDocInfoBuilder_recordEnumParameterType_881918703524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term186478 = new HashMap();
        term186226 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term186306 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term186430 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term186624 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term186306, term186306.getClass(), "bitset", 0);
        setField(term186430, term186430.getClass(), "parameters", term186478);
        setField(term186430, term186430.getClass(), "baseType", null);
        setField(term186306, term186306.getClass(), "info", term186430);
        setField(term186306, term186306.getClass(), "thisType", term186624);
        setField(term186226, term186226.getClass(), "currentInfo", term186306);
        term186718 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term186849 = new HashMap();
        term186846 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term186847 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term186848 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term186850 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term186848, term186848.getClass(), "baseType", null);
        setField(term186848, term186848.getClass(), "implementedInterfaces", null);
        setField(term186848, term186848.getClass(), "parameters", term186849);
        setField(term186848, term186848.getClass(), "thrownTypes", null);
        setField(term186848, term186848.getClass(), "templateTypeName", null);
        setField(term186848, term186848.getClass(), "description", null);
        setField(term186848, term186848.getClass(), "deprecated", null);
        setField(term186848, term186848.getClass(), "license", null);
        setField(term186848, term186848.getClass(), "suppressions", null);
        setField(term186847, term186847.getClass(), "info", term186848);
        setField(term186847, term186847.getClass(), "documentation", null);
        setField(term186847, term186847.getClass(), "sourceName", null);
        setField(term186847, term186847.getClass(), "visibility", null);
        setIntField(term186847, term186847.getClass(), "bitset", 0);
        setField(term186847, term186847.getClass(), "type", null);
        setField(term186850, term186850.getClass(), "root", null);
        setField(term186850, term186850.getClass(), "sourceName", null);
        setField(term186850, term186850.getClass(), "registry", null);
        setField(term186847, term186847.getClass(), "thisType", term186850);
        setBooleanField(term186847, term186847.getClass(), "includeDocumentation", false);
        setField(term186846, term186846.getClass(), "currentInfo", term186847);
        setBooleanField(term186846, term186846.getClass(), "populated", false);
        setBooleanField(term186846, term186846.getClass(), "parseDocumentation", false);
        setField(term186846, term186846.getClass(), "currentMarker", null);
        term186851 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term186851, term186851.getClass(), "root", null);
        setField(term186851, term186851.getClass(), "sourceName", null);
        setField(term186851, term186851.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term186718;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term186226, args);
        assertTrue(recursiveEquals(term186226, term186846));
        assertTrue(recursiveEquals(term186718, term186851));
        assertTrue(recursiveEquals(retValue, false));
    }

};


