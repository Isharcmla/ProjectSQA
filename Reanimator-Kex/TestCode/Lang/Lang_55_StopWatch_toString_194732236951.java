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

public class StopWatch_toString_194732236951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312;
     Object term7279;

    public StopWatch_toString_194732236951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4312 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term4312, term4312.getClass(), "runningState", 1);
        term7279 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term7279, term7279.getClass(), "runningState", 1);
        setIntField(term7279, term7279.getClass(), "splitState", 0);
        setLongField(term7279, term7279.getClass(), "startTime", 0L);
        setLongField(term7279, term7279.getClass(), "stopTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term4312, args);
        assertTrue(recursiveEquals(term4312, term7279));
        assertTrue(recursiveEquals(retValue, "497267:10:11.457"));
    }

};


