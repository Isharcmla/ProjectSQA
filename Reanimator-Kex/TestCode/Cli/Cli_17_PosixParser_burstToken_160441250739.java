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

public class PosixParser_burstToken_160441250739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440894;

    public PosixParser_burstToken_160441250739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term441008 = new HashMap();
        HashMap term441160 = new HashMap();
        term440894 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term440960 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term440960, term440960.getClass(), "shortOpts", term441008);
        setField(term440960, term440960.getClass(), "longOpts", term441160);
        setField(term440894, term440894.getClass(), "options", term440960);
        setField(term440894, term440894.getClass(), "currentOption", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\u0004\u0004\u0004\u0004";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term440894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


