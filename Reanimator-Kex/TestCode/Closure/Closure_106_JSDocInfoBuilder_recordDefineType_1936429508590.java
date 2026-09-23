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

public class JSDocInfoBuilder_recordDefineType_1936429508590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208245;
     Object term208643;
     Object term208812;
     Object term208816;

    public JSDocInfoBuilder_recordDefineType_1936429508590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term208497 = new HashMap();
        term208245 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term208325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term208449 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term208325, term208325.getClass(), "bitset", -2147483648);
        setField(term208449, term208449.getClass(), "parameters", term208497);
        setField(term208449, term208449.getClass(), "baseType", null);
        setField(term208325, term208325.getClass(), "info", term208449);
        setField(term208325, term208325.getClass(), "thisType", null);
        setField(term208245, term208245.getClass(), "currentInfo", term208325);
        term208643 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term208815 = new HashMap();
        term208812 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term208813 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term208814 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term208814, term208814.getClass(), "baseType", null);
        setField(term208814, term208814.getClass(), "implementedInterfaces", null);
        setField(term208814, term208814.getClass(), "parameters", term208815);
        setField(term208814, term208814.getClass(), "thrownTypes", null);
        setField(term208814, term208814.getClass(), "templateTypeName", null);
        setField(term208814, term208814.getClass(), "description", null);
        setField(term208814, term208814.getClass(), "deprecated", null);
        setField(term208814, term208814.getClass(), "license", null);
        setField(term208814, term208814.getClass(), "suppressions", null);
        setField(term208813, term208813.getClass(), "info", term208814);
        setField(term208813, term208813.getClass(), "documentation", null);
        setField(term208813, term208813.getClass(), "sourceName", null);
        setField(term208813, term208813.getClass(), "visibility", null);
        setIntField(term208813, term208813.getClass(), "bitset", -2147483648);
        setField(term208813, term208813.getClass(), "type", null);
        setField(term208813, term208813.getClass(), "thisType", null);
        setBooleanField(term208813, term208813.getClass(), "includeDocumentation", false);
        setField(term208812, term208812.getClass(), "currentInfo", term208813);
        setBooleanField(term208812, term208812.getClass(), "populated", false);
        setBooleanField(term208812, term208812.getClass(), "parseDocumentation", false);
        setField(term208812, term208812.getClass(), "currentMarker", null);
        term208816 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term208816, term208816.getClass(), "root", null);
        setField(term208816, term208816.getClass(), "sourceName", null);
        setField(term208816, term208816.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term208643;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term208245, args);
        assertTrue(recursiveEquals(term208245, term208812));
        assertTrue(recursiveEquals(term208643, term208816));
        assertTrue(recursiveEquals(retValue, false));
    }

};


