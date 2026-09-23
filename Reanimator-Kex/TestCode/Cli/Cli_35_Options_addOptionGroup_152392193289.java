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

public class Options_addOptionGroup_152392193289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22226;
     Object term22352;

    public Options_addOptionGroup_152392193289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22278 = new ArrayList();
        term22226 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term22226, term22226.getClass(), "requiredOpts", term22278);
        HashMap term22400 = new HashMap();
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        ((HashMap) term22400).put((Object)null, (Object)null);
        term22352 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term22352, term22352.getClass(), "required", true);
        setField(term22352, term22352.getClass(), "optionMap", term22400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term22352;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term22226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


