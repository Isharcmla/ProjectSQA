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

public class DefaultParser_handleConcatenatedOptions_55093526767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30927;

    public DefaultParser_handleConcatenatedOptions_55093526767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term31053 = new LinkedHashMap();
        LinkedHashMap term31217 = new LinkedHashMap();
        term30927 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term30993 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term30993, term30993.getClass(), "shortOpts", term31053);
        setField(term30993, term30993.getClass(), "longOpts", term31217);
        setField(term30927, term30927.getClass(), "options", term30993);
        setBooleanField(term30927, term30927.getClass(), "stopAtNonOption", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\uFF80 \uFF80\uFF80\uFF80\uFF80\uFF80\uFF80";
        try {
            callMethod(klass, "handleConcatenatedOptions", argTypes, term30927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


