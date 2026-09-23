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

public class Options_toString_167429327833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;
     Object term4253;

    public Options_toString_167429327833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1021 = new LinkedHashMap();
        LinkedHashMap term1027 = new LinkedHashMap();
        ArrayList term1033 = new ArrayList();
        HashMap term1037 = new HashMap();
        term1020 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1020, term1020.getClass(), "shortOpts", term1021);
        setField(term1020, term1020.getClass(), "longOpts", term1027);
        setField(term1020, term1020.getClass(), "requiredOpts", term1033);
        setField(term1020, term1020.getClass(), "optionGroups", term1037);
        LinkedHashMap term4254 = new LinkedHashMap();
        LinkedHashMap term4256 = new LinkedHashMap();
        ArrayList term4258 = new ArrayList();
        HashMap term4260 = new HashMap();
        term4253 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term4253, term4253.getClass(), "shortOpts", term4254);
        setField(term4253, term4253.getClass(), "longOpts", term4256);
        setField(term4253, term4253.getClass(), "requiredOpts", term4258);
        setField(term4253, term4253.getClass(), "optionGroups", term4260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1020, args);
        assertTrue(recursiveEquals(term1020, term4253));
        assertTrue(recursiveEquals(retValue, "[ Options: [ short {} ] [ long {} ]"));
    }

};


