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

public class PosixParser_burstToken_160441250741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19673;

    public PosixParser_burstToken_160441250741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19787 = new HashMap();
        HashMap term19939 = new HashMap();
        term19673 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term19739 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19739, term19739.getClass(), "shortOpts", term19787);
        setField(term19739, term19739.getClass(), "longOpts", term19939);
        setField(term19673, term19673.getClass(), "options", term19739);
        setField(term19673, term19673.getClass(), "currentOption", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term19673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


