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

public class DefaultParser_getLongPrefix_103463659358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53581;
     Object term329509;

    public DefaultParser_getLongPrefix_103463659358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term53695 = new HashMap();
        term53581 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term53647 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term53647, term53647.getClass(), "longOpts", term53695);
        setField(term53581, term53581.getClass(), "options", term53647);
        HashMap term329511 = new HashMap();
        term329509 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term329510 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term329509, term329509.getClass(), "cmd", null);
        setField(term329510, term329510.getClass(), "shortOpts", null);
        setField(term329510, term329510.getClass(), "longOpts", term329511);
        setField(term329510, term329510.getClass(), "requiredOpts", null);
        setField(term329510, term329510.getClass(), "optionGroups", null);
        setField(term329509, term329509.getClass(), "options", term329510);
        setBooleanField(term329509, term329509.getClass(), "stopAtNonOption", false);
        setField(term329509, term329509.getClass(), "currentToken", null);
        setField(term329509, term329509.getClass(), "currentOption", null);
        setBooleanField(term329509, term329509.getClass(), "skipParsing", false);
        setField(term329509, term329509.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\b                               @                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term53581, args);
        assertTrue(recursiveEquals(term53581, term329509));
        assertTrue(recursiveEquals(retValue, null));
    }

};


