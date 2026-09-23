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

public class Options_hasOption_33069333773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16479;
     Object term17573;

    public Options_hasOption_33069333773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16539 = new LinkedHashMap();
        LinkedHashMap term16703 = new LinkedHashMap();
        ((LinkedHashMap) term16703).put("                                                                                                                                ", "                                                                                                                                ");
        term16479 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term16479, term16479.getClass(), "shortOpts", term16539);
        setField(term16479, term16479.getClass(), "longOpts", term16703);
        LinkedHashMap term17574 = new LinkedHashMap();
        LinkedHashMap term17575 = new LinkedHashMap();
        term17573 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term17573, term17573.getClass(), "shortOpts", term17574);
        setField(term17573, term17573.getClass(), "longOpts", term17575);
        setField(term17573, term17573.getClass(), "requiredOpts", null);
        setField(term17573, term17573.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                ";
        Object retValue = callMethod(klass, "hasOption", argTypes, term16479, args);
        assertTrue(recursiveEquals(term16479, term17573));
        assertTrue(recursiveEquals(retValue, true));
    }

};


