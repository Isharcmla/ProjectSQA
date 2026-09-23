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

public class PosixParser_processOptionToken_150450759349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14043;

    public PosixParser_processOptionToken_150450759349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14157 = new HashMap();
        HashMap term14309 = new HashMap();
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put("", "");
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put((Object)null, (Object)null);
        ((HashMap) term14309).put((Object)null, (Object)null);
        term14043 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term14109 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term14109, term14109.getClass(), "shortOpts", term14157);
        setField(term14109, term14109.getClass(), "longOpts", term14309);
        setField(term14043, term14043.getClass(), "options", term14109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        try {
            callMethod(klass, "processOptionToken", argTypes, term14043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


