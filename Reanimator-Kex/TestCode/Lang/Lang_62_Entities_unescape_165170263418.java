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

public class Entities_unescape_165170263418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;
     Object term577727;

    public Entities_unescape_165170263418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term589 = new HashMap();
        term586 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term587 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term594 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term595 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term587, term587.getClass(), "lookupTable", null);
        setIntField(term587, term587.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term587, term587.getClass(), "mapNameToValue", term589);
        setField(term594, term594.getClass(), "table", term595);
        setIntField(term594, term594.getClass(), "count", 0);
        setIntField(term594, term594.getClass(), "threshold", 15);
        setFloatField(term594, term594.getClass(), "loadFactor", 0.75F);
        setField(term587, term587.getClass(), "mapValueToName", term594);
        setField(term586, term586.getClass(), "map", term587);
        HashMap term577729 = new HashMap();
        term577727 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term577728 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term577730 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term577731 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term577728, term577728.getClass(), "lookupTable", null);
        setIntField(term577728, term577728.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term577728, term577728.getClass(), "mapNameToValue", term577729);
        setField(term577730, term577730.getClass(), "table", term577731);
        setIntField(term577730, term577730.getClass(), "count", 0);
        setIntField(term577730, term577730.getClass(), "threshold", 15);
        setFloatField(term577730, term577730.getClass(), "loadFactor", 0.75F);
        setField(term577728, term577728.getClass(), "mapValueToName", term577730);
        setField(term577727, term577727.getClass(), "map", term577728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        Object retValue = callMethod(klass, "unescape", argTypes, term586, args);
        assertTrue(recursiveEquals(term586, term577727));
        assertTrue(recursiveEquals(retValue, "xOEqzGAmDU"));
    }

};


