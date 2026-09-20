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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class CommandLine_getOptionObject_59404697085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23386;
     Object term24478;

    public CommandLine_getOptionObject_59404697085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23434 = new HashMap();
        ((HashMap) term23434).put((Object)null, (Object)null);
        ((HashMap) term23434).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term23662 = new HashMap();
        term23386 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term23386, term23386.getClass(), "names", term23434);
        setField(term23386, term23386.getClass(), "options", term23662);
        HashMap term24479 = new HashMap();
        HashMap term24480 = new HashMap();
        term24478 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term24478, term24478.getClass(), "args", null);
        setField(term24478, term24478.getClass(), "options", term24479);
        setField(term24478, term24478.getClass(), "names", term24480);
        setField(term24478, term24478.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "getOptionObject", argTypes, term23386, args);
        assertTrue(recursiveEquals(term23386, term24478));
        assertTrue(recursiveEquals(retValue, null));
    }

};
