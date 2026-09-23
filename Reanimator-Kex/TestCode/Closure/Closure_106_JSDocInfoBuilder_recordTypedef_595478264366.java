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

public class JSDocInfoBuilder_recordTypedef_595478264366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147912;
     Object term148086;
     Object term148159;
     Object term148161;

    public JSDocInfoBuilder_recordTypedef_595478264366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term147992 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term147992, term147992.getClass(), "bitset", -2147483648);
        setField(term147992, term147992.getClass(), "info", null);
        setField(term147992, term147992.getClass(), "thisType", null);
        setField(term147912, term147912.getClass(), "currentInfo", term147992);
        term148086 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term148159 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term148160 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term148160, term148160.getClass(), "info", null);
        setField(term148160, term148160.getClass(), "documentation", null);
        setField(term148160, term148160.getClass(), "sourceName", null);
        setField(term148160, term148160.getClass(), "visibility", null);
        setIntField(term148160, term148160.getClass(), "bitset", -2147483648);
        setField(term148160, term148160.getClass(), "type", null);
        setField(term148160, term148160.getClass(), "thisType", null);
        setBooleanField(term148160, term148160.getClass(), "includeDocumentation", false);
        setField(term148159, term148159.getClass(), "currentInfo", term148160);
        setBooleanField(term148159, term148159.getClass(), "populated", false);
        setBooleanField(term148159, term148159.getClass(), "parseDocumentation", false);
        setField(term148159, term148159.getClass(), "currentMarker", null);
        term148161 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term148161, term148161.getClass(), "root", null);
        setField(term148161, term148161.getClass(), "sourceName", null);
        setField(term148161, term148161.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term148086;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term147912, args);
        assertTrue(recursiveEquals(term147912, term148159));
        assertTrue(recursiveEquals(term148086, term148161));
        assertTrue(recursiveEquals(retValue, false));
    }

};


