package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class HashCodeBuilder_getRegistry_166668238536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;
     Object term490;

    public HashCodeBuilder_getRegistry_166668238536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
        setIntField(term496, term496.getClass(), "threadLocalHashCode", 1731955226);
        HashMap term491 = new HashMap();
        Set<Object> term497 =  ((Map) term491).keySet();
        term490 = new HashSet((Collection<? extends Object>) term497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(null, term496));
        assertTrue(recursiveEquals(retValue, term490));
    }

};


