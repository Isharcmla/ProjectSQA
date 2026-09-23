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
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_contains_777550135461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79853;
     Object term80618;

    public IteratorUtils_contains_777550135461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79853 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
        term80618 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term79853;
        args[1] = null;
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term79853, null));
    }

};


