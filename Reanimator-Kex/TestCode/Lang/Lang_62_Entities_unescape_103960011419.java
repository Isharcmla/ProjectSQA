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

public class Entities_unescape_103960011419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public Entities_unescape_103960011419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term624 = new HashMap();
        term621 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term622 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term629 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term630 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term622, term622.getClass(), "lookupTable", null);
        setIntField(term622, term622.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term622, term622.getClass(), "mapNameToValue", term624);
        setField(term629, term629.getClass(), "table", term630);
        setIntField(term629, term629.getClass(), "count", 0);
        setIntField(term629, term629.getClass(), "threshold", 15);
        setFloatField(term629, term629.getClass(), "loadFactor", 0.75F);
        setField(term622, term622.getClass(), "mapValueToName", term629);
        setField(term621, term621.getClass(), "map", term622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "eZFUvlxvGV";
        try {
            callMethod(klass, "unescape", argTypes, term621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


