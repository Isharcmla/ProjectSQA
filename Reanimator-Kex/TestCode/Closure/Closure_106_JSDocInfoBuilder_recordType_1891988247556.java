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

public class JSDocInfoBuilder_recordType_1891988247556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196474;
     Object term196872;
     Object term197132;
     Object term197136;

    public JSDocInfoBuilder_recordType_1891988247556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term196726 = new HashMap();
        term196474 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term196554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term196678 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term196554, term196554.getClass(), "bitset", 1610612736);
        setField(term196678, term196678.getClass(), "parameters", term196726);
        setField(term196678, term196678.getClass(), "baseType", null);
        setField(term196554, term196554.getClass(), "info", term196678);
        setField(term196554, term196554.getClass(), "thisType", null);
        setField(term196474, term196474.getClass(), "currentInfo", term196554);
        term196872 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term197135 = new HashMap();
        term197132 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term197133 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term197134 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term197134, term197134.getClass(), "baseType", null);
        setField(term197134, term197134.getClass(), "implementedInterfaces", null);
        setField(term197134, term197134.getClass(), "parameters", term197135);
        setField(term197134, term197134.getClass(), "thrownTypes", null);
        setField(term197134, term197134.getClass(), "templateTypeName", null);
        setField(term197134, term197134.getClass(), "description", null);
        setField(term197134, term197134.getClass(), "deprecated", null);
        setField(term197134, term197134.getClass(), "license", null);
        setField(term197134, term197134.getClass(), "suppressions", null);
        setField(term197133, term197133.getClass(), "info", term197134);
        setField(term197133, term197133.getClass(), "documentation", null);
        setField(term197133, term197133.getClass(), "sourceName", null);
        setField(term197133, term197133.getClass(), "visibility", null);
        setIntField(term197133, term197133.getClass(), "bitset", 1610612736);
        setField(term197133, term197133.getClass(), "type", null);
        setField(term197133, term197133.getClass(), "thisType", null);
        setBooleanField(term197133, term197133.getClass(), "includeDocumentation", false);
        setField(term197132, term197132.getClass(), "currentInfo", term197133);
        setBooleanField(term197132, term197132.getClass(), "populated", false);
        setBooleanField(term197132, term197132.getClass(), "parseDocumentation", false);
        setField(term197132, term197132.getClass(), "currentMarker", null);
        term197136 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term197136, term197136.getClass(), "root", null);
        setField(term197136, term197136.getClass(), "sourceName", null);
        setField(term197136, term197136.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term196872;
        Object retValue = callMethod(klass, "recordType", argTypes, term196474, args);
        assertTrue(recursiveEquals(term196474, term197132));
        assertTrue(recursiveEquals(term196872, term197136));
        assertTrue(recursiveEquals(retValue, false));
    }

};


