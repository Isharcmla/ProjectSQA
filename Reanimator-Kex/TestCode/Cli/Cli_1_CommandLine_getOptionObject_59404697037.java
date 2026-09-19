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

public class CommandLine_getOptionObject_59404697037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2317;

    public CommandLine_getOptionObject_59404697037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2365 = new HashMap();
        ((HashMap) term2365).put("", "");
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        ((HashMap) term2365).put((Object)null, (Object)null);
        term2317 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2317, term2317.getClass(), "names", term2365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionObject", argTypes, term2317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


