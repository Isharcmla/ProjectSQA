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

public class CommandLine_getOptionValue_2780776449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9028;
     Object term10119;

    public CommandLine_getOptionValue_2780776449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9076 = new HashMap();
        ((HashMap) term9076).put((Object)null, (Object)null);
        ((HashMap) term9076).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term9304 = new HashMap();
        term9028 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term9028, term9028.getClass(), "names", term9076);
        setField(term9028, term9028.getClass(), "options", term9304);
        HashMap term10120 = new HashMap();
        HashMap term10121 = new HashMap();
        term10119 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term10119, term10119.getClass(), "args", null);
        setField(term10119, term10119.getClass(), "options", term10120);
        setField(term10119, term10119.getClass(), "names", term10121);
        setField(term10119, term10119.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term9028, args);
        assertTrue(recursiveEquals(term9028, term10119));
        assertTrue(recursiveEquals(retValue, null));
    }

};
