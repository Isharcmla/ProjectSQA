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

public class PosixParser_processOptionToken_1504507593103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47670;

    public PosixParser_processOptionToken_1504507593103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47874 = newInstance(Class.forName("java.lang.Object"));
        HashMap term47784 = new HashMap();
        ((HashMap) term47784).put(term47874, term47874);
        ((HashMap) term47784).put((Object)null, (Object)null);
        ((HashMap) term47784).put((Object)null, (Object)null);
        ((HashMap) term47784).put((Object)null, (Object)null);
        term47670 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term47736 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term47736, term47736.getClass(), "shortOpts", term47784);
        setField(term47736, term47736.getClass(), "longOpts", null);
        setField(term47670, term47670.getClass(), "options", term47736);
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
            callMethod(klass, "processOptionToken", argTypes, term47670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


