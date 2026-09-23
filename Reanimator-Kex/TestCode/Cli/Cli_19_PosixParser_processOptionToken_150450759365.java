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

public class PosixParser_processOptionToken_150450759365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33261;

    public PosixParser_processOptionToken_150450759365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33375 = new HashMap();
        Object term33655 = newInstance(Class.forName("java.lang.Object"));
        HashMap term33527 = new HashMap();
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put("", "");
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put(term33655, term33655);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put("", "");
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        ((HashMap) term33527).put((Object)null, (Object)null);
        term33261 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term33327 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33327, term33327.getClass(), "shortOpts", term33375);
        setField(term33327, term33327.getClass(), "longOpts", term33527);
        setField(term33261, term33261.getClass(), "options", term33327);
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
            callMethod(klass, "processOptionToken", argTypes, term33261, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


