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

public class AbstractIntegrator_setEquations_152472510334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;

    public AbstractIntegrator_setEquations_152472510334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term47 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term50 = (double[]) newDoubleArray(1);
        double[] term52 = (double[]) newDoubleArray(6);
        setField(term46, term46.getClass(), "equation", null);
        setIntField(term47, term47.getClass(), "firstIndex", -616727354);
        setIntField(term47, term47.getClass(), "dimension", -1955890973);
        setField(term46, term46.getClass(), "mapper", term47);
        setDoubleElement(term50, 0, 0.7332741045694002);
        setField(term46, term46.getClass(), "state", term50);
        setDoubleElement(term52, 0, 0.4569171842750229);
        setDoubleElement(term52, 1, 0.8598297828918529);
        setDoubleElement(term52, 2, 0.43692187681405226);
        setDoubleElement(term52, 3, 0.7633268466829064);
        setDoubleElement(term52, 4, 0.13481025392611334);
        setDoubleElement(term52, 5, 0.3800088629986428);
        setField(term46, term46.getClass(), "stateDot", term52);
        Object term59 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term60 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term63 = (double[]) newDoubleArray(2);
        double[] term66 = (double[]) newDoubleArray(6);
        setField(term59, term59.getClass(), "equation", null);
        setIntField(term60, term60.getClass(), "firstIndex", -2038273078);
        setIntField(term60, term60.getClass(), "dimension", 1227103734);
        setField(term59, term59.getClass(), "mapper", term60);
        setDoubleElement(term63, 0, 0.5840714198152577);
        setDoubleElement(term63, 1, 0.7559240768573477);
        setField(term59, term59.getClass(), "state", term63);
        setDoubleElement(term66, 0, 0.10667076642995188);
        setDoubleElement(term66, 1, 0.11493000848982304);
        setDoubleElement(term66, 2, 0.37161417339133307);
        setDoubleElement(term66, 3, 0.6805867182029153);
        setDoubleElement(term66, 4, 0.2852810965221698);
        setDoubleElement(term66, 5, 0.6300849762307866);
        setField(term59, term59.getClass(), "stateDot", term66);
        Object term73 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term74 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term77 = (double[]) newDoubleArray(7);
        double[] term85 = (double[]) newDoubleArray(1);
        setField(term73, term73.getClass(), "equation", null);
        setIntField(term74, term74.getClass(), "firstIndex", -1339778481);
        setIntField(term74, term74.getClass(), "dimension", 1725571209);
        setField(term73, term73.getClass(), "mapper", term74);
        setDoubleElement(term77, 0, 0.9737083944266686);
        setDoubleElement(term77, 1, 0.0668892744806211);
        setDoubleElement(term77, 2, 0.3587267442738795);
        setDoubleElement(term77, 3, 0.07802449704920456);
        setDoubleElement(term77, 4, 0.5279279537140873);
        setDoubleElement(term77, 5, 0.3202192021706908);
        setDoubleElement(term77, 6, 0.22651340641904605);
        setField(term73, term73.getClass(), "state", term77);
        setDoubleElement(term85, 0, 0.8878841294187743);
        setField(term73, term73.getClass(), "stateDot", term85);
        Object term87 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term88 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term91 = (double[]) newDoubleArray(6);
        double[] term98 = (double[]) newDoubleArray(5);
        setField(term87, term87.getClass(), "equation", null);
        setIntField(term88, term88.getClass(), "firstIndex", -522618178);
        setIntField(term88, term88.getClass(), "dimension", 1134449235);
        setField(term87, term87.getClass(), "mapper", term88);
        setDoubleElement(term91, 0, 0.6588948704887806);
        setDoubleElement(term91, 1, 0.6397214730945112);
        setDoubleElement(term91, 2, 0.25937345430928016);
        setDoubleElement(term91, 3, 0.5873228247510078);
        setDoubleElement(term91, 4, 0.8823181080774973);
        setDoubleElement(term91, 5, 0.2192450926212024);
        setField(term87, term87.getClass(), "state", term91);
        setDoubleElement(term98, 0, 0.7591353014991907);
        setDoubleElement(term98, 1, 0.791695029600875);
        setDoubleElement(term98, 2, 0.6862221294683138);
        setDoubleElement(term98, 3, 0.15917839663695388);
        setDoubleElement(term98, 4, 0.9374115574082594);
        setField(term87, term87.getClass(), "stateDot", term98);
        ArrayList term44 = new ArrayList();
        ((ArrayList) term44).add(term46);
        ((ArrayList) term44).add(term59);
        ((ArrayList) term44).add(term73);
        ((ArrayList) term44).add(term87);
        term30 = newInstance(Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object term31 = newInstance(Class.forName("org.apache.commons.math3.ode.EquationsMapper"));
        double[] term35 = (double[]) newDoubleArray(4);
        double[] term40 = (double[]) newDoubleArray(3);
        setField(term30, term30.getClass(), "primary", null);
        setIntField(term31, term31.getClass(), "firstIndex", 391863371);
        setIntField(term31, term31.getClass(), "dimension", -1922583790);
        setField(term30, term30.getClass(), "primaryMapper", term31);
        setDoubleField(term30, term30.getClass(), "time", 0.5183269973490326);
        setDoubleElement(term35, 0, 0.7655020693602768);
        setDoubleElement(term35, 1, 0.1374549299694151);
        setDoubleElement(term35, 2, 0.7031006357544823);
        setDoubleElement(term35, 3, 0.9527281779865117);
        setField(term30, term30.getClass(), "primaryState", term35);
        setDoubleElement(term40, 0, 0.9828442029246764);
        setDoubleElement(term40, 1, 0.2779719046761513);
        setDoubleElement(term40, 2, 0.6436713023569729);
        setField(term30, term30.getClass(), "primaryStateDot", term40);
        setField(term30, term30.getClass(), "components", term44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.ode.ExpandableStatefulODE");
        Object[] args = new Object[1];
        args[0] = term30;
        try {
            callMethod(klass, "setEquations", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


