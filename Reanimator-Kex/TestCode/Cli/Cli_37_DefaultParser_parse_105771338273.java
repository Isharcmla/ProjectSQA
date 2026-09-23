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
import java.util.LinkedHashMap;
import java.lang.Object;

public class DefaultParser_parse_105771338273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46803;
     Object term46869;
     Object term46475;

    public DefaultParser_parse_105771338273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46803 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term46803, term46803.getClass(), "options", null);
        setBooleanField(term46803, term46803.getClass(), "stopAtNonOption", false);
        setBooleanField(term46803, term46803.getClass(), "skipParsing", false);
        setField(term46803, term46803.getClass(), "currentOption", null);
        setField(term46803, term46803.getClass(), "expectedOpts", null);
        setField(term46803, term46803.getClass(), "cmd", null);
        setField(term46803, term46803.getClass(), "currentToken", null);
        ArrayList term46921 = new ArrayList();
        LinkedHashMap term46981 = new LinkedHashMap();
        term46869 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term46869, term46869.getClass(), "requiredOpts", term46921);
        setField(term46869, term46869.getClass(), "optionGroups", term46981);
        term46475 = (Object[]) newArray("java.lang.String", 16);
        setElement(term46475, 0, "");
        setElement(term46475, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term46869;
        args[1] = term46475;
        args[2] = false;
        try {
            callMethod(klass, "parse", argTypes, term46803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


