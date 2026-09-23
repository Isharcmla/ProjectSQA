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

public class PosixParser_burstToken_1604412507113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56720;

    public PosixParser_burstToken_1604412507113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term56834 = new HashMap();
        HashMap term56986 = new HashMap();
        term56720 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term56786 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term57154 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term56786, term56786.getClass(), "shortOpts", term56834);
        setField(term56786, term56786.getClass(), "longOpts", term56986);
        setField(term56720, term56720.getClass(), "options", term56786);
        setIntField(term57154, term57154.getClass(), "numberOfArgs", -2147483646);
        setField(term56720, term56720.getClass(), "currentOption", term57154);
        setBooleanField(term56720, term56720.getClass(), "eatTheRest", false);
        setField(term56720, term56720.getClass(), "tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term56720, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


