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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_801195673237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55515;
     Object enum21;
     Object term55747;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_801195673237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55631 = new ArrayList();
        term55515 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term55579 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term55579, term55579.getClass(), "rowKeys", term55631);
        setField(term55515, term55515.getClass(), "data", term55579);
        Class<? extends Object> term57200 = Class.forName((String) "java.lang.StackWalker$Option");
        Field term57199 = ((Class) term57200).getDeclaredField((String) "RETAIN_CLASS_REFERENCE");
        ((Field) term57199).setAccessible(true);
        enum21 = ((Field) term57199).get((Object) null);
        term55747 = newInstance(Class.forName("org.jfree.data.time.Year"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum21;
        args[1] = term55747;
        try {
            callMethod(klass, "getMaxOutlier", argTypes, term55515, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


