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

public class PosixParser_processOptionToken_150450759395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43791;

    public PosixParser_processOptionToken_150450759395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43905 = new HashMap();
        HashMap term44057 = new HashMap();
        ((HashMap) term44057).put((Object)null, (Object)null);
        term43791 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term43857 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term43857, term43857.getClass(), "shortOpts", term43905);
        setField(term43857, term43857.getClass(), "longOpts", term44057);
        setField(term43791, term43791.getClass(), "options", term43857);
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
            callMethod(klass, "processOptionToken", argTypes, term43791, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


