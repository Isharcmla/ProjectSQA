package org.apache.commons.math.distribution;

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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.Integer;

public class PoissonDistributionImpl_cumulativeProbability_70654730417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term218;

    public PoissonDistributionImpl_cumulativeProbability_70654730417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashSet term178 = new LinkedHashSet();
        term158 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        Object term162 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term163 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term164 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term173 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term179 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term188 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        byte[] term202 = (byte[]) newByteArray(6);
        byte[] term209 = (byte[]) newByteArray(2);
        Object term214 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term158, term158.getClass(), "normal", null);
        setDoubleField(term158, term158.getClass(), "mean", 0.5183269973490326);
        setIntField(term158, term158.getClass(), "maxIterations", -1955890973);
        setDoubleField(term158, term158.getClass(), "epsilon", 0.7655020693602768);
        setField(term162, term162.getClass(), "rand", null);
        setField(term164, term164.getClass(), "name", "");
        setField(term164, term164.getClass(), "info", "");
        setDoubleField(term164, term164.getClass(), "version", 11.0);
        setField(term164, term164.getClass(), "versionStr", "");
        setField(term164, term164.getClass(), "entrySet", null);
        setIntField(term164, term164.getClass(), "entrySetCallCount", 0);
        setBooleanField(term164, term164.getClass(), "initialized", true);
        setBooleanField(term164, term164.getClass(), "legacyChanged", false);
        setBooleanField(term164, term164.getClass(), "servicesChanged", true);
        setField(term164, term164.getClass(), "legacyStrings", null);
        setField(term173, term173.getClass(), "table", null);
        setField(term173, term173.getClass(), "nextTable", null);
        setLongField(term173, term173.getClass(), "baseCount", 100L);
        setIntField(term173, term173.getClass(), "sizeCtl", 192);
        setIntField(term173, term173.getClass(), "transferIndex", 0);
        setIntField(term173, term173.getClass(), "cellsBusy", 0);
        setField(term173, term173.getClass(), "counterCells", null);
        setField(term173, term173.getClass(), "keySet", null);
        setField(term173, term173.getClass(), "values", null);
        setField(term173, term173.getClass(), "entrySet", null);
        setField(term173, term173.getClass(), "keySet", null);
        setField(term173, term173.getClass(), "values", null);
        setField(term164, term164.getClass(), "serviceMap", term173);
        setField(term164, term164.getClass(), "prngAlgos", term178);
        setField(term164, term164.getClass(), "legacyMap", null);
        setField(term164, term164.getClass(), "serviceSet", null);
        setField(term164, term164.getClass(), "defaults", null);
        setField(term179, term179.getClass(), "table", null);
        setField(term179, term179.getClass(), "nextTable", null);
        setLongField(term179, term179.getClass(), "baseCount", 152L);
        setIntField(term179, term179.getClass(), "sizeCtl", 192);
        setIntField(term179, term179.getClass(), "transferIndex", 0);
        setIntField(term179, term179.getClass(), "cellsBusy", 0);
        setField(term179, term179.getClass(), "counterCells", null);
        setField(term179, term179.getClass(), "keySet", null);
        setField(term179, term179.getClass(), "values", null);
        setField(term179, term179.getClass(), "entrySet", null);
        setField(term179, term179.getClass(), "keySet", null);
        setField(term179, term179.getClass(), "values", null);
        setField(term164, term164.getClass(), "map", term179);
        setField(term164, term164.getClass(), "table", null);
        setIntField(term164, term164.getClass(), "count", 0);
        setIntField(term164, term164.getClass(), "threshold", 0);
        setFloatField(term164, term164.getClass(), "loadFactor", 0.0F);
        setIntField(term164, term164.getClass(), "modCount", 0);
        setField(term164, term164.getClass(), "keySet", null);
        setField(term164, term164.getClass(), "values", null);
        setField(term163, term163.getClass(), "provider", term164);
        setField(term163, term163.getClass(), "secureRandomSpi", term188);
        setBooleanField(term163, term163.getClass(), "threadSafe", true);
        setField(term163, term163.getClass(), "algorithm", "NativePRNG");
        setByteElement(term202, 0, (byte) 67);
        setByteElement(term202, 1, (byte) 78);
        setByteElement(term202, 2, (byte) 87);
        setByteElement(term202, 3, (byte) 121);
        setByteElement(term202, 4, (byte) -99);
        setByteElement(term202, 5, (byte) -2);
        setField(term163, term163.getClass(), "state", term202);
        setField(term163, term163.getClass(), "digest", null);
        setByteElement(term209, 0, (byte) -16);
        setByteElement(term209, 1, (byte) -112);
        setField(term163, term163.getClass(), "randomBytes", term209);
        setIntField(term163, term163.getClass(), "randomBytesUsed", -2038273078);
        setLongField(term163, term163.getClass(), "counter", 6375119433582206027L);
        setLongField(term214, term214.getClass(), "value", 0L);
        setField(term163, term163.getClass(), "seed", term214);
        setDoubleField(term163, term163.getClass(), "nextNextGaussian", 0.1374549299694151);
        setBooleanField(term163, term163.getClass(), "haveNextNextGaussian", true);
        setField(term162, term162.getClass(), "secRand", term163);
        setField(term158, term158.getClass(), "randomData", term162);
        term218 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term218;
        try {
            callMethod(klass, "cumulativeProbability", argTypes, term158, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


