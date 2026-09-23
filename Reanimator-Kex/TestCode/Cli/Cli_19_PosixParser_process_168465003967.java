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

public class PosixParser_process_168465003967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34424;
     Object term34488;

    public PosixParser_process_168465003967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34476 = new ArrayList();
        term34424 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term34424, term34424.getClass(), "currentOption", null);
        setBooleanField(term34424, term34424.getClass(), "eatTheRest", false);
        setField(term34424, term34424.getClass(), "tokens", term34476);
        ArrayList term34489 = new ArrayList();
        ((ArrayList) term34489).add("--");
        ((ArrayList) term34489).add((Object)null);
        term34488 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term34488, term34488.getClass(), "tokens", term34489);
        setBooleanField(term34488, term34488.getClass(), "eatTheRest", true);
        setField(term34488, term34488.getClass(), "currentOption", null);
        setField(term34488, term34488.getClass(), "options", null);
        setField(term34488, term34488.getClass(), "cmd", null);
        setField(term34488, term34488.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term34424, args);
        assertTrue(recursiveEquals(term34424, term34488));
    }

};


