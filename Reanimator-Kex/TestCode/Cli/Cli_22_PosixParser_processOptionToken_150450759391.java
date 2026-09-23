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

public class PosixParser_processOptionToken_150450759391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29859;

    public PosixParser_processOptionToken_150450759391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30063 = newInstance(Class.forName("java.lang.Object"));
        HashMap term29973 = new HashMap();
        ((HashMap) term29973).put(term30063, term30063);
        ((HashMap) term29973).put((Object)null, (Object)null);
        ((HashMap) term29973).put((Object)null, (Object)null);
        ((HashMap) term29973).put((Object)null, (Object)null);
        term29859 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term29925 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term29925, term29925.getClass(), "shortOpts", term29973);
        setField(term29925, term29925.getClass(), "longOpts", null);
        setField(term29859, term29859.getClass(), "options", term29925);
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
            callMethod(klass, "processOptionToken", argTypes, term29859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


