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

public class PosixParser_burstToken_160441250749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27764;
     Object term28375;

    public PosixParser_burstToken_160441250749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27878 = new HashMap();
        HashMap term28030 = new HashMap();
        ArrayList term28250 = new ArrayList();
        term27764 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term27830 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term28198 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term27830, term27830.getClass(), "shortOpts", term27878);
        setField(term27830, term27830.getClass(), "longOpts", term28030);
        setField(term27764, term27764.getClass(), "options", term27830);
        setIntField(term28198, term28198.getClass(), "numberOfArgs", 1);
        setField(term27764, term27764.getClass(), "currentOption", term28198);
        setField(term27764, term27764.getClass(), "tokens", term28250);
        ArrayList term28376 = new ArrayList();
        ((ArrayList) term28376).add("\u0002\u0001\u0001\u0001\u0001\u0001\u0001");
        term28375 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term28375, term28375.getClass(), "tokens", term28376);
        setBooleanField(term28375, term28375.getClass(), "eatTheRest", false);
        setField(term28375, term28375.getClass(), "currentOption", null);
        setField(term28375, term28375.getClass(), "options", null);
        setField(term28375, term28375.getClass(), "cmd", null);
        setField(term28375, term28375.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\u0001\u0002\u0001\u0001\u0001\u0001\u0001\u0001";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term27764, args);
        assertTrue(recursiveEquals(term27764, term28375));
    }

};


