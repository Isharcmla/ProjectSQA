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

public class PosixParser_burstToken_160441250758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18267;
     Object term22183;

    public PosixParser_burstToken_160441250758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18381 = new HashMap();
        HashMap term18533 = new HashMap();
        ArrayList term18753 = new ArrayList();
        term18267 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term18333 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term18701 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18333, term18333.getClass(), "shortOpts", term18381);
        setField(term18333, term18333.getClass(), "longOpts", term18533);
        setField(term18267, term18267.getClass(), "options", term18333);
        setIntField(term18701, term18701.getClass(), "numberOfArgs", 1);
        setField(term18267, term18267.getClass(), "currentOption", term18701);
        setField(term18267, term18267.getClass(), "tokens", term18753);
        ArrayList term22184 = new ArrayList();
        ((ArrayList) term22184).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        term22183 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term22183, term22183.getClass(), "tokens", term22184);
        setBooleanField(term22183, term22183.getClass(), "eatTheRest", false);
        setField(term22183, term22183.getClass(), "currentOption", null);
        setField(term22183, term22183.getClass(), "options", null);
        setField(term22183, term22183.getClass(), "cmd", null);
        setField(term22183, term22183.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term18267, args);
        assertTrue(recursiveEquals(term18267, term22183));
    }

};


