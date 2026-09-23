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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class PosixParser_burstToken_1604412507123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60834;

    public PosixParser_burstToken_1604412507123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term60948 = new HashMap();
        HashMap term61100 = new HashMap();
        term60834 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term60900 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term61268 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60900, term60900.getClass(), "shortOpts", term60948);
        setField(term60900, term60900.getClass(), "longOpts", term61100);
        setField(term60834, term60834.getClass(), "options", term60900);
        setIntField(term61268, term61268.getClass(), "numberOfArgs", -2147483647);
        setField(term60834, term60834.getClass(), "currentOption", term61268);
        setBooleanField(term60834, term60834.getClass(), "eatTheRest", false);
        setField(term60834, term60834.getClass(), "tokens", null);
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
        try {
            callMethod(klass, "burstToken", argTypes, term60834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


