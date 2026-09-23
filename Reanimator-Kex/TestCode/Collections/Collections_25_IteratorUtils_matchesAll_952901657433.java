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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Collection;

public class IteratorUtils_matchesAll_952901657433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71080;
     Object term71194;

    public IteratorUtils_matchesAll_952901657433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Collection<Object> term71080_OuterSet = ((LinkedHashMap) null).values();
        term71080 = ((Collection) term71080_OuterSet).iterator();
        term71194 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullPredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term71080;
        args[1] = term71194;
        callMethod(klass, "matchesAll", argTypes, null, args);
    }

};


