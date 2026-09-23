package org.apache.commons.math.stat;

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
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_1195533799109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12770;
     Object term12858;
     Object term13632;
     Object term13637;

    public Frequency_addValue_1195533799109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12770 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12810 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term12770, term12770.getClass(), "freqTable", term12810);
        term12858 = new Integer(0);
        Long term13635 = new Long(0L);
        Long term13636 = new Long(1L);
        term13632 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term13633 = newInstance(Class.forName("java.util.TreeMap"));
        Object term13634 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term13633, term13633.getClass(), "comparator", null);
        setField(term13634, term13634.getClass(), "key", term13635);
        setField(term13634, term13634.getClass(), "value", term13636);
        setField(term13634, term13634.getClass(), "left", null);
        setField(term13634, term13634.getClass(), "right", null);
        setField(term13634, term13634.getClass(), "parent", null);
        setBooleanField(term13634, term13634.getClass(), "color", true);
        setField(term13633, term13633.getClass(), "root", term13634);
        setIntField(term13633, term13633.getClass(), "size", 1);
        setIntField(term13633, term13633.getClass(), "modCount", 1);
        setField(term13633, term13633.getClass(), "entrySet", null);
        setField(term13633, term13633.getClass(), "navigableKeySet", null);
        setField(term13633, term13633.getClass(), "descendingMap", null);
        setField(term13633, term13633.getClass(), "keySet", null);
        setField(term13633, term13633.getClass(), "values", null);
        setField(term13632, term13632.getClass(), "freqTable", term13633);
        term13637 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12858;
        callMethod(klass, "addValue", argTypes, term12770, args);
        assertTrue(recursiveEquals(term12770, term13632));
        assertTrue(recursiveEquals(term12858, term13637));
    }

};


