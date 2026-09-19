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

public class CommandLine_hasOption_175604180018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term646;

    public CommandLine_hasOption_175604180018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2 = new LinkedList();
        HashMap term5 = new HashMap();
        HashMap term10 = new HashMap();
        HashMap term15 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1, term1.getClass(), "args", term2);
        setField(term1, term1.getClass(), "options", term5);
        setField(term1, term1.getClass(), "names", term10);
        setField(term1, term1.getClass(), "hashcodeMap", term15);
        LinkedList term647 = new LinkedList();
        HashMap term648 = new HashMap();
        HashMap term649 = new HashMap();
        HashMap term650 = new HashMap();
        term646 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term646, term646.getClass(), "args", term647);
        setField(term646, term646.getClass(), "options", term648);
        setField(term646, term646.getClass(), "names", term649);
        setField(term646, term646.getClass(), "hashcodeMap", term650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "hasOption", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term646));
    }

};


