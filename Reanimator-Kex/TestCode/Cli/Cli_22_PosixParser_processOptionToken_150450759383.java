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

public class PosixParser_processOptionToken_150450759383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23840;

    public PosixParser_processOptionToken_150450759383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23954 = new HashMap();
        HashMap term24106 = new HashMap();
        term23840 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term23906 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term23906, term23906.getClass(), "shortOpts", term23954);
        setField(term23906, term23906.getClass(), "longOpts", term24106);
        setField(term23840, term23840.getClass(), "options", term23906);
        setBooleanField(term23840, term23840.getClass(), "eatTheRest", false);
        setField(term23840, term23840.getClass(), "tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        try {
            callMethod(klass, "processOptionToken", argTypes, term23840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


