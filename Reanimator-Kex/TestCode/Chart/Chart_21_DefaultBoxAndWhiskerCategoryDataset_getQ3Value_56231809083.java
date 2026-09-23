package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getQ3Value_56231809083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12252;
     Object enum1;

    public DefaultBoxAndWhiskerCategoryDataset_getQ3Value_56231809083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12252 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term12316 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term12252, term12252.getClass(), "data", term12316);
        Class<? extends Object> term13660 = Class.forName((String) "java.lang.module.ModuleDescriptor$Modifier");
        Field term13659 = ((Class) term13660).getDeclaredField((String) "OPEN");
        ((Field) term13659).setAccessible(true);
        enum1 = ((Field) term13659).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum1;
        args[1] = null;
        try {
            callMethod(klass, "getQ3Value", argTypes, term12252, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


