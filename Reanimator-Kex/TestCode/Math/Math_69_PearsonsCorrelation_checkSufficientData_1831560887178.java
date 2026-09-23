package org.apache.commons.math.stat.correlation;

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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.correlation.EqualityUtils.*;

public class PearsonsCorrelation_checkSufficientData_1831560887178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1853048;
     Object term1853150;
     Object term2021971;
     Object term2021972;

    public PearsonsCorrelation_checkSufficientData_1831560887178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1853048 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term1853150 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term1853150, term1853150.getClass(), "rows", 2);
        setIntField(term1853150, term1853150.getClass(), "columns", 2);
        term2021971 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term2021971, term2021971.getClass(), "correlationMatrix", null);
        setIntField(term2021971, term2021971.getClass(), "nObs", 0);
        term2021972 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term2021972, term2021972.getClass(), "rows", 2);
        setIntField(term2021972, term2021972.getClass(), "columns", 2);
        setField(term2021972, term2021972.getClass(), "entries", null);
        setField(term2021972, term2021972.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term1853150;
        callMethod(klass, "checkSufficientData", argTypes, term1853048, args);
        assertTrue(recursiveEquals(term1853048, term2021971));
        assertTrue(recursiveEquals(term1853150, term2021972));
    }

};


