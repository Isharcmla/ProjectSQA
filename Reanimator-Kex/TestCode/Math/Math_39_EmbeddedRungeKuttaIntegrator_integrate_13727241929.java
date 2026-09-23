package org.apache.commons.math.ode.nonstiff;

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
import static org.apache.commons.math.ode.nonstiff.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class EmbeddedRungeKuttaIntegrator_integrate_13727241929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term67;

    public EmbeddedRungeKuttaIntegrator_integrate_13727241929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term22 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term25 = (double[]) newDoubleArray(4);
        double[] term30 = (double[]) newDoubleArray(1);
        setField(term21, term21.getClass(), "equation", null);
        setIntField(term22, term22.getClass(), "firstIndex", 1484323161);
        setIntField(term22, term22.getClass(), "dimension", 391863371);
        setField(term21, term21.getClass(), "mapper", term22);
        setDoubleElement(term25, 0, 0.5183269973490326);
        setDoubleElement(term25, 1, 0.7655020693602768);
        setDoubleElement(term25, 2, 0.1374549299694151);
        setDoubleElement(term25, 3, 0.7031006357544823);
        setField(term21, term21.getClass(), "state", term25);
        setDoubleElement(term30, 0, 0.9527281779865117);
        setField(term21, term21.getClass(), "stateDot", term30);
        Object term32 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term33 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term36 = (double[]) newDoubleArray(6);
        double[] term43 = (double[]) newDoubleArray(2);
        setField(term32, term32.getClass(), "equation", null);
        setIntField(term33, term33.getClass(), "firstIndex", -1922583790);
        setIntField(term33, term33.getClass(), "dimension", -616727354);
        setField(term32, term32.getClass(), "mapper", term33);
        setDoubleElement(term36, 0, 0.9828442029246764);
        setDoubleElement(term36, 1, 0.2779719046761513);
        setDoubleElement(term36, 2, 0.6436713023569729);
        setDoubleElement(term36, 3, 0.7332741045694002);
        setDoubleElement(term36, 4, 0.4569171842750229);
        setDoubleElement(term36, 5, 0.8598297828918529);
        setField(term32, term32.getClass(), "state", term36);
        setDoubleElement(term43, 0, 0.43692187681405226);
        setDoubleElement(term43, 1, 0.7633268466829064);
        setField(term32, term32.getClass(), "stateDot", term43);
        Object term46 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent"));
        Object term47 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term50 = (double[]) newDoubleArray(6);
        double[] term57 = (double[]) newDoubleArray(7);
        setField(term46, term46.getClass(), "equation", null);
        setIntField(term47, term47.getClass(), "firstIndex", -1955890973);
        setIntField(term47, term47.getClass(), "dimension", -2038273078);
        setField(term46, term46.getClass(), "mapper", term47);
        setDoubleElement(term50, 0, 0.13481025392611334);
        setDoubleElement(term50, 1, 0.3800088629986428);
        setDoubleElement(term50, 2, 0.5840714198152577);
        setDoubleElement(term50, 3, 0.7559240768573477);
        setDoubleElement(term50, 4, 0.10667076642995188);
        setDoubleElement(term50, 5, 0.11493000848982304);
        setField(term46, term46.getClass(), "state", term50);
        setDoubleElement(term57, 0, 0.37161417339133307);
        setDoubleElement(term57, 1, 0.6805867182029153);
        setDoubleElement(term57, 2, 0.2852810965221698);
        setDoubleElement(term57, 3, 0.6300849762307866);
        setDoubleElement(term57, 4, 0.9737083944266686);
        setDoubleElement(term57, 5, 0.0668892744806211);
        setDoubleElement(term57, 6, 0.3587267442738795);
        setField(term46, term46.getClass(), "stateDot", term57);
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add(term21);
        ((ArrayList) term19).add(term32);
        ((ArrayList) term19).add(term46);
        term3 = newInstance(Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object term4 = newInstance(Class.forName("org.apache.commons.math.ode.EquationsMapper"));
        double[] term8 = (double[]) newDoubleArray(5);
        double[] term14 = (double[]) newDoubleArray(4);
        setField(term3, term3.getClass(), "primary", null);
        setIntField(term4, term4.getClass(), "firstIndex", 568599855);
        setIntField(term4, term4.getClass(), "dimension", 1162663216);
        setField(term3, term3.getClass(), "primaryMapper", term4);
        setDoubleField(term3, term3.getClass(), "time", 0.3455959125047594);
        setDoubleElement(term8, 0, 0.5523635872663106);
        setDoubleElement(term8, 1, 0.544608645520025);
        setDoubleElement(term8, 2, 0.28570734989730284);
        setDoubleElement(term8, 3, 0.40176586625454525);
        setDoubleElement(term8, 4, 0.2641345529914265);
        setField(term3, term3.getClass(), "primaryState", term8);
        setDoubleElement(term14, 0, 0.36923381893433327);
        setDoubleElement(term14, 1, 0.6076495596892013);
        setDoubleElement(term14, 2, 0.37773193782763337);
        setDoubleElement(term14, 3, 0.8474802076607362);
        setField(term3, term3.getClass(), "primaryStateDot", term14);
        setField(term3, term3.getClass(), "components", term19);
        term67 = new Double(0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.ExpandableStatefulODE");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term67;
        try {
            callMethod(klass, "integrate", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


