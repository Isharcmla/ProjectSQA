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
import java.util.ArrayList;

public class PosixParser_process_168465003965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34837;
     Object term34979;

    public PosixParser_process_168465003965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34953 = new ArrayList();
        term34837 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term34901 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term34901, term34901.getClass(), "numberOfArgs", -2);
        setField(term34837, term34837.getClass(), "currentOption", term34901);
        setField(term34837, term34837.getClass(), "tokens", term34953);
        ArrayList term34980 = new ArrayList();
        ((ArrayList) term34980).add((Object)null);
        term34979 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term34979, term34979.getClass(), "tokens", term34980);
        setBooleanField(term34979, term34979.getClass(), "eatTheRest", false);
        setField(term34979, term34979.getClass(), "currentOption", null);
        setField(term34979, term34979.getClass(), "options", null);
        setField(term34979, term34979.getClass(), "cmd", null);
        setField(term34979, term34979.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term34837, args);
        assertTrue(recursiveEquals(term34837, term34979));
    }

};


