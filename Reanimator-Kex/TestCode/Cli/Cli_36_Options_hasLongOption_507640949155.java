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
import java.util.HashMap;

public class Options_hasLongOption_507640949155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45057;
     Object term45114;

    public Options_hasLongOption_507640949155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45105 = new HashMap();
        term45057 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term45057, term45057.getClass(), "longOpts", term45105);
        HashMap term45115 = new HashMap();
        term45114 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term45114, term45114.getClass(), "shortOpts", null);
        setField(term45114, term45114.getClass(), "longOpts", term45115);
        setField(term45114, term45114.getClass(), "requiredOpts", null);
        setField(term45114, term45114.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasLongOption", argTypes, term45057, args);
        assertTrue(recursiveEquals(term45057, term45114));
    }

};


