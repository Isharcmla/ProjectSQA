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

public class BorderArrangement_arrangeRR_1759471585107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38259;
     Object term38373;

    public BorderArrangement_arrangeRR_1759471585107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38259 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term38327 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term38259, term38259.getClass(), "topBlock", null);
        setField(term38259, term38259.getClass(), "bottomBlock", term38327);
        term38373 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term38373, term38373.getClass(), "lower", 9.2188684372274063E18);
        setDoubleField(term38373, term38373.getClass(), "upper", 9.2188684372274053E18);
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
        args[1] = null;
        args[2] = term38373;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term38259, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


