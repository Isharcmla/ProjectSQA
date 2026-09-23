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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashSet;

public class PoissonDistributionImpl_sample_11364325418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328;

    public PoissonDistributionImpl_sample_11364325418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashSet term348 = new LinkedHashSet();
        term328 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        Object term332 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term333 = newInstance(Class.forName("java.security.SecureRandom"));
        Object term334 = newInstance(Class.forName("sun.security.provider.Sun"));
        Object term343 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term349 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term358 = newInstance(Class.forName("sun.security.provider.NativePRNG"));
        byte[] term372 = (byte[]) newByteArray(1);
        byte[] term374 = (byte[]) newByteArray(6);
        Object term383 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term328, term328.getClass(), "normal", null);
        setDoubleField(term328, term328.getClass(), "mean", 0.2779719046761513);
        setIntField(term328, term328.getClass(), "maxIterations", 1134449235);
        setDoubleField(term328, term328.getClass(), "epsilon", 0.6436713023569729);
        setField(term332, term332.getClass(), "rand", null);
        setField(term334, term334.getClass(), "name", "");
        setField(term334, term334.getClass(), "info", "");
        setDoubleField(term334, term334.getClass(), "version", 11.0);
        setField(term334, term334.getClass(), "versionStr", "");
        setField(term334, term334.getClass(), "entrySet", null);
        setIntField(term334, term334.getClass(), "entrySetCallCount", 0);
        setBooleanField(term334, term334.getClass(), "initialized", true);
        setBooleanField(term334, term334.getClass(), "legacyChanged", false);
        setBooleanField(term334, term334.getClass(), "servicesChanged", true);
        setField(term334, term334.getClass(), "legacyStrings", null);
        setField(term343, term343.getClass(), "table", null);
        setField(term343, term343.getClass(), "nextTable", null);
        setLongField(term343, term343.getClass(), "baseCount", 100L);
        setIntField(term343, term343.getClass(), "sizeCtl", 192);
        setIntField(term343, term343.getClass(), "transferIndex", 0);
        setIntField(term343, term343.getClass(), "cellsBusy", 0);
        setField(term343, term343.getClass(), "counterCells", null);
        setField(term343, term343.getClass(), "keySet", null);
        setField(term343, term343.getClass(), "values", null);
        setField(term343, term343.getClass(), "entrySet", null);
        setField(term343, term343.getClass(), "keySet", null);
        setField(term343, term343.getClass(), "values", null);
        setField(term334, term334.getClass(), "serviceMap", term343);
        setField(term334, term334.getClass(), "prngAlgos", term348);
        setField(term334, term334.getClass(), "legacyMap", null);
        setField(term334, term334.getClass(), "serviceSet", null);
        setField(term334, term334.getClass(), "defaults", null);
        setField(term349, term349.getClass(), "table", null);
        setField(term349, term349.getClass(), "nextTable", null);
        setLongField(term349, term349.getClass(), "baseCount", 152L);
        setIntField(term349, term349.getClass(), "sizeCtl", 192);
        setIntField(term349, term349.getClass(), "transferIndex", 0);
        setIntField(term349, term349.getClass(), "cellsBusy", 0);
        setField(term349, term349.getClass(), "counterCells", null);
        setField(term349, term349.getClass(), "keySet", null);
        setField(term349, term349.getClass(), "values", null);
        setField(term349, term349.getClass(), "entrySet", null);
        setField(term349, term349.getClass(), "keySet", null);
        setField(term349, term349.getClass(), "values", null);
        setField(term334, term334.getClass(), "map", term349);
        setField(term334, term334.getClass(), "table", null);
        setIntField(term334, term334.getClass(), "count", 0);
        setIntField(term334, term334.getClass(), "threshold", 0);
        setFloatField(term334, term334.getClass(), "loadFactor", 0.0F);
        setIntField(term334, term334.getClass(), "modCount", 0);
        setField(term334, term334.getClass(), "keySet", null);
        setField(term334, term334.getClass(), "values", null);
        setField(term333, term333.getClass(), "provider", term334);
        setField(term333, term333.getClass(), "secureRandomSpi", term358);
        setBooleanField(term333, term333.getClass(), "threadSafe", true);
        setField(term333, term333.getClass(), "algorithm", "NativePRNG");
        setByteElement(term372, 0, (byte) 42);
        setField(term333, term333.getClass(), "state", term372);
        setField(term333, term333.getClass(), "digest", null);
        setByteElement(term374, 0, (byte) 72);
        setByteElement(term374, 1, (byte) 111);
        setByteElement(term374, 2, (byte) 99);
        setByteElement(term374, 3, (byte) -12);
        setByteElement(term374, 4, (byte) -61);
        setByteElement(term374, 5, (byte) -85);
        setField(term333, term333.getClass(), "randomBytes", term374);
        setIntField(term333, term333.getClass(), "randomBytesUsed", -883034806);
        setLongField(term333, term333.getClass(), "counter", -8400487765614892086L);
        setLongField(term383, term383.getClass(), "value", 0L);
        setField(term333, term333.getClass(), "seed", term383);
        setDoubleField(term333, term333.getClass(), "nextNextGaussian", 0.7332741045694002);
        setBooleanField(term333, term333.getClass(), "haveNextNextGaussian", false);
        setField(term332, term332.getClass(), "secRand", term333);
        setField(term328, term328.getClass(), "randomData", term332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term328, args);
    }

};


