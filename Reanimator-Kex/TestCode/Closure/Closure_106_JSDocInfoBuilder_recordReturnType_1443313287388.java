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

public class JSDocInfoBuilder_recordReturnType_1443313287388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153579;
     Object term153753;
     Object term153800;
     Object term153803;

    public JSDocInfoBuilder_recordReturnType_1443313287388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153579 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term153659 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term153659, term153659.getClass(), "bitset", 0);
        setField(term153579, term153579.getClass(), "currentInfo", term153659);
        term153753 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term153800 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term153801 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term153802 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term153801, term153801.getClass(), "info", null);
        setField(term153801, term153801.getClass(), "documentation", null);
        setField(term153801, term153801.getClass(), "sourceName", null);
        setField(term153801, term153801.getClass(), "visibility", null);
        setIntField(term153801, term153801.getClass(), "bitset", 1073741824);
        setField(term153802, term153802.getClass(), "root", null);
        setField(term153802, term153802.getClass(), "sourceName", null);
        setField(term153802, term153802.getClass(), "registry", null);
        setField(term153801, term153801.getClass(), "type", term153802);
        setField(term153801, term153801.getClass(), "thisType", null);
        setBooleanField(term153801, term153801.getClass(), "includeDocumentation", false);
        setField(term153800, term153800.getClass(), "currentInfo", term153801);
        setBooleanField(term153800, term153800.getClass(), "populated", true);
        setBooleanField(term153800, term153800.getClass(), "parseDocumentation", false);
        setField(term153800, term153800.getClass(), "currentMarker", null);
        term153803 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term153803, term153803.getClass(), "root", null);
        setField(term153803, term153803.getClass(), "sourceName", null);
        setField(term153803, term153803.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term153753;
        Object retValue = callMethod(klass, "recordReturnType", argTypes, term153579, args);
        assertTrue(recursiveEquals(term153579, term153800));
        assertTrue(recursiveEquals(term153753, term153803));
        assertTrue(recursiveEquals(retValue, true));
    }

};


