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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class PosixParser_processOptionToken_150450759377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36906;

    public PosixParser_processOptionToken_150450759377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37020 = new HashMap();
        HashMap term37172 = new HashMap();
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put("", "");
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put((Object)null, (Object)null);
        ((HashMap) term37172).put((Object)null, (Object)null);
        term36906 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term36972 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term36972, term36972.getClass(), "shortOpts", term37020);
        setField(term36972, term36972.getClass(), "longOpts", term37172);
        setField(term36906, term36906.getClass(), "options", term36972);
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
        try {
            callMethod(klass, "processOptionToken", argTypes, term36906, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


