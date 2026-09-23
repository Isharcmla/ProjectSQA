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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_getLInfNorm_139657840499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6614;
     Object term68219;

    public OpenMapRealVector_getLInfNorm_139657840499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6614 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6615 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6616 = (int[]) newIntArray(32);
        double[] term6649 = (double[]) newDoubleArray(32);
        byte[] term6682 = (byte[]) newByteArray(32);
        setField(term6615, term6615.getClass(), "keys", term6616);
        setField(term6615, term6615.getClass(), "values", term6649);
        setField(term6615, term6615.getClass(), "states", term6682);
        setDoubleField(term6615, term6615.getClass(), "missingEntries", 0.0);
        setIntField(term6615, term6615.getClass(), "size", 0);
        setIntField(term6615, term6615.getClass(), "mask", 31);
        setIntField(term6615, term6615.getClass(), "count", 0);
        setField(term6614, term6614.getClass(), "entries", term6615);
        setIntField(term6614, term6614.getClass(), "virtualSize", -602026508);
        setDoubleField(term6614, term6614.getClass(), "epsilon", 1.0E-12);
        term68219 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term68220 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term68221 = (int[]) newIntArray(32);
        double[] term68222 = (double[]) newDoubleArray(32);
        byte[] term68223 = (byte[]) newByteArray(32);
        setField(term68220, term68220.getClass(), "keys", term68221);
        setField(term68220, term68220.getClass(), "values", term68222);
        setField(term68220, term68220.getClass(), "states", term68223);
        setDoubleField(term68220, term68220.getClass(), "missingEntries", 0.0);
        setIntField(term68220, term68220.getClass(), "size", 0);
        setIntField(term68220, term68220.getClass(), "mask", 31);
        setIntField(term68220, term68220.getClass(), "count", 0);
        setField(term68219, term68219.getClass(), "entries", term68220);
        setIntField(term68219, term68219.getClass(), "virtualSize", -602026508);
        setDoubleField(term68219, term68219.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLInfNorm", argTypes, term6614, args);
        assertTrue(recursiveEquals(term6614, term68219));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


