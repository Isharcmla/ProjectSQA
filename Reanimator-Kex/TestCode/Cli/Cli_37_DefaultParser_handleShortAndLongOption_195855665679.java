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

public class DefaultParser_handleShortAndLongOption_195855665679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56961;

    public DefaultParser_handleShortAndLongOption_195855665679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term57087 = new LinkedHashMap();
        LinkedHashMap term57251 = new LinkedHashMap();
        term56961 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term57027 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57027, term57027.getClass(), "shortOpts", term57087);
        setField(term57027, term57027.getClass(), "longOpts", term57251);
        setField(term56961, term56961.getClass(), "options", term57027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "       ";
        try {
            callMethod(klass, "handleShortAndLongOption", argTypes, term56961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


