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

public class Options_addOption_74403604279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19467;
     Object term19583;

    public Options_addOption_74403604279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19519 = new ArrayList();
        term19467 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19467, term19467.getClass(), "requiredOpts", term19519);
        term19583 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19583, term19583.getClass(), "opt", "");
        setField(term19583, term19583.getClass(), "longOpt", null);
        setBooleanField(term19583, term19583.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term19583;
        try {
            callMethod(klass, "addOption", argTypes, term19467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


