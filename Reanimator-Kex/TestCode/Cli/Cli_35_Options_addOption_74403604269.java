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

public class Options_addOption_74403604269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16944;
     Object term17008;

    public Options_addOption_74403604269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16944 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        term17008 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17008, term17008.getClass(), "opt", "");
        setField(term17008, term17008.getClass(), "longOpt", null);
        setBooleanField(term17008, term17008.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term17008;
        try {
            callMethod(klass, "addOption", argTypes, term16944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


