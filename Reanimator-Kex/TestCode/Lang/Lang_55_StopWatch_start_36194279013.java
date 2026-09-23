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

public class StopWatch_start_36194279013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public StopWatch_start_36194279013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term1, term1.getClass(), "runningState", 1162663216);
        setIntField(term1, term1.getClass(), "splitState", 10);
        setLongField(term1, term1.getClass(), "startTime", -1L);
        setLongField(term1, term1.getClass(), "stopTime", -1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "start", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


