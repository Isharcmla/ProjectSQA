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
import java.util.ArrayList;
import java.util.HashMap;

public class DatasetUtilities_findStackedRangeBounds_156709370397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public DatasetUtilities_findStackedRangeBounds_156709370397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term279 = new ArrayList();
        HashMap term283 = new HashMap();
        term263 = newInstance(Class.forName("org.jfree.data.KeyToGroupMap"));
        setField(term263, term263.getClass(), "defaultGroup", "Default Group");
        setField(term263, term263.getClass(), "groups", term279);
        setField(term263, term263.getClass(), "keyToGroupMap", term283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        argTypes[1] = Class.forName("org.jfree.data.KeyToGroupMap");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term263;
        try {
            callMethod(klass, "findStackedRangeBounds", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


