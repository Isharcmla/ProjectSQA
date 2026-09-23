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

public class JSDocInfoBuilder_recordReturnType_1443313287154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109357;
     Object term109531;
     Object term109557;
     Object term109559;

    public JSDocInfoBuilder_recordReturnType_1443313287154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109437 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term109437, term109437.getClass(), "bitset", 536870912);
        setField(term109357, term109357.getClass(), "currentInfo", term109437);
        term109531 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term109557 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term109558, term109558.getClass(), "info", null);
        setField(term109558, term109558.getClass(), "documentation", null);
        setField(term109558, term109558.getClass(), "sourceName", null);
        setField(term109558, term109558.getClass(), "visibility", null);
        setIntField(term109558, term109558.getClass(), "bitset", 536870912);
        setField(term109558, term109558.getClass(), "type", null);
        setField(term109558, term109558.getClass(), "thisType", null);
        setBooleanField(term109558, term109558.getClass(), "includeDocumentation", false);
        setField(term109557, term109557.getClass(), "currentInfo", term109558);
        setBooleanField(term109557, term109557.getClass(), "populated", false);
        setBooleanField(term109557, term109557.getClass(), "parseDocumentation", false);
        setField(term109557, term109557.getClass(), "currentMarker", null);
        term109559 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term109559, term109559.getClass(), "root", null);
        setField(term109559, term109559.getClass(), "sourceName", null);
        setField(term109559, term109559.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term109531;
        Object retValue = callMethod(klass, "recordReturnType", argTypes, term109357, args);
        assertTrue(recursiveEquals(term109357, term109557));
        assertTrue(recursiveEquals(term109531, term109559));
        assertTrue(recursiveEquals(retValue, false));
    }

};


