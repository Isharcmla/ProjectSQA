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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.util.LinkedHashMap;

public class Options_hasOption_33069333767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15503;
     Object term16597;

    public Options_hasOption_33069333767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15563 = new LinkedHashMap();
        LinkedHashMap term15727 = new LinkedHashMap();
        ((LinkedHashMap) term15727).put("                                                                                                                                ", "                                                                                                                                ");
        term15503 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term15503, term15503.getClass(), "shortOpts", term15563);
        setField(term15503, term15503.getClass(), "longOpts", term15727);
        LinkedHashMap term16598 = new LinkedHashMap();
        LinkedHashMap term16599 = new LinkedHashMap();
        term16597 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term16597, term16597.getClass(), "shortOpts", term16598);
        setField(term16597, term16597.getClass(), "longOpts", term16599);
        setField(term16597, term16597.getClass(), "requiredOpts", null);
        setField(term16597, term16597.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                ";
        Object retValue = callMethod(klass, "hasOption", argTypes, term15503, args);
        assertTrue(recursiveEquals(term15503, term16597));
        assertTrue(recursiveEquals(retValue, true));
    }

};


