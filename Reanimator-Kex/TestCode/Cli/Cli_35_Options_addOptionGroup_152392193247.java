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

public class Options_addOptionGroup_152392193247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8488;
     Object term8614;

    public Options_addOptionGroup_152392193247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8540 = new ArrayList();
        term8488 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term8488, term8488.getClass(), "requiredOpts", term8540);
        term8614 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term8614, term8614.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term8614;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term8488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


