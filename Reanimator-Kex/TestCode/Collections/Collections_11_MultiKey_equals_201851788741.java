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

public class MultiKey_equals_201851788741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2104;
     Object term4738;
     Object term4739;

    public MultiKey_equals_201851788741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2104 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term4738 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term4738, term4738.getClass(), "keys", null);
        term4739 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term4739, term4739.getClass(), "keys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2104;
        Object retValue = callMethod(klass, "equals", argTypes, term2104, args);
        assertTrue(recursiveEquals(term2104, term4738));
        assertTrue(recursiveEquals(term2104, term4739));
        assertTrue(recursiveEquals(retValue, true));
    }

};


