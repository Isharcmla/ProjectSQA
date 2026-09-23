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

public class StopWatch_stop_136705911030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;
     Object term3328;

    public StopWatch_stop_136705911030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3220 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3220, term3220.getClass(), "runningState", 3);
        term3328 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3328, term3328.getClass(), "runningState", 2);
        setIntField(term3328, term3328.getClass(), "splitState", 0);
        setLongField(term3328, term3328.getClass(), "startTime", 0L);
        setLongField(term3328, term3328.getClass(), "stopTime", 1790161810144L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term3220, args);
        assertTrue(recursiveEquals(term3220, term3328));
    }

};


