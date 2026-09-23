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
import java.util.LinkedHashMap;
import java.lang.Object;

public class Options_hasOption_330693337217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70940;

    public Options_hasOption_330693337217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71090 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term71000 = new LinkedHashMap();
        ((LinkedHashMap) term71000).put(term71090, term71090);
        term70940 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term70940, term70940.getClass(), "shortOpts", term71000);
        setField(term70940, term70940.getClass(), "longOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "hasOption", argTypes, term70940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


