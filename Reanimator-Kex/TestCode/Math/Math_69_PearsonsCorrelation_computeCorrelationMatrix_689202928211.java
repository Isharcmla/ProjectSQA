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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_computeCorrelationMatrix_689202928211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2482122;
     Object term2482224;

    public PearsonsCorrelation_computeCorrelationMatrix_689202928211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2482122 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term2482224 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2482332 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term2482224, term2482224.getClass(), "columns", 2);
        setIntField(term2482224, term2482224.getClass(), "rows", 2);
        setField(term2482224, term2482224.getClass(), "entries", term2482332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term2482224;
        try {
            callMethod(klass, "computeCorrelationMatrix", argTypes, term2482122, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


