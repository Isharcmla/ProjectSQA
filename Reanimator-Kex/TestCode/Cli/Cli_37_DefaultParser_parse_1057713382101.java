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
import java.util.LinkedHashMap;

public class DefaultParser_parse_1057713382101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368934;
     Object term369140;
     Object term368683;

    public DefaultParser_parse_1057713382101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368934 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term369000 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term369074 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term368934, term368934.getClass(), "options", term369000);
        setBooleanField(term368934, term368934.getClass(), "stopAtNonOption", false);
        setBooleanField(term368934, term368934.getClass(), "skipParsing", false);
        setField(term368934, term368934.getClass(), "currentOption", null);
        setField(term368934, term368934.getClass(), "expectedOpts", null);
        setField(term368934, term368934.getClass(), "cmd", term369074);
        setField(term368934, term368934.getClass(), "currentToken", null);
        LinkedHashMap term369282 = new LinkedHashMap();
        term369140 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term369222 = newInstance(Class.forName("java.util.Collections$UnmodifiableList"));
        setField(term369140, term369140.getClass(), "requiredOpts", term369222);
        setField(term369140, term369140.getClass(), "optionGroups", term369282);
        term368683 = (Object[]) newArray("java.lang.String", 1);
        setElement(term368683, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term369140;
        args[1] = term368683;
        args[2] = true;
        try {
            callMethod(klass, "parse", argTypes, term368934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


