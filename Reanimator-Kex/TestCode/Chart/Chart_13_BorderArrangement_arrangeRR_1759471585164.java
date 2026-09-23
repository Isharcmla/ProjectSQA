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

public class BorderArrangement_arrangeRR_1759471585164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59694;
     Object term59822;
     Object term59868;

    public BorderArrangement_arrangeRR_1759471585164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59694 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term59776 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term59694, term59694.getClass(), "topBlock", null);
        setField(term59694, term59694.getClass(), "bottomBlock", null);
        setField(term59694, term59694.getClass(), "leftBlock", null);
        setField(term59694, term59694.getClass(), "rightBlock", term59776);
        term59822 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term59822, term59822.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term59822, term59822.getClass(), "upper", 0.0);
        term59868 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term59868, term59868.getClass(), "lower", 4.6524405826091745E18);
        setDoubleField(term59868, term59868.getClass(), "upper", 4.9181529960915927E18);
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
        args[1] = term59822;
        args[2] = term59868;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term59694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


