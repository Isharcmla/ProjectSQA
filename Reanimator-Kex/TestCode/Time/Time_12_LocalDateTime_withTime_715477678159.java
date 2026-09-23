package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LocalDateTime_withTime_715477678159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38332;
     Object term38334;
     Object term38336;
     Object term38338;
     Object term38340;

    public LocalDateTime_withTime_715477678159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38332 = newInstance(Class.forName("org.joda.time.LocalDateTime"));
        setLongField(term38332, term38332.getClass(), "iLocalMillis", 0L);
        setField(term38332, term38332.getClass(), "iChronology", null);
        term38334 = new Integer(0);
        term38336 = new Integer(0);
        term38338 = new Integer(0);
        term38340 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term38334;
        args[1] = term38336;
        args[2] = term38338;
        args[3] = term38340;
        callMethod(klass, "withTime", argTypes, term38332, args);
    }

};


