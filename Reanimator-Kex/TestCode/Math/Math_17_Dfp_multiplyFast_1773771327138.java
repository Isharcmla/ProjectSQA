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

public class Dfp_multiplyFast_1773771327138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979180;
     Object term979184;

    public Dfp_multiplyFast_1773771327138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979180 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979180, term979180.getClass(), "mant", null);
        setByteField(term979180, term979180.getClass(), "sign", (byte) 0);
        setIntField(term979180, term979180.getClass(), "exp", 0);
        setByteField(term979180, term979180.getClass(), "nans", (byte) 0);
        setField(term979180, term979180.getClass(), "field", null);
        term979184 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term979184;
        callMethod(klass, "multiplyFast", argTypes, term979180, args);
    }

};


