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
import java.util.ArrayList;

public class CommandLine_addOption_15694463131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;
     Object term453;
     Object term1507;
     Object term1523;

    public CommandLine_addOption_15694463131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term435 = new LinkedList();
        HashMap term438 = new HashMap();
        HashMap term443 = new HashMap();
        HashMap term448 = new HashMap();
        term434 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term434, term434.getClass(), "args", term435);
        setField(term434, term434.getClass(), "options", term438);
        setField(term434, term434.getClass(), "names", term443);
        setField(term434, term434.getClass(), "hashcodeMap", term448);
        ArrayList term507 = new ArrayList();
        term453 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term506 = newInstance(Class.forName("java.lang.Object"));
        setField(term453, term453.getClass(), "opt", "hRNSzYYIrc");
        setField(term453, term453.getClass(), "longOpt", "RMFIsYGgne");
        setBooleanField(term453, term453.getClass(), "hasArg", false);
        setField(term453, term453.getClass(), "argName", "NRdvgJlhkX");
        setField(term453, term453.getClass(), "description", "uuaPigETmJ");
        setBooleanField(term453, term453.getClass(), "required", false);
        setBooleanField(term453, term453.getClass(), "optionalArg", false);
        setIntField(term453, term453.getClass(), "numberOfArgs", 568599855);
        setField(term453, term453.getClass(), "type", term506);
        setField(term453, term453.getClass(), "values", term507);
        setCharField(term453, term453.getClass(), "valuesep", 'n');
        LinkedList term1508 = new LinkedList();
        HashMap term1509 = new HashMap();
        HashMap term1514 = new HashMap();
        HashMap term1519 = new HashMap();
        term1507 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1507, term1507.getClass(), "args", term1508);
        setField(term1507, term1507.getClass(), "options", term1509);
        setField(term1507, term1507.getClass(), "names", term1514);
        setField(term1507, term1507.getClass(), "hashcodeMap", term1519);
        term1523 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1523, term1523.getClass(), "opt", null);
        setField(term1523, term1523.getClass(), "longOpt", null);
        setBooleanField(term1523, term1523.getClass(), "hasArg", false);
        setField(term1523, term1523.getClass(), "argName", null);
        setField(term1523, term1523.getClass(), "description", null);
        setBooleanField(term1523, term1523.getClass(), "required", false);
        setBooleanField(term1523, term1523.getClass(), "optionalArg", false);
        setIntField(term1523, term1523.getClass(), "numberOfArgs", 568599855);
        setField(term1523, term1523.getClass(), "type", null);
        setField(term1523, term1523.getClass(), "values", null);
        setCharField(term1523, term1523.getClass(), "valuesep", 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term453;
        callMethod(klass, "addOption", argTypes, term434, args);
        assertTrue(recursiveEquals(term434, term1507));
        assertTrue(recursiveEquals(term453, term1523));
    }

};


