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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;

public class Options_addOptionGroup_1523921932167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47182;
     Object term47308;

    public Options_addOptionGroup_1523921932167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term47234 = new ArrayList();
        term47182 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term47182, term47182.getClass(), "requiredOpts", term47234);
        HashMap term47356 = new HashMap();
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        ((HashMap) term47356).put((Object)null, (Object)null);
        term47308 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term47308, term47308.getClass(), "required", true);
        setField(term47308, term47308.getClass(), "optionMap", term47356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term47308;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term47182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


