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

public class Dfp_trap_2081846736131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886405;
     Object term886409;

    public Dfp_trap_2081846736131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886405 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886405, term886405.getClass(), "mant", null);
        setByteField(term886405, term886405.getClass(), "sign", (byte) 0);
        setIntField(term886405, term886405.getClass(), "exp", 0);
        setByteField(term886405, term886405.getClass(), "nans", (byte) 0);
        setField(term886405, term886405.getClass(), "field", null);
        term886409 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.math.dfp.Dfp");
        argTypes[3] = Class.forName("org.apache.commons.math.dfp.Dfp");
        argTypes[4] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[5];
        args[0] = term886409;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "trap", argTypes, term886405, args);
    }

};


