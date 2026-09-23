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

public class PosixParser_init_16217136838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term535;

    public PosixParser_init_16217136838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        HashMap term36 = new HashMap();
        HashMap term41 = new HashMap();
        ArrayList term46 = new ArrayList();
        HashMap term50 = new HashMap();
        LinkedList term28 = new LinkedList();
        ArrayList term31 = new ArrayList();
        ArrayList term55 = new ArrayList();
        term1 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term35 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term27 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1, term1.getClass(), "tokens", term2);
        setBooleanField(term1, term1.getClass(), "eatTheRest", false);
        setField(term35, term35.getClass(), "shortOpts", term36);
        setField(term35, term35.getClass(), "longOpts", term41);
        setField(term35, term35.getClass(), "requiredOpts", term46);
        setField(term35, term35.getClass(), "optionGroups", term50);
        setField(term1, term1.getClass(), "options", term35);
        setField(term27, term27.getClass(), "args", term28);
        setField(term27, term27.getClass(), "options", term31);
        setField(term1, term1.getClass(), "cmd", term27);
        setField(term1, term1.getClass(), "requiredOptions", term55);
        ArrayList term536 = new ArrayList();
        LinkedList term539 = new LinkedList();
        ArrayList term540 = new ArrayList();
        ArrayList term542 = new ArrayList();
        term535 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term538 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term535, term535.getClass(), "tokens", term536);
        setBooleanField(term535, term535.getClass(), "eatTheRest", false);
        setField(term535, term535.getClass(), "options", null);
        setField(term538, term538.getClass(), "args", term539);
        setField(term538, term538.getClass(), "options", term540);
        setField(term535, term535.getClass(), "cmd", term538);
        setField(term535, term535.getClass(), "requiredOptions", term542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term535));
    }

};


