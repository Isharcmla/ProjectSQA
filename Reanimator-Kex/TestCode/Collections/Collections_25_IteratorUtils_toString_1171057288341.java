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

public class IteratorUtils_toString_1171057288341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48836;
     Object term48968;
     Object term49679;
     Object term49680;

    public IteratorUtils_toString_1171057288341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48836 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        term48968 = newInstance(Class.forName("org.apache.commons.collections4.functors.InstantiateTransformer"));
        term49679 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setField(term49679, term49679.getClass(), "this$0", null);
        setField(term49679, term49679.getClass(), "next", null);
        setField(term49679, term49679.getClass(), "lastReturned", null);
        setIntField(term49679, term49679.getClass(), "expectedModCount", 0);
        term49680 = newInstance(Class.forName("org.apache.commons.collections4.functors.InstantiateTransformer"));
        setField(term49680, term49680.getClass(), "iParamTypes", null);
        setField(term49680, term49680.getClass(), "iArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term48836;
        args[1] = term48968;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term48836, term49679));
        assertTrue(recursiveEquals(term48968, term49680));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


