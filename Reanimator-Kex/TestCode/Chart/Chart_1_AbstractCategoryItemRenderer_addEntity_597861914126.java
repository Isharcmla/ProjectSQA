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

public class AbstractCategoryItemRenderer_addEntity_597861914126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term1327;
     Object term1329;
     Object term1331;
     Object term1333;

    public AbstractCategoryItemRenderer_addEntity_597861914126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325 = new Integer(-1179120542);
        term1327 = new Integer(-73683645);
        term1329 = new Boolean(false);
        term1331 = new Double(0.6436713023569729);
        term1333 = new Double(0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("org.jfree.chart.entity.EntityCollection");
        argTypes[1] = Class.forName("java.awt.Shape");
        argTypes[2] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1325;
        args[4] = term1327;
        args[5] = term1329;
        args[6] = term1331;
        args[7] = term1333;
        try {
            callMethod(klass, "addEntity", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
