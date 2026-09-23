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
import java.util.HashMap;
import java.lang.Object;

public class Options_addOptionGroup_152392193235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4737;
     Object term4811;

    public Options_addOptionGroup_152392193235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4737 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4949 = newInstance(Class.forName("java.lang.Object"));
        HashMap term4859 = new HashMap();
        ((HashMap) term4859).put((Object)null, (Object)null);
        ((HashMap) term4859).put(term4949, term4949);
        term4811 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term4811, term4811.getClass(), "required", false);
        setField(term4811, term4811.getClass(), "optionMap", term4859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term4811;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term4737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


