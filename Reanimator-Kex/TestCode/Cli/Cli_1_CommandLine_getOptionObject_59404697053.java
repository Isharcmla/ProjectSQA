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

public class CommandLine_getOptionObject_59404697053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10105;

    public CommandLine_getOptionObject_59404697053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10153 = new HashMap();
        ((HashMap) term10153).put((Object)null, (Object)null);
        ((HashMap) term10153).put((Object)null, (Object)null);
        ((HashMap) term10153).put((Object)null, (Object)null);
        ((HashMap) term10153).put((Object)null, (Object)null);
        Object term10359 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term10407 = new HashMap();
        ((HashMap) term10407).put((Object)null, (Object)null);
        ((HashMap) term10407).put("", "");
        ((HashMap) term10407).put(term10359, term10359);
        ((HashMap) term10407).put(term10359, term10359);
        term10105 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term10105, term10105.getClass(), "names", term10153);
        setField(term10105, term10105.getClass(), "options", term10407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionObject", argTypes, term10105, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


