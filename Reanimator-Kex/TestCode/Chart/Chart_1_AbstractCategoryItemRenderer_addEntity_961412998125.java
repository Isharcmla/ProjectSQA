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

public class AbstractCategoryItemRenderer_addEntity_961412998125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319;
     Object term1321;
     Object term1323;

    public AbstractCategoryItemRenderer_addEntity_961412998125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1319 = new Integer(-244121226);
        term1321 = new Integer(-203030934);
        term1323 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.jfree.chart.entity.EntityCollection");
        argTypes[1] = Class.forName("java.awt.Shape");
        argTypes[2] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1319;
        args[4] = term1321;
        args[5] = term1323;
        try {
            callMethod(klass, "addEntity", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
