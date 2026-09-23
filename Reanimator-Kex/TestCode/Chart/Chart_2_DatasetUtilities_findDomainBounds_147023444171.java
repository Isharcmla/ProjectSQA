package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Boolean;

public class DatasetUtilities_findDomainBounds_147023444171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term205;

    public DatasetUtilities_findDomainBounds_147023444171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191 = newInstance(Class.forName("java.lang.Object"));
        Object term193 = newInstance(Class.forName("java.lang.Object"));
        Object term195 = newInstance(Class.forName("java.lang.Object"));
        term188 = new LinkedList();
        ((LinkedList) term188).add(term191);
        ((LinkedList) term188).add(term193);
        ((LinkedList) term188).add(term195);
        ((LinkedList) term188).add((Object)null);
        ((LinkedList) term188).add((Object)null);
        ((LinkedList) term188).add((Object)null);
        ((LinkedList) term188).add((Object)null);
        ((LinkedList) term188).add((Object)null);
        ((LinkedList) term188).add((Object)null);
        term205 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataset");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term188;
        args[2] = term205;
        try {
            callMethod(klass, "findDomainBounds", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


