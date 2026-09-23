package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;

public class StopWatch_start_36194279031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;
     Object term3336;

    public StopWatch_start_36194279031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3313 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3313, term3313.getClass(), "runningState", 0);
        term3336 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3336, term3336.getClass(), "runningState", 1);
        setIntField(term3336, term3336.getClass(), "splitState", 0);
        setLongField(term3336, term3336.getClass(), "startTime", 1790161810234L);
        setLongField(term3336, term3336.getClass(), "stopTime", -1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term3313, args);
        assertTrue(recursiveEquals(term3313, term3336));
    }

};


