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

public class Options_hasLongOption_507640949177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57461;
     Object term57518;

    public Options_hasLongOption_507640949177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57509 = new HashMap();
        term57461 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57461, term57461.getClass(), "longOpts", term57509);
        HashMap term57519 = new HashMap();
        term57518 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57518, term57518.getClass(), "shortOpts", null);
        setField(term57518, term57518.getClass(), "longOpts", term57519);
        setField(term57518, term57518.getClass(), "requiredOpts", null);
        setField(term57518, term57518.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasLongOption", argTypes, term57461, args);
        assertTrue(recursiveEquals(term57461, term57518));
    }

};


