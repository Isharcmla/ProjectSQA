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

public class JSDocInfoBuilder_recordType_1891988247264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127217;
     Object term127391;
     Object term127488;
     Object term127490;

    public JSDocInfoBuilder_recordType_1891988247264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127217 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127297 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term127297, term127297.getClass(), "bitset", 1610612736);
        setField(term127297, term127297.getClass(), "info", null);
        setField(term127297, term127297.getClass(), "thisType", null);
        setField(term127217, term127217.getClass(), "currentInfo", term127297);
        term127391 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term127488 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127489 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term127489, term127489.getClass(), "info", null);
        setField(term127489, term127489.getClass(), "documentation", null);
        setField(term127489, term127489.getClass(), "sourceName", null);
        setField(term127489, term127489.getClass(), "visibility", null);
        setIntField(term127489, term127489.getClass(), "bitset", 1610612736);
        setField(term127489, term127489.getClass(), "type", null);
        setField(term127489, term127489.getClass(), "thisType", null);
        setBooleanField(term127489, term127489.getClass(), "includeDocumentation", false);
        setField(term127488, term127488.getClass(), "currentInfo", term127489);
        setBooleanField(term127488, term127488.getClass(), "populated", false);
        setBooleanField(term127488, term127488.getClass(), "parseDocumentation", false);
        setField(term127488, term127488.getClass(), "currentMarker", null);
        term127490 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term127490, term127490.getClass(), "root", null);
        setField(term127490, term127490.getClass(), "sourceName", null);
        setField(term127490, term127490.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term127391;
        Object retValue = callMethod(klass, "recordType", argTypes, term127217, args);
        assertTrue(recursiveEquals(term127217, term127488));
        assertTrue(recursiveEquals(term127391, term127490));
        assertTrue(recursiveEquals(retValue, false));
    }

};


