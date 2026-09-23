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

public class JSDocInfoBuilder_recordReturnType_1443313287523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185794;
     Object term186062;
     Object term186737;
     Object term186740;

    public JSDocInfoBuilder_recordReturnType_1443313287523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185794 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term185874 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term185968 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term185874, term185874.getClass(), "bitset", 1073741824);
        setField(term185874, term185874.getClass(), "type", term185968);
        setField(term185794, term185794.getClass(), "currentInfo", term185874);
        term186062 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term186737 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term186738 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term186739 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term186738, term186738.getClass(), "info", null);
        setField(term186738, term186738.getClass(), "documentation", null);
        setField(term186738, term186738.getClass(), "sourceName", null);
        setField(term186738, term186738.getClass(), "visibility", null);
        setIntField(term186738, term186738.getClass(), "bitset", 1073741824);
        setField(term186739, term186739.getClass(), "root", null);
        setField(term186739, term186739.getClass(), "sourceName", null);
        setField(term186739, term186739.getClass(), "registry", null);
        setField(term186738, term186738.getClass(), "type", term186739);
        setField(term186738, term186738.getClass(), "thisType", null);
        setBooleanField(term186738, term186738.getClass(), "includeDocumentation", false);
        setField(term186737, term186737.getClass(), "currentInfo", term186738);
        setBooleanField(term186737, term186737.getClass(), "populated", false);
        setBooleanField(term186737, term186737.getClass(), "parseDocumentation", false);
        setField(term186737, term186737.getClass(), "currentMarker", null);
        term186740 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term186740, term186740.getClass(), "root", null);
        setField(term186740, term186740.getClass(), "sourceName", null);
        setField(term186740, term186740.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term186062;
        Object retValue = callMethod(klass, "recordReturnType", argTypes, term185794, args);
        assertTrue(recursiveEquals(term185794, term186737));
        assertTrue(recursiveEquals(term186062, term186740));
        assertTrue(recursiveEquals(retValue, false));
    }

};


