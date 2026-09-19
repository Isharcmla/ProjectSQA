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

public class CommandLine_getOptionValue_39707175326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249;
     Object term1110;

    public CommandLine_getOptionValue_39707175326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term250 = new LinkedList();
        HashMap term253 = new HashMap();
        HashMap term258 = new HashMap();
        HashMap term263 = new HashMap();
        term249 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term249, term249.getClass(), "args", term250);
        setField(term249, term249.getClass(), "options", term253);
        setField(term249, term249.getClass(), "names", term258);
        setField(term249, term249.getClass(), "hashcodeMap", term263);
        LinkedList term1111 = new LinkedList();
        HashMap term1112 = new HashMap();
        HashMap term1113 = new HashMap();
        HashMap term1114 = new HashMap();
        term1110 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1110, term1110.getClass(), "args", term1111);
        setField(term1110, term1110.getClass(), "options", term1112);
        setField(term1110, term1110.getClass(), "names", term1113);
        setField(term1110, term1110.getClass(), "hashcodeMap", term1114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = "EGtDIRbSSb";
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term249, args);
        assertTrue(recursiveEquals(term249, term1110));
        assertTrue(recursiveEquals(retValue, "EGtDIRbSSb"));
    }

};


