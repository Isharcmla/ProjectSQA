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

public class BorderArrangement_arrangeRR_1759471585217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79666;
     Object term79788;
     Object term79834;

    public BorderArrangement_arrangeRR_1759471585217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79666 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term79742 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term79666, term79666.getClass(), "topBlock", null);
        setField(term79666, term79666.getClass(), "bottomBlock", null);
        setField(term79666, term79666.getClass(), "leftBlock", null);
        setField(term79666, term79666.getClass(), "rightBlock", term79742);
        term79788 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term79788, term79788.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term79788, term79788.getClass(), "upper", 0.0);
        term79834 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term79834, term79834.getClass(), "lower", 4.6524405826091745E18);
        setDoubleField(term79834, term79834.getClass(), "upper", 4.9181529960915927E18);
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
        args[1] = term79788;
        args[2] = term79834;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term79666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


