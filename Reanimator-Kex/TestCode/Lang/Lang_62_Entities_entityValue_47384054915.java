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

public class Entities_entityValue_47384054915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;
     Object term567666;

    public Entities_entityValue_47384054915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term484 = new HashMap();
        term481 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term482 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term489 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term490 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term482, term482.getClass(), "lookupTable", null);
        setIntField(term482, term482.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term482, term482.getClass(), "mapNameToValue", term484);
        setField(term489, term489.getClass(), "table", term490);
        setIntField(term489, term489.getClass(), "count", 0);
        setIntField(term489, term489.getClass(), "threshold", 15);
        setFloatField(term489, term489.getClass(), "loadFactor", 0.75F);
        setField(term482, term482.getClass(), "mapValueToName", term489);
        setField(term481, term481.getClass(), "map", term482);
        HashMap term567668 = new HashMap();
        term567666 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term567667 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term567669 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term567670 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term567667, term567667.getClass(), "lookupTable", null);
        setIntField(term567667, term567667.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term567667, term567667.getClass(), "mapNameToValue", term567668);
        setField(term567669, term567669.getClass(), "table", term567670);
        setIntField(term567669, term567669.getClass(), "count", 0);
        setIntField(term567669, term567669.getClass(), "threshold", 15);
        setFloatField(term567669, term567669.getClass(), "loadFactor", 0.75F);
        setField(term567667, term567667.getClass(), "mapValueToName", term567669);
        setField(term567666, term567666.getClass(), "map", term567667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        Object retValue = callMethod(klass, "entityValue", argTypes, term481, args);
        assertTrue(recursiveEquals(term481, term567666));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


