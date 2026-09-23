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

public class PosixParser_process_168465003976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36045;
     Object term36187;

    public PosixParser_process_168465003976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36161 = new ArrayList();
        term36045 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term36109 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term36109, term36109.getClass(), "numberOfArgs", -2);
        setField(term36045, term36045.getClass(), "currentOption", term36109);
        setField(term36045, term36045.getClass(), "tokens", term36161);
        ArrayList term36188 = new ArrayList();
        ((ArrayList) term36188).add((Object)null);
        term36187 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term36187, term36187.getClass(), "tokens", term36188);
        setBooleanField(term36187, term36187.getClass(), "eatTheRest", false);
        setField(term36187, term36187.getClass(), "currentOption", null);
        setField(term36187, term36187.getClass(), "options", null);
        setField(term36187, term36187.getClass(), "cmd", null);
        setField(term36187, term36187.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term36045, args);
        assertTrue(recursiveEquals(term36045, term36187));
    }

};


