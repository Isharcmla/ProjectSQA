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

public class JSDocInfoBuilder_recordTypedef_595478264334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140736;
     Object term141128;
     Object term141227;
     Object term141231;

    public JSDocInfoBuilder_recordTypedef_595478264334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140736 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term140816 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term140940 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term141034 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term140816, term140816.getClass(), "bitset", 0);
        setField(term140940, term140940.getClass(), "parameters", null);
        setField(term140940, term140940.getClass(), "baseType", term141034);
        setField(term140816, term140816.getClass(), "info", term140940);
        setField(term140736, term140736.getClass(), "currentInfo", term140816);
        term141128 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term141227 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term141228 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term141229 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term141230 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term141230, term141230.getClass(), "root", null);
        setField(term141230, term141230.getClass(), "sourceName", null);
        setField(term141230, term141230.getClass(), "registry", null);
        setField(term141229, term141229.getClass(), "baseType", term141230);
        setField(term141229, term141229.getClass(), "implementedInterfaces", null);
        setField(term141229, term141229.getClass(), "parameters", null);
        setField(term141229, term141229.getClass(), "thrownTypes", null);
        setField(term141229, term141229.getClass(), "templateTypeName", null);
        setField(term141229, term141229.getClass(), "description", null);
        setField(term141229, term141229.getClass(), "deprecated", null);
        setField(term141229, term141229.getClass(), "license", null);
        setField(term141229, term141229.getClass(), "suppressions", null);
        setField(term141228, term141228.getClass(), "info", term141229);
        setField(term141228, term141228.getClass(), "documentation", null);
        setField(term141228, term141228.getClass(), "sourceName", null);
        setField(term141228, term141228.getClass(), "visibility", null);
        setIntField(term141228, term141228.getClass(), "bitset", 0);
        setField(term141228, term141228.getClass(), "type", null);
        setField(term141228, term141228.getClass(), "thisType", null);
        setBooleanField(term141228, term141228.getClass(), "includeDocumentation", false);
        setField(term141227, term141227.getClass(), "currentInfo", term141228);
        setBooleanField(term141227, term141227.getClass(), "populated", false);
        setBooleanField(term141227, term141227.getClass(), "parseDocumentation", false);
        setField(term141227, term141227.getClass(), "currentMarker", null);
        term141231 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term141231, term141231.getClass(), "root", null);
        setField(term141231, term141231.getClass(), "sourceName", null);
        setField(term141231, term141231.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term141128;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term140736, args);
        assertTrue(recursiveEquals(term140736, term141227));
        assertTrue(recursiveEquals(term141128, term141231));
        assertTrue(recursiveEquals(retValue, false));
    }

};


