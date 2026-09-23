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

public class BorderArrangement_arrangeRR_1759471585312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117284;
     Object term117330;

    public BorderArrangement_arrangeRR_1759471585312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117284 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term117284, term117284.getClass(), "topBlock", null);
        setField(term117284, term117284.getClass(), "bottomBlock", null);
        term117330 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term117330, term117330.getClass(), "lower", 7.5437894158663025E18);
        setDoubleField(term117330, term117330.getClass(), "upper", 9.2188695367390331E18);
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
        args[2] = term117330;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term117284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


