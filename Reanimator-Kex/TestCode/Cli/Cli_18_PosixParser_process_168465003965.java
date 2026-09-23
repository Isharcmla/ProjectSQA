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

public class PosixParser_process_168465003965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24108;
     Object term24250;

    public PosixParser_process_168465003965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24224 = new ArrayList();
        term24108 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term24172 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term24172, term24172.getClass(), "numberOfArgs", -2);
        setField(term24108, term24108.getClass(), "currentOption", term24172);
        setField(term24108, term24108.getClass(), "tokens", term24224);
        ArrayList term24251 = new ArrayList();
        ((ArrayList) term24251).add((Object)null);
        term24250 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term24250, term24250.getClass(), "tokens", term24251);
        setBooleanField(term24250, term24250.getClass(), "eatTheRest", false);
        setField(term24250, term24250.getClass(), "currentOption", null);
        setField(term24250, term24250.getClass(), "options", null);
        setField(term24250, term24250.getClass(), "cmd", null);
        setField(term24250, term24250.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term24108, args);
        assertTrue(recursiveEquals(term24108, term24250));
    }

};


