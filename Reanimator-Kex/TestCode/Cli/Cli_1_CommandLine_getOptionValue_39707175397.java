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

public class CommandLine_getOptionValue_39707175397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27710;

    public CommandLine_getOptionValue_39707175397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27848 = newInstance(Class.forName("java.lang.Object"));
        HashMap term27758 = new HashMap();
        ((HashMap) term27758).put(term27848, term27848);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        ((HashMap) term27758).put((Object)null, (Object)null);
        term27710 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term27710, term27710.getClass(), "names", term27758);
        setField(term27710, term27710.getClass(), "options", null);
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
            callMethod(klass, "getOptionValue", argTypes, term27710, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
