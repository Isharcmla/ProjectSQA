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

public class Entities_init_65757747212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764;

    public Entities_init_65757747212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term766 = new HashMap();
        term764 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term765 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term767 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term768 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term765, term765.getClass(), "lookupTable", null);
        setIntField(term765, term765.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term765, term765.getClass(), "mapNameToValue", term766);
        setField(term767, term767.getClass(), "table", term768);
        setIntField(term767, term767.getClass(), "count", 0);
        setIntField(term767, term767.getClass(), "threshold", 15);
        setFloatField(term767, term767.getClass(), "loadFactor", 0.75F);
        setField(term765, term765.getClass(), "mapValueToName", term767);
        setField(term764, term764.getClass(), "map", term765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term764));
    }

};


