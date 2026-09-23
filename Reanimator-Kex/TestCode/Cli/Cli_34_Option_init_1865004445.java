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
import java.lang.Boolean;
import java.util.ArrayList;

public class Option_init_1865004445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term4598;

    public Option_init_1865004445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = new Boolean(false);
        ArrayList term4603 = new ArrayList();
        term4598 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4598, term4598.getClass(), "opt", "MuLcgQHgqz");
        setField(term4598, term4598.getClass(), "longOpt", null);
        setField(term4598, term4598.getClass(), "argName", null);
        setField(term4598, term4598.getClass(), "description", "xxtlPwDYFs");
        setBooleanField(term4598, term4598.getClass(), "required", false);
        setBooleanField(term4598, term4598.getClass(), "optionalArg", false);
        setIntField(term4598, term4598.getClass(), "numberOfArgs", -1);
        setField(term4598, term4598.getClass(), "type", null);
        setField(term4598, term4598.getClass(), "values", term4603);
        setCharField(term4598, term4598.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = term57;
        args[2] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4598));
        assertTrue(recursiveEquals(term57, false));
    }

};


