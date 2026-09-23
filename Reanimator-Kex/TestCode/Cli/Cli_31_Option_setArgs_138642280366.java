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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Option_setArgs_138642280366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092;
     Object term2150;
     Object term8126;

    public Option_setArgs_138642280366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2145 = new ArrayList();
        term2092 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2144 = newInstance(Class.forName("java.lang.Object"));
        setField(term2092, term2092.getClass(), "opt", "PHvxnGHptP");
        setField(term2092, term2092.getClass(), "longOpt", "TimdotUuNC");
        setField(term2092, term2092.getClass(), "argName", "PkWMRdJcBb");
        setField(term2092, term2092.getClass(), "description", "jSpAteRute");
        setBooleanField(term2092, term2092.getClass(), "required", true);
        setBooleanField(term2092, term2092.getClass(), "optionalArg", true);
        setIntField(term2092, term2092.getClass(), "numberOfArgs", 1048535127);
        setField(term2092, term2092.getClass(), "type", term2144);
        setField(term2092, term2092.getClass(), "values", term2145);
        setCharField(term2092, term2092.getClass(), "valuesep", 'b');
        term2150 = new Integer(-655067527);
        ArrayList term8136 = new ArrayList();
        term8126 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8135 = newInstance(Class.forName("java.lang.Object"));
        setField(term8126, term8126.getClass(), "opt", "PHvxnGHptP");
        setField(term8126, term8126.getClass(), "longOpt", "TimdotUuNC");
        setField(term8126, term8126.getClass(), "argName", "PkWMRdJcBb");
        setField(term8126, term8126.getClass(), "description", "jSpAteRute");
        setBooleanField(term8126, term8126.getClass(), "required", true);
        setBooleanField(term8126, term8126.getClass(), "optionalArg", true);
        setIntField(term8126, term8126.getClass(), "numberOfArgs", -655067527);
        setField(term8126, term8126.getClass(), "type", term8135);
        setField(term8126, term8126.getClass(), "values", term8136);
        setCharField(term8126, term8126.getClass(), "valuesep", 'b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2150;
        callMethod(klass, "setArgs", argTypes, term2092, args);
        assertTrue(recursiveEquals(term2092, term8126));
        assertTrue(recursiveEquals(term2150, -655067527));
    }

};


