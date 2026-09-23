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

public class DefaultParser_isLongOption_193943939549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18103;
     Object term18149;

    public DefaultParser_isLongOption_193943939549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18103 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        term18149 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term18149, term18149.getClass(), "cmd", null);
        setField(term18149, term18149.getClass(), "options", null);
        setBooleanField(term18149, term18149.getClass(), "stopAtNonOption", false);
        setField(term18149, term18149.getClass(), "currentToken", null);
        setField(term18149, term18149.getClass(), "currentOption", null);
        setBooleanField(term18149, term18149.getClass(), "skipParsing", false);
        setField(term18149, term18149.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "isLongOption", argTypes, term18103, args);
        assertTrue(recursiveEquals(term18103, term18149));
        assertTrue(recursiveEquals(retValue, false));
    }

};


