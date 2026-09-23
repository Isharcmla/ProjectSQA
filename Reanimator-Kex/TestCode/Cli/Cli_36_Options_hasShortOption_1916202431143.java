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

public class Options_hasShortOption_1916202431143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41102;
     Object term41159;

    public Options_hasShortOption_1916202431143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41150 = new HashMap();
        term41102 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term41102, term41102.getClass(), "shortOpts", term41150);
        HashMap term41160 = new HashMap();
        term41159 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term41159, term41159.getClass(), "shortOpts", term41160);
        setField(term41159, term41159.getClass(), "longOpts", null);
        setField(term41159, term41159.getClass(), "requiredOpts", null);
        setField(term41159, term41159.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasShortOption", argTypes, term41102, args);
        assertTrue(recursiveEquals(term41102, term41159));
    }

};


