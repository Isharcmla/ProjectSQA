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

public class JSDocInfoBuilder_recordBaseType_1476256102200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116663;
     Object term116837;
     Object term116978;
     Object term116982;

    public JSDocInfoBuilder_recordBaseType_1476256102200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116663 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term116743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term116743, term116743.getClass(), "bitset", -1610612736);
        setField(term116743, term116743.getClass(), "info", null);
        setField(term116663, term116663.getClass(), "currentInfo", term116743);
        term116837 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term116978 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term116979 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term116980 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term116981 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term116981, term116981.getClass(), "root", null);
        setField(term116981, term116981.getClass(), "sourceName", null);
        setField(term116981, term116981.getClass(), "registry", null);
        setField(term116980, term116980.getClass(), "baseType", term116981);
        setField(term116980, term116980.getClass(), "implementedInterfaces", null);
        setField(term116980, term116980.getClass(), "parameters", null);
        setField(term116980, term116980.getClass(), "thrownTypes", null);
        setField(term116980, term116980.getClass(), "templateTypeName", null);
        setField(term116980, term116980.getClass(), "description", null);
        setField(term116980, term116980.getClass(), "deprecated", null);
        setField(term116980, term116980.getClass(), "license", null);
        setField(term116980, term116980.getClass(), "suppressions", null);
        setField(term116979, term116979.getClass(), "info", term116980);
        setField(term116979, term116979.getClass(), "documentation", null);
        setField(term116979, term116979.getClass(), "sourceName", null);
        setField(term116979, term116979.getClass(), "visibility", null);
        setIntField(term116979, term116979.getClass(), "bitset", -1610612736);
        setField(term116979, term116979.getClass(), "type", null);
        setField(term116979, term116979.getClass(), "thisType", null);
        setBooleanField(term116979, term116979.getClass(), "includeDocumentation", false);
        setField(term116978, term116978.getClass(), "currentInfo", term116979);
        setBooleanField(term116978, term116978.getClass(), "populated", true);
        setBooleanField(term116978, term116978.getClass(), "parseDocumentation", false);
        setField(term116978, term116978.getClass(), "currentMarker", null);
        term116982 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term116982, term116982.getClass(), "root", null);
        setField(term116982, term116982.getClass(), "sourceName", null);
        setField(term116982, term116982.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term116837;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term116663, args);
        assertTrue(recursiveEquals(term116663, term116978));
        assertTrue(recursiveEquals(term116837, term116982));
        assertTrue(recursiveEquals(retValue, true));
    }

};


