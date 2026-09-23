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

public class CollapseProperties_declareVarsForObjLitValues_9051514278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242637;
     Object term242741;

    public CollapseProperties_declareVarsForObjLitValues_9051514278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242637 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term242741 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = term242741;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "declareVarsForObjLitValues", argTypes, term242637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


