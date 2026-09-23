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

public class PearsonsCorrelation_getCorrelationMatrix_93217457818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term2218;

    public PearsonsCorrelation_getCorrelationMatrix_93217457818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term47, term47.getClass(), "correlationMatrix", null);
        setIntField(term47, term47.getClass(), "nObs", 1484323161);
        term2218 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term2218, term2218.getClass(), "correlationMatrix", null);
        setIntField(term2218, term2218.getClass(), "nObs", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCorrelationMatrix", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term2218));
        assertTrue(recursiveEquals(retValue, null));
    }

};


