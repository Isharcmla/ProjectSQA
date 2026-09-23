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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class Options_addOption_151414344022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term254;

    public Options_addOption_151414344022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term209 = new LinkedHashMap();
        LinkedHashMap term215 = new LinkedHashMap();
        ArrayList term221 = new ArrayList();
        HashMap term225 = new HashMap();
        term208 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term208, term208.getClass(), "shortOpts", term209);
        setField(term208, term208.getClass(), "longOpts", term215);
        setField(term208, term208.getClass(), "requiredOpts", term221);
        setField(term208, term208.getClass(), "optionGroups", term225);
        term254 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        args[2] = term254;
        args[3] = "MjGYSRKTNF";
        try {
            callMethod(klass, "addOption", argTypes, term208, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


