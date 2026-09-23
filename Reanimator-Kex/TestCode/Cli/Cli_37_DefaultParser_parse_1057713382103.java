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

public class DefaultParser_parse_1057713382103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370080;
     Object term370210;
     Object term369643;

    public DefaultParser_parse_1057713382103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370080 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term370144 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term370080, term370080.getClass(), "options", null);
        setBooleanField(term370080, term370080.getClass(), "stopAtNonOption", false);
        setBooleanField(term370080, term370080.getClass(), "skipParsing", false);
        setField(term370080, term370080.getClass(), "currentOption", term370144);
        setField(term370080, term370080.getClass(), "expectedOpts", null);
        setField(term370080, term370080.getClass(), "cmd", null);
        setField(term370080, term370080.getClass(), "currentToken", null);
        LinkedHashMap term370376 = new LinkedHashMap();
        term370210 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term370316 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term370210, term370210.getClass(), "requiredOpts", term370316);
        setField(term370210, term370210.getClass(), "optionGroups", term370376);
        term369643 = (Object[]) newArray("java.lang.String", 64);
        setElement(term369643, 0, "");
        setElement(term369643, 1, "");
        setElement(term369643, 2, "");
        setElement(term369643, 3, "--");
        setElement(term369643, 4, "");
        setElement(term369643, 5, "");
        setElement(term369643, 6, "");
        setElement(term369643, 7, "");
        setElement(term369643, 8, "");
        setElement(term369643, 9, "");
        setElement(term369643, 10, "");
        setElement(term369643, 11, "");
        setElement(term369643, 12, "");
        setElement(term369643, 13, "");
        setElement(term369643, 14, "");
        setElement(term369643, 15, "");
        setElement(term369643, 16, "");
        setElement(term369643, 17, "");
        setElement(term369643, 18, "");
        setElement(term369643, 19, "");
        setElement(term369643, 20, "");
        setElement(term369643, 21, "");
        setElement(term369643, 22, "");
        setElement(term369643, 23, "");
        setElement(term369643, 24, "");
        setElement(term369643, 25, "");
        setElement(term369643, 26, "");
        setElement(term369643, 27, "");
        setElement(term369643, 28, "");
        setElement(term369643, 29, "");
        setElement(term369643, 30, "");
        setElement(term369643, 31, "");
        setElement(term369643, 32, "");
        setElement(term369643, 33, "");
        setElement(term369643, 34, "");
        setElement(term369643, 35, "");
        setElement(term369643, 36, "");
        setElement(term369643, 37, "");
        setElement(term369643, 38, "");
        setElement(term369643, 39, "");
        setElement(term369643, 40, "");
        setElement(term369643, 41, "");
        setElement(term369643, 42, "");
        setElement(term369643, 43, "");
        setElement(term369643, 44, "");
        setElement(term369643, 45, "");
        setElement(term369643, 46, "");
        setElement(term369643, 47, "");
        setElement(term369643, 48, "");
        setElement(term369643, 49, "");
        setElement(term369643, 50, "");
        setElement(term369643, 51, "");
        setElement(term369643, 52, "");
        setElement(term369643, 53, "");
        setElement(term369643, 54, "");
        setElement(term369643, 55, "");
        setElement(term369643, 56, "");
        setElement(term369643, 57, "");
        setElement(term369643, 58, "");
        setElement(term369643, 59, "");
        setElement(term369643, 60, "");
        setElement(term369643, 61, "");
        setElement(term369643, 62, "");
        setElement(term369643, 63, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term370210;
        args[1] = term369643;
        args[2] = false;
        try {
            callMethod(klass, "parse", argTypes, term370080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


