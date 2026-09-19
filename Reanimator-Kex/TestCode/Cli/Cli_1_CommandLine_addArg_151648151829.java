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

public class CommandLine_addArg_151648151829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393;
     Object term1374;

    public CommandLine_addArg_151648151829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term394 = new LinkedList();
        HashMap term397 = new HashMap();
        HashMap term402 = new HashMap();
        HashMap term407 = new HashMap();
        term393 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term393, term393.getClass(), "args", term394);
        setField(term393, term393.getClass(), "options", term397);
        setField(term393, term393.getClass(), "names", term402);
        setField(term393, term393.getClass(), "hashcodeMap", term407);
        LinkedList term1375 = new LinkedList();
        ((LinkedList) term1375).add("MjGYSRKTNF");
        HashMap term1379 = new HashMap();
        HashMap term1380 = new HashMap();
        HashMap term1381 = new HashMap();
        term1374 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1374, term1374.getClass(), "args", term1375);
        setField(term1374, term1374.getClass(), "options", term1379);
        setField(term1374, term1374.getClass(), "names", term1380);
        setField(term1374, term1374.getClass(), "hashcodeMap", term1381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "addArg", argTypes, term393, args);
        assertTrue(recursiveEquals(term393, term1374));
    }

};


