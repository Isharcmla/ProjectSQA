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

public class PosixParser_burstToken_160441250725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6975;

    public PosixParser_burstToken_160441250725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7089 = new HashMap();
        HashMap term7241 = new HashMap();
        term6975 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term7041 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term7409 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7041, term7041.getClass(), "shortOpts", term7089);
        setField(term7041, term7041.getClass(), "longOpts", term7241);
        setField(term6975, term6975.getClass(), "options", term7041);
        setIntField(term7409, term7409.getClass(), "numberOfArgs", 1);
        setField(term6975, term6975.getClass(), "currentOption", term7409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "        ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term6975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


