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

public class Options_addOption_166292094920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public Options_addOption_166292094920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term75 = new LinkedHashMap();
        LinkedHashMap term81 = new LinkedHashMap();
        ArrayList term87 = new ArrayList();
        HashMap term91 = new HashMap();
        term74 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term74, term74.getClass(), "shortOpts", term75);
        setField(term74, term74.getClass(), "longOpts", term81);
        setField(term74, term74.getClass(), "requiredOpts", term87);
        setField(term74, term74.getClass(), "optionGroups", term91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        try {
            callMethod(klass, "addOption", argTypes, term74, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


