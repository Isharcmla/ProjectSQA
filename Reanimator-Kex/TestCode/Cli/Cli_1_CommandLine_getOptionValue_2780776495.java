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

public class CommandLine_getOptionValue_2780776495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27817;

    public CommandLine_getOptionValue_2780776495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27955 = newInstance(Class.forName("java.lang.Object"));
        HashMap term27865 = new HashMap();
        ((HashMap) term27865).put(term27955, term27955);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        ((HashMap) term27865).put((Object)null, (Object)null);
        term27817 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term27817, term27817.getClass(), "names", term27865);
        setField(term27817, term27817.getClass(), "options", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionValue", argTypes, term27817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


