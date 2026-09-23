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

public class JSDocInfoBuilder_recordEnumParameterType_881918703443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166093;
     Object term166485;
     Object term166649;
     Object term166653;

    public JSDocInfoBuilder_recordEnumParameterType_881918703443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term166173 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term166297 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term166391 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term166173, term166173.getClass(), "bitset", 0);
        setField(term166297, term166297.getClass(), "parameters", null);
        setField(term166297, term166297.getClass(), "baseType", term166391);
        setField(term166173, term166173.getClass(), "info", term166297);
        setField(term166093, term166093.getClass(), "currentInfo", term166173);
        term166485 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term166649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term166650 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term166651 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term166652 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term166652, term166652.getClass(), "root", null);
        setField(term166652, term166652.getClass(), "sourceName", null);
        setField(term166652, term166652.getClass(), "registry", null);
        setField(term166651, term166651.getClass(), "baseType", term166652);
        setField(term166651, term166651.getClass(), "implementedInterfaces", null);
        setField(term166651, term166651.getClass(), "parameters", null);
        setField(term166651, term166651.getClass(), "thrownTypes", null);
        setField(term166651, term166651.getClass(), "templateTypeName", null);
        setField(term166651, term166651.getClass(), "description", null);
        setField(term166651, term166651.getClass(), "deprecated", null);
        setField(term166651, term166651.getClass(), "license", null);
        setField(term166651, term166651.getClass(), "suppressions", null);
        setField(term166650, term166650.getClass(), "info", term166651);
        setField(term166650, term166650.getClass(), "documentation", null);
        setField(term166650, term166650.getClass(), "sourceName", null);
        setField(term166650, term166650.getClass(), "visibility", null);
        setIntField(term166650, term166650.getClass(), "bitset", 0);
        setField(term166650, term166650.getClass(), "type", null);
        setField(term166650, term166650.getClass(), "thisType", null);
        setBooleanField(term166650, term166650.getClass(), "includeDocumentation", false);
        setField(term166649, term166649.getClass(), "currentInfo", term166650);
        setBooleanField(term166649, term166649.getClass(), "populated", false);
        setBooleanField(term166649, term166649.getClass(), "parseDocumentation", false);
        setField(term166649, term166649.getClass(), "currentMarker", null);
        term166653 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term166653, term166653.getClass(), "root", null);
        setField(term166653, term166653.getClass(), "sourceName", null);
        setField(term166653, term166653.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term166485;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term166093, args);
        assertTrue(recursiveEquals(term166093, term166649));
        assertTrue(recursiveEquals(term166485, term166653));
        assertTrue(recursiveEquals(retValue, false));
    }

};


