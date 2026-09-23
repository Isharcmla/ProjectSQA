package org.apache.commons.cli;

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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;

public class Options_getMatchingOptions_81032785351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10201;

    public Options_getMatchingOptions_81032785351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10500 = new LinkedHashMap();
        Set<Object> term10409_OuterSet = ((LinkedHashMap) term10500).keySet();
        Iterator term10409 =  ((Set) term10409_OuterSet).iterator();
        LinkedHashMap term10261 = new LinkedHashMap();
        ((LinkedHashMap) term10261).put(term10409, term10409);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        ((LinkedHashMap) term10261).put((Object)null, (Object)null);
        term10201 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term10201, term10201.getClass(), "longOpts", term10261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getMatchingOptions", argTypes, term10201, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


