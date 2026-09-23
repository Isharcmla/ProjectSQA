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

public class DefaultParser_parse_16712595067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30192;
     Object term30258;
     Object term27788;

    public DefaultParser_parse_16712595067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30192 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term30192, term30192.getClass(), "options", null);
        setBooleanField(term30192, term30192.getClass(), "stopAtNonOption", false);
        setBooleanField(term30192, term30192.getClass(), "skipParsing", false);
        setField(term30192, term30192.getClass(), "currentOption", null);
        setField(term30192, term30192.getClass(), "expectedOpts", null);
        setField(term30192, term30192.getClass(), "cmd", null);
        setField(term30192, term30192.getClass(), "currentToken", null);
        LinkedHashMap term30424 = new LinkedHashMap();
        term30258 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term30364 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term30258, term30258.getClass(), "requiredOpts", term30364);
        setField(term30258, term30258.getClass(), "optionGroups", term30424);
        term27788 = (Object[]) newArray("java.lang.String", 2);
        setElement(term27788, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term27788, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term30258;
        args[1] = term27788;
        try {
            callMethod(klass, "parse", argTypes, term30192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


