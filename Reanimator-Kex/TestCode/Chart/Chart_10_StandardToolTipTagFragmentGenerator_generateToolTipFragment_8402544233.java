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

public class StandardToolTipTagFragmentGenerator_generateToolTipFragment_8402544233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term67;

    public StandardToolTipTagFragmentGenerator_generateToolTipFragment_8402544233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator"));
        term67 = newInstance(Class.forName("org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object retValue = callMethod(klass, "generateToolTipFragment", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term67));
        assertTrue(recursiveEquals(retValue, " title=\"PAEBtnZtTD\" alt=\"\""));
    }

};


