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

public class StopWatch_suspend_59749897657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6105;
     Object term10994;

    public StopWatch_suspend_59749897657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6105 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term6105, term6105.getClass(), "runningState", 1);
        term10994 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term10994, term10994.getClass(), "runningState", 3);
        setIntField(term10994, term10994.getClass(), "splitState", 0);
        setLongField(term10994, term10994.getClass(), "startTime", 0L);
        setLongField(term10994, term10994.getClass(), "stopTime", 1790161812650L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "suspend", argTypes, term6105, args);
        assertTrue(recursiveEquals(term6105, term10994));
    }

};


