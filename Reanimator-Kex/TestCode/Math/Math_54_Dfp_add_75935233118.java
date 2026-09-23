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

public class Dfp_add_75935233118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886345;

    public Dfp_add_75935233118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886345 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886345, term886345.getClass(), "mant", null);
        setByteField(term886345, term886345.getClass(), "sign", (byte) 0);
        setIntField(term886345, term886345.getClass(), "exp", 0);
        setByteField(term886345, term886345.getClass(), "nans", (byte) 0);
        setField(term886345, term886345.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term886345, args);
    }

};


