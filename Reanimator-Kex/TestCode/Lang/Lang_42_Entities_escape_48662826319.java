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
import java.lang.NullPointerException;
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Entities_escape_48662826319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;

    public Entities_escape_48662826319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term554 = new HashMap();
        term551 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term552 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term559 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term560 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term552, term552.getClass(), "lookupTable", null);
        setIntField(term552, term552.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term552, term552.getClass(), "mapNameToValue", term554);
        setField(term559, term559.getClass(), "table", term560);
        setIntField(term559, term559.getClass(), "count", 0);
        setIntField(term559, term559.getClass(), "threshold", 15);
        setFloatField(term559, term559.getClass(), "loadFactor", 0.75F);
        setField(term552, term552.getClass(), "mapValueToName", term559);
        setField(term551, term551.getClass(), "map", term552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "RkybSrpybU";
        try {
            callMethod(klass, "escape", argTypes, term551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


