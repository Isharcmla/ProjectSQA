package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_equals_201851788722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term52;
     Object term584;
     Object term592;

    public MultiKey_equals_201851788722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term45 = (Object[]) newArray("java.lang.Object", 6);
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        Object term47 = newInstance(Class.forName("java.lang.Object"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term49 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        setElement(term45, 0, term46);
        setElement(term45, 1, term47);
        setElement(term45, 2, term48);
        setElement(term45, 3, term49);
        setElement(term45, 4, term50);
        setElement(term45, 5, term51);
        setField(term44, term44.getClass(), "keys", term45);
        term52 = newInstance(Class.forName("java.lang.Object"));
        term584 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term585 = (Object[]) newArray("java.lang.Object", 6);
        Object term586 = newInstance(Class.forName("java.lang.Object"));
        Object term587 = newInstance(Class.forName("java.lang.Object"));
        Object term588 = newInstance(Class.forName("java.lang.Object"));
        Object term589 = newInstance(Class.forName("java.lang.Object"));
        Object term590 = newInstance(Class.forName("java.lang.Object"));
        Object term591 = newInstance(Class.forName("java.lang.Object"));
        setElement(term585, 0, term586);
        setElement(term585, 1, term587);
        setElement(term585, 2, term588);
        setElement(term585, 3, term589);
        setElement(term585, 4, term590);
        setElement(term585, 5, term591);
        setField(term584, term584.getClass(), "keys", term585);
        term592 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52;
        Object retValue = callMethod(klass, "equals", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term584));
        assertTrue(recursiveEquals(term52, term592));
        assertTrue(recursiveEquals(retValue, false));
    }

};


