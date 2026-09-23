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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Options_getOptionGroups_127952180219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term1181;
     Object term1152;

    public Options_getOptionGroups_127952180219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term53 = new LinkedHashMap();
        LinkedHashMap term59 = new LinkedHashMap();
        ArrayList term65 = new ArrayList();
        HashMap term69 = new HashMap();
        term52 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term52, term52.getClass(), "shortOpts", term53);
        setField(term52, term52.getClass(), "longOpts", term59);
        setField(term52, term52.getClass(), "requiredOpts", term65);
        setField(term52, term52.getClass(), "optionGroups", term69);
        LinkedHashMap term1182 = new LinkedHashMap();
        LinkedHashMap term1183 = new LinkedHashMap();
        ArrayList term1184 = new ArrayList();
        HashMap term1186 = new HashMap();
        term1181 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1181, term1181.getClass(), "shortOpts", term1182);
        setField(term1181, term1181.getClass(), "longOpts", term1183);
        setField(term1181, term1181.getClass(), "requiredOpts", term1184);
        setField(term1181, term1181.getClass(), "optionGroups", term1186);
        HashMap term1153 = new HashMap();
        Set<Object> term1188 =  ((Map) term1153).keySet();
        term1152 = new HashSet((Collection<? extends Object>) term1188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptionGroups", argTypes, term52, args);
        assertTrue(recursiveEquals(term52, term1181));
        assertTrue(recursiveEquals(retValue, term1152));
    }

};


