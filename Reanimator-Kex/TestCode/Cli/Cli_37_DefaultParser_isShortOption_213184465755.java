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

public class DefaultParser_isShortOption_213184465755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20255;
     Object term20585;

    public DefaultParser_isShortOption_213184465755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20255 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        term20585 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term20585, term20585.getClass(), "cmd", null);
        setField(term20585, term20585.getClass(), "options", null);
        setBooleanField(term20585, term20585.getClass(), "stopAtNonOption", false);
        setField(term20585, term20585.getClass(), "currentToken", null);
        setField(term20585, term20585.getClass(), "currentOption", null);
        setBooleanField(term20585, term20585.getClass(), "skipParsing", false);
        setField(term20585, term20585.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "isShortOption", argTypes, term20255, args);
        assertTrue(recursiveEquals(term20255, term20585));
        assertTrue(recursiveEquals(retValue, false));
    }

};


