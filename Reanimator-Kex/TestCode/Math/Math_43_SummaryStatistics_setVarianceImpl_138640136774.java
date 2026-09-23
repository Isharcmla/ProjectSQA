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
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_setVarianceImpl_138640136774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990;
     Object term8875;

    public SummaryStatistics_setVarianceImpl_138640136774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term990 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term992 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term998 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term1001 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term1004 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term1007 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term1010 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term1013 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term1014 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term1016 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term990, term990.getClass(), "n", -484994522244390100L);
        setDoubleField(term992, term992.getClass(), "m2", Double.NaN);
        setLongField(term992, term992.getClass(), "n", 0L);
        setDoubleField(term992, term992.getClass(), "m1", Double.NaN);
        setDoubleField(term992, term992.getClass(), "dev", Double.NaN);
        setDoubleField(term992, term992.getClass(), "nDev", Double.NaN);
        setField(term992, term992.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "secondMoment", term992);
        setLongField(term998, term998.getClass(), "n", 0L);
        setDoubleField(term998, term998.getClass(), "value", 0.0);
        setField(term998, term998.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "sum", term998);
        setLongField(term1001, term1001.getClass(), "n", 0L);
        setDoubleField(term1001, term1001.getClass(), "value", 0.0);
        setField(term1001, term1001.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "sumsq", term1001);
        setLongField(term1004, term1004.getClass(), "n", 0L);
        setDoubleField(term1004, term1004.getClass(), "value", Double.NaN);
        setField(term1004, term1004.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "min", term1004);
        setLongField(term1007, term1007.getClass(), "n", 0L);
        setDoubleField(term1007, term1007.getClass(), "value", Double.NaN);
        setField(term1007, term1007.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "max", term1007);
        setIntField(term1010, term1010.getClass(), "n", 0);
        setDoubleField(term1010, term1010.getClass(), "value", 0.0);
        setField(term1010, term1010.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "sumLog", term1010);
        setField(term1013, term1013.getClass(), "sumOfLogs", term1010);
        setField(term1013, term1013.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "geoMean", term1013);
        setField(term1014, term1014.getClass(), "moment", term992);
        setBooleanField(term1014, term1014.getClass(), "incMoment", false);
        setField(term1014, term1014.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "mean", term1014);
        setField(term1016, term1016.getClass(), "moment", term992);
        setBooleanField(term1016, term1016.getClass(), "incMoment", false);
        setBooleanField(term1016, term1016.getClass(), "isBiasCorrected", true);
        setField(term1016, term1016.getClass(), "storedData", null);
        setField(term990, term990.getClass(), "variance", term1016);
        setField(term990, term990.getClass(), "sumImpl", term998);
        setField(term990, term990.getClass(), "sumsqImpl", term1001);
        setField(term990, term990.getClass(), "minImpl", term1004);
        setField(term990, term990.getClass(), "maxImpl", term1007);
        setField(term990, term990.getClass(), "sumLogImpl", term1010);
        setField(term990, term990.getClass(), "geoMeanImpl", term1013);
        setField(term990, term990.getClass(), "meanImpl", term1014);
        setField(term990, term990.getClass(), "varianceImpl", term1016);
        term8875 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term8876 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term9126 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term9132 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term9136 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term9137 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term9138 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term9139 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term9140 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term9141 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term8875, term8875.getClass(), "n", -484994522244390100L);
        setDoubleField(term8876, term8876.getClass(), "m2", Double.NaN);
        setLongField(term8876, term8876.getClass(), "n", 0L);
        setDoubleField(term8876, term8876.getClass(), "m1", Double.NaN);
        setDoubleField(term8876, term8876.getClass(), "dev", Double.NaN);
        setDoubleField(term8876, term8876.getClass(), "nDev", Double.NaN);
        setField(term8876, term8876.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "secondMoment", term8876);
        setLongField(term9126, term9126.getClass(), "n", 0L);
        setDoubleField(term9126, term9126.getClass(), "value", 0.0);
        setField(term9126, term9126.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "sum", term9126);
        setLongField(term9132, term9132.getClass(), "n", 0L);
        setDoubleField(term9132, term9132.getClass(), "value", 0.0);
        setField(term9132, term9132.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "sumsq", term9132);
        setLongField(term9136, term9136.getClass(), "n", 0L);
        setDoubleField(term9136, term9136.getClass(), "value", Double.NaN);
        setField(term9136, term9136.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "min", term9136);
        setLongField(term9137, term9137.getClass(), "n", 0L);
        setDoubleField(term9137, term9137.getClass(), "value", Double.NaN);
        setField(term9137, term9137.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "max", term9137);
        setIntField(term9138, term9138.getClass(), "n", 0);
        setDoubleField(term9138, term9138.getClass(), "value", 0.0);
        setField(term9138, term9138.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "sumLog", term9138);
        setField(term9139, term9139.getClass(), "sumOfLogs", term9138);
        setField(term9139, term9139.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "geoMean", term9139);
        setField(term9140, term9140.getClass(), "moment", term8876);
        setBooleanField(term9140, term9140.getClass(), "incMoment", false);
        setField(term9140, term9140.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "mean", term9140);
        setField(term9141, term9141.getClass(), "moment", term8876);
        setBooleanField(term9141, term9141.getClass(), "incMoment", false);
        setBooleanField(term9141, term9141.getClass(), "isBiasCorrected", true);
        setField(term9141, term9141.getClass(), "storedData", null);
        setField(term8875, term8875.getClass(), "variance", term9141);
        setField(term8875, term8875.getClass(), "sumImpl", term9126);
        setField(term8875, term8875.getClass(), "sumsqImpl", term9132);
        setField(term8875, term8875.getClass(), "minImpl", term9136);
        setField(term8875, term8875.getClass(), "maxImpl", term9137);
        setField(term8875, term8875.getClass(), "sumLogImpl", term9138);
        setField(term8875, term8875.getClass(), "geoMeanImpl", term9139);
        setField(term8875, term8875.getClass(), "meanImpl", term9140);
        setField(term8875, term8875.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVarianceImpl", argTypes, term990, args);
        assertTrue(recursiveEquals(term990, term8875));
    }

};


