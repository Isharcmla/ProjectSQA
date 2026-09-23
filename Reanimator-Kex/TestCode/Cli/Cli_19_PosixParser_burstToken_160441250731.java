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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class PosixParser_burstToken_160441250731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13252;
     Object term16756;

    public PosixParser_burstToken_160441250731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13366 = new HashMap();
        HashMap term13518 = new HashMap();
        ArrayList term13674 = new ArrayList();
        term13252 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term13318 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term13318, term13318.getClass(), "shortOpts", term13366);
        setField(term13318, term13318.getClass(), "longOpts", term13518);
        setField(term13252, term13252.getClass(), "options", term13318);
        setField(term13252, term13252.getClass(), "tokens", term13674);
        ArrayList term16757 = new ArrayList();
        ((ArrayList) term16757).add("                                                                                                                                ");
        term16756 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16756, term16756.getClass(), "tokens", term16757);
        setBooleanField(term16756, term16756.getClass(), "eatTheRest", false);
        setField(term16756, term16756.getClass(), "currentOption", null);
        setField(term16756, term16756.getClass(), "options", null);
        setField(term16756, term16756.getClass(), "cmd", null);
        setField(term16756, term16756.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                ";
        args[1] = false;
        callMethod(klass, "burstToken", argTypes, term13252, args);
        assertTrue(recursiveEquals(term13252, term16756));
    }

};


