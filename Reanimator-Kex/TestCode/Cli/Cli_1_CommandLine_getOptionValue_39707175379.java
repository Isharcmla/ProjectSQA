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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CommandLine_getOptionValue_39707175379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19252;

    public CommandLine_getOptionValue_39707175379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19300 = new HashMap();
        ((HashMap) term19300).put((Object)null, (Object)null);
        ((HashMap) term19300).put((Object)null, (Object)null);
        ((HashMap) term19300).put((Object)null, (Object)null);
        ((HashMap) term19300).put((Object)null, (Object)null);
        Object term19506 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term19554 = new HashMap();
        ((HashMap) term19554).put((Object)null, (Object)null);
        ((HashMap) term19554).put("", "");
        ((HashMap) term19554).put(term19506, term19506);
        ((HashMap) term19554).put(term19506, term19506);
        term19252 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term19252, term19252.getClass(), "names", term19300);
        setField(term19252, term19252.getClass(), "options", term19554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "getOptionValue", argTypes, term19252, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
