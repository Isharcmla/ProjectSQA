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

public class CommandLine_getOptionValues_196330445353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11248;

    public CommandLine_getOptionValues_196330445353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11424 = newInstance(Class.forName("java.lang.Object"));
        HashMap term11296 = new HashMap();
        ((HashMap) term11296).put("                                ", "                                ");
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put((Object)null, (Object)null);
        ((HashMap) term11296).put(term11424, term11424);
        ((HashMap) term11296).put((Object)null, (Object)null);
        term11248 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term11248, term11248.getClass(), "names", term11296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        try {
            callMethod(klass, "getOptionValues", argTypes, term11248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
