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

public class JSDocInfoBuilder_recordTypedef_595478264188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114613;
     Object term114787;
     Object term114897;
     Object term114900;

    public JSDocInfoBuilder_recordTypedef_595478264188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114613 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term114693 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term114693, term114693.getClass(), "bitset", 0);
        setField(term114693, term114693.getClass(), "info", null);
        setField(term114613, term114613.getClass(), "currentInfo", term114693);
        term114787 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term114897 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term114898 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term114899 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term114898, term114898.getClass(), "info", null);
        setField(term114898, term114898.getClass(), "documentation", null);
        setField(term114898, term114898.getClass(), "sourceName", null);
        setField(term114898, term114898.getClass(), "visibility", null);
        setIntField(term114898, term114898.getClass(), "bitset", -2147483648);
        setField(term114899, term114899.getClass(), "root", null);
        setField(term114899, term114899.getClass(), "sourceName", null);
        setField(term114899, term114899.getClass(), "registry", null);
        setField(term114898, term114898.getClass(), "type", term114899);
        setField(term114898, term114898.getClass(), "thisType", null);
        setBooleanField(term114898, term114898.getClass(), "includeDocumentation", false);
        setField(term114897, term114897.getClass(), "currentInfo", term114898);
        setBooleanField(term114897, term114897.getClass(), "populated", true);
        setBooleanField(term114897, term114897.getClass(), "parseDocumentation", false);
        setField(term114897, term114897.getClass(), "currentMarker", null);
        term114900 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term114900, term114900.getClass(), "root", null);
        setField(term114900, term114900.getClass(), "sourceName", null);
        setField(term114900, term114900.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term114787;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term114613, args);
        assertTrue(recursiveEquals(term114613, term114897));
        assertTrue(recursiveEquals(term114787, term114900));
        assertTrue(recursiveEquals(retValue, true));
    }

};


