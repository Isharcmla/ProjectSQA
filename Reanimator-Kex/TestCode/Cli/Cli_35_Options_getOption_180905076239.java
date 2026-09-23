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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;

public class Options_getOption_180905076239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5627;

    public Options_getOption_180905076239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5687 = new LinkedHashMap();
        ((LinkedHashMap) term5687).put("", "");
        ((LinkedHashMap) term5687).put((Object)null, (Object)null);
        ((LinkedHashMap) term5687).put((Object)null, (Object)null);
        ((LinkedHashMap) term5687).put((Object)null, (Object)null);
        term5627 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5627, term5627.getClass(), "shortOpts", term5687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getOption", argTypes, term5627, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


