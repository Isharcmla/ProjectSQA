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

public class PearsonsCorrelation_checkSufficientData_183156088769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528092;
     Object term528190;
     Object term528202;
     Object term528203;

    public PearsonsCorrelation_checkSufficientData_183156088769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528092 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term528190 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term528190, term528190.getClass(), "rows", 2);
        setIntField(term528190, term528190.getClass(), "columns", 2);
        term528202 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term528202, term528202.getClass(), "correlationMatrix", null);
        setIntField(term528202, term528202.getClass(), "nObs", 0);
        term528203 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term528203, term528203.getClass(), "blocks", null);
        setIntField(term528203, term528203.getClass(), "rows", 2);
        setIntField(term528203, term528203.getClass(), "columns", 2);
        setIntField(term528203, term528203.getClass(), "blockRows", 0);
        setIntField(term528203, term528203.getClass(), "blockColumns", 0);
        setField(term528203, term528203.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term528190;
        callMethod(klass, "checkSufficientData", argTypes, term528092, args);
        assertTrue(recursiveEquals(term528092, term528202));
        assertTrue(recursiveEquals(term528190, term528203));
    }

};


