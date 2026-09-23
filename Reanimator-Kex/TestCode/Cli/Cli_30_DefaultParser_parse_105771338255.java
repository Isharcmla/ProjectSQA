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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_parse_105771338255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36149;
     Object term36405;

    public DefaultParser_parse_105771338255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36265 = new ArrayList();
        term36149 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term36213 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term36339 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term36149, term36149.getClass(), "options", null);
        setBooleanField(term36149, term36149.getClass(), "stopAtNonOption", false);
        setBooleanField(term36149, term36149.getClass(), "skipParsing", false);
        setField(term36149, term36149.getClass(), "currentOption", term36213);
        setField(term36149, term36149.getClass(), "expectedOpts", term36265);
        setField(term36149, term36149.getClass(), "cmd", term36339);
        HashMap term36453 = new HashMap();
        term36405 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term36405, term36405.getClass(), "requiredOpts", null);
        setField(term36405, term36405.getClass(), "optionGroups", term36453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term36405;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "parse", argTypes, term36149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


