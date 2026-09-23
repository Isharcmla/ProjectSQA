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
import org.apache.commons.math.exception.MathIllegalStateException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_checkEmpty_11673545975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019;

    public SummaryStatistics_checkEmpty_11673545975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1019 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term1021 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term1027 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term1030 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term1033 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term1036 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term1039 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term1042 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term1043 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term1045 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term1019, term1019.getClass(), "n", 1233889271256172047L);
        setDoubleField(term1021, term1021.getClass(), "m2", Double.NaN);
        setLongField(term1021, term1021.getClass(), "n", 0L);
        setDoubleField(term1021, term1021.getClass(), "m1", Double.NaN);
        setDoubleField(term1021, term1021.getClass(), "dev", Double.NaN);
        setDoubleField(term1021, term1021.getClass(), "nDev", Double.NaN);
        setField(term1021, term1021.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "secondMoment", term1021);
        setLongField(term1027, term1027.getClass(), "n", 0L);
        setDoubleField(term1027, term1027.getClass(), "value", 0.0);
        setField(term1027, term1027.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "sum", term1027);
        setLongField(term1030, term1030.getClass(), "n", 0L);
        setDoubleField(term1030, term1030.getClass(), "value", 0.0);
        setField(term1030, term1030.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "sumsq", term1030);
        setLongField(term1033, term1033.getClass(), "n", 0L);
        setDoubleField(term1033, term1033.getClass(), "value", Double.NaN);
        setField(term1033, term1033.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "min", term1033);
        setLongField(term1036, term1036.getClass(), "n", 0L);
        setDoubleField(term1036, term1036.getClass(), "value", Double.NaN);
        setField(term1036, term1036.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "max", term1036);
        setIntField(term1039, term1039.getClass(), "n", 0);
        setDoubleField(term1039, term1039.getClass(), "value", 0.0);
        setField(term1039, term1039.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "sumLog", term1039);
        setField(term1042, term1042.getClass(), "sumOfLogs", term1039);
        setField(term1042, term1042.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "geoMean", term1042);
        setField(term1043, term1043.getClass(), "moment", term1021);
        setBooleanField(term1043, term1043.getClass(), "incMoment", false);
        setField(term1043, term1043.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "mean", term1043);
        setField(term1045, term1045.getClass(), "moment", term1021);
        setBooleanField(term1045, term1045.getClass(), "incMoment", false);
        setBooleanField(term1045, term1045.getClass(), "isBiasCorrected", true);
        setField(term1045, term1045.getClass(), "storedData", null);
        setField(term1019, term1019.getClass(), "variance", term1045);
        setField(term1019, term1019.getClass(), "sumImpl", term1027);
        setField(term1019, term1019.getClass(), "sumsqImpl", term1030);
        setField(term1019, term1019.getClass(), "minImpl", term1033);
        setField(term1019, term1019.getClass(), "maxImpl", term1036);
        setField(term1019, term1019.getClass(), "sumLogImpl", term1039);
        setField(term1019, term1019.getClass(), "geoMeanImpl", term1042);
        setField(term1019, term1019.getClass(), "meanImpl", term1043);
        setField(term1019, term1019.getClass(), "varianceImpl", term1045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkEmpty", argTypes, term1019, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


