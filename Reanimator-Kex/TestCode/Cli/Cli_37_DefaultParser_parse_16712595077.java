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

public class DefaultParser_parse_16712595077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55506;
     Object term55702;

    public DefaultParser_parse_16712595077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55506 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term55572 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term55636 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term55506, term55506.getClass(), "options", term55572);
        setBooleanField(term55506, term55506.getClass(), "stopAtNonOption", false);
        setBooleanField(term55506, term55506.getClass(), "skipParsing", false);
        setField(term55506, term55506.getClass(), "currentOption", term55636);
        setField(term55506, term55506.getClass(), "expectedOpts", null);
        LinkedHashMap term55868 = new LinkedHashMap();
        term55702 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term55808 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term55702, term55702.getClass(), "requiredOpts", term55808);
        setField(term55702, term55702.getClass(), "optionGroups", term55868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term55702;
        args[1] = null;
        try {
            callMethod(klass, "parse", argTypes, term55506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


