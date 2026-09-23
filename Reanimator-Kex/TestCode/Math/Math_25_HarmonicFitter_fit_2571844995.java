package org.apache.commons.math3.optimization.fitting;

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
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_2571844995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public HarmonicFitter_fit_2571844995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term38, term38.getClass(), "weight", 0.7332741045694002);
        setDoubleField(term38, term38.getClass(), "x", 0.4569171842750229);
        setDoubleField(term38, term38.getClass(), "y", 0.8598297828918529);
        Object term42 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term42, term42.getClass(), "weight", 0.43692187681405226);
        setDoubleField(term42, term42.getClass(), "x", 0.7633268466829064);
        setDoubleField(term42, term42.getClass(), "y", 0.13481025392611334);
        Object term46 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term46, term46.getClass(), "weight", 0.3800088629986428);
        setDoubleField(term46, term46.getClass(), "x", 0.5840714198152577);
        setDoubleField(term46, term46.getClass(), "y", 0.7559240768573477);
        ArrayList term36 = new ArrayList();
        ((ArrayList) term36).add(term38);
        ((ArrayList) term36).add(term42);
        ((ArrayList) term36).add(term46);
        term35 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        setField(term35, term35.getClass(), "optimizer", null);
        setField(term35, term35.getClass(), "observations", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "fit", argTypes, term35, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


