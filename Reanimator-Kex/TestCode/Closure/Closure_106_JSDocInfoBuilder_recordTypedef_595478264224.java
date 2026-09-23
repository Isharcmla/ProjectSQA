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

public class JSDocInfoBuilder_recordTypedef_595478264224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120462;
     Object term120860;
     Object term121013;
     Object term121018;

    public JSDocInfoBuilder_recordTypedef_595478264224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term120714 = new HashMap();
        term120462 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term120542 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term120666 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term120542, term120542.getClass(), "bitset", 0);
        setField(term120666, term120666.getClass(), "parameters", term120714);
        setField(term120666, term120666.getClass(), "baseType", null);
        setField(term120542, term120542.getClass(), "info", term120666);
        setField(term120462, term120462.getClass(), "currentInfo", term120542);
        term120860 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term121016 = new HashMap();
        term121013 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121014 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121015 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term121017 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term121015, term121015.getClass(), "baseType", null);
        setField(term121015, term121015.getClass(), "implementedInterfaces", null);
        setField(term121015, term121015.getClass(), "parameters", term121016);
        setField(term121015, term121015.getClass(), "thrownTypes", null);
        setField(term121015, term121015.getClass(), "templateTypeName", null);
        setField(term121015, term121015.getClass(), "description", null);
        setField(term121015, term121015.getClass(), "deprecated", null);
        setField(term121015, term121015.getClass(), "license", null);
        setField(term121015, term121015.getClass(), "suppressions", null);
        setField(term121014, term121014.getClass(), "info", term121015);
        setField(term121014, term121014.getClass(), "documentation", null);
        setField(term121014, term121014.getClass(), "sourceName", null);
        setField(term121014, term121014.getClass(), "visibility", null);
        setIntField(term121014, term121014.getClass(), "bitset", -2147483648);
        setField(term121017, term121017.getClass(), "root", null);
        setField(term121017, term121017.getClass(), "sourceName", null);
        setField(term121017, term121017.getClass(), "registry", null);
        setField(term121014, term121014.getClass(), "type", term121017);
        setField(term121014, term121014.getClass(), "thisType", null);
        setBooleanField(term121014, term121014.getClass(), "includeDocumentation", false);
        setField(term121013, term121013.getClass(), "currentInfo", term121014);
        setBooleanField(term121013, term121013.getClass(), "populated", true);
        setBooleanField(term121013, term121013.getClass(), "parseDocumentation", false);
        setField(term121013, term121013.getClass(), "currentMarker", null);
        term121018 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term121018, term121018.getClass(), "root", null);
        setField(term121018, term121018.getClass(), "sourceName", null);
        setField(term121018, term121018.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term120860;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term120462, args);
        assertTrue(recursiveEquals(term120462, term121013));
        assertTrue(recursiveEquals(term120860, term121018));
        assertTrue(recursiveEquals(retValue, true));
    }

};


