package org.apache.commons.lang3.time;

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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class FastDateParser_escapeRegex_106732247254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7350;
     Object term7382;

    public FastDateParser_escapeRegex_106732247254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7350 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7351 = (byte[]) newByteArray(16);
        setField(term7350, term7350.getClass(), "value", term7351);
        setByteField(term7350, term7350.getClass(), "coder", (byte) 78);
        setIntField(term7350, term7350.getClass(), "count", 1716165145);
        term7382 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term7350;
        args[1] = "EYtfuJaxiM";
        args[2] = term7382;
        try {
            callMethod(klass, "escapeRegex", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


