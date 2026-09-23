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

public class IteratorUtils_matchesAny_952829582453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75704;
     Object term75840;
     Object term77796;
     Object term77797;

    public IteratorUtils_matchesAny_952829582453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75704 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        term75840 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullIsExceptionPredicate"));
        term77796 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term77796, term77796.getClass(), "map", null);
        setField(term77796, term77796.getClass(), "lastReturned", null);
        setField(term77796, term77796.getClass(), "tab", null);
        setField(term77796, term77796.getClass(), "next", null);
        setField(term77796, term77796.getClass(), "stack", null);
        setField(term77796, term77796.getClass(), "spare", null);
        setIntField(term77796, term77796.getClass(), "index", 0);
        setIntField(term77796, term77796.getClass(), "baseIndex", 0);
        setIntField(term77796, term77796.getClass(), "baseLimit", 0);
        setIntField(term77796, term77796.getClass(), "baseSize", 0);
        term77797 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullIsExceptionPredicate"));
        setField(term77797, term77797.getClass(), "iPredicate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term75704;
        args[1] = term75840;
        Object retValue = callMethod(klass, "matchesAny", argTypes, null, args);
        assertTrue(recursiveEquals(term75704, term77796));
        assertTrue(recursiveEquals(term75840, term77797));
        assertTrue(recursiveEquals(retValue, false));
    }

};


