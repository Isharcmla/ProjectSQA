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
import static org.apache.commons.math3.analysis.differentiation.EqualityUtils.*;

public class DSCompiler_compileLowerIndirection_1403760319143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82351;

    public DSCompiler_compileLowerIndirection_1403760319143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82351 = (int[]) newIntArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[3] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "compileLowerIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term82351));
    }

};


