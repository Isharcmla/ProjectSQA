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

public class CommandLine_getOptionValue_2780776455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12089;

    public CommandLine_getOptionValue_2780776455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12137 = new HashMap();
        ((HashMap) term12137).put((Object)null, (Object)null);
        ((HashMap) term12137).put((Object)null, (Object)null);
        ((HashMap) term12137).put((Object)null, (Object)null);
        ((HashMap) term12137).put((Object)null, (Object)null);
        Object term12343 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term12391 = new HashMap();
        ((HashMap) term12391).put((Object)null, (Object)null);
        ((HashMap) term12391).put("", "");
        ((HashMap) term12391).put(term12343, term12343);
        ((HashMap) term12391).put(term12343, term12343);
        term12089 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term12089, term12089.getClass(), "names", term12137);
        setField(term12089, term12089.getClass(), "options", term12391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionValue", argTypes, term12089, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
