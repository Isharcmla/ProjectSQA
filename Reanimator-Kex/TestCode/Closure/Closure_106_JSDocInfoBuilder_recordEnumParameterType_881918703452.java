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

public class JSDocInfoBuilder_recordEnumParameterType_881918703452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168482;
     Object term168656;
     Object term168729;
     Object term168731;

    public JSDocInfoBuilder_recordEnumParameterType_881918703452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168482 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term168562 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term168562, term168562.getClass(), "bitset", -2147483648);
        setField(term168562, term168562.getClass(), "info", null);
        setField(term168562, term168562.getClass(), "thisType", null);
        setField(term168482, term168482.getClass(), "currentInfo", term168562);
        term168656 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term168729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term168730 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term168730, term168730.getClass(), "info", null);
        setField(term168730, term168730.getClass(), "documentation", null);
        setField(term168730, term168730.getClass(), "sourceName", null);
        setField(term168730, term168730.getClass(), "visibility", null);
        setIntField(term168730, term168730.getClass(), "bitset", -2147483648);
        setField(term168730, term168730.getClass(), "type", null);
        setField(term168730, term168730.getClass(), "thisType", null);
        setBooleanField(term168730, term168730.getClass(), "includeDocumentation", false);
        setField(term168729, term168729.getClass(), "currentInfo", term168730);
        setBooleanField(term168729, term168729.getClass(), "populated", false);
        setBooleanField(term168729, term168729.getClass(), "parseDocumentation", false);
        setField(term168729, term168729.getClass(), "currentMarker", null);
        term168731 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term168731, term168731.getClass(), "root", null);
        setField(term168731, term168731.getClass(), "sourceName", null);
        setField(term168731, term168731.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term168656;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term168482, args);
        assertTrue(recursiveEquals(term168482, term168729));
        assertTrue(recursiveEquals(term168656, term168731));
        assertTrue(recursiveEquals(retValue, false));
    }

};


