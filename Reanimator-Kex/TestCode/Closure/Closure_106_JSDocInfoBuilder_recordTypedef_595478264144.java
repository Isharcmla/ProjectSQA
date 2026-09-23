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

public class JSDocInfoBuilder_recordTypedef_595478264144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107973;
     Object term108147;
     Object term108167;
     Object term108169;

    public JSDocInfoBuilder_recordTypedef_595478264144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107973 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108053 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term108053, term108053.getClass(), "bitset", 2);
        setField(term107973, term107973.getClass(), "currentInfo", term108053);
        term108147 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term108167 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108168 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term108168, term108168.getClass(), "info", null);
        setField(term108168, term108168.getClass(), "documentation", null);
        setField(term108168, term108168.getClass(), "sourceName", null);
        setField(term108168, term108168.getClass(), "visibility", null);
        setIntField(term108168, term108168.getClass(), "bitset", 2);
        setField(term108168, term108168.getClass(), "type", null);
        setField(term108168, term108168.getClass(), "thisType", null);
        setBooleanField(term108168, term108168.getClass(), "includeDocumentation", false);
        setField(term108167, term108167.getClass(), "currentInfo", term108168);
        setBooleanField(term108167, term108167.getClass(), "populated", false);
        setBooleanField(term108167, term108167.getClass(), "parseDocumentation", false);
        setField(term108167, term108167.getClass(), "currentMarker", null);
        term108169 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term108169, term108169.getClass(), "root", null);
        setField(term108169, term108169.getClass(), "sourceName", null);
        setField(term108169, term108169.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term108147;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term107973, args);
        assertTrue(recursiveEquals(term107973, term108167));
        assertTrue(recursiveEquals(term108147, term108169));
        assertTrue(recursiveEquals(retValue, false));
    }

};


