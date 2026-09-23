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
import java.util.HashMap;
import java.util.ArrayList;

public class Options_getMatchingOptions_81032785379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19099;
     Object term19199;
     Object term19188;

    public Options_getMatchingOptions_81032785379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19147 = new HashMap();
        term19099 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19099, term19099.getClass(), "longOpts", term19147);
        HashMap term19200 = new HashMap();
        term19199 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19199, term19199.getClass(), "shortOpts", null);
        setField(term19199, term19199.getClass(), "longOpts", term19200);
        setField(term19199, term19199.getClass(), "requiredOpts", null);
        setField(term19199, term19199.getClass(), "optionGroups", null);
        term19188 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term19099, args);
        assertTrue(recursiveEquals(term19099, term19199));
        assertTrue(recursiveEquals(retValue, term19188));
    }

};


