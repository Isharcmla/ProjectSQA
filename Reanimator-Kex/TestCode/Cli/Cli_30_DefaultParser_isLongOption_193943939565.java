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

public class DefaultParser_isLongOption_193943939565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336609;
     Object term336655;

    public DefaultParser_isLongOption_193943939565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336609 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        term336655 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term336655, term336655.getClass(), "cmd", null);
        setField(term336655, term336655.getClass(), "options", null);
        setBooleanField(term336655, term336655.getClass(), "stopAtNonOption", false);
        setField(term336655, term336655.getClass(), "currentToken", null);
        setField(term336655, term336655.getClass(), "currentOption", null);
        setBooleanField(term336655, term336655.getClass(), "skipParsing", false);
        setField(term336655, term336655.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "isLongOption", argTypes, term336609, args);
        assertTrue(recursiveEquals(term336609, term336655));
        assertTrue(recursiveEquals(retValue, false));
    }

};


