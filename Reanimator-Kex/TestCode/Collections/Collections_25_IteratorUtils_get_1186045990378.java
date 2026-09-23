package org.apache.commons.collections4;

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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;

public class IteratorUtils_get_1186045990378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56848;

    public IteratorUtils_get_1186045990378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term56849 = new LinkedHashMap();
        Set<Object> term56848_OuterSet = ((LinkedHashMap) term56849).keySet();
        term56848 = ((Set) term56848_OuterSet).iterator();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term56848;
        args[1] = 0;
        try {
            callMethod(klass, "get", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


