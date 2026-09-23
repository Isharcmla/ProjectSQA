package org.apache.commons.jxpath.ri.compiler;

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
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoreFunction_functionString_1204698443156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37423;

    public CoreFunction_functionString_1204698443156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term37305 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 0);
        setField(term37423, term37423.getClass(), "args", term37305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "functionString", argTypes, term37423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


