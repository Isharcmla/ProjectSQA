package org.jfree.chart.imagemap;

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
import static org.jfree.chart.imagemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.imagemap.EqualityUtils.*;

public class StandardToolTipTagFragmentGenerator_init_6222443032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public StandardToolTipTagFragmentGenerator_init_6222443032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25));
    }

};


