package org.apache.commons.math.stat.descriptive;

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
import org.apache.commons.math.exception.NullArgumentException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SummaryStatistics_copy_2134835667199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44292;

    public SummaryStatistics_copy_2134835667199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44292 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Object[] args = new Object[2];
        args[0] = term44292;
        args[1] = null;
        try {
            callMethod(klass, "copy", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


