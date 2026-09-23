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
import java.lang.NullPointerException;
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.Integer;

public class PoissonDistributionImpl_normalApproximateProbability_106360164618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;
     Object term303;

    public PoissonDistributionImpl_normalApproximateProbability_106360164618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashSet term258 = new LinkedHashSet();
        term238 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        Object term242 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term243 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term244 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term253 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term259 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term268 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        byte[] term282 = (byte[]) newByteArray(6);
        byte[] term289 = (byte[]) newByteArray(7);
        Object term299 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term238, term238.getClass(), "normal", null);
        setDoubleField(term238, term238.getClass(), "mean", 0.7031006357544823);
        setIntField(term238, term238.getClass(), "maxIterations", -1339778481);
        setDoubleField(term238, term238.getClass(), "epsilon", 0.9527281779865117);
        setField(term242, term242.getClass(), "rand", null);
        setField(term244, term244.getClass(), "name", "");
        setField(term244, term244.getClass(), "info", "");
        setDoubleField(term244, term244.getClass(), "version", 11.0);
        setField(term244, term244.getClass(), "versionStr", "");
        setField(term244, term244.getClass(), "entrySet", null);
        setIntField(term244, term244.getClass(), "entrySetCallCount", 0);
        setBooleanField(term244, term244.getClass(), "initialized", true);
        setBooleanField(term244, term244.getClass(), "legacyChanged", false);
        setBooleanField(term244, term244.getClass(), "servicesChanged", true);
        setField(term244, term244.getClass(), "legacyStrings", null);
        setField(term253, term253.getClass(), "table", null);
        setField(term253, term253.getClass(), "nextTable", null);
        setLongField(term253, term253.getClass(), "baseCount", 100L);
        setIntField(term253, term253.getClass(), "sizeCtl", 192);
        setIntField(term253, term253.getClass(), "transferIndex", 0);
        setIntField(term253, term253.getClass(), "cellsBusy", 0);
        setField(term253, term253.getClass(), "counterCells", null);
        setField(term253, term253.getClass(), "keySet", null);
        setField(term253, term253.getClass(), "values", null);
        setField(term253, term253.getClass(), "entrySet", null);
        setField(term253, term253.getClass(), "keySet", null);
        setField(term253, term253.getClass(), "values", null);
        setField(term244, term244.getClass(), "serviceMap", term253);
        setField(term244, term244.getClass(), "prngAlgos", term258);
        setField(term244, term244.getClass(), "legacyMap", null);
        setField(term244, term244.getClass(), "serviceSet", null);
        setField(term244, term244.getClass(), "defaults", null);
        setField(term259, term259.getClass(), "table", null);
        setField(term259, term259.getClass(), "nextTable", null);
        setLongField(term259, term259.getClass(), "baseCount", 152L);
        setIntField(term259, term259.getClass(), "sizeCtl", 192);
        setIntField(term259, term259.getClass(), "transferIndex", 0);
        setIntField(term259, term259.getClass(), "cellsBusy", 0);
        setField(term259, term259.getClass(), "counterCells", null);
        setField(term259, term259.getClass(), "keySet", null);
        setField(term259, term259.getClass(), "values", null);
        setField(term259, term259.getClass(), "entrySet", null);
        setField(term259, term259.getClass(), "keySet", null);
        setField(term259, term259.getClass(), "values", null);
        setField(term244, term244.getClass(), "map", term259);
        setField(term244, term244.getClass(), "table", null);
        setIntField(term244, term244.getClass(), "count", 0);
        setIntField(term244, term244.getClass(), "threshold", 0);
        setFloatField(term244, term244.getClass(), "loadFactor", 0.0F);
        setIntField(term244, term244.getClass(), "modCount", 0);
        setField(term244, term244.getClass(), "keySet", null);
        setField(term244, term244.getClass(), "values", null);
        setField(term243, term243.getClass(), "provider", term244);
        setField(term243, term243.getClass(), "secureRandomSpi", term268);
        setBooleanField(term243, term243.getClass(), "threadSafe", true);
        setField(term243, term243.getClass(), "algorithm", "NativePRNG");
        setByteElement(term282, 0, (byte) -111);
        setByteElement(term282, 1, (byte) 23);
        setByteElement(term282, 2, (byte) -15);
        setByteElement(term282, 3, (byte) 36);
        setByteElement(term282, 4, (byte) 118);
        setByteElement(term282, 5, (byte) 106);
        setField(term243, term243.getClass(), "state", term282);
        setField(term243, term243.getClass(), "digest", null);
        setByteElement(term289, 0, (byte) 98);
        setByteElement(term289, 1, (byte) 67);
        setByteElement(term289, 2, (byte) 66);
        setByteElement(term289, 3, (byte) -121);
        setByteElement(term289, 4, (byte) -119);
        setByteElement(term289, 5, (byte) 71);
        setByteElement(term289, 6, (byte) 80);
        setField(term243, term243.getClass(), "randomBytes", term289);
        setIntField(term243, term243.getClass(), "randomBytesUsed", 1725571209);
        setLongField(term243, term243.getClass(), "counter", -8257434502486459194L);
        setLongField(term299, term299.getClass(), "value", 0L);
        setField(term243, term243.getClass(), "seed", term299);
        setDoubleField(term243, term243.getClass(), "nextNextGaussian", 0.9828442029246764);
        setBooleanField(term243, term243.getClass(), "haveNextNextGaussian", false);
        setField(term242, term242.getClass(), "secRand", term243);
        setField(term238, term238.getClass(), "randomData", term242);
        term303 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term303;
        try {
            callMethod(klass, "normalApproximateProbability", argTypes, term238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


