package org.apache.commons.math.linear;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_preMultiply_35367376982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3633;
     Object term3704;

    public RealMatrixImpl_preMultiply_35367376982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3633 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3634 = (Object[]) newArray("[D", 7);
        double[] term3635 = (double[]) newDoubleArray(7);
        double[] term3643 = (double[]) newDoubleArray(7);
        double[] term3651 = (double[]) newDoubleArray(4);
        double[] term3656 = (double[]) newDoubleArray(6);
        double[] term3663 = (double[]) newDoubleArray(9);
        double[] term3673 = (double[]) newDoubleArray(4);
        double[] term3678 = (double[]) newDoubleArray(0);
        Object[] term3679 = (Object[]) newArray("[D", 5);
        double[] term3680 = (double[]) newDoubleArray(3);
        double[] term3684 = (double[]) newDoubleArray(3);
        double[] term3688 = (double[]) newDoubleArray(7);
        double[] term3696 = (double[]) newDoubleArray(2);
        double[] term3699 = (double[]) newDoubleArray(2);
        int[] term3702 = (int[]) newIntArray(0);
        setDoubleElement(term3635, 0, 0.07750483171119882);
        setDoubleElement(term3635, 1, 0.9439864461820359);
        setDoubleElement(term3635, 2, 0.48346317030308505);
        setDoubleElement(term3635, 3, 0.9922599761018691);
        setDoubleElement(term3635, 4, 0.61109721071905);
        setDoubleElement(term3635, 5, 0.7005595888007458);
        setDoubleElement(term3635, 6, 0.533001418704147);
        setElement(term3634, 0, term3635);
        setDoubleElement(term3643, 0, 0.9818549251139834);
        setDoubleElement(term3643, 1, 0.9968905523871232);
        setDoubleElement(term3643, 2, 0.5782492033278201);
        setDoubleElement(term3643, 3, 0.11415011225631944);
        setDoubleElement(term3643, 4, 0.9680611801309333);
        setDoubleElement(term3643, 5, 0.3247557569539842);
        setDoubleElement(term3643, 6, 0.0145401306959696);
        setElement(term3634, 1, term3643);
        setDoubleElement(term3651, 0, 0.7835572863983016);
        setDoubleElement(term3651, 1, 0.27036192661860925);
        setDoubleElement(term3651, 2, 0.871322715553573);
        setDoubleElement(term3651, 3, 0.9859225497604077);
        setElement(term3634, 2, term3651);
        setDoubleElement(term3656, 0, 0.29527820404600214);
        setDoubleElement(term3656, 1, 0.8434643614018447);
        setDoubleElement(term3656, 2, 0.00210877501865836);
        setDoubleElement(term3656, 3, 0.11749444093040129);
        setDoubleElement(term3656, 4, 0.12856990669752166);
        setDoubleElement(term3656, 5, 0.7871693137371649);
        setElement(term3634, 3, term3656);
        setDoubleElement(term3663, 0, 0.4111991184653976);
        setDoubleElement(term3663, 1, 0.3688320407866329);
        setDoubleElement(term3663, 2, 0.7704283024189764);
        setDoubleElement(term3663, 3, 0.24532916475451183);
        setDoubleElement(term3663, 4, 0.2821279199094008);
        setDoubleElement(term3663, 5, 0.7198652890536935);
        setDoubleElement(term3663, 6, 0.010833029141803951);
        setDoubleElement(term3663, 7, 0.1708539695203959);
        setDoubleElement(term3663, 8, 0.46630440467911727);
        setElement(term3634, 4, term3663);
        setDoubleElement(term3673, 0, 0.6135021698139438);
        setDoubleElement(term3673, 1, 0.9744854247738662);
        setDoubleElement(term3673, 2, 0.8448572663497166);
        setDoubleElement(term3673, 3, 0.44427267003047954);
        setElement(term3634, 5, term3673);
        setElement(term3634, 6, term3678);
        setField(term3633, term3633.getClass(), "data", term3634);
        setDoubleElement(term3680, 0, 0.6510046609054884);
        setDoubleElement(term3680, 1, 0.7348952452308307);
        setDoubleElement(term3680, 2, 0.3554167808758565);
        setElement(term3679, 0, term3680);
        setDoubleElement(term3684, 0, 0.6602905273017295);
        setDoubleElement(term3684, 1, 0.18162585474118642);
        setDoubleElement(term3684, 2, 0.13499238703794558);
        setElement(term3679, 1, term3684);
        setDoubleElement(term3688, 0, 0.46505735758715006);
        setDoubleElement(term3688, 1, 0.8021566501622185);
        setDoubleElement(term3688, 2, 0.9797763362008045);
        setDoubleElement(term3688, 3, 0.8730095856413708);
        setDoubleElement(term3688, 4, 0.42594697418584104);
        setDoubleElement(term3688, 5, 0.7359116915729608);
        setDoubleElement(term3688, 6, 0.16099540167443394);
        setElement(term3679, 2, term3688);
        setDoubleElement(term3696, 0, 0.0032031687815008425);
        setDoubleElement(term3696, 1, 0.3379289469153276);
        setElement(term3679, 3, term3696);
        setDoubleElement(term3699, 0, 0.09898387578677581);
        setDoubleElement(term3699, 1, 0.8522605188766443);
        setElement(term3679, 4, term3699);
        setField(term3633, term3633.getClass(), "lu", term3679);
        setField(term3633, term3633.getClass(), "permutation", term3702);
        setIntField(term3633, term3633.getClass(), "parity", 1);
        term3704 = (double[]) newDoubleArray(4);
        setDoubleElement(term3704, 0, 0.7480484510848255);
        setDoubleElement(term3704, 1, 0.5868962060721916);
        setDoubleElement(term3704, 2, 0.005544728815947253);
        setDoubleElement(term3704, 3, 0.902676261684306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3704;
        try {
            callMethod(klass, "preMultiply", argTypes, term3633, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


