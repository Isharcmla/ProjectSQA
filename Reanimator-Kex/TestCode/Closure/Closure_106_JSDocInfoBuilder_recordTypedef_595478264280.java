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

public class JSDocInfoBuilder_recordTypedef_595478264280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130603;
     Object term130901;
     Object term130998;
     Object term131001;

    public JSDocInfoBuilder_recordTypedef_595478264280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130603 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term130683 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term130807 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term130683, term130683.getClass(), "bitset", 1610612736);
        setField(term130807, term130807.getClass(), "parameters", null);
        setField(term130807, term130807.getClass(), "baseType", null);
        setField(term130683, term130683.getClass(), "info", term130807);
        setField(term130683, term130683.getClass(), "thisType", null);
        setField(term130603, term130603.getClass(), "currentInfo", term130683);
        term130901 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term130998 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term130999 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term131000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term131000, term131000.getClass(), "baseType", null);
        setField(term131000, term131000.getClass(), "implementedInterfaces", null);
        setField(term131000, term131000.getClass(), "parameters", null);
        setField(term131000, term131000.getClass(), "thrownTypes", null);
        setField(term131000, term131000.getClass(), "templateTypeName", null);
        setField(term131000, term131000.getClass(), "description", null);
        setField(term131000, term131000.getClass(), "deprecated", null);
        setField(term131000, term131000.getClass(), "license", null);
        setField(term131000, term131000.getClass(), "suppressions", null);
        setField(term130999, term130999.getClass(), "info", term131000);
        setField(term130999, term130999.getClass(), "documentation", null);
        setField(term130999, term130999.getClass(), "sourceName", null);
        setField(term130999, term130999.getClass(), "visibility", null);
        setIntField(term130999, term130999.getClass(), "bitset", 1610612736);
        setField(term130999, term130999.getClass(), "type", null);
        setField(term130999, term130999.getClass(), "thisType", null);
        setBooleanField(term130999, term130999.getClass(), "includeDocumentation", false);
        setField(term130998, term130998.getClass(), "currentInfo", term130999);
        setBooleanField(term130998, term130998.getClass(), "populated", false);
        setBooleanField(term130998, term130998.getClass(), "parseDocumentation", false);
        setField(term130998, term130998.getClass(), "currentMarker", null);
        term131001 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term131001, term131001.getClass(), "root", null);
        setField(term131001, term131001.getClass(), "sourceName", null);
        setField(term131001, term131001.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term130901;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term130603, args);
        assertTrue(recursiveEquals(term130603, term130998));
        assertTrue(recursiveEquals(term130901, term131001));
        assertTrue(recursiveEquals(retValue, false));
    }

};


