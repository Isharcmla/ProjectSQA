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

public class OptionGroup_isRequired_136314404215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;
     Object term2092;

    public OptionGroup_isRequired_136314404215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term570 = new HashMap();
        term569 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term569, term569.getClass(), "optionMap", term570);
        setField(term569, term569.getClass(), "selected", "eZFUvlxvGV");
        setBooleanField(term569, term569.getClass(), "required", true);
        HashMap term2093 = new HashMap();
        term2092 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2092, term2092.getClass(), "optionMap", term2093);
        setField(term2092, term2092.getClass(), "selected", "eZFUvlxvGV");
        setBooleanField(term2092, term2092.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRequired", argTypes, term569, args);
        assertTrue(recursiveEquals(term569, term2092));
    }

};


