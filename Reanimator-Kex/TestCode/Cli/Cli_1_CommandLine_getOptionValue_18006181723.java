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

public class CommandLine_getOptionValue_18006181723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term185;
     Object term922;

    public CommandLine_getOptionValue_18006181723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term167 = new LinkedList();
        HashMap term170 = new HashMap();
        HashMap term175 = new HashMap();
        HashMap term180 = new HashMap();
        term166 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term166, term166.getClass(), "args", term167);
        setField(term166, term166.getClass(), "options", term170);
        setField(term166, term166.getClass(), "names", term175);
        setField(term166, term166.getClass(), "hashcodeMap", term180);
        term185 = new Character('E');
        LinkedList term923 = new LinkedList();
        HashMap term924 = new HashMap();
        HashMap term925 = new HashMap();
        HashMap term926 = new HashMap();
        term922 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term922, term922.getClass(), "args", term923);
        setField(term922, term922.getClass(), "options", term924);
        setField(term922, term922.getClass(), "names", term925);
        setField(term922, term922.getClass(), "hashcodeMap", term926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term185;
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term166, args);
        assertTrue(recursiveEquals(term166, term922));
        assertTrue(recursiveEquals(term185, 'E'));
        assertTrue(recursiveEquals(retValue, null));
    }

};
