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

public class BorderArrangement_arrangeRR_1759471585289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108878;
     Object term109002;
     Object term109048;

    public BorderArrangement_arrangeRR_1759471585289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108878 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term108956 = newInstance(Class.forName("org.jfree.chart.title.CompositeTitle"));
        setField(term108878, term108878.getClass(), "topBlock", null);
        setField(term108878, term108878.getClass(), "bottomBlock", null);
        setField(term108878, term108878.getClass(), "leftBlock", null);
        setField(term108878, term108878.getClass(), "rightBlock", term108956);
        term109002 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term109002, term109002.getClass(), "lower", -9.223372036854776E18);
        setDoubleField(term109002, term109002.getClass(), "upper", 0.0);
        term109048 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term109048, term109048.getClass(), "lower", 4.6524405826091745E18);
        setDoubleField(term109048, term109048.getClass(), "upper", 4.9181529960915927E18);
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
        args[1] = term109002;
        args[2] = term109048;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term108878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


