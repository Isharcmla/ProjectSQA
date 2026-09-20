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

public class CommandLine_getOptionObject_59404697092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25856;

    public CommandLine_getOptionObject_59404697092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25904 = new HashMap();
        ((HashMap) term25904).put((Object)null, (Object)null);
        ((HashMap) term25904).put((Object)null, (Object)null);
        ((HashMap) term25904).put((Object)null, (Object)null);
        ((HashMap) term25904).put((Object)null, (Object)null);
        Object term26110 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term26158 = new HashMap();
        ((HashMap) term26158).put((Object)null, (Object)null);
        ((HashMap) term26158).put("", "");
        ((HashMap) term26158).put(term26110, term26110);
        ((HashMap) term26158).put(term26110, term26110);
        term25856 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term25856, term25856.getClass(), "names", term25904);
        setField(term25856, term25856.getClass(), "options", term26158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionObject", argTypes, term25856, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
