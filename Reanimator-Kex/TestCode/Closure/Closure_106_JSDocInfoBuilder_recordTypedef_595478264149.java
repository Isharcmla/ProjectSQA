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

public class JSDocInfoBuilder_recordTypedef_595478264149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108601;
     Object term108775;
     Object term108998;
     Object term109000;

    public JSDocInfoBuilder_recordTypedef_595478264149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108601 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108681 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term108681, term108681.getClass(), "bitset", 512);
        setField(term108601, term108601.getClass(), "currentInfo", term108681);
        term108775 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term108998 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108999 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term108999, term108999.getClass(), "info", null);
        setField(term108999, term108999.getClass(), "documentation", null);
        setField(term108999, term108999.getClass(), "sourceName", null);
        setField(term108999, term108999.getClass(), "visibility", null);
        setIntField(term108999, term108999.getClass(), "bitset", 512);
        setField(term108999, term108999.getClass(), "type", null);
        setField(term108999, term108999.getClass(), "thisType", null);
        setBooleanField(term108999, term108999.getClass(), "includeDocumentation", false);
        setField(term108998, term108998.getClass(), "currentInfo", term108999);
        setBooleanField(term108998, term108998.getClass(), "populated", false);
        setBooleanField(term108998, term108998.getClass(), "parseDocumentation", false);
        setField(term108998, term108998.getClass(), "currentMarker", null);
        term109000 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term109000, term109000.getClass(), "root", null);
        setField(term109000, term109000.getClass(), "sourceName", null);
        setField(term109000, term109000.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term108775;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term108601, args);
        assertTrue(recursiveEquals(term108601, term108998));
        assertTrue(recursiveEquals(term108775, term109000));
        assertTrue(recursiveEquals(retValue, false));
    }

};


