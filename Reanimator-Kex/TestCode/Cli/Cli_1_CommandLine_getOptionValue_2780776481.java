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

public class CommandLine_getOptionValue_2780776481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22832;

    public CommandLine_getOptionValue_2780776481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22880 = new HashMap();
        ((HashMap) term22880).put((Object)null, (Object)null);
        ((HashMap) term22880).put((Object)null, (Object)null);
        ((HashMap) term22880).put((Object)null, (Object)null);
        ((HashMap) term22880).put((Object)null, (Object)null);
        Object term23086 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        HashMap term23134 = new HashMap();
        ((HashMap) term23134).put((Object)null, (Object)null);
        ((HashMap) term23134).put("", "");
        ((HashMap) term23134).put(term23086, term23086);
        ((HashMap) term23134).put(term23086, term23086);
        term22832 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term22832, term22832.getClass(), "names", term22880);
        setField(term22832, term22832.getClass(), "options", term23134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOptionValue", argTypes, term22832, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


