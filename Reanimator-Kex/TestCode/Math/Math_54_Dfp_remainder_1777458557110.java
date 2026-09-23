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

public class Dfp_remainder_1777458557110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886307;

    public Dfp_remainder_1777458557110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886307 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886307, term886307.getClass(), "mant", null);
        setByteField(term886307, term886307.getClass(), "sign", (byte) 0);
        setIntField(term886307, term886307.getClass(), "exp", 0);
        setByteField(term886307, term886307.getClass(), "nans", (byte) 0);
        setField(term886307, term886307.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remainder", argTypes, term886307, args);
    }

};


