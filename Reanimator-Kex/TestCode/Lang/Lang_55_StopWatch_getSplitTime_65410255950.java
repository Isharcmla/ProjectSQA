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

public class StopWatch_getSplitTime_65410255950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4118;
     Object term6113;

    public StopWatch_getSplitTime_65410255950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4118 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term4118, term4118.getClass(), "splitState", 11);
        term6113 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term6113, term6113.getClass(), "runningState", 0);
        setIntField(term6113, term6113.getClass(), "splitState", 11);
        setLongField(term6113, term6113.getClass(), "startTime", 0L);
        setLongField(term6113, term6113.getClass(), "stopTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSplitTime", argTypes, term4118, args);
        assertTrue(recursiveEquals(term4118, term6113));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


