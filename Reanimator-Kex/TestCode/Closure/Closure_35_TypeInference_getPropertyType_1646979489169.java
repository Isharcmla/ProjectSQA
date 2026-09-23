package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeInference_getPropertyType_1646979489169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55924;
     Object term55994;
     Object term56088;

    public TypeInference_getPropertyType_1646979489169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55924 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term55994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55994, term55994.getClass(), "type", 0);
        term56088 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term55994;
        args[3] = term56088;
        try {
            callMethod(klass, "getPropertyType", argTypes, term55924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


