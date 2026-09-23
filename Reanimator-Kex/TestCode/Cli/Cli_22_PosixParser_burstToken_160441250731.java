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
     Object term7148;
     Object term7782;

    public PosixParser_burstToken_160441250731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7262 = new HashMap();
        HashMap term7414 = new HashMap();
        ArrayList term7570 = new ArrayList();
        term7148 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term7214 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term7214, term7214.getClass(), "shortOpts", term7262);
        setField(term7214, term7214.getClass(), "longOpts", term7414);
        setField(term7148, term7148.getClass(), "options", term7214);
        setBooleanField(term7148, term7148.getClass(), "eatTheRest", false);
        setField(term7148, term7148.getClass(), "tokens", term7570);
        ArrayList term7783 = new ArrayList();
        ((ArrayList) term7783).add("--");
        ((ArrayList) term7783).add("                                ");
        term7782 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term7782, term7782.getClass(), "tokens", term7783);
        setBooleanField(term7782, term7782.getClass(), "eatTheRest", true);
        setField(term7782, term7782.getClass(), "options", null);
        setField(term7782, term7782.getClass(), "cmd", null);
        setField(term7782, term7782.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                 ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term7148, args);
        assertTrue(recursiveEquals(term7148, term7782));
    }

};


