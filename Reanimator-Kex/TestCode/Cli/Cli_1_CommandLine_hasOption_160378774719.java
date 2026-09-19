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

public class CommandLine_hasOption_160378774719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term61;
     Object term698;

    public CommandLine_hasOption_160378774719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term43 = new LinkedList();
        HashMap term46 = new HashMap();
        HashMap term51 = new HashMap();
        HashMap term56 = new HashMap();
        term42 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term42, term42.getClass(), "args", term43);
        setField(term42, term42.getClass(), "options", term46);
        setField(term42, term42.getClass(), "names", term51);
        setField(term42, term42.getClass(), "hashcodeMap", term56);
        term61 = new Character('P');
        LinkedList term699 = new LinkedList();
        HashMap term700 = new HashMap();
        HashMap term701 = new HashMap();
        HashMap term702 = new HashMap();
        term698 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term698, term698.getClass(), "args", term699);
        setField(term698, term698.getClass(), "options", term700);
        setField(term698, term698.getClass(), "names", term701);
        setField(term698, term698.getClass(), "hashcodeMap", term702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "hasOption", argTypes, term42, args);
        assertTrue(recursiveEquals(term42, term698));
        assertTrue(recursiveEquals(term61, 'P'));
    }

};


