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

public class CollectionUtils_addIgnoreNull_1716262200223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24610;
     Object term24662;
     Object term24673;
     Object term24677;

    public CollectionUtils_addIgnoreNull_1716262200223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24610 = new ArrayList();
        term24662 = new ArrayList();
        ArrayList term24675 = new ArrayList();
        term24673 = new ArrayList();
        ((ArrayList) term24673).add(term24675);
        term24677 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term24610;
        args[1] = term24662;
        Object retValue = callMethod(klass, "addIgnoreNull", argTypes, null, args);
        assertTrue(recursiveEquals(term24610, term24673));
        assertTrue(recursiveEquals(term24662, term24677));
        assertTrue(recursiveEquals(retValue, true));
    }

};


