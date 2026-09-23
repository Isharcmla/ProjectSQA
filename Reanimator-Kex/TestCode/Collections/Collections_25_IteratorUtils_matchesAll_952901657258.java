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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Collection;

public class IteratorUtils_matchesAll_952901657258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32578;
     Object term32706;
     Object term32901;
     Object term32904;

    public IteratorUtils_matchesAll_952901657258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term32707 = new LinkedHashMap();
        Collection<Object> term32578_OuterSet = ((LinkedHashMap) term32707).values();
        term32578 = ((Collection) term32578_OuterSet).iterator();
        term32706 = newInstance(Class.forName("org.apache.commons.collections4.functors.TransformerPredicate"));
        LinkedHashMap term32902 = new LinkedHashMap();
        term32901 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValueIterator"));
        setField(term32901, term32901.getClass(), "this$0", term32902);
        setField(term32901, term32901.getClass(), "next", null);
        setField(term32901, term32901.getClass(), "current", null);
        setIntField(term32901, term32901.getClass(), "expectedModCount", 0);
        term32904 = newInstance(Class.forName("org.apache.commons.collections4.functors.TransformerPredicate"));
        setField(term32904, term32904.getClass(), "iTransformer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term32578;
        args[1] = term32706;
        Object retValue = callMethod(klass, "matchesAll", argTypes, null, args);
        assertTrue(recursiveEquals(term32578, term32901));
        assertTrue(recursiveEquals(term32706, term32904));
        assertTrue(recursiveEquals(retValue, true));
    }

};


