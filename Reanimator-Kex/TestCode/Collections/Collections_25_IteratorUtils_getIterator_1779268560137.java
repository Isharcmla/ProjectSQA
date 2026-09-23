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

public class IteratorUtils_getIterator_1779268560137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16504;
     Object term16508;
     Object term16507;

    public IteratorUtils_getIterator_1779268560137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16504 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$1"));
        term16508 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$1"));
        setField(term16508, term16508.getClass(), "i", null);
        setField(term16508, term16508.getClass(), "this$0", null);
        term16507 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$1"));
        setField(term16507, term16507.getClass(), "i", null);
        setField(term16507, term16507.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16504;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term16504, term16508));
        assertTrue(recursiveEquals(retValue, term16507));
    }

};


