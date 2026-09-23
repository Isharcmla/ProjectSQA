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

public class JSDocInfoBuilder_recordTypedef_595478264204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117302;
     Object term117600;
     Object term117718;
     Object term117722;

    public JSDocInfoBuilder_recordTypedef_595478264204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117302 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117382 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term117506 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term117382, term117382.getClass(), "bitset", 0);
        setField(term117506, term117506.getClass(), "parameters", null);
        setField(term117382, term117382.getClass(), "info", term117506);
        setField(term117302, term117302.getClass(), "currentInfo", term117382);
        term117600 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term117718 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term117720 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term117721 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term117720, term117720.getClass(), "baseType", null);
        setField(term117720, term117720.getClass(), "implementedInterfaces", null);
        setField(term117720, term117720.getClass(), "parameters", null);
        setField(term117720, term117720.getClass(), "thrownTypes", null);
        setField(term117720, term117720.getClass(), "templateTypeName", null);
        setField(term117720, term117720.getClass(), "description", null);
        setField(term117720, term117720.getClass(), "deprecated", null);
        setField(term117720, term117720.getClass(), "license", null);
        setField(term117720, term117720.getClass(), "suppressions", null);
        setField(term117719, term117719.getClass(), "info", term117720);
        setField(term117719, term117719.getClass(), "documentation", null);
        setField(term117719, term117719.getClass(), "sourceName", null);
        setField(term117719, term117719.getClass(), "visibility", null);
        setIntField(term117719, term117719.getClass(), "bitset", -2147483648);
        setField(term117721, term117721.getClass(), "root", null);
        setField(term117721, term117721.getClass(), "sourceName", null);
        setField(term117721, term117721.getClass(), "registry", null);
        setField(term117719, term117719.getClass(), "type", term117721);
        setField(term117719, term117719.getClass(), "thisType", null);
        setBooleanField(term117719, term117719.getClass(), "includeDocumentation", false);
        setField(term117718, term117718.getClass(), "currentInfo", term117719);
        setBooleanField(term117718, term117718.getClass(), "populated", true);
        setBooleanField(term117718, term117718.getClass(), "parseDocumentation", false);
        setField(term117718, term117718.getClass(), "currentMarker", null);
        term117722 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term117722, term117722.getClass(), "root", null);
        setField(term117722, term117722.getClass(), "sourceName", null);
        setField(term117722, term117722.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term117600;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term117302, args);
        assertTrue(recursiveEquals(term117302, term117718));
        assertTrue(recursiveEquals(term117600, term117722));
        assertTrue(recursiveEquals(retValue, true));
    }

};


