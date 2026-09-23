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

public class Options_hasShortOption_1916202431167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55202;
     Object term55259;

    public Options_hasShortOption_1916202431167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55250 = new HashMap();
        term55202 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term55202, term55202.getClass(), "shortOpts", term55250);
        HashMap term55260 = new HashMap();
        term55259 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term55259, term55259.getClass(), "shortOpts", term55260);
        setField(term55259, term55259.getClass(), "longOpts", null);
        setField(term55259, term55259.getClass(), "requiredOpts", null);
        setField(term55259, term55259.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasShortOption", argTypes, term55202, args);
        assertTrue(recursiveEquals(term55202, term55259));
    }

};


