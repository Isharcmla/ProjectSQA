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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Options_addOption_744036042115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31309;
     Object term31425;

    public Options_addOption_744036042115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31361 = new ArrayList();
        term31309 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term31309, term31309.getClass(), "requiredOpts", term31361);
        term31425 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31425, term31425.getClass(), "opt", "");
        setField(term31425, term31425.getClass(), "longOpt", null);
        setBooleanField(term31425, term31425.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term31425;
        try {
            callMethod(klass, "addOption", argTypes, term31309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


