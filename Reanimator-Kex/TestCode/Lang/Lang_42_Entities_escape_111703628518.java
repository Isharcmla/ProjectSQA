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

public class Entities_escape_111703628518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term580246;

    public Entities_escape_111703628518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term519 = new HashMap();
        term516 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term517 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term524 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term525 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term517, term517.getClass(), "lookupTable", null);
        setIntField(term517, term517.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term517, term517.getClass(), "mapNameToValue", term519);
        setField(term524, term524.getClass(), "table", term525);
        setIntField(term524, term524.getClass(), "count", 0);
        setIntField(term524, term524.getClass(), "threshold", 15);
        setFloatField(term524, term524.getClass(), "loadFactor", 0.75F);
        setField(term517, term517.getClass(), "mapValueToName", term524);
        setField(term516, term516.getClass(), "map", term517);
        HashMap term580249 = new HashMap();
        term580246 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term580247 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object[] term580248 = (Object[]) newArray("java.lang.String", 256);
        Object term580250 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term580251 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term580247, term580247.getClass(), "lookupTable", term580248);
        setIntField(term580247, term580247.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term580247, term580247.getClass(), "mapNameToValue", term580249);
        setField(term580250, term580250.getClass(), "table", term580251);
        setIntField(term580250, term580250.getClass(), "count", 0);
        setIntField(term580250, term580250.getClass(), "threshold", 15);
        setFloatField(term580250, term580250.getClass(), "loadFactor", 0.75F);
        setField(term580247, term580247.getClass(), "mapValueToName", term580250);
        setField(term580246, term580246.getClass(), "map", term580247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        Object retValue = callMethod(klass, "escape", argTypes, term516, args);
        assertTrue(recursiveEquals(term516, term580246));
        assertTrue(recursiveEquals(retValue, "hNxWaHcfhY"));
    }

};


