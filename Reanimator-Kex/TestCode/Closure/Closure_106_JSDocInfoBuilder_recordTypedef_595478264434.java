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

public class JSDocInfoBuilder_recordTypedef_595478264434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164524;
     Object term164822;
     Object term165031;
     Object term165034;

    public JSDocInfoBuilder_recordTypedef_595478264434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164524 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term164604 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term164728 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term164604, term164604.getClass(), "bitset", 536870912);
        setField(term164728, term164728.getClass(), "parameters", null);
        setField(term164728, term164728.getClass(), "baseType", null);
        setField(term164604, term164604.getClass(), "info", term164728);
        setField(term164604, term164604.getClass(), "thisType", null);
        setField(term164524, term164524.getClass(), "currentInfo", term164604);
        term164822 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term165031 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165032 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term165033 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term165033, term165033.getClass(), "baseType", null);
        setField(term165033, term165033.getClass(), "implementedInterfaces", null);
        setField(term165033, term165033.getClass(), "parameters", null);
        setField(term165033, term165033.getClass(), "thrownTypes", null);
        setField(term165033, term165033.getClass(), "templateTypeName", null);
        setField(term165033, term165033.getClass(), "description", null);
        setField(term165033, term165033.getClass(), "deprecated", null);
        setField(term165033, term165033.getClass(), "license", null);
        setField(term165033, term165033.getClass(), "suppressions", null);
        setField(term165032, term165032.getClass(), "info", term165033);
        setField(term165032, term165032.getClass(), "documentation", null);
        setField(term165032, term165032.getClass(), "sourceName", null);
        setField(term165032, term165032.getClass(), "visibility", null);
        setIntField(term165032, term165032.getClass(), "bitset", 536870912);
        setField(term165032, term165032.getClass(), "type", null);
        setField(term165032, term165032.getClass(), "thisType", null);
        setBooleanField(term165032, term165032.getClass(), "includeDocumentation", false);
        setField(term165031, term165031.getClass(), "currentInfo", term165032);
        setBooleanField(term165031, term165031.getClass(), "populated", false);
        setBooleanField(term165031, term165031.getClass(), "parseDocumentation", false);
        setField(term165031, term165031.getClass(), "currentMarker", null);
        term165034 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term165034, term165034.getClass(), "root", null);
        setField(term165034, term165034.getClass(), "sourceName", null);
        setField(term165034, term165034.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term164822;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term164524, args);
        assertTrue(recursiveEquals(term164524, term165031));
        assertTrue(recursiveEquals(term164822, term165034));
        assertTrue(recursiveEquals(retValue, false));
    }

};


