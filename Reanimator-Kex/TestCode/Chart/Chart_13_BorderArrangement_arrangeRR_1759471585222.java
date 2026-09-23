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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.block.EqualityUtils.*;

public class BorderArrangement_arrangeRR_1759471585222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80845;
     Object term80891;
     Object term80937;
     Object term81972;
     Object term81973;
     Object term81974;
     Object term81966;

    public BorderArrangement_arrangeRR_1759471585222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80845 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term80845, term80845.getClass(), "topBlock", null);
        setField(term80845, term80845.getClass(), "bottomBlock", null);
        setField(term80845, term80845.getClass(), "leftBlock", null);
        term80891 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term80891, term80891.getClass(), "lower", -9.2188684372274053E18);
        setDoubleField(term80891, term80891.getClass(), "upper", 4.503599627370497E15);
        term80937 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term80937, term80937.getClass(), "lower", 1.8093563347239368E16);
        setDoubleField(term80937, term80937.getClass(), "upper", 1.15300066944411315E18);
        term81972 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term81972, term81972.getClass(), "centerBlock", null);
        setField(term81972, term81972.getClass(), "topBlock", null);
        setField(term81972, term81972.getClass(), "bottomBlock", null);
        setField(term81972, term81972.getClass(), "leftBlock", null);
        setField(term81972, term81972.getClass(), "rightBlock", null);
        term81973 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term81973, term81973.getClass(), "lower", 1.8093563347239368E16);
        setDoubleField(term81973, term81973.getClass(), "upper", 1.15300066944411315E18);
        term81974 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term81974, term81974.getClass(), "lower", -9.2188684372274053E18);
        setDoubleField(term81974, term81974.getClass(), "upper", 4.503599627370497E15);
        term81966 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term81966, term81966.getClass(), "width", 0.0);
        setDoubleField(term81966, term81966.getClass(), "height", 0.0);
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
        args[1] = term80891;
        args[2] = term80937;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term80845, args);
        assertTrue(recursiveEquals(term80845, term81972));
        assertTrue(recursiveEquals(term80891, term81974));
        assertTrue(recursiveEquals(term80937, null));
        assertTrue(recursiveEquals(retValue, term81966));
    }

};


