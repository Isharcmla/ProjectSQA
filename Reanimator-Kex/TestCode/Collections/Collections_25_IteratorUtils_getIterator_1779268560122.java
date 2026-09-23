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
import java.lang.Object;

public class IteratorUtils_getIterator_1779268560122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term12554;
     Object term12550;

    public IteratorUtils_getIterator_1779268560122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = newInstance(Class.forName("java.lang.Object"));
        term12554 = newInstance(Class.forName("java.lang.Object"));
        term12550 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SingletonIterator"));
        Object term12548 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term12550, term12550.getClass(), "removeAllowed", true);
        setBooleanField(term12550, term12550.getClass(), "beforeFirst", true);
        setBooleanField(term12550, term12550.getClass(), "removed", false);
        setField(term12550, term12550.getClass(), "object", term12548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term98, term12554));
        assertTrue(recursiveEquals(retValue, term12550));
    }

};


