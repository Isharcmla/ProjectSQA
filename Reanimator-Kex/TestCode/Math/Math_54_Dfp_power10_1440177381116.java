package org.apache.commons.math.dfp;

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
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Dfp_power10_1440177381116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886333;
     Object term886337;

    public Dfp_power10_1440177381116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886333 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886333, term886333.getClass(), "mant", null);
        setByteField(term886333, term886333.getClass(), "sign", (byte) 0);
        setIntField(term886333, term886333.getClass(), "exp", 0);
        setByteField(term886333, term886333.getClass(), "nans", (byte) 0);
        setField(term886333, term886333.getClass(), "field", null);
        term886337 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term886337;
        callMethod(klass, "power10", argTypes, term886333, args);
    }

};


