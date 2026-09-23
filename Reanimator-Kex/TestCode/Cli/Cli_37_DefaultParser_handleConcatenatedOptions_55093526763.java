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

public class DefaultParser_handleConcatenatedOptions_55093526763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26088;

    public DefaultParser_handleConcatenatedOptions_55093526763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term26214 = new LinkedHashMap();
        LinkedHashMap term26378 = new LinkedHashMap();
        term26088 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term26154 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term26154, term26154.getClass(), "shortOpts", term26214);
        setField(term26154, term26154.getClass(), "longOpts", term26378);
        setField(term26088, term26088.getClass(), "options", term26154);
        setBooleanField(term26088, term26088.getClass(), "stopAtNonOption", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\uFF80 \uFF80\uFF80\uFF80\uFF80\uFF80\uFF80";
        try {
            callMethod(klass, "handleConcatenatedOptions", argTypes, term26088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


