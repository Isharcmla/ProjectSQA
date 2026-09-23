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
import java.lang.Object;
import java.util.LinkedHashMap;

public class DefaultParser_parse_105771338271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32461;
     Object term32653;
     Object term32244;

    public DefaultParser_parse_105771338271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32513 = new ArrayList();
        term32461 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term32587 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term32461, term32461.getClass(), "options", null);
        setBooleanField(term32461, term32461.getClass(), "stopAtNonOption", false);
        setBooleanField(term32461, term32461.getClass(), "skipParsing", false);
        setField(term32461, term32461.getClass(), "currentOption", null);
        setField(term32461, term32461.getClass(), "expectedOpts", term32513);
        setField(term32461, term32461.getClass(), "cmd", term32587);
        LinkedHashMap term32819 = new LinkedHashMap();
        term32653 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term32759 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term32653, term32653.getClass(), "requiredOpts", term32759);
        setField(term32653, term32653.getClass(), "optionGroups", term32819);
        term32244 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term32653;
        args[1] = term32244;
        args[2] = true;
        try {
            callMethod(klass, "parse", argTypes, term32461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


