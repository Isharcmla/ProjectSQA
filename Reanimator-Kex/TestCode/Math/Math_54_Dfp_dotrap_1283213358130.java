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

public class Dfp_dotrap_1283213358130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886399;
     Object term886403;

    public Dfp_dotrap_1283213358130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886399 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886399, term886399.getClass(), "mant", null);
        setByteField(term886399, term886399.getClass(), "sign", (byte) 0);
        setIntField(term886399, term886399.getClass(), "exp", 0);
        setByteField(term886399, term886399.getClass(), "nans", (byte) 0);
        setField(term886399, term886399.getClass(), "field", null);
        term886403 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.math.dfp.Dfp");
        argTypes[3] = Class.forName("org.apache.commons.math.dfp.Dfp");
        Object[] args = new Object[4];
        args[0] = term886403;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "dotrap", argTypes, term886399, args);
    }

};


