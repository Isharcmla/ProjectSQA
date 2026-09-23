package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_clear_120489897491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16540;

    public MultiValueMap_clear_120489897491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16540 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term16644 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term16748 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term16644, term16644.getClass(), "map", term16748);
        setField(term16540, term16540.getClass(), "map", term16644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term16540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


