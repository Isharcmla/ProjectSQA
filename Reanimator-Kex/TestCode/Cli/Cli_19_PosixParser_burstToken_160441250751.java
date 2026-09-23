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

public class PosixParser_burstToken_160441250751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28779;
     Object term29318;

    public PosixParser_burstToken_160441250751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28893 = new HashMap();
        HashMap term29045 = new HashMap();
        ArrayList term29201 = new ArrayList();
        term28779 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term28845 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28845, term28845.getClass(), "shortOpts", term28893);
        setField(term28845, term28845.getClass(), "longOpts", term29045);
        setField(term28779, term28779.getClass(), "options", term28845);
        setField(term28779, term28779.getClass(), "currentOption", null);
        setBooleanField(term28779, term28779.getClass(), "eatTheRest", false);
        setField(term28779, term28779.getClass(), "tokens", term29201);
        ArrayList term29319 = new ArrayList();
        ((ArrayList) term29319).add("--");
        ((ArrayList) term29319).add("        ");
        term29318 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term29318, term29318.getClass(), "tokens", term29319);
        setBooleanField(term29318, term29318.getClass(), "eatTheRest", true);
        setField(term29318, term29318.getClass(), "currentOption", null);
        setField(term29318, term29318.getClass(), "options", null);
        setField(term29318, term29318.getClass(), "cmd", null);
        setField(term29318, term29318.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "         ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term28779, args);
        assertTrue(recursiveEquals(term28779, term29318));
    }

};


