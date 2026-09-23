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

public class JSDocInfoBuilder_recordTypedef_595478264272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128861;
     Object term129129;
     Object term129259;
     Object term129262;

    public JSDocInfoBuilder_recordTypedef_595478264272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128861 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term128941 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term129035 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term128941, term128941.getClass(), "bitset", 0);
        setField(term128941, term128941.getClass(), "info", null);
        setField(term128941, term128941.getClass(), "thisType", term129035);
        setField(term128861, term128861.getClass(), "currentInfo", term128941);
        term129129 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term129259 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term129260 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term129261 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term129260, term129260.getClass(), "info", null);
        setField(term129260, term129260.getClass(), "documentation", null);
        setField(term129260, term129260.getClass(), "sourceName", null);
        setField(term129260, term129260.getClass(), "visibility", null);
        setIntField(term129260, term129260.getClass(), "bitset", 0);
        setField(term129260, term129260.getClass(), "type", null);
        setField(term129261, term129261.getClass(), "root", null);
        setField(term129261, term129261.getClass(), "sourceName", null);
        setField(term129261, term129261.getClass(), "registry", null);
        setField(term129260, term129260.getClass(), "thisType", term129261);
        setBooleanField(term129260, term129260.getClass(), "includeDocumentation", false);
        setField(term129259, term129259.getClass(), "currentInfo", term129260);
        setBooleanField(term129259, term129259.getClass(), "populated", false);
        setBooleanField(term129259, term129259.getClass(), "parseDocumentation", false);
        setField(term129259, term129259.getClass(), "currentMarker", null);
        term129262 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term129262, term129262.getClass(), "root", null);
        setField(term129262, term129262.getClass(), "sourceName", null);
        setField(term129262, term129262.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term129129;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term128861, args);
        assertTrue(recursiveEquals(term128861, term129259));
        assertTrue(recursiveEquals(term129129, term129262));
        assertTrue(recursiveEquals(retValue, false));
    }

};


