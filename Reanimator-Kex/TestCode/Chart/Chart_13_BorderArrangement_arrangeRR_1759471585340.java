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

public class BorderArrangement_arrangeRR_1759471585340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142824;
     Object term142968;
     Object term143014;

    public BorderArrangement_arrangeRR_1759471585340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142824 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term142922 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term142824, term142824.getClass(), "topBlock", null);
        setField(term142824, term142824.getClass(), "bottomBlock", null);
        setField(term142824, term142824.getClass(), "leftBlock", null);
        setField(term142824, term142824.getClass(), "rightBlock", term142922);
        term142968 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term142968, term142968.getClass(), "lower", 6.9355434269558702E18);
        setDoubleField(term142968, term142968.getClass(), "upper", 8.0749541326806057E18);
        term143014 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term143014, term143014.getClass(), "lower", 7.2868267005187205E18);
        setDoubleField(term143014, term143014.getClass(), "upper", 7.8047491961915986E18);
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
        args[1] = term142968;
        args[2] = term143014;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term142824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


