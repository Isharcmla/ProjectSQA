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

public class PosixParser_processOptionToken_150450759371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29343;

    public PosixParser_processOptionToken_150450759371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29457 = new HashMap();
        ((HashMap) term29457).put("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        ((HashMap) term29457).put((Object)null, (Object)null);
        term29343 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term29409 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term29409, term29409.getClass(), "shortOpts", term29457);
        setField(term29343, term29343.getClass(), "options", term29409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term29343, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


