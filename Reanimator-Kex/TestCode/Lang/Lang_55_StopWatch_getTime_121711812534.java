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

public class StopWatch_getTime_121711812534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3434;
     Object term3536;

    public StopWatch_getTime_121711812534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3434 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3434, term3434.getClass(), "runningState", 1);
        term3536 = newInstance(Class.forName("org.apache.commons.lang.time.StopWatch"));
        setIntField(term3536, term3536.getClass(), "runningState", 1);
        setIntField(term3536, term3536.getClass(), "splitState", 0);
        setLongField(term3536, term3536.getClass(), "startTime", 0L);
        setLongField(term3536, term3536.getClass(), "stopTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTime", argTypes, term3434, args);
        assertTrue(recursiveEquals(term3434, term3536));
        assertTrue(recursiveEquals(retValue, 1790161810375L));
    }

};


