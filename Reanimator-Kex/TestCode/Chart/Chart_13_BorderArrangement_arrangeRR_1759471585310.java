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

public class BorderArrangement_arrangeRR_1759471585310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116632;
     Object term116748;

    public BorderArrangement_arrangeRR_1759471585310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116632 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term116702 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term116632, term116632.getClass(), "topBlock", null);
        setField(term116632, term116632.getClass(), "bottomBlock", term116702);
        term116748 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term116748, term116748.getClass(), "lower", -9.2188684372274053E18);
        setDoubleField(term116748, term116748.getClass(), "upper", 4.503599627370497E15);
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
        args[2] = term116748;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term116632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


