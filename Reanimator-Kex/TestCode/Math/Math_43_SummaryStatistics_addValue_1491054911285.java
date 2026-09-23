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
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_addValue_1491054911285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76333;

    public SummaryStatistics_addValue_1491054911285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76333 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term76443 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term76571 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term76675 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term76785 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term76903 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Kurtosis"));
        setDoubleField(term76443, term76443.getClass(), "value", 7.2059793061718176E16);
        setLongField(term76443, term76443.getClass(), "n", 0L);
        setField(term76333, term76333.getClass(), "sumImpl", term76443);
        setDoubleField(term76571, term76571.getClass(), "value", 7.2059793061718176E16);
        setLongField(term76571, term76571.getClass(), "n", 0L);
        setField(term76333, term76333.getClass(), "sumsqImpl", term76571);
        setDoubleField(term76675, term76675.getClass(), "value", 7.2059793061718176E16);
        setLongField(term76675, term76675.getClass(), "n", 0L);
        setField(term76333, term76333.getClass(), "minImpl", term76675);
        setBooleanField(term76785, term76785.getClass(), "incMoment", false);
        setField(term76333, term76333.getClass(), "maxImpl", term76785);
        setField(term76333, term76333.getClass(), "sumLogImpl", term76903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.577718159285469E-231;
        callMethod(klass, "addValue", argTypes, term76333, args);
    }

};


