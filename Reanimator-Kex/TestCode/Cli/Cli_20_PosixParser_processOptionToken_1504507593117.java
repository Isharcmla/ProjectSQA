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

public class PosixParser_processOptionToken_1504507593117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57028;

    public PosixParser_processOptionToken_1504507593117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57232 = newInstance(Class.forName("java.lang.Object"));
        HashMap term57142 = new HashMap();
        ((HashMap) term57142).put(term57232, term57232);
        ((HashMap) term57142).put((Object)null, (Object)null);
        ((HashMap) term57142).put((Object)null, (Object)null);
        ((HashMap) term57142).put((Object)null, (Object)null);
        term57028 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term57094 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57094, term57094.getClass(), "shortOpts", term57142);
        setField(term57094, term57094.getClass(), "longOpts", null);
        setField(term57028, term57028.getClass(), "options", term57094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term57028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


