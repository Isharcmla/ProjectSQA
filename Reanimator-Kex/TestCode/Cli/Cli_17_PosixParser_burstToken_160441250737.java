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

public class PosixParser_burstToken_160441250737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23870;
     Object term439040;

    public PosixParser_burstToken_160441250737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23984 = new HashMap();
        HashMap term24136 = new HashMap();
        ArrayList term24252 = new ArrayList();
        term23870 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term23936 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term24200 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23936, term23936.getClass(), "shortOpts", term23984);
        setField(term23936, term23936.getClass(), "longOpts", term24136);
        setField(term23870, term23870.getClass(), "options", term23936);
        setIntField(term24200, term24200.getClass(), "numberOfArgs", -2);
        setField(term23870, term23870.getClass(), "currentOption", term24200);
        setField(term23870, term23870.getClass(), "tokens", term24252);
        ArrayList term439041 = new ArrayList();
        ((ArrayList) term439041).add("\u0004\u0004");
        ((ArrayList) term439041).add("--");
        ((ArrayList) term439041).add("\u0004");
        term439040 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term439040, term439040.getClass(), "tokens", term439041);
        setBooleanField(term439040, term439040.getClass(), "eatTheRest", true);
        setField(term439040, term439040.getClass(), "currentOption", null);
        setField(term439040, term439040.getClass(), "options", null);
        setField(term439040, term439040.getClass(), "cmd", null);
        setField(term439040, term439040.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\u0004\u0004\u0004";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term23870, args);
        assertTrue(recursiveEquals(term23870, term439040));
    }

};


