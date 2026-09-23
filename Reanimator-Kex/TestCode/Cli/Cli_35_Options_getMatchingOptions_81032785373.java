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

public class Options_getMatchingOptions_81032785373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17736;
     Object term18288;
     Object term18267;

    public Options_getMatchingOptions_81032785373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term17796 = new LinkedHashMap();
        ((LinkedHashMap) term17796).put("", "");
        term17736 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term17736, term17736.getClass(), "longOpts", term17796);
        LinkedHashMap term18289 = new LinkedHashMap();
        term18288 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18288, term18288.getClass(), "shortOpts", null);
        setField(term18288, term18288.getClass(), "longOpts", term18289);
        setField(term18288, term18288.getClass(), "requiredOpts", null);
        setField(term18288, term18288.getClass(), "optionGroups", null);
        term18267 = new ArrayList();
        ((ArrayList) term18267).add("");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term17736, args);
        assertTrue(recursiveEquals(term17736, term18288));
        assertTrue(recursiveEquals(retValue, term18267));
    }

};


