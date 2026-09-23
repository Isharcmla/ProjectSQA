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

public class JSDocInfoBuilder_recordEnumParameterType_881918703116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103892;
     Object term104066;
     Object term104170;
     Object term104173;

    public JSDocInfoBuilder_recordEnumParameterType_881918703116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103892 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term103972 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term103972, term103972.getClass(), "bitset", 0);
        setField(term103892, term103892.getClass(), "currentInfo", term103972);
        term104066 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term104170 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104171 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term104172 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term104171, term104171.getClass(), "info", null);
        setField(term104171, term104171.getClass(), "documentation", null);
        setField(term104171, term104171.getClass(), "sourceName", null);
        setField(term104171, term104171.getClass(), "visibility", null);
        setIntField(term104171, term104171.getClass(), "bitset", 1610612736);
        setField(term104172, term104172.getClass(), "root", null);
        setField(term104172, term104172.getClass(), "sourceName", null);
        setField(term104172, term104172.getClass(), "registry", null);
        setField(term104171, term104171.getClass(), "type", term104172);
        setField(term104171, term104171.getClass(), "thisType", null);
        setBooleanField(term104171, term104171.getClass(), "includeDocumentation", false);
        setField(term104170, term104170.getClass(), "currentInfo", term104171);
        setBooleanField(term104170, term104170.getClass(), "populated", true);
        setBooleanField(term104170, term104170.getClass(), "parseDocumentation", false);
        setField(term104170, term104170.getClass(), "currentMarker", null);
        term104173 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term104173, term104173.getClass(), "root", null);
        setField(term104173, term104173.getClass(), "sourceName", null);
        setField(term104173, term104173.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term104066;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term103892, args);
        assertTrue(recursiveEquals(term103892, term104170));
        assertTrue(recursiveEquals(term104066, term104173));
        assertTrue(recursiveEquals(retValue, true));
    }

};


