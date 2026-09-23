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

public class PearsonsCorrelation_covarianceToCorrelation_684660402109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098995;
     Object term1099093;

    public PearsonsCorrelation_covarianceToCorrelation_684660402109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1098995 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term1099093 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term1098787 = (Object[]) newArray("[D", 236);
        setIntField(term1099093, term1099093.getClass(), "columns", 1);
        setIntField(term1099093, term1099093.getClass(), "blockColumns", -2);
        setField(term1099093, term1099093.getClass(), "blocks", term1098787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term1099093;
        try {
            callMethod(klass, "covarianceToCorrelation", argTypes, term1098995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


