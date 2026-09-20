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

public class CommandLine_getOptionObject_44179291721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term123;
     Object term811;

    public CommandLine_getOptionObject_44179291721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term105 = new LinkedList();
        HashMap term108 = new HashMap();
        HashMap term113 = new HashMap();
        HashMap term118 = new HashMap();
        term104 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term104, term104.getClass(), "args", term105);
        setField(term104, term104.getClass(), "options", term108);
        setField(term104, term104.getClass(), "names", term113);
        setField(term104, term104.getClass(), "hashcodeMap", term118);
        term123 = new Character('A');
        LinkedList term812 = new LinkedList();
        HashMap term813 = new HashMap();
        HashMap term814 = new HashMap();
        HashMap term815 = new HashMap();
        term811 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term811, term811.getClass(), "args", term812);
        setField(term811, term811.getClass(), "options", term813);
        setField(term811, term811.getClass(), "names", term814);
        setField(term811, term811.getClass(), "hashcodeMap", term815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term123;
        Object retValue = callMethod(klass, "getOptionObject", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term811));
        assertTrue(recursiveEquals(term123, 'A'));
        assertTrue(recursiveEquals(retValue, null));
    }

};
