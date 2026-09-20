package org.jfree.chart.renderer.category;

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
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Double;

public class AbstractCategoryItemRenderer_drawItemLabel_1189681171119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term984;
     Object term997;
     Object term999;
     Object term1001;
     Object term1003;
     Object term1005;
     Object term1007;

    public AbstractCategoryItemRenderer_drawItemLabel_1189681171119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term984 = newInstance(Class.forName("org.jfree.chart.plot.PlotOrientation"));
        setField(term984, term984.getClass(), "name", "tbcdzjIfER");
        term997 = new Integer(590364439);
        term999 = new Integer(865208305);
        term1001 = new Boolean(false);
        term1003 = new Double(0.7031006357544823);
        term1005 = new Double(0.9527281779865117);
        term1007 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotOrientation");
        argTypes[2] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = term984;
        args[2] = null;
        args[3] = term997;
        args[4] = term999;
        args[5] = term1001;
        args[6] = term1003;
        args[7] = term1005;
        args[8] = term1007;
        try {
            callMethod(klass, "drawItemLabel", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
