package org.apache.commons.math3.optim.nonlinear.vector;

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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Weight_getWeight_1253785039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345;

    public Weight_getWeight_1253785039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1345 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Object term1445 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term1345, term1345.getClass(), "weightMatrix", term1445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWeight", argTypes, term1345, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


