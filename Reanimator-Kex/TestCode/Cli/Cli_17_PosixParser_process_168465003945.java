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
import java.lang.Object;
import java.util.ArrayList;

public class PosixParser_process_168465003945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444180;
     Object term444322;

    public PosixParser_process_168465003945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term444296 = new ArrayList();
        term444180 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term444244 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term444244, term444244.getClass(), "numberOfArgs", 0);
        setField(term444180, term444180.getClass(), "currentOption", term444244);
        setBooleanField(term444180, term444180.getClass(), "eatTheRest", false);
        setField(term444180, term444180.getClass(), "tokens", term444296);
        ArrayList term444323 = new ArrayList();
        ((ArrayList) term444323).add("--");
        ((ArrayList) term444323).add((Object)null);
        term444322 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term444327 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term444322, term444322.getClass(), "tokens", term444323);
        setBooleanField(term444322, term444322.getClass(), "eatTheRest", true);
        setField(term444327, term444327.getClass(), "opt", null);
        setField(term444327, term444327.getClass(), "longOpt", null);
        setField(term444327, term444327.getClass(), "argName", null);
        setField(term444327, term444327.getClass(), "description", null);
        setBooleanField(term444327, term444327.getClass(), "required", false);
        setBooleanField(term444327, term444327.getClass(), "optionalArg", false);
        setIntField(term444327, term444327.getClass(), "numberOfArgs", 0);
        setField(term444327, term444327.getClass(), "type", null);
        setField(term444327, term444327.getClass(), "values", null);
        setCharField(term444327, term444327.getClass(), "valuesep", (char) 0);
        setField(term444322, term444322.getClass(), "currentOption", term444327);
        setField(term444322, term444322.getClass(), "options", null);
        setField(term444322, term444322.getClass(), "cmd", null);
        setField(term444322, term444322.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term444180, args);
        assertTrue(recursiveEquals(term444180, term444322));
    }

};


