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
import java.util.LinkedHashMap;

public class JSDocInfoBuilder_recordParameter_1978522823494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177563;
     Object term177832;

    public JSDocInfoBuilder_recordParameter_1978522823494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177563 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term177643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term177767 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term177643, term177643.getClass(), "bitset", 0);
        setField(term177767, term177767.getClass(), "parameters", null);
        setField(term177643, term177643.getClass(), "info", term177767);
        setField(term177563, term177563.getClass(), "currentInfo", term177643);
        LinkedHashMap term177835 = new LinkedHashMap();
        term177832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term177833 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term177834 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term177834, term177834.getClass(), "baseType", null);
        setField(term177834, term177834.getClass(), "implementedInterfaces", null);
        setField(term177834, term177834.getClass(), "parameters", term177835);
        setField(term177834, term177834.getClass(), "thrownTypes", null);
        setField(term177834, term177834.getClass(), "templateTypeName", null);
        setField(term177834, term177834.getClass(), "description", null);
        setField(term177834, term177834.getClass(), "deprecated", null);
        setField(term177834, term177834.getClass(), "license", null);
        setField(term177834, term177834.getClass(), "suppressions", null);
        setField(term177833, term177833.getClass(), "info", term177834);
        setField(term177833, term177833.getClass(), "documentation", null);
        setField(term177833, term177833.getClass(), "sourceName", null);
        setField(term177833, term177833.getClass(), "visibility", null);
        setIntField(term177833, term177833.getClass(), "bitset", 0);
        setField(term177833, term177833.getClass(), "type", null);
        setField(term177833, term177833.getClass(), "thisType", null);
        setBooleanField(term177833, term177833.getClass(), "includeDocumentation", false);
        setField(term177832, term177832.getClass(), "currentInfo", term177833);
        setBooleanField(term177832, term177832.getClass(), "populated", true);
        setBooleanField(term177832, term177832.getClass(), "parseDocumentation", false);
        setField(term177832, term177832.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameter", argTypes, term177563, args);
        assertTrue(recursiveEquals(term177563, term177832));
        assertTrue(recursiveEquals(retValue, true));
    }

};


