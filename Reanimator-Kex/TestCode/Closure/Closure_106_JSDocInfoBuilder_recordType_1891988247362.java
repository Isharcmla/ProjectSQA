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

public class JSDocInfoBuilder_recordType_1891988247362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146894;
     Object term147192;
     Object term147290;
     Object term147294;

    public JSDocInfoBuilder_recordType_1891988247362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146894 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term146974 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term147098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term146974, term146974.getClass(), "bitset", 0);
        setField(term146974, term146974.getClass(), "info", term147098);
        setField(term146894, term146894.getClass(), "currentInfo", term146974);
        term147192 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term147290 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term147291 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term147292 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term147293 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term147292, term147292.getClass(), "baseType", null);
        setField(term147292, term147292.getClass(), "implementedInterfaces", null);
        setField(term147292, term147292.getClass(), "parameters", null);
        setField(term147292, term147292.getClass(), "thrownTypes", null);
        setField(term147292, term147292.getClass(), "templateTypeName", null);
        setField(term147292, term147292.getClass(), "description", null);
        setField(term147292, term147292.getClass(), "deprecated", null);
        setField(term147292, term147292.getClass(), "license", null);
        setField(term147292, term147292.getClass(), "suppressions", null);
        setField(term147291, term147291.getClass(), "info", term147292);
        setField(term147291, term147291.getClass(), "documentation", null);
        setField(term147291, term147291.getClass(), "sourceName", null);
        setField(term147291, term147291.getClass(), "visibility", null);
        setIntField(term147291, term147291.getClass(), "bitset", 536870912);
        setField(term147293, term147293.getClass(), "root", null);
        setField(term147293, term147293.getClass(), "sourceName", null);
        setField(term147293, term147293.getClass(), "registry", null);
        setField(term147291, term147291.getClass(), "type", term147293);
        setField(term147291, term147291.getClass(), "thisType", null);
        setBooleanField(term147291, term147291.getClass(), "includeDocumentation", false);
        setField(term147290, term147290.getClass(), "currentInfo", term147291);
        setBooleanField(term147290, term147290.getClass(), "populated", true);
        setBooleanField(term147290, term147290.getClass(), "parseDocumentation", false);
        setField(term147290, term147290.getClass(), "currentMarker", null);
        term147294 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term147294, term147294.getClass(), "root", null);
        setField(term147294, term147294.getClass(), "sourceName", null);
        setField(term147294, term147294.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term147192;
        Object retValue = callMethod(klass, "recordType", argTypes, term146894, args);
        assertTrue(recursiveEquals(term146894, term147290));
        assertTrue(recursiveEquals(term147192, term147294));
        assertTrue(recursiveEquals(retValue, true));
    }

};


