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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class Options_addOption_180146615721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term174;

    public Options_addOption_180146615721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term141 = new LinkedHashMap();
        LinkedHashMap term147 = new LinkedHashMap();
        ArrayList term153 = new ArrayList();
        HashMap term157 = new HashMap();
        term140 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term140, term140.getClass(), "shortOpts", term141);
        setField(term140, term140.getClass(), "longOpts", term147);
        setField(term140, term140.getClass(), "requiredOpts", term153);
        setField(term140, term140.getClass(), "optionGroups", term157);
        term174 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "xxtlPwDYFs";
        args[1] = term174;
        args[2] = "jJCZpVmanW";
        try {
            callMethod(klass, "addOption", argTypes, term140, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


