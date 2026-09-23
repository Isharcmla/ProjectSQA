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

public class PosixParser_burstToken_160441250759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31254;
     Object term31843;

    public PosixParser_burstToken_160441250759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31368 = new HashMap();
        HashMap term31520 = new HashMap();
        ArrayList term31740 = new ArrayList();
        term31254 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term31320 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term31688 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31320, term31320.getClass(), "shortOpts", term31368);
        setField(term31320, term31320.getClass(), "longOpts", term31520);
        setField(term31254, term31254.getClass(), "options", term31320);
        setIntField(term31688, term31688.getClass(), "numberOfArgs", -2);
        setField(term31254, term31254.getClass(), "currentOption", term31688);
        setField(term31254, term31254.getClass(), "tokens", term31740);
        ArrayList term31844 = new ArrayList();
        ((ArrayList) term31844).add(" ");
        term31843 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term31843, term31843.getClass(), "tokens", term31844);
        setBooleanField(term31843, term31843.getClass(), "eatTheRest", false);
        setField(term31843, term31843.getClass(), "currentOption", null);
        setField(term31843, term31843.getClass(), "options", null);
        setField(term31843, term31843.getClass(), "cmd", null);
        setField(term31843, term31843.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "  ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term31254, args);
        assertTrue(recursiveEquals(term31254, term31843));
    }

};


