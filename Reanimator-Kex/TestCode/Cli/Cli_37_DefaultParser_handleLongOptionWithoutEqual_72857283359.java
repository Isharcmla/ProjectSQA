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

public class DefaultParser_handleLongOptionWithoutEqual_72857283359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21817;

    public DefaultParser_handleLongOptionWithoutEqual_72857283359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term21943 = new LinkedHashMap();
        term21817 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term21883 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term21883, term21883.getClass(), "longOpts", term21943);
        setField(term21817, term21817.getClass(), "options", term21883);
        setField(term21817, term21817.getClass(), "currentToken", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "handleLongOptionWithoutEqual", argTypes, term21817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


