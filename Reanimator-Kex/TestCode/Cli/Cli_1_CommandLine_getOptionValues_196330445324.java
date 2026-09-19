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

public class CommandLine_getOptionValues_196330445324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;
     Object term975;

    public CommandLine_getOptionValues_196330445324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term188 = new LinkedList();
        HashMap term191 = new HashMap();
        HashMap term196 = new HashMap();
        HashMap term201 = new HashMap();
        term187 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term187, term187.getClass(), "args", term188);
        setField(term187, term187.getClass(), "options", term191);
        setField(term187, term187.getClass(), "names", term196);
        setField(term187, term187.getClass(), "hashcodeMap", term201);
        LinkedList term976 = new LinkedList();
        HashMap term977 = new HashMap();
        HashMap term978 = new HashMap();
        HashMap term979 = new HashMap();
        term975 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term975, term975.getClass(), "args", term976);
        setField(term975, term975.getClass(), "options", term977);
        setField(term975, term975.getClass(), "names", term978);
        setField(term975, term975.getClass(), "hashcodeMap", term979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "getOptionValues", argTypes, term187, args);
        assertTrue(recursiveEquals(term187, term975));
        assertTrue(recursiveEquals(retValue, null));
    }

};


