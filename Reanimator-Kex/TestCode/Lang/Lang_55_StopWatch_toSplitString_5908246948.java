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

public class StopWatch_toSplitString_5908246948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4026;
     Object term6003;

    public StopWatch_toSplitString_5908246948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4026 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term4026, term4026.getClass(), "splitState", 11);
        term6003 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term6003, term6003.getClass(), "runningState", 0);
        setIntField(term6003, term6003.getClass(), "splitState", 11);
        setLongField(term6003, term6003.getClass(), "startTime", 0L);
        setLongField(term6003, term6003.getClass(), "stopTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toSplitString", argTypes, term4026, args);
        assertTrue(recursiveEquals(term4026, term6003));
        assertTrue(recursiveEquals(retValue, "0:00:00.000"));
    }

};


