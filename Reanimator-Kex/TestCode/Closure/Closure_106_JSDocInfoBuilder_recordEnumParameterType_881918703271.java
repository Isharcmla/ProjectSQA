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

public class JSDocInfoBuilder_recordEnumParameterType_881918703271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128266;
     Object term128440;
     Object term129194;
     Object term129196;

    public JSDocInfoBuilder_recordEnumParameterType_881918703271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128266 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term128346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term128346, term128346.getClass(), "bitset", 536870912);
        setField(term128346, term128346.getClass(), "info", null);
        setField(term128346, term128346.getClass(), "thisType", null);
        setField(term128266, term128266.getClass(), "currentInfo", term128346);
        term128440 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term129194 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term129195 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term129195, term129195.getClass(), "info", null);
        setField(term129195, term129195.getClass(), "documentation", null);
        setField(term129195, term129195.getClass(), "sourceName", null);
        setField(term129195, term129195.getClass(), "visibility", null);
        setIntField(term129195, term129195.getClass(), "bitset", 536870912);
        setField(term129195, term129195.getClass(), "type", null);
        setField(term129195, term129195.getClass(), "thisType", null);
        setBooleanField(term129195, term129195.getClass(), "includeDocumentation", false);
        setField(term129194, term129194.getClass(), "currentInfo", term129195);
        setBooleanField(term129194, term129194.getClass(), "populated", false);
        setBooleanField(term129194, term129194.getClass(), "parseDocumentation", false);
        setField(term129194, term129194.getClass(), "currentMarker", null);
        term129196 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term129196, term129196.getClass(), "root", null);
        setField(term129196, term129196.getClass(), "sourceName", null);
        setField(term129196, term129196.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term128440;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term128266, args);
        assertTrue(recursiveEquals(term128266, term129194));
        assertTrue(recursiveEquals(term128440, term129196));
        assertTrue(recursiveEquals(retValue, false));
    }

};


