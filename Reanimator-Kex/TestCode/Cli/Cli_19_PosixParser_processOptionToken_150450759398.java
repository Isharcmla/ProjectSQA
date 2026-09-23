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

public class PosixParser_processOptionToken_150450759398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46216;

    public PosixParser_processOptionToken_150450759398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46330 = new HashMap();
        HashMap term46482 = new HashMap();
        ((HashMap) term46482).put((Object)null, (Object)null);
        term46216 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term46282 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term46282, term46282.getClass(), "shortOpts", term46330);
        setField(term46282, term46282.getClass(), "longOpts", term46482);
        setField(term46216, term46216.getClass(), "options", term46282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term46216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


