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

public class PosixParser_processOptionToken_150450759380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39446;

    public PosixParser_processOptionToken_150450759380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39560 = new HashMap();
        Object term39840 = newInstance(Class.forName("java.lang.Object"));
        HashMap term39712 = new HashMap();
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put("", "");
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put(term39840, term39840);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put("", "");
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        ((HashMap) term39712).put((Object)null, (Object)null);
        term39446 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term39512 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term39512, term39512.getClass(), "shortOpts", term39560);
        setField(term39512, term39512.getClass(), "longOpts", term39712);
        setField(term39446, term39446.getClass(), "options", term39512);
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
            callMethod(klass, "processOptionToken", argTypes, term39446, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


