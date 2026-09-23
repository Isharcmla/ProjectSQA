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
import java.util.ArrayList;
import java.lang.Object;

public class PosixParser_processOptionToken_150450759361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16888;
     Object term16949;

    public PosixParser_processOptionToken_150450759361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16940 = new ArrayList();
        term16888 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16888, term16888.getClass(), "tokens", term16940);
        ArrayList term16950 = new ArrayList();
        ((ArrayList) term16950).add((Object)null);
        term16949 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16949, term16949.getClass(), "tokens", term16950);
        setBooleanField(term16949, term16949.getClass(), "eatTheRest", false);
        setField(term16949, term16949.getClass(), "options", null);
        setField(term16949, term16949.getClass(), "cmd", null);
        setField(term16949, term16949.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        callMethod(klass, "processOptionToken", argTypes, term16888, args);
        assertTrue(recursiveEquals(term16888, term16949));
    }

};


