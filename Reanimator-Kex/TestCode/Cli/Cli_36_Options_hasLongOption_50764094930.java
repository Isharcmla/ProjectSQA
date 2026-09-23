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
import java.util.ArrayList;
import java.util.HashMap;

public class Options_hasLongOption_50764094930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;
     Object term3761;

    public Options_hasLongOption_50764094930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term726 = new LinkedHashMap();
        LinkedHashMap term732 = new LinkedHashMap();
        ArrayList term738 = new ArrayList();
        HashMap term742 = new HashMap();
        term725 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term725, term725.getClass(), "shortOpts", term726);
        setField(term725, term725.getClass(), "longOpts", term732);
        setField(term725, term725.getClass(), "requiredOpts", term738);
        setField(term725, term725.getClass(), "optionGroups", term742);
        LinkedHashMap term3762 = new LinkedHashMap();
        LinkedHashMap term3763 = new LinkedHashMap();
        ArrayList term3764 = new ArrayList();
        HashMap term3766 = new HashMap();
        term3761 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3761, term3761.getClass(), "shortOpts", term3762);
        setField(term3761, term3761.getClass(), "longOpts", term3763);
        setField(term3761, term3761.getClass(), "requiredOpts", term3764);
        setField(term3761, term3761.getClass(), "optionGroups", term3766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "hasLongOption", argTypes, term725, args);
        assertTrue(recursiveEquals(term725, term3761));
    }

};


