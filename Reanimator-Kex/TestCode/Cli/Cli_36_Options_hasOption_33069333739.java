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
import java.lang.Object;

public class Options_hasOption_33069333739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6155;
     Object term6438;

    public Options_hasOption_33069333739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term6215 = new LinkedHashMap();
        ((LinkedHashMap) term6215).put("", "");
        ((LinkedHashMap) term6215).put((Object)null, (Object)null);
        ((LinkedHashMap) term6215).put((Object)null, (Object)null);
        ((LinkedHashMap) term6215).put((Object)null, (Object)null);
        term6155 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6155, term6155.getClass(), "shortOpts", term6215);
        LinkedHashMap term6439 = new LinkedHashMap();
        term6438 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6438, term6438.getClass(), "shortOpts", term6439);
        setField(term6438, term6438.getClass(), "longOpts", null);
        setField(term6438, term6438.getClass(), "requiredOpts", null);
        setField(term6438, term6438.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasOption", argTypes, term6155, args);
        assertTrue(recursiveEquals(term6155, term6438));
        assertTrue(recursiveEquals(retValue, true));
    }

};


