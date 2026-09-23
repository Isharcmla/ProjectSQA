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

public class DefaultParser_handleLongOption_214305057187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71262;

    public DefaultParser_handleLongOption_214305057187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term71388 = new LinkedHashMap();
        term71262 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term71328 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term71328, term71328.getClass(), "longOpts", term71388);
        setField(term71262, term71262.getClass(), "options", term71328);
        setField(term71262, term71262.getClass(), "currentToken", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "handleLongOption", argTypes, term71262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


