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

public class DefaultParser_parse_1057713382112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376620;
     Object term376724;
     Object term376357;

    public DefaultParser_parse_1057713382112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376620 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term376620, term376620.getClass(), "options", null);
        setBooleanField(term376620, term376620.getClass(), "stopAtNonOption", false);
        setBooleanField(term376620, term376620.getClass(), "skipParsing", false);
        setField(term376620, term376620.getClass(), "currentOption", null);
        setField(term376620, term376620.getClass(), "expectedOpts", null);
        setField(term376620, term376620.getClass(), "cmd", null);
        setField(term376620, term376620.getClass(), "currentToken", "");
        LinkedHashMap term376890 = new LinkedHashMap();
        term376724 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term376830 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term376724, term376724.getClass(), "requiredOpts", term376830);
        setField(term376724, term376724.getClass(), "optionGroups", term376890);
        term376357 = (Object[]) newArray("java.lang.String", 128);
        setElement(term376357, 0, "--");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term376724;
        args[1] = term376357;
        args[2] = true;
        try {
            callMethod(klass, "parse", argTypes, term376620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


