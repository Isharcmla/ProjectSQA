package org.jfree.data.time;

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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeries_createCopy_1994343888170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34269;
     Object term34347;

    public TimeSeries_createCopy_1994343888170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34269 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term34347 = newInstance(Class.forName("org.jfree.data.time.Day"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[2];
        args[0] = term34347;
        args[1] = term34347;
        try {
            callMethod(klass, "createCopy", argTypes, term34269, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


