package org.apache.commons.math3.ode;

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
import static org.apache.commons.math3.ode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class AbstractIntegrator_sanityChecks_78661060639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;
     Object term244;

    public AbstractIntegrator_sanityChecks_78661060639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term212 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term213 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term216 = (double[]) newDoubleArray(1);
        double[] term218 = (double[]) newDoubleArray(9);
        setField(term212, term212.getClass(), "equation", null);
        setIntField(term213, term213.getClass(), "firstIndex", 597278769);
        setIntField(term213, term213.getClass(), "dimension", -1685132342);
        setField(term212, term212.getClass(), "mapper", term213);
        setDoubleElement(term216, 0, 0.146431486357265);
        setField(term212, term212.getClass(), "state", term216);
        setDoubleElement(term218, 0, 0.24259014218848696);
        setDoubleElement(term218, 1, 0.1544348383112728);
        setDoubleElement(term218, 2, 0.5187846213101265);
        setDoubleElement(term218, 3, 0.045893173090043815);
        setDoubleElement(term218, 4, 0.3626177854778667);
        setDoubleElement(term218, 5, 0.3163771663728089);
        setDoubleElement(term218, 6, 0.8819646072665548);
        setDoubleElement(term218, 7, 0.5412182593116958);
        setDoubleElement(term218, 8, 0.16988691727397487);
        setField(term212, term212.getClass(), "stateDot", term218);
        Object term228 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term229 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term232 = (double[]) newDoubleArray(3);
        double[] term236 = (double[]) newDoubleArray(5);
        setField(term228, term228.getClass(), "equation", null);
        setIntField(term229, term229.getClass(), "firstIndex", -1456670397);
        setIntField(term229, term229.getClass(), "dimension", 1622346318);
        setField(term228, term228.getClass(), "mapper", term229);
        setDoubleElement(term232, 0, 0.39286935532362843);
        setDoubleElement(term232, 1, 0.11577948268926874);
        setDoubleElement(term232, 2, 0.5617009352394552);
        setField(term228, term228.getClass(), "state", term232);
        setDoubleElement(term236, 0, 0.09067063848644474);
        setDoubleElement(term236, 1, 0.268304014379393);
        setDoubleElement(term236, 2, 0.7171972879282721);
        setDoubleElement(term236, 3, 0.9006361024877096);
        setDoubleElement(term236, 4, 0.5644914462415626);
        setField(term228, term228.getClass(), "stateDot", term236);
        ArrayList term210 = new ArrayList();
        ((ArrayList) term210).add(term212);
        ((ArrayList) term210).add(term228);
        term189 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object term190 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term194 = (double[]) newDoubleArray(8);
        double[] term203 = (double[]) newDoubleArray(6);
        setField(term189, term189.getClass(), "primary", null);
        setIntField(term190, term190.getClass(), "firstIndex", -883034806);
        setIntField(term190, term190.getClass(), "dimension", 1585847225);
        setField(term189, term189.getClass(), "primaryMapper", term190);
        setDoubleField(term189, term189.getClass(), "time", 0.7154795600170818);
        setDoubleElement(term194, 0, 0.6355029654528058);
        setDoubleElement(term194, 1, 0.0022646783892913414);
        setDoubleElement(term194, 2, 0.36226058076369927);
        setDoubleElement(term194, 3, 0.03699061125289671);
        setDoubleElement(term194, 4, 0.6047137830113202);
        setDoubleElement(term194, 5, 0.6767213143579776);
        setDoubleElement(term194, 6, 0.48862955528902696);
        setDoubleElement(term194, 7, 0.426231085465289);
        setField(term189, term189.getClass(), "primaryState", term194);
        setDoubleElement(term203, 0, 0.0027299293098262956);
        setDoubleElement(term203, 1, 0.29874017652881824);
        setDoubleElement(term203, 2, 0.32554480512985284);
        setDoubleElement(term203, 3, 0.8924855581421237);
        setDoubleElement(term203, 4, 0.32237559209193944);
        setDoubleElement(term203, 5, 0.53094494792755);
        setField(term189, term189.getClass(), "primaryStateDot", term203);
        setField(term189, term189.getClass(), "components", term210);
        term244 = new Double(0.509895859167191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term189;
        args[1] = term244;
        try {
            callMethod(klass, "sanityChecks", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


