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

public class StopWatch_split_25731679855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;
     Object term9843;

    public StopWatch_split_25731679855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term4779, term4779.getClass(), "runningState", 1);
        term9843 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term9843, term9843.getClass(), "runningState", 1);
        setIntField(term9843, term9843.getClass(), "splitState", 11);
        setLongField(term9843, term9843.getClass(), "startTime", 0L);
        setLongField(term9843, term9843.getClass(), "stopTime", 1790161812470L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "split", argTypes, term4779, args);
        assertTrue(recursiveEquals(term4779, term9843));
    }

};


