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

public class PosixParser_processOptionToken_150450759397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44769;

    public PosixParser_processOptionToken_150450759397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44883 = new HashMap();
        Object term45163 = newInstance(Class.forName("java.lang.Object"));
        HashMap term45035 = new HashMap();
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put("", "");
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put(term45163, term45163);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put("", "");
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        ((HashMap) term45035).put((Object)null, (Object)null);
        term44769 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term44835 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44835, term44835.getClass(), "shortOpts", term44883);
        setField(term44835, term44835.getClass(), "longOpts", term45035);
        setField(term44769, term44769.getClass(), "options", term44835);
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
            callMethod(klass, "processOptionToken", argTypes, term44769, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


