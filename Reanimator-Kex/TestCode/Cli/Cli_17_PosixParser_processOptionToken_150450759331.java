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

public class PosixParser_processOptionToken_150450759331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18452;
     Object term18928;

    public PosixParser_processOptionToken_150450759331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18566 = new HashMap();
        HashMap term18718 = new HashMap();
        term18452 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term18518 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18518, term18518.getClass(), "shortOpts", term18566);
        setField(term18518, term18518.getClass(), "longOpts", term18718);
        setField(term18452, term18452.getClass(), "options", term18518);
        term18928 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term18928, term18928.getClass(), "tokens", null);
        setBooleanField(term18928, term18928.getClass(), "eatTheRest", true);
        setField(term18928, term18928.getClass(), "currentOption", null);
        setField(term18928, term18928.getClass(), "options", null);
        setField(term18928, term18928.getClass(), "cmd", null);
        setField(term18928, term18928.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term18452, args);
        assertTrue(recursiveEquals(term18452, term18928));
    }

};


