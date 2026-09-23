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

public class JSDocInfoBuilder_markTypeNode_1865840748254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125811;
     Object term125820;

    public JSDocInfoBuilder_markTypeNode_1865840748254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125811 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term125811, term125811.getClass(), "currentMarker", null);
        term125820 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term125820, term125820.getClass(), "currentInfo", null);
        setBooleanField(term125820, term125820.getClass(), "populated", false);
        setBooleanField(term125820, term125820.getClass(), "parseDocumentation", false);
        setField(term125820, term125820.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = false;
        callMethod(klass, "markTypeNode", argTypes, term125811, args);
        assertTrue(recursiveEquals(term125811, term125820));
    }

};


