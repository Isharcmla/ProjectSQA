package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_equals_169725075523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term59;
     Object term630;
     Object term636;

    public MultiKey_equals_169725075523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term54 = (Object[]) newArray("java.lang.Object", 4);
        Object term55 = newInstance(Class.forName("java.lang.Object"));
        Object term56 = newInstance(Class.forName("java.lang.Object"));
        Object term57 = newInstance(Class.forName("java.lang.Object"));
        Object term58 = newInstance(Class.forName("java.lang.Object"));
        setElement(term54, 0, term55);
        setElement(term54, 1, term56);
        setElement(term54, 2, term57);
        setElement(term54, 3, term58);
        setField(term53, term53.getClass(), "keys", term54);
        term59 = newInstance(Class.forName("java.lang.Object"));
        term630 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term631 = (Object[]) newArray("java.lang.Object", 4);
        Object term632 = newInstance(Class.forName("java.lang.Object"));
        Object term633 = newInstance(Class.forName("java.lang.Object"));
        Object term634 = newInstance(Class.forName("java.lang.Object"));
        Object term635 = newInstance(Class.forName("java.lang.Object"));
        setElement(term631, 0, term632);
        setElement(term631, 1, term633);
        setElement(term631, 2, term634);
        setElement(term631, 3, term635);
        setField(term630, term630.getClass(), "keys", term631);
        term636 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term59;
        Object retValue = callMethod(klass, "equals", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term630));
        assertTrue(recursiveEquals(term59, term636));
        assertTrue(recursiveEquals(retValue, false));
    }

};


