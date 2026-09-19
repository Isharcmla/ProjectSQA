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

public class CommandLine_getOptionValue_39707175387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25131;

    public CommandLine_getOptionValue_39707175387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25179 = new HashMap();
        ((HashMap) term25179).put((Object)null, (Object)null);
        ((HashMap) term25179).put((Object)null, (Object)null);
        ((HashMap) term25179).put((Object)null, (Object)null);
        ((HashMap) term25179).put((Object)null, (Object)null);
        Object term25385 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term25433 = new HashMap();
        ((HashMap) term25433).put((Object)null, (Object)null);
        ((HashMap) term25433).put("", "");
        ((HashMap) term25433).put(term25385, term25385);
        ((HashMap) term25433).put(term25385, term25385);
        term25131 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term25131, term25131.getClass(), "names", term25179);
        setField(term25131, term25131.getClass(), "options", term25433);
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
            callMethod(klass, "getOptionValue", argTypes, term25131, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


