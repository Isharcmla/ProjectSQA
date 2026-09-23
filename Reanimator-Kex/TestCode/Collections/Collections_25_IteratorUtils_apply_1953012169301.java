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

public class IteratorUtils_apply_1953012169301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40403;
     Object term40509;
     Object term40787;
     Object term40788;

    public IteratorUtils_apply_1953012169301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40403 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        term40509 = newInstance(Class.forName("org.apache.commons.collections4.functors.IfClosure"));
        term40787 = newInstance(Class.forName("java.util.ImmutableCollections$MapN$MapNIterator"));
        setIntField(term40787, term40787.getClass(), "remaining", 0);
        setIntField(term40787, term40787.getClass(), "idx", 0);
        setField(term40787, term40787.getClass(), "this$0", null);
        term40788 = newInstance(Class.forName("org.apache.commons.collections4.functors.IfClosure"));
        setField(term40788, term40788.getClass(), "iPredicate", null);
        setField(term40788, term40788.getClass(), "iTrueClosure", null);
        setField(term40788, term40788.getClass(), "iFalseClosure", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term40403;
        args[1] = term40509;
        callMethod(klass, "apply", argTypes, null, args);
        assertTrue(recursiveEquals(term40403, term40787));
        assertTrue(recursiveEquals(term40509, term40788));
    }

};


