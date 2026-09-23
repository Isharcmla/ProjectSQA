package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_hasNoValues_174921116380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3558;
     Object term11184;

    public Option_hasNoValues_174921116380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3611 = new ArrayList();
        term3558 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3610 = newInstance(Class.forName("java.lang.Object"));
        setField(term3558, term3558.getClass(), "opt", "UfQtPRyWRC");
        setField(term3558, term3558.getClass(), "longOpt", "FPvxVzzSvD");
        setField(term3558, term3558.getClass(), "argName", "WHcwFgsGFC");
        setField(term3558, term3558.getClass(), "description", "HzqpegHiRq");
        setBooleanField(term3558, term3558.getClass(), "required", false);
        setBooleanField(term3558, term3558.getClass(), "optionalArg", false);
        setIntField(term3558, term3558.getClass(), "numberOfArgs", -1087774327);
        setField(term3558, term3558.getClass(), "type", term3610);
        setField(term3558, term3558.getClass(), "values", term3611);
        setCharField(term3558, term3558.getClass(), "valuesep", 'P');
        ArrayList term11194 = new ArrayList();
        term11184 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11193 = newInstance(Class.forName("java.lang.Object"));
        setField(term11184, term11184.getClass(), "opt", "UfQtPRyWRC");
        setField(term11184, term11184.getClass(), "longOpt", "FPvxVzzSvD");
        setField(term11184, term11184.getClass(), "argName", "WHcwFgsGFC");
        setField(term11184, term11184.getClass(), "description", "HzqpegHiRq");
        setBooleanField(term11184, term11184.getClass(), "required", false);
        setBooleanField(term11184, term11184.getClass(), "optionalArg", false);
        setIntField(term11184, term11184.getClass(), "numberOfArgs", -1087774327);
        setField(term11184, term11184.getClass(), "type", term11193);
        setField(term11184, term11184.getClass(), "values", term11194);
        setCharField(term11184, term11184.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNoValues", argTypes, term3558, args);
        assertTrue(recursiveEquals(term3558, term11184));
    }

};


