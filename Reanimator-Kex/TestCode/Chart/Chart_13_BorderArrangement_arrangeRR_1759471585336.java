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

public class BorderArrangement_arrangeRR_1759471585336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140982;
     Object term141126;
     Object term141172;

    public BorderArrangement_arrangeRR_1759471585336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140982 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term141080 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term140982, term140982.getClass(), "topBlock", null);
        setField(term140982, term140982.getClass(), "bottomBlock", null);
        setField(term140982, term140982.getClass(), "leftBlock", null);
        setField(term140982, term140982.getClass(), "rightBlock", null);
        setField(term140982, term140982.getClass(), "centerBlock", term141080);
        term141126 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term141126, term141126.getClass(), "lower", -4.5890932186032374E18);
        setDoubleField(term141126, term141126.getClass(), "upper", 4.560337917026304E16);
        term141172 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term141172, term141172.getClass(), "lower", 3.659174697238528E16);
        setDoubleField(term141172, term141172.getClass(), "upper", 4.1095346599755776E16);
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
        args[1] = term141126;
        args[2] = term141172;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term140982, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


