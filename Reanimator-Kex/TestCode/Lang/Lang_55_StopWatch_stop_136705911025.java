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

public class StopWatch_stop_136705911025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;
     Object term3033;

    public StopWatch_stop_136705911025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3026 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3026, term3026.getClass(), "runningState", 1);
        term3033 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3033, term3033.getClass(), "runningState", 2);
        setIntField(term3033, term3033.getClass(), "splitState", 0);
        setLongField(term3033, term3033.getClass(), "startTime", 0L);
        setLongField(term3033, term3033.getClass(), "stopTime", 1790161809929L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term3026, args);
        assertTrue(recursiveEquals(term3026, term3033));
    }

};


