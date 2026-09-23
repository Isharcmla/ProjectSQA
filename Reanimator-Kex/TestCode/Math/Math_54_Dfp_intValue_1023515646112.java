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

public class Dfp_intValue_1023515646112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886315;

    public Dfp_intValue_1023515646112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886315 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886315, term886315.getClass(), "mant", null);
        setByteField(term886315, term886315.getClass(), "sign", (byte) 0);
        setIntField(term886315, term886315.getClass(), "exp", 0);
        setByteField(term886315, term886315.getClass(), "nans", (byte) 0);
        setField(term886315, term886315.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "intValue", argTypes, term886315, args);
    }

};


