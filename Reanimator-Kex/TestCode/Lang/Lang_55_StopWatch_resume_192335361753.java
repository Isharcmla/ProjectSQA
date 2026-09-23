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

public class StopWatch_resume_192335361753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4498;
     Object term7429;

    public StopWatch_resume_192335361753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4498 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term4498, term4498.getClass(), "runningState", 3);
        term7429 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term7429, term7429.getClass(), "runningState", 1);
        setIntField(term7429, term7429.getClass(), "splitState", 0);
        setLongField(term7429, term7429.getClass(), "startTime", 1790161811898L);
        setLongField(term7429, term7429.getClass(), "stopTime", -1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resume", argTypes, term4498, args);
        assertTrue(recursiveEquals(term4498, term7429));
    }

};


