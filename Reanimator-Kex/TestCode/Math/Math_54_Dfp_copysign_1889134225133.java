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

public class Dfp_copysign_1889134225133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886415;

    public Dfp_copysign_1889134225133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886415 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886415, term886415.getClass(), "mant", null);
        setByteField(term886415, term886415.getClass(), "sign", (byte) 0);
        setIntField(term886415, term886415.getClass(), "exp", 0);
        setByteField(term886415, term886415.getClass(), "nans", (byte) 0);
        setField(term886415, term886415.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.Dfp");
        argTypes[1] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "copysign", argTypes, term886415, args);
    }

};


