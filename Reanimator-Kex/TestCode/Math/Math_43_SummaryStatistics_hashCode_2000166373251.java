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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_hashCode_2000166373251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54787;

    public SummaryStatistics_hashCode_2000166373251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54787 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics$AggregatingSummaryStatistics"));
        Object term54911 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FirstMoment"));
        Object term55035 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.ThirdMoment"));
        setDoubleField(term54911, term54911.getClass(), "m1", 0.0);
        setField(term54787, term54787.getClass(), "geoMeanImpl", term54911);
        setField(term54787, term54787.getClass(), "maxImpl", term55035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term54787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


