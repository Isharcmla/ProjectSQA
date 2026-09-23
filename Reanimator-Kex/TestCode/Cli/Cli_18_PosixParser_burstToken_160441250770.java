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

public class PosixParser_burstToken_160441250770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27182;
     Object term31723;

    public PosixParser_burstToken_160441250770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27296 = new HashMap();
        HashMap term27448 = new HashMap();
        ArrayList term27552 = new ArrayList();
        term27182 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term27248 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term27616 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term27248, term27248.getClass(), "shortOpts", term27296);
        setField(term27248, term27248.getClass(), "longOpts", term27448);
        setField(term27182, term27182.getClass(), "options", term27248);
        setIntField(term27616, term27616.getClass(), "numberOfArgs", -2);
        setField(term27182, term27182.getClass(), "currentOption", term27616);
        setField(term27182, term27182.getClass(), "tokens", term27552);
        ArrayList term31724 = new ArrayList();
        ((ArrayList) term31724).add("\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        term31723 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term31723, term31723.getClass(), "tokens", term31724);
        setBooleanField(term31723, term31723.getClass(), "eatTheRest", false);
        setField(term31723, term31723.getClass(), "currentOption", null);
        setField(term31723, term31723.getClass(), "options", null);
        setField(term31723, term31723.getClass(), "cmd", null);
        setField(term31723, term31723.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = " \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term27182, args);
        assertTrue(recursiveEquals(term27182, term31723));
    }

};


