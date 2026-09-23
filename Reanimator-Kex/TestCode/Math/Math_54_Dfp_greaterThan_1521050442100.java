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

public class Dfp_greaterThan_1521050442100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886267;

    public Dfp_greaterThan_1521050442100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886267 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886267, term886267.getClass(), "mant", null);
        setByteField(term886267, term886267.getClass(), "sign", (byte) 0);
        setIntField(term886267, term886267.getClass(), "exp", 0);
        setByteField(term886267, term886267.getClass(), "nans", (byte) 0);
        setField(term886267, term886267.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "greaterThan", argTypes, term886267, args);
    }

};


