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

public class CommandLine_getOptionValues_181105040025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term247;
     Object term1031;

    public CommandLine_getOptionValues_181105040025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term229 = new LinkedList();
        HashMap term232 = new HashMap();
        HashMap term237 = new HashMap();
        HashMap term242 = new HashMap();
        term228 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term228, term228.getClass(), "args", term229);
        setField(term228, term228.getClass(), "options", term232);
        setField(term228, term228.getClass(), "names", term237);
        setField(term228, term228.getClass(), "hashcodeMap", term242);
        term247 = new Character('B');
        LinkedList term1032 = new LinkedList();
        HashMap term1033 = new HashMap();
        HashMap term1034 = new HashMap();
        HashMap term1035 = new HashMap();
        term1031 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1031, term1031.getClass(), "args", term1032);
        setField(term1031, term1031.getClass(), "options", term1033);
        setField(term1031, term1031.getClass(), "names", term1034);
        setField(term1031, term1031.getClass(), "hashcodeMap", term1035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term247;
        Object retValue = callMethod(klass, "getOptionValues", argTypes, term228, args);
        assertTrue(recursiveEquals(term228, term1031));
        assertTrue(recursiveEquals(term247, 'B'));
        assertTrue(recursiveEquals(retValue, null));
    }

};
