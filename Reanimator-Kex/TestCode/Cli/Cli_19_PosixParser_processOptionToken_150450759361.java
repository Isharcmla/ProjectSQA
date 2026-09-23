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

public class PosixParser_processOptionToken_150450759361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32025;
     Object term32460;

    public PosixParser_processOptionToken_150450759361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term32139 = new HashMap();
        HashMap term32291 = new HashMap();
        term32025 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term32091 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term32091, term32091.getClass(), "shortOpts", term32139);
        setField(term32091, term32091.getClass(), "longOpts", term32291);
        setField(term32025, term32025.getClass(), "options", term32091);
        term32460 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term32460, term32460.getClass(), "tokens", null);
        setBooleanField(term32460, term32460.getClass(), "eatTheRest", false);
        setField(term32460, term32460.getClass(), "currentOption", null);
        setField(term32460, term32460.getClass(), "options", null);
        setField(term32460, term32460.getClass(), "cmd", null);
        setField(term32460, term32460.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        callMethod(klass, "processOptionToken", argTypes, term32025, args);
        assertTrue(recursiveEquals(term32025, term32460));
    }

};


