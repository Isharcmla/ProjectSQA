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

public class CollectionUtils_selectRejected_1191604935135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12155;
     Object term12166;
     Object term12162;

    public CollectionUtils_selectRejected_1191604935135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12155 = new ArrayList();
        term12166 = new ArrayList();
        term12162 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("org.apache.commons.collections.Predicate");
        Object[] args = new Object[2];
        args[0] = term12155;
        args[1] = null;
        Object retValue = callMethod(klass, "selectRejected", argTypes, null, args);
        assertTrue(recursiveEquals(term12155, term12166));
        assertTrue(recursiveEquals(retValue, term12162));
    }

};


