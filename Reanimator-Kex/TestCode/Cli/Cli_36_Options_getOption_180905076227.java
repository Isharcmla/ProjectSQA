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

public class Options_getOption_180905076227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;
     Object term3517;

    public Options_getOption_180905076227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term594 = new LinkedHashMap();
        LinkedHashMap term600 = new LinkedHashMap();
        ArrayList term606 = new ArrayList();
        HashMap term610 = new HashMap();
        term593 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term593, term593.getClass(), "shortOpts", term594);
        setField(term593, term593.getClass(), "longOpts", term600);
        setField(term593, term593.getClass(), "requiredOpts", term606);
        setField(term593, term593.getClass(), "optionGroups", term610);
        LinkedHashMap term3518 = new LinkedHashMap();
        LinkedHashMap term3519 = new LinkedHashMap();
        ArrayList term3520 = new ArrayList();
        HashMap term3522 = new HashMap();
        term3517 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3517, term3517.getClass(), "shortOpts", term3518);
        setField(term3517, term3517.getClass(), "longOpts", term3519);
        setField(term3517, term3517.getClass(), "requiredOpts", term3520);
        setField(term3517, term3517.getClass(), "optionGroups", term3522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        Object retValue = callMethod(klass, "getOption", argTypes, term593, args);
        assertTrue(recursiveEquals(term593, term3517));
        assertTrue(recursiveEquals(retValue, null));
    }

};


