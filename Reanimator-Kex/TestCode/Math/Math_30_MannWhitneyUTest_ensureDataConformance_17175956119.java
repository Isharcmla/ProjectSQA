package org.apache.commons.math3.stat.inference;

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
import static org.apache.commons.math3.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.stat.inference.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_ensureDataConformance_17175956119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673;
     Object term696;
     Object term702;
     Object term5945;
     Object term5954;
     Object term5955;

    public MannWhitneyUTest_ensureDataConformance_17175956119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5957 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term5956 = ((Class) term5957).getDeclaredField((String) "FIXED");
        ((Field) term5956).setAccessible(true);
        Object enum20 = ((Field) term5956).get((Object) null);
        Class<? extends Object> term6224 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term6223 = ((Class) term6224).getDeclaredField((String) "AVERAGE");
        ((Field) term6223).setAccessible(true);
        Object enum21 = ((Field) term6223).get((Object) null);
        term673 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term674 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term695 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term674, term674.getClass(), "nanStrategy", enum20);
        setField(term674, term674.getClass(), "tiesStrategy", enum21);
        setField(term695, term695.getClass(), "rand", null);
        setField(term695, term695.getClass(), "secRand", null);
        setField(term674, term674.getClass(), "randomData", term695);
        setField(term673, term673.getClass(), "naturalRanking", term674);
        term696 = (double[]) newDoubleArray(5);
        setDoubleElement(term696, 0, 0.13238746331190498);
        setDoubleElement(term696, 1, 0.3455959125047594);
        setDoubleElement(term696, 2, 0.5523635872663106);
        setDoubleElement(term696, 3, 0.544608645520025);
        setDoubleElement(term696, 4, 0.28570734989730284);
        term702 = (double[]) newDoubleArray(4);
        setDoubleElement(term702, 0, 0.40176586625454525);
        setDoubleElement(term702, 1, 0.2641345529914265);
        setDoubleElement(term702, 2, 0.36923381893433327);
        setDoubleElement(term702, 3, 0.6076495596892013);
        Class<? extends Object> term6511 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term6510 = ((Class) term6511).getDeclaredField((String) "FIXED");
        ((Field) term6510).setAccessible(true);
        Object enum22 = ((Field) term6510).get((Object) null);
        Class<? extends Object> term6778 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term6777 = ((Class) term6778).getDeclaredField((String) "AVERAGE");
        ((Field) term6777).setAccessible(true);
        Object enum23 = ((Field) term6777).get((Object) null);
        term5945 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term5946 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term5953 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term5946, term5946.getClass(), "nanStrategy", enum22);
        setField(term5946, term5946.getClass(), "tiesStrategy", enum23);
        setField(term5953, term5953.getClass(), "rand", null);
        setField(term5953, term5953.getClass(), "secRand", null);
        setField(term5946, term5946.getClass(), "randomData", term5953);
        setField(term5945, term5945.getClass(), "naturalRanking", term5946);
        term5954 = (double[]) newDoubleArray(5);
        setDoubleElement(term5954, 0, 0.13238746331190498);
        setDoubleElement(term5954, 1, 0.3455959125047594);
        setDoubleElement(term5954, 2, 0.5523635872663106);
        setDoubleElement(term5954, 3, 0.544608645520025);
        setDoubleElement(term5954, 4, 0.28570734989730284);
        term5955 = (double[]) newDoubleArray(4);
        setDoubleElement(term5955, 0, 0.40176586625454525);
        setDoubleElement(term5955, 1, 0.2641345529914265);
        setDoubleElement(term5955, 2, 0.36923381893433327);
        setDoubleElement(term5955, 3, 0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term696;
        args[1] = term702;
        callMethod(klass, "ensureDataConformance", argTypes, term673, args);
        assertTrue(recursiveEquals(term673, term5945));
        assertTrue(recursiveEquals(term696, term5954));
        assertTrue(recursiveEquals(term702, term5955));
    }

};


