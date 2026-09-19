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

public class CommandLine_getOptionValues_196330445342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4512;

    public CommandLine_getOptionValues_196330445342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4560 = new HashMap();
        HashMap term4712 = new HashMap();
        ((HashMap) term4712).put("", "");
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        ((HashMap) term4712).put((Object)null, (Object)null);
        term4512 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term4512, term4512.getClass(), "names", term4560);
        setField(term4512, term4512.getClass(), "options", term4712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionValues", argTypes, term4512, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


