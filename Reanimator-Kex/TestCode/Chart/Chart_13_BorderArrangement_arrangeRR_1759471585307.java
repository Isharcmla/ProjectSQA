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

public class BorderArrangement_arrangeRR_1759471585307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115187;
     Object term115331;
     Object term115377;

    public BorderArrangement_arrangeRR_1759471585307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115187 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term115285 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term115187, term115187.getClass(), "topBlock", null);
        setField(term115187, term115187.getClass(), "bottomBlock", null);
        setField(term115187, term115187.getClass(), "leftBlock", null);
        setField(term115187, term115187.getClass(), "rightBlock", term115285);
        term115331 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term115331, term115331.getClass(), "lower", 6.9265362269042115E18);
        setDoubleField(term115331, term115331.getClass(), "upper", 8.0749541318836879E18);
        term115377 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term115377, term115377.getClass(), "lower", 1.8159935634348032E16);
        setDoubleField(term115377, term115377.getClass(), "upper", 2.2589593132222496E16);
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
        args[1] = term115331;
        args[2] = term115377;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term115187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


