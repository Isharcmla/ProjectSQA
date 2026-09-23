package org.apache.commons.math.ode;

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
import static org.apache.commons.math.ode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class AbstractIntegrator_sanityChecks_121915603239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term215;

    public AbstractIntegrator_sanityChecks_121915603239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term184 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term185 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term188 = (double[]) newDoubleArray(8);
        double[] term197 = (double[]) newDoubleArray(6);
        setField(term184, term184.getClass(), "equation", null);
        setIntField(term185, term185.getClass(), "firstIndex", -883034806);
        setIntField(term185, term185.getClass(), "dimension", 1585847225);
        setField(term184, term184.getClass(), "mapper", term185);
        setDoubleElement(term188, 0, 0.016575281023182953);
        setDoubleElement(term188, 1, 0.5308350402051779);
        setDoubleElement(term188, 2, 0.7154795600170818);
        setDoubleElement(term188, 3, 0.6355029654528058);
        setDoubleElement(term188, 4, 0.0022646783892913414);
        setDoubleElement(term188, 5, 0.36226058076369927);
        setDoubleElement(term188, 6, 0.03699061125289671);
        setDoubleElement(term188, 7, 0.6047137830113202);
        setField(term184, term184.getClass(), "state", term188);
        setDoubleElement(term197, 0, 0.6767213143579776);
        setDoubleElement(term197, 1, 0.48862955528902696);
        setDoubleElement(term197, 2, 0.426231085465289);
        setDoubleElement(term197, 3, 0.0027299293098262956);
        setDoubleElement(term197, 4, 0.29874017652881824);
        setDoubleElement(term197, 5, 0.32554480512985284);
        setField(term184, term184.getClass(), "stateDot", term197);
        Object term204 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term205 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term208 = (double[]) newDoubleArray(2);
        double[] term211 = (double[]) newDoubleArray(1);
        setField(term204, term204.getClass(), "equation", null);
        setIntField(term205, term205.getClass(), "firstIndex", 597278769);
        setIntField(term205, term205.getClass(), "dimension", -1685132342);
        setField(term204, term204.getClass(), "mapper", term205);
        setDoubleElement(term208, 0, 0.8924855581421237);
        setDoubleElement(term208, 1, 0.32237559209193944);
        setField(term204, term204.getClass(), "state", term208);
        setDoubleElement(term211, 0, 0.53094494792755);
        setField(term204, term204.getClass(), "stateDot", term211);
        ArrayList term182 = new ArrayList();
        ((ArrayList) term182).add(term184);
        ((ArrayList) term182).add(term204);
        term174 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object term175 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term179 = (double[]) newDoubleArray(1);
        double[] term181 = (double[]) newDoubleArray(0);
        setField(term174, term174.getClass(), "primary", null);
        setIntField(term175, term175.getClass(), "firstIndex", -522618178);
        setIntField(term175, term175.getClass(), "dimension", 1134449235);
        setField(term174, term174.getClass(), "primaryMapper", term175);
        setDoubleField(term174, term174.getClass(), "time", 0.022483645678509023);
        setDoubleElement(term179, 0, 0.025133051616627267);
        setField(term174, term174.getClass(), "primaryState", term179);
        setField(term174, term174.getClass(), "primaryStateDot", term181);
        setField(term174, term174.getClass(), "components", term182);
        term215 = new Double(0.146431486357265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term174;
        args[1] = term215;
        try {
            callMethod(klass, "sanityChecks", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


