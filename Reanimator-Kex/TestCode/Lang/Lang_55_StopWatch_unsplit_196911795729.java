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

public class StopWatch_unsplit_196911795729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3125;
     Object term3320;

    public StopWatch_unsplit_196911795729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3125 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3125, term3125.getClass(), "splitState", 11);
        term3320 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3320, term3320.getClass(), "runningState", 0);
        setIntField(term3320, term3320.getClass(), "splitState", 10);
        setLongField(term3320, term3320.getClass(), "startTime", 0L);
        setLongField(term3320, term3320.getClass(), "stopTime", -1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unsplit", argTypes, term3125, args);
        assertTrue(recursiveEquals(term3125, term3320));
    }

};


