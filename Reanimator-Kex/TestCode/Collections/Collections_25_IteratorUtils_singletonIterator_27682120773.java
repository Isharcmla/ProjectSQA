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

public class IteratorUtils_singletonIterator_27682120773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term186;
     Object term180;

    public IteratorUtils_singletonIterator_27682120773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term186 = newInstance(Class.forName("java.lang.Object"));
        term180 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SingletonIterator"));
        Object term184 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term180, term180.getClass(), "removeAllowed", true);
        setBooleanField(term180, term180.getClass(), "beforeFirst", true);
        setBooleanField(term180, term180.getClass(), "removed", false);
        setField(term180, term180.getClass(), "object", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "singletonIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term186));
        assertTrue(recursiveEquals(retValue, term180));
    }

};


