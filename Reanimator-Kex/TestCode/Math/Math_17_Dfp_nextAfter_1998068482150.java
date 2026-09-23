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

public class Dfp_nextAfter_1998068482150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979236;

    public Dfp_nextAfter_1998068482150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979236 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979236, term979236.getClass(), "mant", null);
        setByteField(term979236, term979236.getClass(), "sign", (byte) 0);
        setIntField(term979236, term979236.getClass(), "exp", 0);
        setByteField(term979236, term979236.getClass(), "nans", (byte) 0);
        setField(term979236, term979236.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "nextAfter", argTypes, term979236, args);
    }

};


