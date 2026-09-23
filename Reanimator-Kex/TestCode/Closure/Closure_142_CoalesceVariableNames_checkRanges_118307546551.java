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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16719;
     Object term16851;

    public CoalesceVariableNames_checkRanges_118307546551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16719 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term16799 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16719, term16719.getClass(), "compiler", term16799);
        term16851 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16851;
        args[1] = null;
        try {
            callMethod(klass, "checkRanges", argTypes, term16719, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


