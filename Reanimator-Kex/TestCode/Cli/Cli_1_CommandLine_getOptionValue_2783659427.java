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
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.Character;

public class CommandLine_getOptionValue_2783659427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term331;
     Object term1236;

    public CommandLine_getOptionValue_2783659427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term313 = new LinkedList();
        HashMap term316 = new HashMap();
        HashMap term321 = new HashMap();
        HashMap term326 = new HashMap();
        term312 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term312, term312.getClass(), "args", term313);
        setField(term312, term312.getClass(), "options", term316);
        setField(term312, term312.getClass(), "names", term321);
        setField(term312, term312.getClass(), "hashcodeMap", term326);
        term331 = new Character('t');
        LinkedList term1237 = new LinkedList();
        HashMap term1238 = new HashMap();
        HashMap term1239 = new HashMap();
        HashMap term1240 = new HashMap();
        term1236 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1236, term1236.getClass(), "args", term1237);
        setField(term1236, term1236.getClass(), "options", term1238);
        setField(term1236, term1236.getClass(), "names", term1239);
        setField(term1236, term1236.getClass(), "hashcodeMap", term1240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term331;
        args[1] = "SzjVpOQTyS";
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term312, args);
        assertTrue(recursiveEquals(term312, term1236));
        assertTrue(recursiveEquals(term331, "SzjVpOQTyS"));
        assertTrue(recursiveEquals(retValue, "SzjVpOQTyS"));
    }

};
