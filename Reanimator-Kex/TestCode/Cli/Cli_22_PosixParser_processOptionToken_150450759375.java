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

public class PosixParser_processOptionToken_150450759375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21790;
     Object term22237;

    public PosixParser_processOptionToken_150450759375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21904 = new HashMap();
        HashMap term22056 = new HashMap();
        ArrayList term22212 = new ArrayList();
        term21790 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term21856 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term21856, term21856.getClass(), "shortOpts", term21904);
        setField(term21856, term21856.getClass(), "longOpts", term22056);
        setField(term21790, term21790.getClass(), "options", term21856);
        setBooleanField(term21790, term21790.getClass(), "eatTheRest", false);
        setField(term21790, term21790.getClass(), "tokens", term22212);
        ArrayList term22238 = new ArrayList();
        ((ArrayList) term22238).add((Object)null);
        term22237 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term22237, term22237.getClass(), "tokens", term22238);
        setBooleanField(term22237, term22237.getClass(), "eatTheRest", true);
        setField(term22237, term22237.getClass(), "options", null);
        setField(term22237, term22237.getClass(), "cmd", null);
        setField(term22237, term22237.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term21790, args);
        assertTrue(recursiveEquals(term21790, term22237));
    }

};


