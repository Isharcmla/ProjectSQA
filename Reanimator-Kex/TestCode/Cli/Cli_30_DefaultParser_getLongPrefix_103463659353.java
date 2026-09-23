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
import java.lang.Object;
import java.util.HashMap;

public class DefaultParser_getLongPrefix_103463659353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31544;
     Object term34208;

    public DefaultParser_getLongPrefix_103463659353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31658 = new HashMap();
        ((HashMap) term31658).put("                                                                                                                                                                                                                                                               ", "                                                                                                                                                                                                                                                               ");
        term31544 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term31610 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term31610, term31610.getClass(), "longOpts", term31658);
        setField(term31544, term31544.getClass(), "options", term31610);
        HashMap term34210 = new HashMap();
        term34208 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term34209 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term34208, term34208.getClass(), "cmd", null);
        setField(term34209, term34209.getClass(), "shortOpts", null);
        setField(term34209, term34209.getClass(), "longOpts", term34210);
        setField(term34209, term34209.getClass(), "requiredOpts", null);
        setField(term34209, term34209.getClass(), "optionGroups", null);
        setField(term34208, term34208.getClass(), "options", term34209);
        setBooleanField(term34208, term34208.getClass(), "stopAtNonOption", false);
        setField(term34208, term34208.getClass(), "currentToken", null);
        setField(term34208, term34208.getClass(), "currentOption", null);
        setBooleanField(term34208, term34208.getClass(), "skipParsing", false);
        setField(term34208, term34208.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                  ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term31544, args);
        assertTrue(recursiveEquals(term31544, term34208));
        assertTrue(recursiveEquals(retValue, "                                                                                                                                                                                                                                                               "));
    }

};


