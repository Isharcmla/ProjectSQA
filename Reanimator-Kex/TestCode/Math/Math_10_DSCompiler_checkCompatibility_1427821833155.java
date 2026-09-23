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

public class DSCompiler_checkCompatibility_1427821833155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88746;
     Object term88752;
     Object term88753;

    public DSCompiler_checkCompatibility_1427821833155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88746 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term88746, term88746.getClass(), "parameters", 0);
        term88752 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term88752, term88752.getClass(), "parameters", 0);
        setIntField(term88752, term88752.getClass(), "order", 0);
        setField(term88752, term88752.getClass(), "sizes", null);
        setField(term88752, term88752.getClass(), "derivativesIndirection", null);
        setField(term88752, term88752.getClass(), "lowerIndirection", null);
        setField(term88752, term88752.getClass(), "multIndirection", null);
        setField(term88752, term88752.getClass(), "compIndirection", null);
        term88753 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term88753, term88753.getClass(), "parameters", 0);
        setIntField(term88753, term88753.getClass(), "order", 0);
        setField(term88753, term88753.getClass(), "sizes", null);
        setField(term88753, term88753.getClass(), "derivativesIndirection", null);
        setField(term88753, term88753.getClass(), "lowerIndirection", null);
        setField(term88753, term88753.getClass(), "multIndirection", null);
        setField(term88753, term88753.getClass(), "compIndirection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Object[] args = new Object[1];
        args[0] = term88746;
        callMethod(klass, "checkCompatibility", argTypes, term88746, args);
        assertTrue(recursiveEquals(term88746, term88752));
        assertTrue(recursiveEquals(term88746, term88753));
    }

};


