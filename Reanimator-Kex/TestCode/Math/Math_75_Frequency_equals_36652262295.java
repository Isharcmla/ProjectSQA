package org.apache.commons.math.stat;

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
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.EqualityUtils.*;

public class Frequency_equals_36652262295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9708;
     Object term9790;
     Object term9821;
     Object term9822;

    public Frequency_equals_36652262295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9708 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        term9790 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        term9821 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term9821, term9821.getClass(), "freqTable", null);
        term9822 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term9822, term9822.getClass(), "freqTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9790;
        Object retValue = callMethod(klass, "equals", argTypes, term9708, args);
        assertTrue(recursiveEquals(term9708, term9821));
        assertTrue(recursiveEquals(term9790, term9822));
        assertTrue(recursiveEquals(retValue, true));
    }

};


