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
import java.lang.Integer;

public class Entities_entityName_180699116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;
     Object term479;
     Object term567693;

    public Entities_entityName_180699116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term469 = new HashMap();
        term466 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term467 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term474 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term475 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term467, term467.getClass(), "lookupTable", null);
        setIntField(term467, term467.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term467, term467.getClass(), "mapNameToValue", term469);
        setField(term474, term474.getClass(), "table", term475);
        setIntField(term474, term474.getClass(), "count", 0);
        setIntField(term474, term474.getClass(), "threshold", 15);
        setFloatField(term474, term474.getClass(), "loadFactor", 0.75F);
        setField(term467, term467.getClass(), "mapValueToName", term474);
        setField(term466, term466.getClass(), "map", term467);
        term479 = new Integer(1162663216);
        HashMap term567695 = new HashMap();
        term567693 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term567694 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term567696 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term567697 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term567694, term567694.getClass(), "lookupTable", null);
        setIntField(term567694, term567694.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term567694, term567694.getClass(), "mapNameToValue", term567695);
        setField(term567696, term567696.getClass(), "table", term567697);
        setIntField(term567696, term567696.getClass(), "count", 0);
        setIntField(term567696, term567696.getClass(), "threshold", 15);
        setFloatField(term567696, term567696.getClass(), "loadFactor", 0.75F);
        setField(term567694, term567694.getClass(), "mapValueToName", term567696);
        setField(term567693, term567693.getClass(), "map", term567694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term479;
        Object retValue = callMethod(klass, "entityName", argTypes, term466, args);
        assertTrue(recursiveEquals(term466, term567693));
        assertTrue(recursiveEquals(term479, 1162663216));
        assertTrue(recursiveEquals(retValue, null));
    }

};


