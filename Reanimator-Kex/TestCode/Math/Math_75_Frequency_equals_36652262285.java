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

public class Frequency_equals_36652262285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7466;
     Object term7470;
     Object term7471;

    public Frequency_equals_36652262285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7466 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        term7470 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term7470, term7470.getClass(), "freqTable", null);
        term7471 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term7471, term7471.getClass(), "freqTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7466;
        Object retValue = callMethod(klass, "equals", argTypes, term7466, args);
        assertTrue(recursiveEquals(term7466, term7470));
        assertTrue(recursiveEquals(term7466, term7471));
        assertTrue(recursiveEquals(retValue, true));
    }

};


