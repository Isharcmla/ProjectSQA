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

public class PosixParser_processOptionToken_150450759399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46999;

    public PosixParser_processOptionToken_150450759399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47113 = new HashMap();
        HashMap term47265 = new HashMap();
        ((HashMap) term47265).put((Object)null, (Object)null);
        term46999 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term47065 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term47065, term47065.getClass(), "shortOpts", term47113);
        setField(term47065, term47065.getClass(), "longOpts", term47265);
        setField(term46999, term46999.getClass(), "options", term47065);
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
            callMethod(klass, "processOptionToken", argTypes, term46999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


