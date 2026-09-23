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
import java.util.HashMap;
import java.util.ArrayList;

public class PosixParser_burstToken_160441250771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37309;
     Object term37904;

    public PosixParser_burstToken_160441250771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37423 = new HashMap();
        HashMap term37575 = new HashMap();
        ArrayList term37795 = new ArrayList();
        term37309 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term37375 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term37743 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37375, term37375.getClass(), "shortOpts", term37423);
        setField(term37375, term37375.getClass(), "longOpts", term37575);
        setField(term37309, term37309.getClass(), "options", term37375);
        setIntField(term37743, term37743.getClass(), "numberOfArgs", 1);
        setField(term37309, term37309.getClass(), "currentOption", term37743);
        setField(term37309, term37309.getClass(), "tokens", term37795);
        ArrayList term37905 = new ArrayList();
        ((ArrayList) term37905).add("   ");
        term37904 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term37904, term37904.getClass(), "tokens", term37905);
        setBooleanField(term37904, term37904.getClass(), "eatTheRest", false);
        setField(term37904, term37904.getClass(), "currentOption", null);
        setField(term37904, term37904.getClass(), "options", null);
        setField(term37904, term37904.getClass(), "cmd", null);
        setField(term37904, term37904.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "    ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term37309, args);
        assertTrue(recursiveEquals(term37309, term37904));
    }

};


