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

public class CommandLine_getOptionValues_1963304453105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30969;

    public CommandLine_getOptionValues_1963304453105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31017 = new HashMap();
        HashMap term31169 = new HashMap();
        ((HashMap) term31169).put("", "");
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        ((HashMap) term31169).put((Object)null, (Object)null);
        term30969 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term30969, term30969.getClass(), "names", term31017);
        setField(term30969, term30969.getClass(), "options", term31169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionValues", argTypes, term30969, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


