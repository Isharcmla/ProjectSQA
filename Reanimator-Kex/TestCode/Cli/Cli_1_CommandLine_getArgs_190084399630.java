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
import java.lang.Object;

public class CommandLine_getArgs_190084399630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;
     Object term1434;
     Object term1414;

    public CommandLine_getArgs_190084399630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term356 = new LinkedList();
        HashMap term359 = new HashMap();
        HashMap term364 = new HashMap();
        HashMap term369 = new HashMap();
        term355 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term355, term355.getClass(), "args", term356);
        setField(term355, term355.getClass(), "options", term359);
        setField(term355, term355.getClass(), "names", term364);
        setField(term355, term355.getClass(), "hashcodeMap", term369);
        LinkedList term1435 = new LinkedList();
        HashMap term1436 = new HashMap();
        HashMap term1437 = new HashMap();
        HashMap term1438 = new HashMap();
        term1434 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1434, term1434.getClass(), "args", term1435);
        setField(term1434, term1434.getClass(), "options", term1436);
        setField(term1434, term1434.getClass(), "names", term1437);
        setField(term1434, term1434.getClass(), "hashcodeMap", term1438);
        term1414 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgs", argTypes, term355, args);
        assertTrue(recursiveEquals(term355, term1434));
        assertTrue(recursiveEquals(retValue, term1414));
    }

};


