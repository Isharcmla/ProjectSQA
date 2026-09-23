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

public class JSDocInfoBuilder_recordTypedef_595478264324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138612;
     Object term139010;
     Object term139138;
     Object term139142;

    public JSDocInfoBuilder_recordTypedef_595478264324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term138864 = new HashMap();
        term138612 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term138692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term138816 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term138692, term138692.getClass(), "bitset", -2147483648);
        setField(term138816, term138816.getClass(), "parameters", term138864);
        setField(term138816, term138816.getClass(), "baseType", null);
        setField(term138692, term138692.getClass(), "info", term138816);
        setField(term138692, term138692.getClass(), "thisType", null);
        setField(term138612, term138612.getClass(), "currentInfo", term138692);
        term139010 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term139141 = new HashMap();
        term139138 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term139139 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term139140 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term139140, term139140.getClass(), "baseType", null);
        setField(term139140, term139140.getClass(), "implementedInterfaces", null);
        setField(term139140, term139140.getClass(), "parameters", term139141);
        setField(term139140, term139140.getClass(), "thrownTypes", null);
        setField(term139140, term139140.getClass(), "templateTypeName", null);
        setField(term139140, term139140.getClass(), "description", null);
        setField(term139140, term139140.getClass(), "deprecated", null);
        setField(term139140, term139140.getClass(), "license", null);
        setField(term139140, term139140.getClass(), "suppressions", null);
        setField(term139139, term139139.getClass(), "info", term139140);
        setField(term139139, term139139.getClass(), "documentation", null);
        setField(term139139, term139139.getClass(), "sourceName", null);
        setField(term139139, term139139.getClass(), "visibility", null);
        setIntField(term139139, term139139.getClass(), "bitset", -2147483648);
        setField(term139139, term139139.getClass(), "type", null);
        setField(term139139, term139139.getClass(), "thisType", null);
        setBooleanField(term139139, term139139.getClass(), "includeDocumentation", false);
        setField(term139138, term139138.getClass(), "currentInfo", term139139);
        setBooleanField(term139138, term139138.getClass(), "populated", false);
        setBooleanField(term139138, term139138.getClass(), "parseDocumentation", false);
        setField(term139138, term139138.getClass(), "currentMarker", null);
        term139142 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term139142, term139142.getClass(), "root", null);
        setField(term139142, term139142.getClass(), "sourceName", null);
        setField(term139142, term139142.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term139010;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term138612, args);
        assertTrue(recursiveEquals(term138612, term139138));
        assertTrue(recursiveEquals(term139010, term139142));
        assertTrue(recursiveEquals(retValue, false));
    }

};


