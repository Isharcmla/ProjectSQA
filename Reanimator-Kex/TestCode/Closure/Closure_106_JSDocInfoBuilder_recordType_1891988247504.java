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

public class JSDocInfoBuilder_recordType_1891988247504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180480;
     Object term180878;
     Object term181117;
     Object term181121;

    public JSDocInfoBuilder_recordType_1891988247504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term180732 = new HashMap();
        term180480 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term180560 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term180684 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term180560, term180560.getClass(), "bitset", -2147483648);
        setField(term180684, term180684.getClass(), "parameters", term180732);
        setField(term180684, term180684.getClass(), "baseType", null);
        setField(term180560, term180560.getClass(), "info", term180684);
        setField(term180560, term180560.getClass(), "thisType", null);
        setField(term180480, term180480.getClass(), "currentInfo", term180560);
        term180878 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term181120 = new HashMap();
        term181117 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term181118 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term181119 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term181119, term181119.getClass(), "baseType", null);
        setField(term181119, term181119.getClass(), "implementedInterfaces", null);
        setField(term181119, term181119.getClass(), "parameters", term181120);
        setField(term181119, term181119.getClass(), "thrownTypes", null);
        setField(term181119, term181119.getClass(), "templateTypeName", null);
        setField(term181119, term181119.getClass(), "description", null);
        setField(term181119, term181119.getClass(), "deprecated", null);
        setField(term181119, term181119.getClass(), "license", null);
        setField(term181119, term181119.getClass(), "suppressions", null);
        setField(term181118, term181118.getClass(), "info", term181119);
        setField(term181118, term181118.getClass(), "documentation", null);
        setField(term181118, term181118.getClass(), "sourceName", null);
        setField(term181118, term181118.getClass(), "visibility", null);
        setIntField(term181118, term181118.getClass(), "bitset", -2147483648);
        setField(term181118, term181118.getClass(), "type", null);
        setField(term181118, term181118.getClass(), "thisType", null);
        setBooleanField(term181118, term181118.getClass(), "includeDocumentation", false);
        setField(term181117, term181117.getClass(), "currentInfo", term181118);
        setBooleanField(term181117, term181117.getClass(), "populated", false);
        setBooleanField(term181117, term181117.getClass(), "parseDocumentation", false);
        setField(term181117, term181117.getClass(), "currentMarker", null);
        term181121 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term181121, term181121.getClass(), "root", null);
        setField(term181121, term181121.getClass(), "sourceName", null);
        setField(term181121, term181121.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term180878;
        Object retValue = callMethod(klass, "recordType", argTypes, term180480, args);
        assertTrue(recursiveEquals(term180480, term181117));
        assertTrue(recursiveEquals(term180878, term181121));
        assertTrue(recursiveEquals(retValue, false));
    }

};


