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

public class AbstractIntegrator_setEquations_88824340734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public AbstractIntegrator_setEquations_88824340734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term34 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term37 = (double[]) newDoubleArray(4);
        double[] term42 = (double[]) newDoubleArray(1);
        setField(term33, term33.getClass(), "equation", null);
        setIntField(term34, term34.getClass(), "firstIndex", -616727354);
        setIntField(term34, term34.getClass(), "dimension", -1955890973);
        setField(term33, term33.getClass(), "mapper", term34);
        setDoubleElement(term37, 0, 0.7031006357544823);
        setDoubleElement(term37, 1, 0.9527281779865117);
        setDoubleElement(term37, 2, 0.9828442029246764);
        setDoubleElement(term37, 3, 0.2779719046761513);
        setField(term33, term33.getClass(), "state", term37);
        setDoubleElement(term42, 0, 0.6436713023569729);
        setField(term33, term33.getClass(), "stateDot", term42);
        Object term44 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term45 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term48 = (double[]) newDoubleArray(6);
        double[] term55 = (double[]) newDoubleArray(2);
        setField(term44, term44.getClass(), "equation", null);
        setIntField(term45, term45.getClass(), "firstIndex", -2038273078);
        setIntField(term45, term45.getClass(), "dimension", 1227103734);
        setField(term44, term44.getClass(), "mapper", term45);
        setDoubleElement(term48, 0, 0.7332741045694002);
        setDoubleElement(term48, 1, 0.4569171842750229);
        setDoubleElement(term48, 2, 0.8598297828918529);
        setDoubleElement(term48, 3, 0.43692187681405226);
        setDoubleElement(term48, 4, 0.7633268466829064);
        setDoubleElement(term48, 5, 0.13481025392611334);
        setField(term44, term44.getClass(), "state", term48);
        setDoubleElement(term55, 0, 0.3800088629986428);
        setDoubleElement(term55, 1, 0.5840714198152577);
        setField(term44, term44.getClass(), "stateDot", term55);
        Object term58 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term59 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term62 = (double[]) newDoubleArray(6);
        double[] term69 = (double[]) newDoubleArray(7);
        setField(term58, term58.getClass(), "equation", null);
        setIntField(term59, term59.getClass(), "firstIndex", -1339778481);
        setIntField(term59, term59.getClass(), "dimension", 1725571209);
        setField(term58, term58.getClass(), "mapper", term59);
        setDoubleElement(term62, 0, 0.7559240768573477);
        setDoubleElement(term62, 1, 0.10667076642995188);
        setDoubleElement(term62, 2, 0.11493000848982304);
        setDoubleElement(term62, 3, 0.37161417339133307);
        setDoubleElement(term62, 4, 0.6805867182029153);
        setDoubleElement(term62, 5, 0.2852810965221698);
        setField(term58, term58.getClass(), "state", term62);
        setDoubleElement(term69, 0, 0.6300849762307866);
        setDoubleElement(term69, 1, 0.9737083944266686);
        setDoubleElement(term69, 2, 0.0668892744806211);
        setDoubleElement(term69, 3, 0.3587267442738795);
        setDoubleElement(term69, 4, 0.07802449704920456);
        setDoubleElement(term69, 5, 0.5279279537140873);
        setDoubleElement(term69, 6, 0.3202192021706908);
        setField(term58, term58.getClass(), "stateDot", term69);
        ArrayList term31 = new ArrayList();
        ((ArrayList) term31).add(term33);
        ((ArrayList) term31).add(term44);
        ((ArrayList) term31).add(term58);
        term15 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object term16 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term20 = (double[]) newDoubleArray(5);
        double[] term26 = (double[]) newDoubleArray(4);
        setField(term15, term15.getClass(), "primary", null);
        setIntField(term16, term16.getClass(), "firstIndex", 391863371);
        setIntField(term16, term16.getClass(), "dimension", -1922583790);
        setField(term15, term15.getClass(), "primaryMapper", term16);
        setDoubleField(term15, term15.getClass(), "time", 0.28570734989730284);
        setDoubleElement(term20, 0, 0.40176586625454525);
        setDoubleElement(term20, 1, 0.2641345529914265);
        setDoubleElement(term20, 2, 0.36923381893433327);
        setDoubleElement(term20, 3, 0.6076495596892013);
        setDoubleElement(term20, 4, 0.37773193782763337);
        setField(term15, term15.getClass(), "primaryState", term20);
        setDoubleElement(term26, 0, 0.8474802076607362);
        setDoubleElement(term26, 1, 0.5183269973490326);
        setDoubleElement(term26, 2, 0.7655020693602768);
        setDoubleElement(term26, 3, 0.1374549299694151);
        setField(term15, term15.getClass(), "primaryStateDot", term26);
        setField(term15, term15.getClass(), "components", term31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE");
        Object[] args = new Object[1];
        args[0] = term15;
        try {
            callMethod(klass, "setEquations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


