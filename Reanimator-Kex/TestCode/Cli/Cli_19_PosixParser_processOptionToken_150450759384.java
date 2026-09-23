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

public class PosixParser_processOptionToken_150450759384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41555;

    public PosixParser_processOptionToken_150450759384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41669 = new HashMap();
        HashMap term41821 = new HashMap();
        term41555 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term41621 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term41621, term41621.getClass(), "shortOpts", term41669);
        setField(term41621, term41621.getClass(), "longOpts", term41821);
        setField(term41555, term41555.getClass(), "options", term41621);
        setBooleanField(term41555, term41555.getClass(), "eatTheRest", false);
        setField(term41555, term41555.getClass(), "tokens", null);
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
            callMethod(klass, "processOptionToken", argTypes, term41555, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


