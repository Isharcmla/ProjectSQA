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
import java.lang.Object;

public class PearsonsCorrelation_computeCorrelationMatrix_68920292873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528869;
     Object term528971;
     Object term529004;
     Object term529005;
     Object term528978;

    public PearsonsCorrelation_computeCorrelationMatrix_68920292873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528869 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term528971 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term528971, term528971.getClass(), "columns", 1);
        term529004 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term529004, term529004.getClass(), "correlationMatrix", null);
        setIntField(term529004, term529004.getClass(), "nObs", 0);
        term529005 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term529005, term529005.getClass(), "rows", 0);
        setIntField(term529005, term529005.getClass(), "columns", 1);
        setField(term529005, term529005.getClass(), "entries", null);
        setField(term529005, term529005.getClass(), "lu", null);
        term528978 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term528979 = (Object[]) newArray("[D", 1);
        double[] term528980 = (double[]) newDoubleArray(1);
        setDoubleElement(term528980, 0, 1.0);
        setElement(term528979, 0, term528980);
        setField(term528978, term528978.getClass(), "blocks", term528979);
        setIntField(term528978, term528978.getClass(), "rows", 1);
        setIntField(term528978, term528978.getClass(), "columns", 1);
        setIntField(term528978, term528978.getClass(), "blockRows", 1);
        setIntField(term528978, term528978.getClass(), "blockColumns", 1);
        setField(term528978, term528978.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term528971;
        Object retValue = callMethod(klass, "computeCorrelationMatrix", argTypes, term528869, args);
        assertTrue(recursiveEquals(term528869, term529004));
        assertTrue(recursiveEquals(term528971, term529005));
        assertTrue(recursiveEquals(retValue, term528978));
    }

};


