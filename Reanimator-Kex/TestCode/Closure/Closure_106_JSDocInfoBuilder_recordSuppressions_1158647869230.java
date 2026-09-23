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

public class JSDocInfoBuilder_recordSuppressions_1158647869230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121671;
     Object term121790;

    public JSDocInfoBuilder_recordSuppressions_1158647869230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121671 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121751 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term121751, term121751.getClass(), "info", null);
        setField(term121671, term121671.getClass(), "currentInfo", term121751);
        term121790 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121791 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121792 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term121792, term121792.getClass(), "baseType", null);
        setField(term121792, term121792.getClass(), "implementedInterfaces", null);
        setField(term121792, term121792.getClass(), "parameters", null);
        setField(term121792, term121792.getClass(), "thrownTypes", null);
        setField(term121792, term121792.getClass(), "templateTypeName", null);
        setField(term121792, term121792.getClass(), "description", null);
        setField(term121792, term121792.getClass(), "deprecated", null);
        setField(term121792, term121792.getClass(), "license", null);
        setField(term121792, term121792.getClass(), "suppressions", null);
        setField(term121791, term121791.getClass(), "info", term121792);
        setField(term121791, term121791.getClass(), "documentation", null);
        setField(term121791, term121791.getClass(), "sourceName", null);
        setField(term121791, term121791.getClass(), "visibility", null);
        setIntField(term121791, term121791.getClass(), "bitset", 0);
        setField(term121791, term121791.getClass(), "type", null);
        setField(term121791, term121791.getClass(), "thisType", null);
        setBooleanField(term121791, term121791.getClass(), "includeDocumentation", false);
        setField(term121790, term121790.getClass(), "currentInfo", term121791);
        setBooleanField(term121790, term121790.getClass(), "populated", true);
        setBooleanField(term121790, term121790.getClass(), "parseDocumentation", false);
        setField(term121790, term121790.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordSuppressions", argTypes, term121671, args);
        assertTrue(recursiveEquals(term121671, term121790));
        assertTrue(recursiveEquals(retValue, true));
    }

};


