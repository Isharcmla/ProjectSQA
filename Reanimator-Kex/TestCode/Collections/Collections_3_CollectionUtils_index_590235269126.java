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
import java.util.HashMap;

public class CollectionUtils_index_590235269126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10384;
     Object term10789;
     Object term10785;

    public CollectionUtils_index_590235269126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10384 = new HashMap();
        term10789 = new HashMap();
        HashMap term10777 = new HashMap();
        term10785 = newInstance(Class.forName("java.util.HashMap$KeyIterator"));
        setField(term10785, term10785.getClass(), "this$0", term10777);
        setField(term10785, term10785.getClass(), "next", null);
        setField(term10785, term10785.getClass(), "current", null);
        setIntField(term10785, term10785.getClass(), "expectedModCount", 0);
        setIntField(term10785, term10785.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10384;
        args[1] = 0;
        Object retValue = callMethod(klass, "index", argTypes, null, args);
        assertTrue(recursiveEquals(term10384, term10789));
        assertTrue(recursiveEquals(retValue, term10785));
    }

};


