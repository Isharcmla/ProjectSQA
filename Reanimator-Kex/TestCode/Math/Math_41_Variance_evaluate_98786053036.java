package org.apache.commons.math.stat.descriptive.moment;

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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class Variance_evaluate_98786053036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;
     Object term324;
     Object term334;
     Object term338;
     Object term340;
     Object term342;

    public Variance_evaluate_98786053036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term314 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term322 = (double[]) newDoubleArray(1);
        setDoubleField(term314, term314.getClass(), "m2", Double.NaN);
        setLongField(term314, term314.getClass(), "n", 0L);
        setDoubleField(term314, term314.getClass(), "m1", Double.NaN);
        setDoubleField(term314, term314.getClass(), "dev", Double.NaN);
        setDoubleField(term314, term314.getClass(), "nDev", Double.NaN);
        setField(term314, term314.getClass(), "storedData", null);
        setField(term313, term313.getClass(), "moment", term314);
        setBooleanField(term313, term313.getClass(), "incMoment", true);
        setBooleanField(term313, term313.getClass(), "isBiasCorrected", true);
        setDoubleElement(term322, 0, 0.8924855581421237);
        setField(term313, term313.getClass(), "storedData", term322);
        term324 = (double[]) newDoubleArray(9);
        setDoubleElement(term324, 0, 0.32237559209193944);
        setDoubleElement(term324, 1, 0.53094494792755);
        setDoubleElement(term324, 2, 0.146431486357265);
        setDoubleElement(term324, 3, 0.24259014218848696);
        setDoubleElement(term324, 4, 0.1544348383112728);
        setDoubleElement(term324, 5, 0.5187846213101265);
        setDoubleElement(term324, 6, 0.045893173090043815);
        setDoubleElement(term324, 7, 0.3626177854778667);
        setDoubleElement(term324, 8, 0.3163771663728089);
        term334 = (double[]) newDoubleArray(3);
        setDoubleElement(term334, 0, 0.8819646072665548);
        setDoubleElement(term334, 1, 0.5412182593116958);
        setDoubleElement(term334, 2, 0.16988691727397487);
        term338 = new Double(0.39286935532362843);
        term340 = new Integer(-1955890973);
        term342 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term324;
        args[1] = term334;
        args[2] = term338;
        args[3] = term340;
        args[4] = term342;
        try {
            callMethod(klass, "evaluate", argTypes, term313, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


