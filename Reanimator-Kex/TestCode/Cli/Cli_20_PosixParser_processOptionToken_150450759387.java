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

public class PosixParser_processOptionToken_150450759387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43111;

    public PosixParser_processOptionToken_150450759387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43315 = newInstance(Class.forName("java.lang.Object"));
        HashMap term43225 = new HashMap();
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        ((HashMap) term43225).put(term43315, term43315);
        Object term43505 = newInstance(Class.forName("java.lang.Object"));
        HashMap term43415 = new HashMap();
        ((HashMap) term43415).put(term43505, term43505);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        ((HashMap) term43415).put(term43315, term43315);
        term43111 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term43177 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term43177, term43177.getClass(), "shortOpts", term43225);
        setField(term43177, term43177.getClass(), "longOpts", term43415);
        setField(term43111, term43111.getClass(), "options", term43177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        try {
            callMethod(klass, "processOptionToken", argTypes, term43111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


