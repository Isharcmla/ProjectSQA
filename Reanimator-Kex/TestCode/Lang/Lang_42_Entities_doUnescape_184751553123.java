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
import java.lang.Integer;

public class Entities_doUnescape_184751553123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term716;

    public Entities_doUnescape_184751553123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term694 = new HashMap();
        term691 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term692 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term699 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term700 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term692, term692.getClass(), "lookupTable", null);
        setIntField(term692, term692.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term692, term692.getClass(), "mapNameToValue", term694);
        setField(term699, term699.getClass(), "table", term700);
        setIntField(term699, term699.getClass(), "count", 0);
        setIntField(term699, term699.getClass(), "threshold", 15);
        setFloatField(term699, term699.getClass(), "loadFactor", 0.75F);
        setField(term692, term692.getClass(), "mapValueToName", term699);
        setField(term691, term691.getClass(), "map", term692);
        term716 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "vrQLuWIDJX";
        args[2] = term716;
        try {
            callMethod(klass, "doUnescape", argTypes, term691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


