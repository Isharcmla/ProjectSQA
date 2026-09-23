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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class PosixParser_processOptionToken_150450759328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8226;
     Object term9706;

    public PosixParser_processOptionToken_150450759328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8340 = new HashMap();
        HashMap term8492 = new HashMap();
        term8226 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term8292 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term8292, term8292.getClass(), "shortOpts", term8340);
        setField(term8292, term8292.getClass(), "longOpts", term8492);
        setField(term8226, term8226.getClass(), "options", term8292);
        term9706 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term9706, term9706.getClass(), "tokens", null);
        setBooleanField(term9706, term9706.getClass(), "eatTheRest", true);
        setField(term9706, term9706.getClass(), "currentOption", null);
        setField(term9706, term9706.getClass(), "options", null);
        setField(term9706, term9706.getClass(), "cmd", null);
        setField(term9706, term9706.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        callMethod(klass, "processOptionToken", argTypes, term8226, args);
        assertTrue(recursiveEquals(term8226, term9706));
    }

};


