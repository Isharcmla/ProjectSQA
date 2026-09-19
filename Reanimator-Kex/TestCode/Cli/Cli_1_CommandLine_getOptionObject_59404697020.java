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

public class CommandLine_getOptionObject_59404697020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term752;

    public CommandLine_getOptionObject_59404697020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term64 = new LinkedList();
        HashMap term67 = new HashMap();
        HashMap term72 = new HashMap();
        HashMap term77 = new HashMap();
        term63 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term63, term63.getClass(), "args", term64);
        setField(term63, term63.getClass(), "options", term67);
        setField(term63, term63.getClass(), "names", term72);
        setField(term63, term63.getClass(), "hashcodeMap", term77);
        LinkedList term753 = new LinkedList();
        HashMap term754 = new HashMap();
        HashMap term755 = new HashMap();
        HashMap term756 = new HashMap();
        term752 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term752, term752.getClass(), "args", term753);
        setField(term752, term752.getClass(), "options", term754);
        setField(term752, term752.getClass(), "names", term755);
        setField(term752, term752.getClass(), "hashcodeMap", term756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "getOptionObject", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term752));
        assertTrue(recursiveEquals(retValue, null));
    }

};


