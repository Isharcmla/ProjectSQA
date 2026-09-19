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

public class CommandLine_getOptionObject_59404697055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11777;
     Object term12869;

    public CommandLine_getOptionObject_59404697055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11825 = new HashMap();
        ((HashMap) term11825).put((Object)null, (Object)null);
        ((HashMap) term11825).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term12053 = new HashMap();
        term11777 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term11777, term11777.getClass(), "names", term11825);
        setField(term11777, term11777.getClass(), "options", term12053);
        HashMap term12870 = new HashMap();
        HashMap term12871 = new HashMap();
        term12869 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term12869, term12869.getClass(), "args", null);
        setField(term12869, term12869.getClass(), "options", term12870);
        setField(term12869, term12869.getClass(), "names", term12871);
        setField(term12869, term12869.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "getOptionObject", argTypes, term11777, args);
        assertTrue(recursiveEquals(term11777, term12869));
        assertTrue(recursiveEquals(retValue, null));
    }

};


