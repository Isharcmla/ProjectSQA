package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListOrderedSet_remove_1226139451155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118326;

    public ListOrderedSet_remove_1226139451155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118326 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118430 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118534 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118638 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118742 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118846 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term118950 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119054 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119158 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119262 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119366 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119470 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119574 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119678 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119782 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119886 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term119990 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120094 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120198 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120302 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120406 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120510 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120614 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120718 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120822 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term120926 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121030 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121134 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121238 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121342 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121446 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term121550 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term121550, term121550.getClass(), "collection", null);
        setField(term121446, term121446.getClass(), "collection", term121550);
        setField(term121342, term121342.getClass(), "collection", term121446);
        setField(term121238, term121238.getClass(), "collection", term121342);
        setField(term121134, term121134.getClass(), "collection", term121238);
        setField(term121030, term121030.getClass(), "collection", term121134);
        setField(term120926, term120926.getClass(), "collection", term121030);
        setField(term120822, term120822.getClass(), "collection", term120926);
        setField(term120718, term120718.getClass(), "collection", term120822);
        setField(term120614, term120614.getClass(), "collection", term120718);
        setField(term120510, term120510.getClass(), "collection", term120614);
        setField(term120406, term120406.getClass(), "collection", term120510);
        setField(term120302, term120302.getClass(), "collection", term120406);
        setField(term120198, term120198.getClass(), "collection", term120302);
        setField(term120094, term120094.getClass(), "collection", term120198);
        setField(term119990, term119990.getClass(), "collection", term120094);
        setField(term119886, term119886.getClass(), "collection", term119990);
        setField(term119782, term119782.getClass(), "collection", term119886);
        setField(term119678, term119678.getClass(), "collection", term119782);
        setField(term119574, term119574.getClass(), "collection", term119678);
        setField(term119470, term119470.getClass(), "collection", term119574);
        setField(term119366, term119366.getClass(), "collection", term119470);
        setField(term119262, term119262.getClass(), "collection", term119366);
        setField(term119158, term119158.getClass(), "collection", term119262);
        setField(term119054, term119054.getClass(), "collection", term119158);
        setField(term118950, term118950.getClass(), "collection", term119054);
        setField(term118846, term118846.getClass(), "collection", term118950);
        setField(term118742, term118742.getClass(), "collection", term118846);
        setField(term118638, term118638.getClass(), "collection", term118742);
        setField(term118534, term118534.getClass(), "collection", term118638);
        setField(term118430, term118430.getClass(), "collection", term118534);
        setField(term118326, term118326.getClass(), "collection", term118430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "remove", argTypes, term118326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


