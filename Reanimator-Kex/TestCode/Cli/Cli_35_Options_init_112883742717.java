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

public class Options_init_112883742717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;

    public Options_init_112883742717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1065 = new LinkedHashMap();
        LinkedHashMap term1066 = new LinkedHashMap();
        ArrayList term1067 = new ArrayList();
        HashMap term1069 = new HashMap();
        term1064 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1064, term1064.getClass(), "shortOpts", term1065);
        setField(term1064, term1064.getClass(), "longOpts", term1066);
        setField(term1064, term1064.getClass(), "requiredOpts", term1067);
        setField(term1064, term1064.getClass(), "optionGroups", term1069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1064));
    }

};


