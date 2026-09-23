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

public class PosixParser_burstToken_160441250761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26542;
     Object term29093;

    public PosixParser_burstToken_160441250761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26656 = new HashMap();
        HashMap term26808 = new HashMap();
        ArrayList term26964 = new ArrayList();
        term26542 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term26608 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term26608, term26608.getClass(), "shortOpts", term26656);
        setField(term26608, term26608.getClass(), "longOpts", term26808);
        setField(term26542, term26542.getClass(), "options", term26608);
        setField(term26542, term26542.getClass(), "currentOption", null);
        setBooleanField(term26542, term26542.getClass(), "eatTheRest", false);
        setField(term26542, term26542.getClass(), "tokens", term26964);
        ArrayList term29094 = new ArrayList();
        ((ArrayList) term29094).add("--");
        ((ArrayList) term29094).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        term29093 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term29093, term29093.getClass(), "tokens", term29094);
        setBooleanField(term29093, term29093.getClass(), "eatTheRest", true);
        setField(term29093, term29093.getClass(), "currentOption", null);
        setField(term29093, term29093.getClass(), "options", null);
        setField(term29093, term29093.getClass(), "cmd", null);
        setField(term29093, term29093.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = true;
        callMethod(klass, "burstToken", argTypes, term26542, args);
        assertTrue(recursiveEquals(term26542, term29093));
    }

};


