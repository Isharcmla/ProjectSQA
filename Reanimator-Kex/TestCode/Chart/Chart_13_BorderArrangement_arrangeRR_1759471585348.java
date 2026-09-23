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

public class BorderArrangement_arrangeRR_1759471585348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146271;
     Object term146399;
     Object term146445;

    public BorderArrangement_arrangeRR_1759471585348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146271 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term146353 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term146271, term146271.getClass(), "topBlock", null);
        setField(term146271, term146271.getClass(), "bottomBlock", null);
        setField(term146271, term146271.getClass(), "leftBlock", null);
        setField(term146271, term146271.getClass(), "rightBlock", term146353);
        term146399 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term146399, term146399.getClass(), "lower", 7.569430040832639E18);
        setDoubleField(term146399, term146399.getClass(), "upper", 8.7966610638451507E18);
        term146445 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term146445, term146445.getClass(), "lower", 7.4987859012904724E18);
        setDoubleField(term146445, term146445.getClass(), "upper", 8.2157357746798019E18);
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
        args[1] = term146399;
        args[2] = term146445;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term146271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


