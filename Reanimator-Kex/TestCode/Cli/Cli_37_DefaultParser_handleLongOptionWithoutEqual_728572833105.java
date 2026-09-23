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

public class DefaultParser_handleLongOptionWithoutEqual_728572833105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371156;

    public DefaultParser_handleLongOptionWithoutEqual_728572833105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term371282 = new LinkedHashMap();
        term371156 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term371222 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term371222, term371222.getClass(), "longOpts", term371282);
        setField(term371156, term371156.getClass(), "options", term371222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "handleLongOptionWithoutEqual", argTypes, term371156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


