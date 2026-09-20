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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CommandLine_getOptionObject_594046970111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34776;

    public CommandLine_getOptionObject_594046970111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34914 = newInstance(Class.forName("java.lang.Object"));
        HashMap term34824 = new HashMap();
        ((HashMap) term34824).put(term34914, term34914);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        ((HashMap) term34824).put((Object)null, (Object)null);
        term34776 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term34776, term34776.getClass(), "names", term34824);
        setField(term34776, term34776.getClass(), "options", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionObject", argTypes, term34776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
