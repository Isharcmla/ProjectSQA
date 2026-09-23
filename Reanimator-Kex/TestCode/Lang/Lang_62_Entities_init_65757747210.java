package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class Entities_init_65757747210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;

    public Entities_init_65757747210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term694 = new HashMap();
        term692 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term693 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term695 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term696 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term693, term693.getClass(), "lookupTable", null);
        setIntField(term693, term693.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term693, term693.getClass(), "mapNameToValue", term694);
        setField(term695, term695.getClass(), "table", term696);
        setIntField(term695, term695.getClass(), "count", 0);
        setIntField(term695, term695.getClass(), "threshold", 15);
        setFloatField(term695, term695.getClass(), "loadFactor", 0.75F);
        setField(term693, term693.getClass(), "mapValueToName", term695);
        setField(term692, term692.getClass(), "map", term693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term692));
    }

};


