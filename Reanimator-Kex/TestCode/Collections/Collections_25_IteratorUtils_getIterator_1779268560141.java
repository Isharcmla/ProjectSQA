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
import java.util.HashMap;

public class IteratorUtils_getIterator_1779268560141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17300;
     Object term17316;
     Object term17307;

    public IteratorUtils_getIterator_1779268560141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17300 = new HashMap();
        term17316 = new HashMap();
        HashMap term17308 = new HashMap();
        term17307 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        setField(term17307, term17307.getClass(), "this$0", term17308);
        setField(term17307, term17307.getClass(), "next", null);
        setField(term17307, term17307.getClass(), "current", null);
        setIntField(term17307, term17307.getClass(), "expectedModCount", 0);
        setIntField(term17307, term17307.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17300;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term17300, term17316));
        assertTrue(recursiveEquals(retValue, term17307));
    }

};


