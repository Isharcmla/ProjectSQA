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

public class Dfp_divide_1731727194140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979190;
     Object term979194;

    public Dfp_divide_1731727194140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979190 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979190, term979190.getClass(), "mant", null);
        setByteField(term979190, term979190.getClass(), "sign", (byte) 0);
        setIntField(term979190, term979190.getClass(), "exp", 0);
        setByteField(term979190, term979190.getClass(), "nans", (byte) 0);
        setField(term979190, term979190.getClass(), "field", null);
        term979194 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term979194;
        callMethod(klass, "divide", argTypes, term979190, args);
    }

};


