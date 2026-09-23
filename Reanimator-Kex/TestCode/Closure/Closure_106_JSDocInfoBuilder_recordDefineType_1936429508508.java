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

public class JSDocInfoBuilder_recordDefineType_1936429508508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181539;
     Object term181837;
     Object term181955;
     Object term181958;

    public JSDocInfoBuilder_recordDefineType_1936429508508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181539 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term181619 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term181743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term181619, term181619.getClass(), "bitset", 1610612736);
        setField(term181743, term181743.getClass(), "parameters", null);
        setField(term181743, term181743.getClass(), "baseType", null);
        setField(term181619, term181619.getClass(), "info", term181743);
        setField(term181619, term181619.getClass(), "thisType", null);
        setField(term181539, term181539.getClass(), "currentInfo", term181619);
        term181837 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term181955 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term181956 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term181957 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term181957, term181957.getClass(), "baseType", null);
        setField(term181957, term181957.getClass(), "implementedInterfaces", null);
        setField(term181957, term181957.getClass(), "parameters", null);
        setField(term181957, term181957.getClass(), "thrownTypes", null);
        setField(term181957, term181957.getClass(), "templateTypeName", null);
        setField(term181957, term181957.getClass(), "description", null);
        setField(term181957, term181957.getClass(), "deprecated", null);
        setField(term181957, term181957.getClass(), "license", null);
        setField(term181957, term181957.getClass(), "suppressions", null);
        setField(term181956, term181956.getClass(), "info", term181957);
        setField(term181956, term181956.getClass(), "documentation", null);
        setField(term181956, term181956.getClass(), "sourceName", null);
        setField(term181956, term181956.getClass(), "visibility", null);
        setIntField(term181956, term181956.getClass(), "bitset", 1610612736);
        setField(term181956, term181956.getClass(), "type", null);
        setField(term181956, term181956.getClass(), "thisType", null);
        setBooleanField(term181956, term181956.getClass(), "includeDocumentation", false);
        setField(term181955, term181955.getClass(), "currentInfo", term181956);
        setBooleanField(term181955, term181955.getClass(), "populated", false);
        setBooleanField(term181955, term181955.getClass(), "parseDocumentation", false);
        setField(term181955, term181955.getClass(), "currentMarker", null);
        term181958 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term181958, term181958.getClass(), "root", null);
        setField(term181958, term181958.getClass(), "sourceName", null);
        setField(term181958, term181958.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term181837;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term181539, args);
        assertTrue(recursiveEquals(term181539, term181955));
        assertTrue(recursiveEquals(term181837, term181958));
        assertTrue(recursiveEquals(retValue, false));
    }

};


