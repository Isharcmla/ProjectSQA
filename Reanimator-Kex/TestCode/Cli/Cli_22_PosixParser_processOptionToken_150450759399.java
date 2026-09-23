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

public class PosixParser_processOptionToken_150450759399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33429;
     Object term33920;

    public PosixParser_processOptionToken_150450759399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33543 = new HashMap();
        Object term33785 = newInstance(Class.forName("java.lang.Object"));
        HashMap term33695 = new HashMap();
        ((HashMap) term33695).put((Object)null, (Object)null);
        ((HashMap) term33695).put(term33785, term33785);
        ((HashMap) term33695).put((Object)null, (Object)null);
        ((HashMap) term33695).put(term33785, term33785);
        ArrayList term33889 = new ArrayList();
        term33429 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term33495 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33495, term33495.getClass(), "shortOpts", term33543);
        setField(term33495, term33495.getClass(), "longOpts", term33695);
        setField(term33429, term33429.getClass(), "options", term33495);
        setField(term33429, term33429.getClass(), "tokens", term33889);
        ArrayList term33921 = new ArrayList();
        ((ArrayList) term33921).add((Object)null);
        term33920 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term33920, term33920.getClass(), "tokens", term33921);
        setBooleanField(term33920, term33920.getClass(), "eatTheRest", false);
        setField(term33920, term33920.getClass(), "options", null);
        setField(term33920, term33920.getClass(), "cmd", null);
        setField(term33920, term33920.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term33429, args);
        assertTrue(recursiveEquals(term33429, term33920));
    }

};


