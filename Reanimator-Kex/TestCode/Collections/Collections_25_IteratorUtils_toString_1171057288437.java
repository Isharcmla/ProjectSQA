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

public class IteratorUtils_toString_1171057288437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72981;
     Object term73103;
     Object term73883;
     Object term73884;

    public IteratorUtils_toString_1171057288437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72981 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        term73103 = newInstance(Class.forName("org.apache.commons.collections4.functors.SwitchTransformer"));
        term73883 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setField(term73883, term73883.getClass(), "this$0", null);
        setField(term73883, term73883.getClass(), "next", null);
        setField(term73883, term73883.getClass(), "lastReturned", null);
        setIntField(term73883, term73883.getClass(), "expectedModCount", 0);
        term73884 = newInstance(Class.forName("org.apache.commons.collections4.functors.SwitchTransformer"));
        setField(term73884, term73884.getClass(), "iPredicates", null);
        setField(term73884, term73884.getClass(), "iTransformers", null);
        setField(term73884, term73884.getClass(), "iDefault", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term72981;
        args[1] = term73103;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term72981, term73883));
        assertTrue(recursiveEquals(term73103, term73884));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


