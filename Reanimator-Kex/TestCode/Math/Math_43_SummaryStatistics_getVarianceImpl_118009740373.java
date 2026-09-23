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

public class SummaryStatistics_getVarianceImpl_118009740373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961;
     Object term8834;
     Object term8805;

    public SummaryStatistics_getVarianceImpl_118009740373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term961 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term963 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term969 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term972 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term975 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term978 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term981 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term984 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term985 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term987 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term961, term961.getClass(), "n", -6823727938421990489L);
        setDoubleField(term963, term963.getClass(), "m2", Double.NaN);
        setLongField(term963, term963.getClass(), "n", 0L);
        setDoubleField(term963, term963.getClass(), "m1", Double.NaN);
        setDoubleField(term963, term963.getClass(), "dev", Double.NaN);
        setDoubleField(term963, term963.getClass(), "nDev", Double.NaN);
        setField(term963, term963.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "secondMoment", term963);
        setLongField(term969, term969.getClass(), "n", 0L);
        setDoubleField(term969, term969.getClass(), "value", 0.0);
        setField(term969, term969.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "sum", term969);
        setLongField(term972, term972.getClass(), "n", 0L);
        setDoubleField(term972, term972.getClass(), "value", 0.0);
        setField(term972, term972.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "sumsq", term972);
        setLongField(term975, term975.getClass(), "n", 0L);
        setDoubleField(term975, term975.getClass(), "value", Double.NaN);
        setField(term975, term975.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "min", term975);
        setLongField(term978, term978.getClass(), "n", 0L);
        setDoubleField(term978, term978.getClass(), "value", Double.NaN);
        setField(term978, term978.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "max", term978);
        setIntField(term981, term981.getClass(), "n", 0);
        setDoubleField(term981, term981.getClass(), "value", 0.0);
        setField(term981, term981.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "sumLog", term981);
        setField(term984, term984.getClass(), "sumOfLogs", term981);
        setField(term984, term984.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "geoMean", term984);
        setField(term985, term985.getClass(), "moment", term963);
        setBooleanField(term985, term985.getClass(), "incMoment", false);
        setField(term985, term985.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "mean", term985);
        setField(term987, term987.getClass(), "moment", term963);
        setBooleanField(term987, term987.getClass(), "incMoment", false);
        setBooleanField(term987, term987.getClass(), "isBiasCorrected", true);
        setField(term987, term987.getClass(), "storedData", null);
        setField(term961, term961.getClass(), "variance", term987);
        setField(term961, term961.getClass(), "sumImpl", term969);
        setField(term961, term961.getClass(), "sumsqImpl", term972);
        setField(term961, term961.getClass(), "minImpl", term975);
        setField(term961, term961.getClass(), "maxImpl", term978);
        setField(term961, term961.getClass(), "sumLogImpl", term981);
        setField(term961, term961.getClass(), "geoMeanImpl", term984);
        setField(term961, term961.getClass(), "meanImpl", term985);
        setField(term961, term961.getClass(), "varianceImpl", term987);
        term8834 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term8835 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term8836 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term8837 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term8838 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term8839 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term8840 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term8841 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term8842 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term8843 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term8834, term8834.getClass(), "n", -6823727938421990489L);
        setDoubleField(term8835, term8835.getClass(), "m2", Double.NaN);
        setLongField(term8835, term8835.getClass(), "n", 0L);
        setDoubleField(term8835, term8835.getClass(), "m1", Double.NaN);
        setDoubleField(term8835, term8835.getClass(), "dev", Double.NaN);
        setDoubleField(term8835, term8835.getClass(), "nDev", Double.NaN);
        setField(term8835, term8835.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "secondMoment", term8835);
        setLongField(term8836, term8836.getClass(), "n", 0L);
        setDoubleField(term8836, term8836.getClass(), "value", 0.0);
        setField(term8836, term8836.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "sum", term8836);
        setLongField(term8837, term8837.getClass(), "n", 0L);
        setDoubleField(term8837, term8837.getClass(), "value", 0.0);
        setField(term8837, term8837.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "sumsq", term8837);
        setLongField(term8838, term8838.getClass(), "n", 0L);
        setDoubleField(term8838, term8838.getClass(), "value", Double.NaN);
        setField(term8838, term8838.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "min", term8838);
        setLongField(term8839, term8839.getClass(), "n", 0L);
        setDoubleField(term8839, term8839.getClass(), "value", Double.NaN);
        setField(term8839, term8839.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "max", term8839);
        setIntField(term8840, term8840.getClass(), "n", 0);
        setDoubleField(term8840, term8840.getClass(), "value", 0.0);
        setField(term8840, term8840.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "sumLog", term8840);
        setField(term8841, term8841.getClass(), "sumOfLogs", term8840);
        setField(term8841, term8841.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "geoMean", term8841);
        setField(term8842, term8842.getClass(), "moment", term8835);
        setBooleanField(term8842, term8842.getClass(), "incMoment", false);
        setField(term8842, term8842.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "mean", term8842);
        setField(term8843, term8843.getClass(), "moment", term8835);
        setBooleanField(term8843, term8843.getClass(), "incMoment", false);
        setBooleanField(term8843, term8843.getClass(), "isBiasCorrected", true);
        setField(term8843, term8843.getClass(), "storedData", null);
        setField(term8834, term8834.getClass(), "variance", term8843);
        setField(term8834, term8834.getClass(), "sumImpl", term8836);
        setField(term8834, term8834.getClass(), "sumsqImpl", term8837);
        setField(term8834, term8834.getClass(), "minImpl", term8838);
        setField(term8834, term8834.getClass(), "maxImpl", term8839);
        setField(term8834, term8834.getClass(), "sumLogImpl", term8840);
        setField(term8834, term8834.getClass(), "geoMeanImpl", term8841);
        setField(term8834, term8834.getClass(), "meanImpl", term8842);
        setField(term8834, term8834.getClass(), "varianceImpl", term8843);
        term8805 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term8806 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setDoubleField(term8806, term8806.getClass(), "m2", Double.NaN);
        setLongField(term8806, term8806.getClass(), "n", 0L);
        setDoubleField(term8806, term8806.getClass(), "m1", Double.NaN);
        setDoubleField(term8806, term8806.getClass(), "dev", Double.NaN);
        setDoubleField(term8806, term8806.getClass(), "nDev", Double.NaN);
        setField(term8806, term8806.getClass(), "storedData", null);
        setField(term8805, term8805.getClass(), "moment", term8806);
        setBooleanField(term8805, term8805.getClass(), "incMoment", false);
        setBooleanField(term8805, term8805.getClass(), "isBiasCorrected", true);
        setField(term8805, term8805.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVarianceImpl", argTypes, term961, args);
        assertTrue(recursiveEquals(term961, term8834));
        assertTrue(recursiveEquals(retValue, term8805));
    }

};


