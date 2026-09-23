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

public class Dfp_trap_1782670873147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979222;
     Object term979226;

    public Dfp_trap_1782670873147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979222 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        setField(term979222, term979222.getClass(), "mant", null);
        setByteField(term979222, term979222.getClass(), "sign", (byte) 0);
        setIntField(term979222, term979222.getClass(), "exp", 0);
        setByteField(term979222, term979222.getClass(), "nans", (byte) 0);
        setField(term979222, term979222.getClass(), "field", null);
        term979226 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.math3.dfp.Dfp");
        argTypes[3] = Class.forName("org.apache.commons.math3.dfp.Dfp");
        argTypes[4] = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Object[] args = new Object[5];
        args[0] = term979226;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "trap", argTypes, term979222, args);
    }

};


