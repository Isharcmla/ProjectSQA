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

public class CommandLine_getOptionValue_39707175377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20056;
     Object term21148;

    public CommandLine_getOptionValue_39707175377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20104 = new HashMap();
        ((HashMap) term20104).put((Object)null, (Object)null);
        ((HashMap) term20104).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term20332 = new HashMap();
        term20056 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term20056, term20056.getClass(), "names", term20104);
        setField(term20056, term20056.getClass(), "options", term20332);
        HashMap term21149 = new HashMap();
        HashMap term21150 = new HashMap();
        term21148 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term21148, term21148.getClass(), "args", null);
        setField(term21148, term21148.getClass(), "options", term21149);
        setField(term21148, term21148.getClass(), "names", term21150);
        setField(term21148, term21148.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = null;
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term20056, args);
        assertTrue(recursiveEquals(term20056, term21148));
        assertTrue(recursiveEquals(retValue, null));
    }

};


