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

public class IteratorUtils_toString_1171057288432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70749;
     Object term70873;
     Object term70902;
     Object term70903;

    public IteratorUtils_toString_1171057288432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70749 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        term70873 = newInstance(Class.forName("org.apache.commons.collections4.functors.ChainedTransformer"));
        term70902 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setField(term70902, term70902.getClass(), "this$0", null);
        setField(term70902, term70902.getClass(), "next", null);
        setField(term70902, term70902.getClass(), "lastReturned", null);
        setIntField(term70902, term70902.getClass(), "expectedModCount", 0);
        term70903 = newInstance(Class.forName("org.apache.commons.collections4.functors.ChainedTransformer"));
        setField(term70903, term70903.getClass(), "iTransformers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term70749;
        args[1] = term70873;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term70749, term70902));
        assertTrue(recursiveEquals(term70873, term70903));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


