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

public class Options_addOptionGroup_152392193218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term23;
     Object term1121;
     Object term1127;

    public Options_addOptionGroup_152392193218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2 = new LinkedHashMap();
        LinkedHashMap term8 = new LinkedHashMap();
        ArrayList term14 = new ArrayList();
        HashMap term18 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1, term1.getClass(), "shortOpts", term2);
        setField(term1, term1.getClass(), "longOpts", term8);
        setField(term1, term1.getClass(), "requiredOpts", term14);
        setField(term1, term1.getClass(), "optionGroups", term18);
        HashMap term24 = new HashMap();
        term23 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term23, term23.getClass(), "optionMap", term24);
        setField(term23, term23.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term23, term23.getClass(), "required", false);
        LinkedHashMap term1122 = new LinkedHashMap();
        LinkedHashMap term1123 = new LinkedHashMap();
        ArrayList term1124 = new ArrayList();
        HashMap term1126 = new HashMap();
        term1121 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1121, term1121.getClass(), "shortOpts", term1122);
        setField(term1121, term1121.getClass(), "longOpts", term1123);
        setField(term1121, term1121.getClass(), "requiredOpts", term1124);
        setField(term1121, term1121.getClass(), "optionGroups", term1126);
        HashMap term1128 = new HashMap();
        term1127 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1127, term1127.getClass(), "optionMap", term1128);
        setField(term1127, term1127.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term1127, term1127.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "addOptionGroup", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term1121));
        assertTrue(recursiveEquals(term23, term1127));
    }

};


