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

public class CommandLine_getOptionValue_2780776475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17982;
     Object term19073;

    public CommandLine_getOptionValue_2780776475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18030 = new HashMap();
        ((HashMap) term18030).put((Object)null, (Object)null);
        ((HashMap) term18030).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term18258 = new HashMap();
        term17982 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term17982, term17982.getClass(), "names", term18030);
        setField(term17982, term17982.getClass(), "options", term18258);
        HashMap term19074 = new HashMap();
        HashMap term19075 = new HashMap();
        term19073 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term19073, term19073.getClass(), "args", null);
        setField(term19073, term19073.getClass(), "options", term19074);
        setField(term19073, term19073.getClass(), "names", term19075);
        setField(term19073, term19073.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term17982, args);
        assertTrue(recursiveEquals(term17982, term19073));
        assertTrue(recursiveEquals(retValue, null));
    }

};


