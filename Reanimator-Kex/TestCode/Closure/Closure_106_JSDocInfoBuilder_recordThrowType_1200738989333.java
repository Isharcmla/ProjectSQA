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

public class JSDocInfoBuilder_recordThrowType_1200738989333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140511;
     Object term141162;

    public JSDocInfoBuilder_recordThrowType_1200738989333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140511 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term140591 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term140591, term140591.getClass(), "bitset", 1610612736);
        setField(term140511, term140511.getClass(), "currentInfo", term140591);
        term141162 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term141163 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term141163, term141163.getClass(), "info", null);
        setField(term141163, term141163.getClass(), "documentation", null);
        setField(term141163, term141163.getClass(), "sourceName", null);
        setField(term141163, term141163.getClass(), "visibility", null);
        setIntField(term141163, term141163.getClass(), "bitset", 1610612736);
        setField(term141163, term141163.getClass(), "type", null);
        setField(term141163, term141163.getClass(), "thisType", null);
        setBooleanField(term141163, term141163.getClass(), "includeDocumentation", false);
        setField(term141162, term141162.getClass(), "currentInfo", term141163);
        setBooleanField(term141162, term141162.getClass(), "populated", false);
        setBooleanField(term141162, term141162.getClass(), "parseDocumentation", false);
        setField(term141162, term141162.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordThrowType", argTypes, term140511, args);
        assertTrue(recursiveEquals(term140511, term141162));
        assertTrue(recursiveEquals(retValue, false));
    }

};


