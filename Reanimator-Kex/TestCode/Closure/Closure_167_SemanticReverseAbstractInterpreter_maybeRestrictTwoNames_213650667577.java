package com.google.javascript.jscomp.type;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SemanticReverseAbstractInterpreter_maybeRestrictTwoNames_213650667577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15627;
     Object term15733;

    public SemanticReverseAbstractInterpreter_maybeRestrictTwoNames_213650667577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15627 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term15733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = true;
        args[3] = term15733;
        args[4] = null;
        args[5] = false;
        args[6] = null;
        try {
            callMethod(klass, "maybeRestrictTwoNames", argTypes, term15627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


