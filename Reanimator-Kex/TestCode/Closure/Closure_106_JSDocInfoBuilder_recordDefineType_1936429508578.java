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

public class JSDocInfoBuilder_recordDefineType_1936429508578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203688;
     Object term204086;
     Object term204241;
     Object term204245;

    public JSDocInfoBuilder_recordDefineType_1936429508578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term203940 = new HashMap();
        term203688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term203768 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term203892 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term203768, term203768.getClass(), "bitset", 536870912);
        setField(term203892, term203892.getClass(), "parameters", term203940);
        setField(term203892, term203892.getClass(), "baseType", null);
        setField(term203768, term203768.getClass(), "info", term203892);
        setField(term203768, term203768.getClass(), "thisType", null);
        setField(term203688, term203688.getClass(), "currentInfo", term203768);
        term204086 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term204244 = new HashMap();
        term204241 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term204242 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term204243 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term204243, term204243.getClass(), "baseType", null);
        setField(term204243, term204243.getClass(), "implementedInterfaces", null);
        setField(term204243, term204243.getClass(), "parameters", term204244);
        setField(term204243, term204243.getClass(), "thrownTypes", null);
        setField(term204243, term204243.getClass(), "templateTypeName", null);
        setField(term204243, term204243.getClass(), "description", null);
        setField(term204243, term204243.getClass(), "deprecated", null);
        setField(term204243, term204243.getClass(), "license", null);
        setField(term204243, term204243.getClass(), "suppressions", null);
        setField(term204242, term204242.getClass(), "info", term204243);
        setField(term204242, term204242.getClass(), "documentation", null);
        setField(term204242, term204242.getClass(), "sourceName", null);
        setField(term204242, term204242.getClass(), "visibility", null);
        setIntField(term204242, term204242.getClass(), "bitset", 536870912);
        setField(term204242, term204242.getClass(), "type", null);
        setField(term204242, term204242.getClass(), "thisType", null);
        setBooleanField(term204242, term204242.getClass(), "includeDocumentation", false);
        setField(term204241, term204241.getClass(), "currentInfo", term204242);
        setBooleanField(term204241, term204241.getClass(), "populated", false);
        setBooleanField(term204241, term204241.getClass(), "parseDocumentation", false);
        setField(term204241, term204241.getClass(), "currentMarker", null);
        term204245 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term204245, term204245.getClass(), "root", null);
        setField(term204245, term204245.getClass(), "sourceName", null);
        setField(term204245, term204245.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term204086;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term203688, args);
        assertTrue(recursiveEquals(term203688, term204241));
        assertTrue(recursiveEquals(term204086, term204245));
        assertTrue(recursiveEquals(retValue, false));
    }

};


