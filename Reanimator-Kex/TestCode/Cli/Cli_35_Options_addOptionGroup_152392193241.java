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

public class Options_addOptionGroup_152392193241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6595;
     Object term6669;

    public Options_addOptionGroup_152392193241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6595 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term6807 = newInstance(Class.forName("java.lang.Object"));
        HashMap term6717 = new HashMap();
        ((HashMap) term6717).put((Object)null, (Object)null);
        ((HashMap) term6717).put(term6807, term6807);
        term6669 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term6669, term6669.getClass(), "required", false);
        setField(term6669, term6669.getClass(), "optionMap", term6717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term6669;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term6595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


