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

public class DefaultParser_isOption_10831239120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381931;
     Object term381982;

    public DefaultParser_isOption_10831239120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381931 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        term381982 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term381982, term381982.getClass(), "cmd", null);
        setField(term381982, term381982.getClass(), "options", null);
        setBooleanField(term381982, term381982.getClass(), "stopAtNonOption", false);
        setField(term381982, term381982.getClass(), "currentToken", null);
        setField(term381982, term381982.getClass(), "currentOption", null);
        setBooleanField(term381982, term381982.getClass(), "skipParsing", false);
        setField(term381982, term381982.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "isOption", argTypes, term381931, args);
        assertTrue(recursiveEquals(term381931, term381982));
        assertTrue(recursiveEquals(retValue, false));
    }

};


