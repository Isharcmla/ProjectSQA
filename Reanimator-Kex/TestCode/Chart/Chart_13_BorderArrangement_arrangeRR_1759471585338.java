package org.jfree.chart.block;

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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeRR_1759471585338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141921;
     Object term142043;
     Object term142089;

    public BorderArrangement_arrangeRR_1759471585338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141921 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term141997 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term141921, term141921.getClass(), "topBlock", null);
        setField(term141921, term141921.getClass(), "bottomBlock", null);
        setField(term141921, term141921.getClass(), "leftBlock", null);
        setField(term141921, term141921.getClass(), "rightBlock", term141997);
        term142043 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term142043, term142043.getClass(), "lower", 7.569430040832639E18);
        setDoubleField(term142043, term142043.getClass(), "upper", 8.7966610638451507E18);
        term142089 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term142089, term142089.getClass(), "lower", 7.4987859012904724E18);
        setDoubleField(term142089, term142089.getClass(), "upper", 8.2157357746798019E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term142043;
        args[2] = term142089;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term141921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


