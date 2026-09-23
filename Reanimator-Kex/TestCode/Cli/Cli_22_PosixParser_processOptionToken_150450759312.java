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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Boolean;

public class PosixParser_processOptionToken_150450759312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term414;
     Object term1103;

    public PosixParser_processOptionToken_150450759312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term345 = new ArrayList();
        HashMap term379 = new HashMap();
        HashMap term384 = new HashMap();
        ArrayList term389 = new ArrayList();
        HashMap term393 = new HashMap();
        LinkedList term371 = new LinkedList();
        ArrayList term374 = new ArrayList();
        ArrayList term398 = new ArrayList();
        term344 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term378 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term370 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term344, term344.getClass(), "tokens", term345);
        setBooleanField(term344, term344.getClass(), "eatTheRest", true);
        setField(term378, term378.getClass(), "shortOpts", term379);
        setField(term378, term378.getClass(), "longOpts", term384);
        setField(term378, term378.getClass(), "requiredOpts", term389);
        setField(term378, term378.getClass(), "optionGroups", term393);
        setField(term344, term344.getClass(), "options", term378);
        setField(term370, term370.getClass(), "args", term371);
        setField(term370, term370.getClass(), "options", term374);
        setField(term344, term344.getClass(), "cmd", term370);
        setField(term344, term344.getClass(), "requiredOptions", term398);
        term414 = new Boolean(true);
        ArrayList term1104 = new ArrayList();
        ((ArrayList) term1104).add("jJCZpVmanW");
        LinkedList term1109 = new LinkedList();
        ArrayList term1110 = new ArrayList();
        ArrayList term1112 = new ArrayList();
        term1103 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1108 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1103, term1103.getClass(), "tokens", term1104);
        setBooleanField(term1103, term1103.getClass(), "eatTheRest", true);
        setField(term1103, term1103.getClass(), "options", null);
        setField(term1108, term1108.getClass(), "args", term1109);
        setField(term1108, term1108.getClass(), "options", term1110);
        setField(term1103, term1103.getClass(), "cmd", term1108);
        setField(term1103, term1103.getClass(), "requiredOptions", term1112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term414;
        callMethod(klass, "processOptionToken", argTypes, term344, args);
        assertTrue(recursiveEquals(term344, term1103));
        assertTrue(recursiveEquals(term414, true));
    }

};


