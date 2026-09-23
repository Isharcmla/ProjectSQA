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

public class PosixParser_burstToken_1604412507109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51039;

    public PosixParser_burstToken_1604412507109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term51153 = new HashMap();
        term51039 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term51105 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term51105, term51105.getClass(), "shortOpts", term51153);
        setField(term51105, term51105.getClass(), "longOpts", null);
        setField(term51039, term51039.getClass(), "options", term51105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = " \u0001                                                                                                                              ";
        args[1] = false;
        try {
            callMethod(klass, "burstToken", argTypes, term51039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


