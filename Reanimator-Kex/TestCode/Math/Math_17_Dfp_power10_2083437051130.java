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

public class Dfp_power10_2083437051130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979140;
     Object term979144;

    public Dfp_power10_2083437051130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979140 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979140, term979140.getClass(), "mant", null);
        setByteField(term979140, term979140.getClass(), "sign", (byte) 0);
        setIntField(term979140, term979140.getClass(), "exp", 0);
        setByteField(term979140, term979140.getClass(), "nans", (byte) 0);
        setField(term979140, term979140.getClass(), "field", null);
        term979144 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term979144;
        callMethod(klass, "power10", argTypes, term979140, args);
    }

};


