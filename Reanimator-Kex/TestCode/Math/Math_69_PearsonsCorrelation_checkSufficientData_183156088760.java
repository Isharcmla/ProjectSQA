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

public class PearsonsCorrelation_checkSufficientData_183156088760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525054;
     Object term525152;

    public PearsonsCorrelation_checkSufficientData_183156088760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525054 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term525152 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term525152, term525152.getClass(), "rows", 2);
        setIntField(term525152, term525152.getClass(), "columns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term525152;
        callMethod(klass, "checkSufficientData", argTypes, term525054, args);
    }

};


