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

public class OpenMapRealVector_getLInfDistance_95644773298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6614;
     Object term6721;
     Object term73764;
     Object term73769;

    public OpenMapRealVector_getLInfDistance_95644773298() {
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
        term6721 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6722 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6723 = (int[]) newIntArray(32);
        double[] term6756 = (double[]) newDoubleArray(32);
        byte[] term6789 = (byte[]) newByteArray(32);
        setField(term6722, term6722.getClass(), "keys", term6723);
        setField(term6722, term6722.getClass(), "values", term6756);
        setField(term6722, term6722.getClass(), "states", term6789);
        setDoubleField(term6722, term6722.getClass(), "missingEntries", 0.0);
        setIntField(term6722, term6722.getClass(), "size", 0);
        setIntField(term6722, term6722.getClass(), "mask", 31);
        setIntField(term6722, term6722.getClass(), "count", 0);
        setField(term6721, term6721.getClass(), "entries", term6722);
        setIntField(term6721, term6721.getClass(), "virtualSize", -157887805);
        setDoubleField(term6721, term6721.getClass(), "epsilon", 1.0E-12);
        term73764 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term73765 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term73766 = (int[]) newIntArray(32);
        double[] term73767 = (double[]) newDoubleArray(32);
        byte[] term73768 = (byte[]) newByteArray(32);
        setField(term73765, term73765.getClass(), "keys", term73766);
        setField(term73765, term73765.getClass(), "values", term73767);
        setField(term73765, term73765.getClass(), "states", term73768);
        setDoubleField(term73765, term73765.getClass(), "missingEntries", 0.0);
        setIntField(term73765, term73765.getClass(), "size", 0);
        setIntField(term73765, term73765.getClass(), "mask", 31);
        setIntField(term73765, term73765.getClass(), "count", 0);
        setField(term73764, term73764.getClass(), "entries", term73765);
        setIntField(term73764, term73764.getClass(), "virtualSize", -602026508);
        setDoubleField(term73764, term73764.getClass(), "epsilon", 1.0E-12);
        term73769 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term73770 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term73771 = (int[]) newIntArray(32);
        double[] term73772 = (double[]) newDoubleArray(32);
        byte[] term73773 = (byte[]) newByteArray(32);
        setField(term73770, term73770.getClass(), "keys", term73771);
        setField(term73770, term73770.getClass(), "values", term73772);
        setField(term73770, term73770.getClass(), "states", term73773);
        setDoubleField(term73770, term73770.getClass(), "missingEntries", 0.0);
        setIntField(term73770, term73770.getClass(), "size", 0);
        setIntField(term73770, term73770.getClass(), "mask", 31);
        setIntField(term73770, term73770.getClass(), "count", 0);
        setField(term73769, term73769.getClass(), "entries", term73770);
        setIntField(term73769, term73769.getClass(), "virtualSize", -157887805);
        setDoubleField(term73769, term73769.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term6721;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term6614, args);
        assertTrue(recursiveEquals(term6614, term73764));
        assertTrue(recursiveEquals(term6721, term73769));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


