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

public class PosixParser_processOptionToken_150450759391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42667;
     Object term43144;

    public PosixParser_processOptionToken_150450759391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42871 = newInstance(Class.forName("java.lang.Object"));
        HashMap term42781 = new HashMap();
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        ((HashMap) term42781).put(term42871, term42871);
        Object term43061 = newInstance(Class.forName("java.lang.Object"));
        HashMap term42971 = new HashMap();
        ((HashMap) term42971).put(term43061, term43061);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        ((HashMap) term42971).put(term42871, term42871);
        term42667 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term42733 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term42733, term42733.getClass(), "shortOpts", term42781);
        setField(term42733, term42733.getClass(), "longOpts", term42971);
        setField(term42667, term42667.getClass(), "options", term42733);
        term43144 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term43144, term43144.getClass(), "tokens", null);
        setBooleanField(term43144, term43144.getClass(), "eatTheRest", true);
        setField(term43144, term43144.getClass(), "currentOption", null);
        setField(term43144, term43144.getClass(), "options", null);
        setField(term43144, term43144.getClass(), "cmd", null);
        setField(term43144, term43144.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term42667, args);
        assertTrue(recursiveEquals(term42667, term43144));
    }

};


