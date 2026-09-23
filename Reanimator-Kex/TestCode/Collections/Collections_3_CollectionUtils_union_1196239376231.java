package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;

public class CollectionUtils_union_1196239376231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25012;
     Object term25064;
     Object term27223;
     Object term27225;
     Object term27219;

    public CollectionUtils_union_1196239376231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25012 = new ArrayList();
        term25064 = new ArrayList();
        term27223 = new ArrayList();
        term27225 = new ArrayList();
        term27219 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term25012;
        args[1] = term25064;
        Object retValue = callMethod(klass, "union", argTypes, null, args);
        assertTrue(recursiveEquals(term25012, term27223));
        assertTrue(recursiveEquals(term25064, term27225));
        assertTrue(recursiveEquals(retValue, term27219));
    }

};


