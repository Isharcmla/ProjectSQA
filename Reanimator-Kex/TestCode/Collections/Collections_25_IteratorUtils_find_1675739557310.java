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

public class IteratorUtils_find_1675739557310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42019;
     Object term42135;
     Object term42412;
     Object term42413;

    public IteratorUtils_find_1675739557310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42019 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        term42135 = newInstance(Class.forName("org.apache.commons.collections4.functors.FalsePredicate"));
        term42412 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        setIntField(term42412, term42412.getClass(), "i", 0);
        setIntField(term42412, term42412.getClass(), "entryCount", 0);
        setField(term42412, term42412.getClass(), "gen", null);
        setField(term42412, term42412.getClass(), "this$0", null);
        term42413 = newInstance(Class.forName("org.apache.commons.collections4.functors.FalsePredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term42019;
        args[1] = term42135;
        Object retValue = callMethod(klass, "find", argTypes, null, args);
        assertTrue(recursiveEquals(term42019, term42412));
        assertTrue(recursiveEquals(term42135, term42413));
        assertTrue(recursiveEquals(retValue, null));
    }

};


