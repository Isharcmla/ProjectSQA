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

public class CommandLine_getOptionValue_2780776422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term865;

    public CommandLine_getOptionValue_2780776422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term126 = new LinkedList();
        HashMap term129 = new HashMap();
        HashMap term134 = new HashMap();
        HashMap term139 = new HashMap();
        term125 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term125, term125.getClass(), "args", term126);
        setField(term125, term125.getClass(), "options", term129);
        setField(term125, term125.getClass(), "names", term134);
        setField(term125, term125.getClass(), "hashcodeMap", term139);
        LinkedList term866 = new LinkedList();
        HashMap term867 = new HashMap();
        HashMap term868 = new HashMap();
        HashMap term869 = new HashMap();
        term865 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term865, term865.getClass(), "args", term866);
        setField(term865, term865.getClass(), "options", term867);
        setField(term865, term865.getClass(), "names", term868);
        setField(term865, term865.getClass(), "hashcodeMap", term869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term125, args);
        assertTrue(recursiveEquals(term125, term865));
        assertTrue(recursiveEquals(retValue, null));
    }

};


