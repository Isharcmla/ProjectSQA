package org.apache.commons.math3.dfp;

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
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Dfp_power10K_1763871304128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979130;
     Object term979134;

    public Dfp_power10K_1763871304128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979130 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979130, term979130.getClass(), "mant", null);
        setByteField(term979130, term979130.getClass(), "sign", (byte) 0);
        setIntField(term979130, term979130.getClass(), "exp", 0);
        setByteField(term979130, term979130.getClass(), "nans", (byte) 0);
        setField(term979130, term979130.getClass(), "field", null);
        term979134 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term979134;
        callMethod(klass, "power10K", argTypes, term979130, args);
    }

};


