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

public class OptionGroup_setSelected_82295806131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4511;
     Object term4613;
     Object term4672;
     Object term4675;

    public OptionGroup_setSelected_82295806131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4511 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4511, term4511.getClass(), "selected", "");
        term4613 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4613, term4613.getClass(), "opt", "");
        term4672 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4672, term4672.getClass(), "optionMap", null);
        setField(term4672, term4672.getClass(), "selected", "");
        setBooleanField(term4672, term4672.getClass(), "required", false);
        term4675 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4675, term4675.getClass(), "opt", "");
        setField(term4675, term4675.getClass(), "longOpt", null);
        setField(term4675, term4675.getClass(), "argName", null);
        setField(term4675, term4675.getClass(), "description", null);
        setBooleanField(term4675, term4675.getClass(), "required", false);
        setBooleanField(term4675, term4675.getClass(), "optionalArg", false);
        setIntField(term4675, term4675.getClass(), "numberOfArgs", 0);
        setField(term4675, term4675.getClass(), "type", null);
        setField(term4675, term4675.getClass(), "values", null);
        setCharField(term4675, term4675.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4613;
        callMethod(klass, "setSelected", argTypes, term4511, args);
        assertTrue(recursiveEquals(term4511, term4672));
        assertTrue(recursiveEquals(term4613, term4675));
    }

};


