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

public class DatasetUtilities_iterateToFindRangeBounds_28314398188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;
     Object term256;
     Object term259;

    public DatasetUtilities_iterateToFindRangeBounds_28314398188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term245 = newInstance(Class.forName("java.lang.Object"));
        Object term247 = newInstance(Class.forName("java.lang.Object"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        term242 = new LinkedList();
        ((LinkedList) term242).add(term245);
        ((LinkedList) term242).add(term247);
        ((LinkedList) term242).add(term249);
        ((LinkedList) term242).add((Object)null);
        ((LinkedList) term242).add((Object)null);
        ((LinkedList) term242).add((Object)null);
        term256 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term256, term256.getClass(), "lower", 0.07802449704920456);
        setDoubleField(term256, term256.getClass(), "upper", 0.5279279537140873);
        term259 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataset");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term242;
        args[2] = term256;
        args[3] = term259;
        try {
            callMethod(klass, "iterateToFindRangeBounds", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


