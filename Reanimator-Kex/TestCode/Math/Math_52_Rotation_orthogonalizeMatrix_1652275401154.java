package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;

public class Rotation_orthogonalizeMatrix_1652275401154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57952;
     Object term55693;
     Object term59981;
     Object term59982;
     Object term58960;

    public Rotation_orthogonalizeMatrix_1652275401154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57952 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term55693 = (Object[]) newArray("[D", 489);
        double[] term55694 = (double[]) newDoubleArray(489);
        double[] term56184 = (double[]) newDoubleArray(9);
        double[] term56194 = (double[]) newDoubleArray(500);
        setElement(term55693, 0, term55694);
        setElement(term55693, 1, term56184);
        setElement(term55693, 2, term56194);
        term59981 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term59981, term59981.getClass(), "q0", 0.0);
        setDoubleField(term59981, term59981.getClass(), "q1", 0.0);
        setDoubleField(term59981, term59981.getClass(), "q2", 0.0);
        setDoubleField(term59981, term59981.getClass(), "q3", 0.0);
        term59982 = (Object[]) newArray("[D", 489);
        double[] term59983 = (double[]) newDoubleArray(489);
        double[] term59984 = (double[]) newDoubleArray(9);
        double[] term59985 = (double[]) newDoubleArray(500);
        setElement(term59982, 0, term59983);
        setElement(term59982, 1, term59984);
        setElement(term59982, 2, term59985);
        term58960 = (Object[]) newArray("[D", 3);
        double[] term58961 = (double[]) newDoubleArray(3);
        double[] term58965 = (double[]) newDoubleArray(3);
        double[] term58969 = (double[]) newDoubleArray(3);
        setElement(term58960, 0, term58961);
        setElement(term58960, 1, term58965);
        setElement(term58960, 2, term58969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term55693;
        args[1] = 0.0;
        Object retValue = callMethod(klass, "orthogonalizeMatrix", argTypes, term57952, args);
        assertTrue(recursiveEquals(term57952, term59981));
        assertTrue(recursiveEquals(term55693, term59982));
        assertTrue(recursiveEquals(retValue, term58960));
    }

};


