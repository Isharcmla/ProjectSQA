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

public class SummaryStatistics_addValue_1491054911305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160657;

    public SummaryStatistics_addValue_1491054911305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160657 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term160767 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term160895 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term160999 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term161109 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term161213 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setDoubleField(term160767, term160767.getClass(), "value", 0.0);
        setLongField(term160767, term160767.getClass(), "n", 0L);
        setField(term160657, term160657.getClass(), "sumImpl", term160767);
        setDoubleField(term160895, term160895.getClass(), "value", 0.0);
        setLongField(term160895, term160895.getClass(), "n", 0L);
        setField(term160657, term160657.getClass(), "sumsqImpl", term160895);
        setDoubleField(term160999, term160999.getClass(), "value", -4.2866229395849216E18);
        setLongField(term160999, term160999.getClass(), "n", 0L);
        setField(term160657, term160657.getClass(), "minImpl", term160999);
        setBooleanField(term161109, term161109.getClass(), "incMoment", false);
        setField(term160657, term160657.getClass(), "maxImpl", term161109);
        setDoubleField(term161213, term161213.getClass(), "value", -3.4082934141380198E18);
        setField(term160657, term160657.getClass(), "sumLogImpl", term161213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.7300289006269764E80;
        try {
            callMethod(klass, "addValue", argTypes, term160657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


