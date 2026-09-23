package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DSCompiler_rootN_1254658551163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580986;
     Object term580350;

    public DSCompiler_rootN_1254658551163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580986 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term580986, term580986.getClass(), "order", -1);
        term580350 = (double[]) newDoubleArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term580350;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        args[4] = 0;
        callMethod(klass, "rootN", argTypes, term580986, args);
    }

};


