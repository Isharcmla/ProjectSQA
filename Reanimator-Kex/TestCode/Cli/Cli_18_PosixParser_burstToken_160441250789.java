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

public class PosixParser_burstToken_160441250789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41597;
     Object term42304;

    public PosixParser_burstToken_160441250789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41711 = new HashMap();
        HashMap term41863 = new HashMap();
        ArrayList term41967 = new ArrayList();
        term41597 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term41663 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term41663, term41663.getClass(), "shortOpts", term41711);
        setField(term41663, term41663.getClass(), "longOpts", term41863);
        setField(term41597, term41597.getClass(), "options", term41663);
        setField(term41597, term41597.getClass(), "currentOption", null);
        setBooleanField(term41597, term41597.getClass(), "eatTheRest", false);
        setField(term41597, term41597.getClass(), "tokens", term41967);
        ArrayList term42305 = new ArrayList();
        ((ArrayList) term42305).add("--");
        ((ArrayList) term42305).add("                                                               ");
        term42304 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term42304, term42304.getClass(), "tokens", term42305);
        setBooleanField(term42304, term42304.getClass(), "eatTheRest", true);
        setField(term42304, term42304.getClass(), "currentOption", null);
        setField(term42304, term42304.getClass(), "options", null);
        setField(term42304, term42304.getClass(), "cmd", null);
        setField(term42304, term42304.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term41597, args);
        assertTrue(recursiveEquals(term41597, term42304));
    }

};


