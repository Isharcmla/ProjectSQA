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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeRR_1759471585350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147171;
     Object term147315;
     Object term147361;

    public BorderArrangement_arrangeRR_1759471585350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147171 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term147269 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term147171, term147171.getClass(), "topBlock", null);
        setField(term147171, term147171.getClass(), "bottomBlock", null);
        setField(term147171, term147171.getClass(), "leftBlock", null);
        setField(term147171, term147171.getClass(), "rightBlock", term147269);
        term147315 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term147315, term147315.getClass(), "lower", 9.2188684372274053E18);
        setDoubleField(term147315, term147315.getClass(), "upper", 4.6073231562883727E18);
        term147361 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term147361, term147361.getClass(), "lower", 9.4181527207385498E17);
        setDoubleField(term147361, term147361.getClass(), "upper", 2.09023317705333146E18);
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
        args[1] = term147315;
        args[2] = term147361;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term147171, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


